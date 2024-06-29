import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class218 {
   @OriginalMember(
      owner = "client!va",
      name = "j",
      descriptor = "I"
   )
   private int field3283;
   @OriginalMember(
      owner = "client!va",
      name = "l",
      descriptor = "Z"
   )
   public boolean field3291;
   @OriginalMember(
      owner = "client!va",
      name = "e",
      descriptor = "I"
   )
   private int field3295;
   @OriginalMember(
      owner = "client!va",
      name = "h",
      descriptor = "Lc;"
   )
   private class652 field3288;
   @OriginalMember(
      owner = "client!va",
      name = "q",
      descriptor = "I"
   )
   private int field3293;
   @OriginalMember(
      owner = "client!va",
      name = "d",
      descriptor = "Lod;"
   )
   private class728 field3279;
   @OriginalMember(
      owner = "client!va",
      name = "f",
      descriptor = "I"
   )
   private int field3281;
   @OriginalMember(
      owner = "client!va",
      name = "n",
      descriptor = "Lle;"
   )
   private class172 field3286;
   @OriginalMember(
      owner = "client!va",
      name = "m",
      descriptor = "Lnn;"
   )
   private class463 field3287;
   @OriginalMember(
      owner = "client!va",
      name = "k",
      descriptor = "Lbka;"
   )
   private class396 field3292;
   @OriginalMember(
      owner = "client!va",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3297 = new String[]{method1892(method1891("|W\u0018f\b")), method1892(method1891("dCZI")), method1892(method1891("|W\u0018\u0019Id_B\u001b\b")), method1892(method1891("q\u0018\u0018\u000b]")), method1892(method1891("|W\u0018g\b")), method1892(method1891("|W\u0018`\b")), method1892(method1891("|W\u0018b\b")), method1892(method1891("|W\u0018c\b")), method1892(method1891("|W\u0018m\b")), method1892(method1891("|W\u0018d\b")), method1892(method1891("|W\u0018a\b"))};
   @OriginalMember(
      owner = "client!va",
      name = "r",
      descriptor = "I"
   )
   public static int field3278;
   @OriginalMember(
      owner = "client!va",
      name = "i",
      descriptor = "I"
   )
   public static int field3280;
   @OriginalMember(
      owner = "client!va",
      name = "o",
      descriptor = "I"
   )
   public static int field3284;
   @OriginalMember(
      owner = "client!va",
      name = "t",
      descriptor = "I"
   )
   public static int field3285;
   @OriginalMember(
      owner = "client!va",
      name = "g",
      descriptor = "I"
   )
   public static int field3289;
   @OriginalMember(
      owner = "client!va",
      name = "s",
      descriptor = "I"
   )
   public static int field3294;
   @OriginalMember(
      owner = "client!va",
      name = "b",
      descriptor = "I"
   )
   public static int field3296;
   @OriginalMember(
      owner = "client!va",
      name = "c",
      descriptor = "Lrr;"
   )
   public static class678 field3277;
   @OriginalMember(
      owner = "client!va",
      name = "a",
      descriptor = "Lgj;"
   )
   public static class761 field3290;
   @OriginalMember(
      owner = "client!va",
      name = "p",
      descriptor = "[I"
   )
   public static int[] field3282;

   @OriginalMember(
      owner = "client!va",
      name = "a",
      descriptor = "(Z)V",
      line = 6
   )
   public static final void method1882(boolean arg0) {
      try {
         ++field3294;
         if (!arg0) {
            field3282 = null;
         }

         class566 var1 = class146.method1321(0L, 15, -1428737160);
         var1.method4268(4);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3297[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!va",
      name = "a",
      descriptor = "(Lhja;)V",
      line = 19
   )
   public static final void method1883(class330 arg0) {
      if (class213.field3240 < 65535) {
         class404 var1 = arg0.field5003;
         class88.field1276[class213.field3240] = arg0;
         class701.field10454[class213.field3240] = false;
         ++class213.field3240;
         int var2 = arg0.field5008;
         if (arg0.field5000) {
            var2 = 0;
         }

         int var3 = arg0.field5008;
         if (arg0.field4998) {
            var3 = class461.field7016 - 1;
         }

         for(int var4 = var2; var4 <= var3; ++var4) {
            int var5 = 0;
            int var6 = var1.method3247((byte)-119) - var1.method3249((byte)12) + class42.field564 >> class394.field6180;
            if (var6 < 0) {
               var5 -= var6;
               var6 = 0;
            }

            int var7 = var1.method3247((byte)-122) + var1.method3249((byte)26) - class42.field564 >> class394.field6180;
            if (var7 >= class365.field5634) {
               var7 = class365.field5634 - 1;
            }

            for(int var8 = var6; var8 <= var7; ++var8) {
               short var9 = arg0.field4997[var5++];
               int var10 = (var1.method3246((byte)-127) - var1.method3249((byte)104) + class42.field564 >> class394.field6180) + (var9 >>> 8);
               int var11 = (var9 & 255) + var10 - 1;
               if (var10 < 0) {
                  var10 = 0;
               }

               if (var11 >= class247.field3734) {
                  var11 = class247.field3734 - 1;
               }

               for(int var12 = var10; var12 <= var11; ++var12) {
                  long var13 = class226.field3439[var4][var12][var8];
                  if ((var13 & 65535L) == 0L) {
                     class226.field3439[var4][var12][var8] = var13 | (long)class213.field3240;
                  } else if ((var13 & 4294901760L) == 0L) {
                     class226.field3439[var4][var12][var8] = var13 | (long)class213.field3240 << 16;
                  } else if ((var13 & 281470681743360L) == 0L) {
                     class226.field3439[var4][var12][var8] = var13 | (long)class213.field3240 << 32;
                  } else if ((var13 & -281474976710656L) == 0L) {
                     class226.field3439[var4][var12][var8] = var13 | (long)class213.field3240 << 48;
                  }
               }
            }
         }

      }
   }

   @OriginalMember(
      owner = "client!va",
      name = "a",
      descriptor = "(I)V",
      line = 113
   )
   public final void method1884(int arg0) {
      try {
         this.method1886(this.field3286, (byte)114, this.field3281);
         ++field3285;
         if (arg0 != -28670) {
            method1890(74);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3297[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!va",
      name = "b",
      descriptor = "(I)V",
      line = 124
   )
   public static void method1885(int arg0) {
      try {
         field3290 = null;
         field3282 = null;
         int var1 = 69 % ((arg0 - 10) / 62);
         field3277 = null;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3297[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!va",
      name = "a",
      descriptor = "(Lle;BI)V",
      line = 136
   )
   private final void method1886(class172 arg0, byte arg1, int arg2) {
      try {
         ++field3278;
         if (arg2 != 0) {
            this.method1889((byte)-92);
            this.field3288.method4792(-26367, this.field3292);
            if (arg1 > 78) {
               this.field3288.method4760(arg2, arg0, 4, 0, -126);
            }
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field3297[7] + (arg0 != null ? field3297[3] : field3297[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!va",
      name = "<init>",
      descriptor = "(Lc;Lod;Lg;IIIII)V",
      line = 338
   )
   public class218(class652 arg0, class728 arg1, class361 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      boolean var9 = client.field1786;
      super();
      this.field3283 = -1;
      this.field3291 = true;

      try {
         this.field3295 = arg7;
         this.field3288 = arg0;
         this.field3293 = arg6;
         this.field3279 = arg1;
         int var10 = 1 << arg5;
         int var11 = 0;
         int var12 = arg3 << arg5;
         int var13 = arg4 << arg5;
         int var14 = 0;
         int var15;
         int var16;
         int var10000;
         short[] var17;
         int var10001;
         class354 var18;
         int var19;
         int var20;
         int var21;
         short[] var22;
         int var23;
         int var24;
         int var25;
         int var26;
         short[] var27;
         int var28;
         if (var9) {
            var15 = (var13 + var14) * arg2.field4383 - -var12;
            var16 = 0;
            if (var9) {
               var17 = arg2.field5593[var15++];
               if (var17 != null) {
                  var11 += var17.length;
               }

               ++var16;
            }
         } else {
            if (~var14 <= ~var10) {
               this.field3281 = var11;
               var10000 = ~var11;
               var10001 = -1;
               if (!var9) {
                  if (var10000 >= -1) {
                     this.field3292 = null;
                     return;
                  }

                  label321: {
                     var18 = new class354(var11 * 2);
                     if (!this.field3288.field9695) {
                        var19 = 0;
                        if (var9 || ~var19 > ~var10) {
                           do {
                              var20 = (var13 + var19) * arg2.field4383 + var12;
                              var21 = 0;
                              if (var9 || var10 > var21) {
                                 do {
                                    var22 = arg2.field5593[var20++];
                                    if (var22 == null) {
                                       ++var21;
                                    } else {
                                       var23 = 0;
                                       if (!var9 && var23 >= var22.length) {
                                          ++var21;
                                       } else {
                                          do {
                                             var18.method2841(-3, 65535 & var22[var23]);
                                             ++var23;
                                          } while(var23 < var22.length);

                                          ++var21;
                                       }
                                    }
                                 } while(var10 > var21);
                              }

                              ++var19;
                           } while(~var19 > ~var10);
                        }

                        if (!var9) {
                           break label321;
                        }
                     }

                     var24 = 0;
                     if (var9 || ~var24 > ~var10) {
                        do {
                           var25 = (var13 + var24) * arg2.field4383 + var12;
                           var26 = 0;
                           if (var9 || var10 > var26) {
                              do {
                                 var27 = arg2.field5593[var25++];
                                 if (var27 == null) {
                                    ++var26;
                                 } else {
                                    var28 = 0;
                                    if (!var9 && ~var27.length >= ~var28) {
                                       ++var26;
                                    } else {
                                       do {
                                          var18.method2873(var27[var28] & 65535, (byte)118);
                                          ++var28;
                                       } while(~var27.length < ~var28);

                                       ++var26;
                                    }
                                 }
                              } while(var10 > var26);
                           }

                           ++var24;
                        } while(~var24 > ~var10);
                     }
                  }

                  this.field3286 = this.field3288.method4732(false, 5123, var18.field5436, var18.field5428, 125);
                  this.field3287 = new class463(this.field3288, 5123, (byte[])null, 1);
                  return;
               }
            } else {
               var10000 = (var13 + var14) * arg2.field4383;
               var10001 = -var12;
            }

            var15 = var10000 - var10001;
            var16 = 0;
            if (var9) {
               var17 = arg2.field5593[var15++];
               if (var17 != null) {
                  var11 += var17.length;
               }

               ++var16;
            }
         }

         while(true) {
            while(~var10 < ~var16) {
               var17 = arg2.field5593[var15++];
               if (var17 != null) {
                  var11 += var17.length;
               }

               ++var16;
            }

            ++var14;
            if (~var14 <= ~var10) {
               this.field3281 = var11;
               var10000 = ~var11;
               var10001 = -1;
               if (!var9) {
                  if (var10000 >= -1) {
                     this.field3292 = null;
                     return;
                  }

                  label329: {
                     var18 = new class354(var11 * 2);
                     if (!this.field3288.field9695) {
                        var19 = 0;
                        if (var9 || ~var19 > ~var10) {
                           do {
                              var20 = (var13 + var19) * arg2.field4383 + var12;
                              var21 = 0;
                              if (var9 || var10 > var21) {
                                 do {
                                    var22 = arg2.field5593[var20++];
                                    if (var22 == null) {
                                       ++var21;
                                    } else {
                                       var23 = 0;
                                       if (!var9 && var23 >= var22.length) {
                                          ++var21;
                                       } else {
                                          do {
                                             var18.method2841(-3, 65535 & var22[var23]);
                                             ++var23;
                                          } while(var23 < var22.length);

                                          ++var21;
                                       }
                                    }
                                 } while(var10 > var21);
                              }

                              ++var19;
                           } while(~var19 > ~var10);
                        }

                        if (!var9) {
                           break label329;
                        }
                     }

                     var24 = 0;
                     if (var9 || ~var24 > ~var10) {
                        do {
                           var25 = (var13 + var24) * arg2.field4383 + var12;
                           var26 = 0;
                           if (var9 || var10 > var26) {
                              do {
                                 var27 = arg2.field5593[var25++];
                                 if (var27 == null) {
                                    ++var26;
                                 } else {
                                    var28 = 0;
                                    if (!var9 && ~var27.length >= ~var28) {
                                       ++var26;
                                    } else {
                                       do {
                                          var18.method2873(var27[var28] & 65535, (byte)118);
                                          ++var28;
                                       } while(~var27.length < ~var28);

                                       ++var26;
                                    }
                                 }
                              } while(var10 > var26);
                           }

                           ++var24;
                        } while(~var24 > ~var10);
                     }
                  }

                  this.field3286 = this.field3288.method4732(false, 5123, var18.field5436, var18.field5428, 125);
                  this.field3287 = new class463(this.field3288, 5123, (byte[])null, 1);
                  return;
               }
            } else {
               var10000 = (var13 + var14) * arg2.field4383;
               var10001 = -var12;
            }

            var15 = var10000 - var10001;
            var16 = 0;
            if (var9) {
               var17 = arg2.field5593[var15++];
               if (var17 != null) {
                  var11 += var17.length;
               }

               ++var16;
            }
         }
      } catch (RuntimeException var30) {
         throw class482.method3757(var30, field3297[2] + (arg0 != null ? field3297[3] : field3297[1]) + ',' + (arg1 != null ? field3297[3] : field3297[1]) + ',' + (arg2 != null ? field3297[3] : field3297[1]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!va",
      name = "a",
      descriptor = "(IBI[B)V",
      line = 166
   )
   public final void method1887(int arg0, byte arg1, int arg2, byte[] arg3) {
      try {
         this.field3287.method1590(arg3, arg0 * this.field3288.method4785(arg2, arg1 ^ -87), 24668, arg2);
         ++field3296;
         if (arg1 == -88) {
            this.method1886(this.field3287, (byte)79, arg0);
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field3297[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field3297[3] : field3297[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!va",
      name = "a",
      descriptor = "(Lnaa;ILce;)Lmq;",
      line = 179
   )
   public static final class577 method1888(class113 arg0, int arg1, class378 arg2) {
      boolean var3 = client.field1786;

      try {
         ++field3280;
         if (arg1 < 87) {
            field3290 = null;
         }

         class577 var4;
         label52: {
            var4 = class702.method5167(50);
            var4.field8535 = arg0;
            var4.field8532 = arg0.field1541;
            if (var4.field8532 != -1) {
               if (~var4.field8532 != 1) {
                  if (var4.field8532 <= 18) {
                     var4.field8531 = new class102(20);
                     if (!var3) {
                        break label52;
                     }
                  }

                  if (~var4.field8532 >= -99) {
                     var4.field8531 = new class102(100);
                     if (!var3) {
                        break label52;
                     }
                  }

                  var4.field8531 = new class102(260);
                  if (!var3) {
                     break label52;
                  }
               }

               var4.field8531 = new class102(10000);
               if (!var3) {
                  break label52;
               }
            }

            var4.field8531 = new class102(260);
         }

         var4.field8531.method992(arg2, (byte)29);
         var4.field8531.method997(44, var4.field8535.method1061(1));
         var4.field8533 = 0;
         return var4;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field3297[8] + (arg0 != null ? field3297[3] : field3297[1]) + ',' + arg1 + ',' + (arg2 != null ? field3297[3] : field3297[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!va",
      name = "a",
      descriptor = "(B)V",
      line = 214
   )
   private final void method1889(byte arg0) {
      boolean var2 = client.field1786;

      try {
         ++field3284;
         if (this.field3291) {
            this.field3291 = false;
            byte[] var3 = this.field3279.field10870;
            byte[] var4 = this.field3288.field9767;
            byte var5 = 0;
            int var6 = this.field3279.field10866;
            int var7 = this.field3279.field10866 * this.field3295 + this.field3293;
            int var8 = -128;
            int var9;
            int var10;
            int var11;
            int var12;
            int var13;
            int var14;
            int var10000;
            int var17;
            int var10001;
            if (var2) {
               var17 = -var5 + (var5 << 8);
               var9 = -128;
               if (var2) {
                  if (var3[var7++] != 0) {
                     ++var17;
                  }

                  ++var9;
               }
            } else {
               if (var8 >= 0) {
                  var10000 = arg0;
                  var10001 = -92;
                  if (!var2) {
                     if (arg0 != -92) {
                        this.method1884(-82);
                     }

                     if (this.field3292 != null && this.field3283 == var5) {
                        this.field3291 = false;
                        return;
                     }

                     this.field3283 = var5;
                     var10 = 0;
                     var11 = this.field3295 * var6 + this.field3293;
                     var12 = -128;
                     if (!var2 && ~var12 <= -1) {
                        if (this.field3292 == null) {
                           this.field3292 = new class396(this.field3288, 3553, 6406, 128, 128, false, this.field3288.field9767, 6406, false);
                           this.field3292.method3192(false, false, false);
                           this.field3292.method5760(true, (byte)-107);
                           return;
                        }

                        this.field3292.method3195(128, 0, this.field3288.field9767, 0, 0, -3477, 6406, false, 0, 128);
                        return;
                     }

                     do {
                        var13 = -128;
                        if (var2) {
                           if (var3[var11] == 0) {
                              var14 = 0;
                              if (~var3[var11 - 1] != -1) {
                                 ++var14;
                                 if (~var3[var11 + 1] != -1) {
                                    ++var14;
                                 }
                              } else if (~var3[var11 + 1] != -1) {
                                 ++var14;
                              }

                              if (var3[-var6 + var11] != 0) {
                                 ++var14;
                                 if (~var3[var6 + var11] != -1) {
                                    ++var14;
                                 }
                              } else if (~var3[var6 + var11] != -1) {
                                 ++var14;
                              }

                              var4[var10++] = (byte)(var14 * 17);
                              if (var2) {
                                 var4[var10++] = 68;
                                 ++var11;
                                 ++var13;
                              } else {
                                 ++var11;
                                 ++var13;
                              }
                           } else {
                              var4[var10++] = 68;
                              ++var11;
                              ++var13;
                           }
                        }

                        while(true) {
                           while(~var13 > -1) {
                              if (var3[var11] == 0) {
                                 var14 = 0;
                                 if (~var3[var11 - 1] != -1) {
                                    ++var14;
                                    if (~var3[var11 + 1] != -1) {
                                       ++var14;
                                    }
                                 } else if (~var3[var11 + 1] != -1) {
                                    ++var14;
                                 }

                                 if (var3[-var6 + var11] != 0) {
                                    ++var14;
                                    if (~var3[var6 + var11] != -1) {
                                       ++var14;
                                    }
                                 } else if (~var3[var6 + var11] != -1) {
                                    ++var14;
                                 }

                                 var4[var10++] = (byte)(var14 * 17);
                                 if (var2) {
                                    var4[var10++] = 68;
                                    ++var11;
                                    ++var13;
                                 } else {
                                    ++var11;
                                    ++var13;
                                 }
                              } else {
                                 var4[var10++] = 68;
                                 ++var11;
                                 ++var13;
                              }
                           }

                           var11 += this.field3279.field10866 + -128;
                           if (!var2) {
                              ++var12;
                              break;
                           }

                           var4[var10++] = 68;
                           ++var11;
                           ++var13;
                        }
                     } while(~var12 > -1);

                     if (this.field3292 == null) {
                        this.field3292 = new class396(this.field3288, 3553, 6406, 128, 128, false, this.field3288.field9767, 6406, false);
                        this.field3292.method3192(false, false, false);
                        this.field3292.method5760(true, (byte)-107);
                        return;
                     }

                     this.field3292.method3195(128, 0, this.field3288.field9767, 0, 0, -3477, 6406, false, 0, 128);
                     return;
                  }
               } else {
                  var10000 = -var5;
                  var10001 = var5 << 8;
               }

               var17 = var10000 + var10001;
               var9 = -128;
               if (var2) {
                  if (var3[var7++] != 0) {
                     ++var17;
                  }

                  ++var9;
               }
            }

            while(true) {
               while(~var9 > -1) {
                  if (var3[var7++] != 0) {
                     ++var17;
                  }

                  ++var9;
               }

               var7 += var6 + -128;
               if (!var2) {
                  ++var8;
                  if (var8 >= 0) {
                     var10000 = arg0;
                     var10001 = -92;
                     if (!var2) {
                        if (arg0 != -92) {
                           this.method1884(-82);
                        }

                        if (this.field3292 != null && this.field3283 == var17) {
                           this.field3291 = false;
                           return;
                        }

                        this.field3283 = var17;
                        var10 = 0;
                        var11 = this.field3295 * var6 + this.field3293;
                        var12 = -128;
                        if (!var2 && ~var12 <= -1) {
                           if (this.field3292 == null) {
                              this.field3292 = new class396(this.field3288, 3553, 6406, 128, 128, false, this.field3288.field9767, 6406, false);
                              this.field3292.method3192(false, false, false);
                              this.field3292.method5760(true, (byte)-107);
                              return;
                           }

                           this.field3292.method3195(128, 0, this.field3288.field9767, 0, 0, -3477, 6406, false, 0, 128);
                           return;
                        }

                        do {
                           var13 = -128;
                           if (var2) {
                              if (var3[var11] == 0) {
                                 var14 = 0;
                                 if (~var3[var11 - 1] != -1) {
                                    ++var14;
                                    if (~var3[var11 + 1] != -1) {
                                       ++var14;
                                    }
                                 } else if (~var3[var11 + 1] != -1) {
                                    ++var14;
                                 }

                                 if (var3[-var6 + var11] != 0) {
                                    ++var14;
                                    if (~var3[var6 + var11] != -1) {
                                       ++var14;
                                    }
                                 } else if (~var3[var6 + var11] != -1) {
                                    ++var14;
                                 }

                                 var4[var10++] = (byte)(var14 * 17);
                                 if (var2) {
                                    var4[var10++] = 68;
                                    ++var11;
                                    ++var13;
                                 } else {
                                    ++var11;
                                    ++var13;
                                 }
                              } else {
                                 var4[var10++] = 68;
                                 ++var11;
                                 ++var13;
                              }
                           }

                           while(true) {
                              while(~var13 > -1) {
                                 if (var3[var11] == 0) {
                                    var14 = 0;
                                    if (~var3[var11 - 1] != -1) {
                                       ++var14;
                                       if (~var3[var11 + 1] != -1) {
                                          ++var14;
                                       }
                                    } else if (~var3[var11 + 1] != -1) {
                                       ++var14;
                                    }

                                    if (var3[-var6 + var11] != 0) {
                                       ++var14;
                                       if (~var3[var6 + var11] != -1) {
                                          ++var14;
                                       }
                                    } else if (~var3[var6 + var11] != -1) {
                                       ++var14;
                                    }

                                    var4[var10++] = (byte)(var14 * 17);
                                    if (var2) {
                                       var4[var10++] = 68;
                                       ++var11;
                                       ++var13;
                                    } else {
                                       ++var11;
                                       ++var13;
                                    }
                                 } else {
                                    var4[var10++] = 68;
                                    ++var11;
                                    ++var13;
                                 }
                              }

                              var11 += this.field3279.field10866 + -128;
                              if (!var2) {
                                 ++var12;
                                 break;
                              }

                              var4[var10++] = 68;
                              ++var11;
                              ++var13;
                           }
                        } while(~var12 > -1);

                        if (this.field3292 == null) {
                           this.field3292 = new class396(this.field3288, 3553, 6406, 128, 128, false, this.field3288.field9767, 6406, false);
                           this.field3292.method3192(false, false, false);
                           this.field3292.method5760(true, (byte)-107);
                           return;
                        }

                        this.field3292.method3195(128, 0, this.field3288.field9767, 0, 0, -3477, 6406, false, 0, 128);
                        return;
                     }
                  } else {
                     var10000 = -var17;
                     var10001 = var17 << 8;
                  }

                  var17 = var10000 + var10001;
                  var9 = -128;
                  if (var2) {
                     if (var3[var7++] != 0) {
                        ++var17;
                     }

                     ++var9;
                  }
               } else {
                  ++var9;
               }
            }
         }
      } catch (RuntimeException var16) {
         throw class482.method3757(var16, field3297[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!va",
      name = "c",
      descriptor = "(I)I",
      line = 323
   )
   public static final int method1890(int arg0) {
      try {
         if (arg0 != 0) {
            method1882(false);
         }

         ++field3289;
         return ~class67.field883 == -2 ? class177.field2773 : 0;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field3297[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!va",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1891(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 32);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!va",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1892(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 10;
            break;
         case 1:
            var10005 = 54;
            break;
         case 2:
            var10005 = 54;
            break;
         case 3:
            var10005 = 37;
            break;
         default:
            var10005 = 32;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
