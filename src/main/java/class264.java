import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class264 {
   @OriginalMember(
      owner = "client!jj",
      name = "g",
      descriptor = "I"
   )
   private int field3341;
   @OriginalMember(
      owner = "client!jj",
      name = "f",
      descriptor = "Z"
   )
   public boolean field3348;
   @OriginalMember(
      owner = "client!jj",
      name = "h",
      descriptor = "I"
   )
   private int field3352;
   @OriginalMember(
      owner = "client!jj",
      name = "d",
      descriptor = "I"
   )
   private int field3356;
   @OriginalMember(
      owner = "client!jj",
      name = "a",
      descriptor = "Ljja;"
   )
   private class4 field3357;
   @OriginalMember(
      owner = "client!jj",
      name = "b",
      descriptor = "Liu;"
   )
   private class530 field3345;
   @OriginalMember(
      owner = "client!jj",
      name = "k",
      descriptor = "I"
   )
   private int field3351;
   @OriginalMember(
      owner = "client!jj",
      name = "q",
      descriptor = "Lwe;"
   )
   private class133 field3342;
   @OriginalMember(
      owner = "client!jj",
      name = "l",
      descriptor = "Lot;"
   )
   private class750 field3346;
   @OriginalMember(
      owner = "client!jj",
      name = "i",
      descriptor = "Lkk;"
   )
   private class266 field3353;
   @OriginalMember(
      owner = "client!jj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3358 = new String[]{method2119(method2118("^+$\u001d")), method2119(method2118("Z4f5\u001d")), method2119(method2118("Kpf_H")), method2119(method2118("Z4f3\u001d")), method2119(method2118("Z4f4\u001d")), method2119(method2118("Z4f0\u001d")), method2119(method2118("Z4fM\\^7<O\u001d")), method2119(method2118("Z4f2\u001d"))};
   @OriginalMember(
      owner = "client!jj",
      name = "o",
      descriptor = "I"
   )
   public static int field3355 = 0;
   @OriginalMember(
      owner = "client!jj",
      name = "e",
      descriptor = "Z"
   )
   public static boolean field3344 = false;
   @OriginalMember(
      owner = "client!jj",
      name = "n",
      descriptor = "I"
   )
   public static int field3343;
   @OriginalMember(
      owner = "client!jj",
      name = "c",
      descriptor = "I"
   )
   public static int field3347;
   @OriginalMember(
      owner = "client!jj",
      name = "m",
      descriptor = "I"
   )
   public static int field3349;
   @OriginalMember(
      owner = "client!jj",
      name = "j",
      descriptor = "I"
   )
   public static int field3350;
   @OriginalMember(
      owner = "client!jj",
      name = "p",
      descriptor = "I"
   )
   public static int field3354;

   @OriginalMember(
      owner = "client!jj",
      name = "a",
      descriptor = "(I[BII)V"
   )
   public final void method2113(int arg0, byte[] arg1, int arg2, int arg3) {
      try {
         if (arg3 == -128) {
            this.field3346.method1122(arg2 * this.field3345.method4027(arg0, (byte)-95), true, arg0, arg1);
            ++field3347;
            this.method2115(false, this.field3346, arg2);
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field3358[5] + arg0 + ',' + (arg1 != null ? field3358[2] : field3358[0]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jj",
      name = "a",
      descriptor = "(B)V"
   )
   private final void method2114(byte arg0) {
      boolean var2 = client.field1481;

      try {
         ++field3343;
         if (this.field3348) {
            this.field3348 = false;
            byte[] var3 = this.field3357.field54;
            byte[] var4 = this.field3345.field7793;
            int var5 = 0;
            int var6 = this.field3357.field56;
            int var7 = this.field3356 - -(this.field3357.field56 * this.field3352);
            int var8 = -128;
            int var9;
            int var10;
            int var11;
            int var12;
            int var13;
            int var14;
            if (var2) {
               var5 = (var5 << 8) + -var5;
               var9 = -128;
               if (var2) {
                  if (~var3[var7++] != -1) {
                     ++var5;
                  }

                  ++var9;
               }
            } else {
               if (var8 >= 0) {
                  if (!var2) {
                     if (this.field3353 != null && ~this.field3341 == ~var5) {
                        this.field3348 = false;
                        return;
                     }

                     this.field3341 = var5;
                     var10 = 0;
                     var11 = this.field3352 * var6 + this.field3356;
                     var12 = -128;
                     if (var2) {
                        var13 = -128;
                     } else if (var12 >= 0) {
                        var13 = -68 / ((11 - arg0) / 34);
                        if (!var2) {
                           if (this.field3353 != null) {
                              this.field3353.method2124(0, 3314, false, 0, 0, 6406, 128, 128, this.field3345.field7793, 0);
                              return;
                           }

                           this.field3353 = new class266(this.field3345, 3553, 6406, 128, 128, false, this.field3345.field7793, 6406, false);
                           this.field3353.method2121(0, false, false);
                           this.field3353.method4157((byte)111, true);
                           return;
                        }
                     } else {
                        var13 = -128;
                     }

                     while(true) {
                        if (var2) {
                           if (var3[var11] == 0) {
                              var14 = 0;
                              if (var3[var11 - 1] != 0) {
                                 ++var14;
                                 if (var3[var11 - -1] != 0) {
                                    ++var14;
                                 }
                              } else if (var3[var11 - -1] != 0) {
                                 ++var14;
                              }

                              if (~var3[var11 - var6] != -1) {
                                 ++var14;
                                 if (~var3[var11 - -var6] != -1) {
                                    ++var14;
                                 }
                              } else if (~var3[var11 - -var6] != -1) {
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
                                 if (var3[var11 - 1] != 0) {
                                    ++var14;
                                    if (var3[var11 - -1] != 0) {
                                       ++var14;
                                    }
                                 } else if (var3[var11 - -1] != 0) {
                                    ++var14;
                                 }

                                 if (~var3[var11 - var6] != -1) {
                                    ++var14;
                                    if (~var3[var11 - -var6] != -1) {
                                       ++var14;
                                    }
                                 } else if (~var3[var11 - -var6] != -1) {
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

                           var11 += this.field3357.field56 + -128;
                           if (!var2) {
                              ++var12;
                              if (var12 >= 0) {
                                 var13 = -68 / ((11 - arg0) / 34);
                                 if (!var2) {
                                    if (this.field3353 != null) {
                                       this.field3353.method2124(0, 3314, false, 0, 0, 6406, 128, 128, this.field3345.field7793, 0);
                                       return;
                                    }

                                    this.field3353 = new class266(this.field3345, 3553, 6406, 128, 128, false, this.field3345.field7793, 6406, false);
                                    this.field3353.method2121(0, false, false);
                                    this.field3353.method4157((byte)111, true);
                                    return;
                                 }
                              } else {
                                 var13 = -128;
                              }
                              break;
                           }

                           var4[var10++] = 68;
                           ++var11;
                           ++var13;
                        }
                     }
                  }
               } else {
                  var5 = (var5 << 8) + -var5;
               }

               var9 = -128;
               if (var2) {
                  if (~var3[var7++] != -1) {
                     ++var5;
                  }

                  ++var9;
               }
            }

            while(true) {
               while(var9 < 0) {
                  if (~var3[var7++] != -1) {
                     ++var5;
                  }

                  ++var9;
               }

               var7 += var6 - 128;
               if (!var2) {
                  ++var8;
                  if (var8 >= 0) {
                     if (!var2) {
                        if (this.field3353 != null && ~this.field3341 == ~var5) {
                           this.field3348 = false;
                           return;
                        }

                        this.field3341 = var5;
                        var10 = 0;
                        var11 = this.field3352 * var6 + this.field3356;
                        var12 = -128;
                        if (var2) {
                           var13 = -128;
                        } else if (var12 >= 0) {
                           var13 = -68 / ((11 - arg0) / 34);
                           if (!var2) {
                              if (this.field3353 != null) {
                                 this.field3353.method2124(0, 3314, false, 0, 0, 6406, 128, 128, this.field3345.field7793, 0);
                                 return;
                              }

                              this.field3353 = new class266(this.field3345, 3553, 6406, 128, 128, false, this.field3345.field7793, 6406, false);
                              this.field3353.method2121(0, false, false);
                              this.field3353.method4157((byte)111, true);
                              return;
                           }
                        } else {
                           var13 = -128;
                        }

                        while(true) {
                           if (var2) {
                              if (var3[var11] == 0) {
                                 var14 = 0;
                                 if (var3[var11 - 1] != 0) {
                                    ++var14;
                                    if (var3[var11 - -1] != 0) {
                                       ++var14;
                                    }
                                 } else if (var3[var11 - -1] != 0) {
                                    ++var14;
                                 }

                                 if (~var3[var11 - var6] != -1) {
                                    ++var14;
                                    if (~var3[var11 - -var6] != -1) {
                                       ++var14;
                                    }
                                 } else if (~var3[var11 - -var6] != -1) {
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
                                    if (var3[var11 - 1] != 0) {
                                       ++var14;
                                       if (var3[var11 - -1] != 0) {
                                          ++var14;
                                       }
                                    } else if (var3[var11 - -1] != 0) {
                                       ++var14;
                                    }

                                    if (~var3[var11 - var6] != -1) {
                                       ++var14;
                                       if (~var3[var11 - -var6] != -1) {
                                          ++var14;
                                       }
                                    } else if (~var3[var11 - -var6] != -1) {
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

                              var11 += this.field3357.field56 + -128;
                              if (!var2) {
                                 ++var12;
                                 if (var12 >= 0) {
                                    var13 = -68 / ((11 - arg0) / 34);
                                    if (!var2) {
                                       if (this.field3353 != null) {
                                          this.field3353.method2124(0, 3314, false, 0, 0, 6406, 128, 128, this.field3345.field7793, 0);
                                          return;
                                       }

                                       this.field3353 = new class266(this.field3345, 3553, 6406, 128, 128, false, this.field3345.field7793, 6406, false);
                                       this.field3353.method2121(0, false, false);
                                       this.field3353.method4157((byte)111, true);
                                       return;
                                    }
                                 } else {
                                    var13 = -128;
                                 }
                                 break;
                              }

                              var4[var10++] = 68;
                              ++var11;
                              ++var13;
                           }
                        }
                     }
                  } else {
                     var5 = (var5 << 8) + -var5;
                  }

                  var9 = -128;
                  if (var2) {
                     if (~var3[var7++] != -1) {
                        ++var5;
                     }

                     ++var9;
                  }
               } else {
                  ++var9;
               }
            }
         }
      } catch (RuntimeException var16) {
         throw class93.method866(var16, field3358[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jj",
      name = "a",
      descriptor = "(ZLwe;I)V"
   )
   private final void method2115(boolean arg0, class133 arg1, int arg2) {
      try {
         ++field3354;
         if (arg2 != 0) {
            if (arg0) {
               this.method2117(43);
            }

            this.method2114((byte)-32);
            this.field3345.method4006(this.field3353, (byte)-127);
            this.field3345.method3962(arg2, arg1, (byte)118, 0, 4);
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field3358[4] + arg0 + ',' + (arg1 != null ? field3358[2] : field3358[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jj",
      name = "a",
      descriptor = "(Lgea;Ljava/lang/String;I)I"
   )
   public static final int method2116(class66 arg0, String arg1, int arg2) {
      try {
         ++field3349;
         int var3 = arg0.field864;
         byte[] var4 = class270.method2147(-113, arg1);
         arg0.method647(-2098, var4.length);
         if (arg2 <= 22) {
            method2116((class66)null, (String)null, 15);
         }

         arg0.field864 += class532.field7798.method5462(var4.length, 0, arg0.field864, var4, arg0.field859, 1);
         return -var3 + arg0.field864;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field3358[1] + (arg0 != null ? field3358[2] : field3358[0]) + ',' + (arg1 != null ? field3358[2] : field3358[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jj",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method2117(int arg0) {
      try {
         ++field3350;
         this.method2115(false, this.field3342, this.field3351);
         if (arg0 != 26195) {
            this.method2117(-113);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3358[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jj",
      name = "<init>",
      descriptor = "(Liu;Ljja;Lod;IIIII)V"
   )
   public class264(class530 arg0, class4 arg1, class761 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      boolean var9 = client.field1481;
      super();
      this.field3341 = -1;
      this.field3348 = true;

      try {
         this.field3352 = arg7;
         this.field3356 = arg6;
         this.field3357 = arg1;
         this.field3345 = arg0;
         int var10 = 1 << arg5;
         int var11 = 0;
         int var12 = arg3 << arg5;
         int var13 = arg4 << arg5;
         int var14 = 0;
         int var15;
         int var16;
         int var10000;
         short[] var17;
         class66 var18;
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
            var15 = (var13 + var14) * arg2.field5769 - -var12;
            var16 = 0;
            if (var9) {
               var17 = arg2.field11131[var15++];
               if (var17 != null) {
                  var11 += var17.length;
               }

               ++var16;
            }
         } else {
            if (var10 <= var14) {
               this.field3351 = var11;
               var10000 = var11;
               if (!var9) {
                  if (var11 <= 0) {
                     this.field3353 = null;
                     return;
                  }

                  label313: {
                     var18 = new class66(var11 * 2);
                     if (this.field3345.field7781) {
                        var19 = 0;
                        if (var9 || var19 < var10) {
                           do {
                              var20 = (var13 + var19) * arg2.field5769 + var12;
                              var21 = 0;
                              if (var9 || ~var21 > ~var10) {
                                 do {
                                    var22 = arg2.field11131[var20++];
                                    if (var22 == null) {
                                       ++var21;
                                    } else {
                                       var23 = 0;
                                       if (var9) {
                                          var18.method611(var22[var23] & 65535, -1344798296);
                                          ++var23;
                                       }

                                       while(var23 < var22.length) {
                                          var18.method611(var22[var23] & 65535, -1344798296);
                                          ++var23;
                                       }

                                       ++var21;
                                    }
                                 } while(~var21 > ~var10);
                              }

                              ++var19;
                           } while(var19 < var10);
                        }

                        if (!var9) {
                           break label313;
                        }
                     }

                     var24 = 0;
                     if (var9 || ~var24 > ~var10) {
                        do {
                           var25 = (var13 + var24) * arg2.field5769 - -var12;
                           var26 = 0;
                           if (var9 || ~var10 < ~var26) {
                              do {
                                 var27 = arg2.field11131[var25++];
                                 if (var27 == null) {
                                    ++var26;
                                 } else {
                                    var28 = 0;
                                    if (var9) {
                                       var18.method644((byte)-65, 65535 & var27[var28]);
                                       ++var28;
                                    }

                                    while(var28 < var27.length) {
                                       var18.method644((byte)-65, 65535 & var27[var28]);
                                       ++var28;
                                    }

                                    ++var26;
                                 }
                              } while(~var10 < ~var26);
                           }

                           ++var24;
                        } while(~var24 > ~var10);
                     }
                  }

                  this.field3342 = this.field3345.method4015(var18.field864, 2, false, 5123, var18.field859);
                  this.field3346 = new class750(this.field3345, 5123, (byte[])null, 1);
                  return;
               }
            } else {
               var10000 = (var13 + var14) * arg2.field5769 - -var12;
            }

            var15 = var10000;
            var16 = 0;
            if (var9) {
               var17 = arg2.field11131[var15++];
               if (var17 != null) {
                  var11 += var17.length;
               }

               ++var16;
            }
         }

         while(true) {
            while(var16 < var10) {
               var17 = arg2.field11131[var15++];
               if (var17 != null) {
                  var11 += var17.length;
               }

               ++var16;
            }

            ++var14;
            if (var10 <= var14) {
               this.field3351 = var11;
               var10000 = var11;
               if (!var9) {
                  if (var11 <= 0) {
                     this.field3353 = null;
                     return;
                  }

                  label321: {
                     var18 = new class66(var11 * 2);
                     if (this.field3345.field7781) {
                        var19 = 0;
                        if (var9 || var19 < var10) {
                           do {
                              var20 = (var13 + var19) * arg2.field5769 + var12;
                              var21 = 0;
                              if (var9 || ~var21 > ~var10) {
                                 do {
                                    var22 = arg2.field11131[var20++];
                                    if (var22 == null) {
                                       ++var21;
                                    } else {
                                       var23 = 0;
                                       if (var9) {
                                          var18.method611(var22[var23] & 65535, -1344798296);
                                          ++var23;
                                       }

                                       while(var23 < var22.length) {
                                          var18.method611(var22[var23] & 65535, -1344798296);
                                          ++var23;
                                       }

                                       ++var21;
                                    }
                                 } while(~var21 > ~var10);
                              }

                              ++var19;
                           } while(var19 < var10);
                        }

                        if (!var9) {
                           break label321;
                        }
                     }

                     var24 = 0;
                     if (var9 || ~var24 > ~var10) {
                        do {
                           var25 = (var13 + var24) * arg2.field5769 - -var12;
                           var26 = 0;
                           if (var9 || ~var10 < ~var26) {
                              do {
                                 var27 = arg2.field11131[var25++];
                                 if (var27 == null) {
                                    ++var26;
                                 } else {
                                    var28 = 0;
                                    if (var9) {
                                       var18.method644((byte)-65, 65535 & var27[var28]);
                                       ++var28;
                                    }

                                    while(var28 < var27.length) {
                                       var18.method644((byte)-65, 65535 & var27[var28]);
                                       ++var28;
                                    }

                                    ++var26;
                                 }
                              } while(~var10 < ~var26);
                           }

                           ++var24;
                        } while(~var24 > ~var10);
                     }
                  }

                  this.field3342 = this.field3345.method4015(var18.field864, 2, false, 5123, var18.field859);
                  this.field3346 = new class750(this.field3345, 5123, (byte[])null, 1);
                  return;
               }
            } else {
               var10000 = (var13 + var14) * arg2.field5769 - -var12;
            }

            var15 = var10000;
            var16 = 0;
            if (var9) {
               var17 = arg2.field11131[var15++];
               if (var17 != null) {
                  var11 += var17.length;
               }

               ++var16;
            }
         }
      } catch (RuntimeException var30) {
         throw class93.method866(var30, field3358[6] + (arg0 != null ? field3358[2] : field3358[0]) + ',' + (arg1 != null ? field3358[2] : field3358[0]) + ',' + (arg2 != null ? field3358[2] : field3358[0]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2118(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 53);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2119(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 48;
            break;
         case 1:
            var10005 = 94;
            break;
         case 2:
            var10005 = 72;
            break;
         case 3:
            var10005 = 113;
            break;
         default:
            var10005 = 53;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
