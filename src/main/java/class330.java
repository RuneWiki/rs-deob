import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class330 {
   @OriginalMember(
      owner = "client!aj",
      name = "m",
      descriptor = "B"
   )
   public byte field4708 = 0;
   @OriginalMember(
      owner = "client!aj",
      name = "o",
      descriptor = "I"
   )
   private int field4709 = -1;
   @OriginalMember(
      owner = "client!aj",
      name = "C",
      descriptor = "I"
   )
   public int field4721 = -1;
   @OriginalMember(
      owner = "client!aj",
      name = "v",
      descriptor = "I"
   )
   private int field4723 = 0;
   @OriginalMember(
      owner = "client!aj",
      name = "B",
      descriptor = "I"
   )
   private int field4732 = 128;
   @OriginalMember(
      owner = "client!aj",
      name = "q",
      descriptor = "Z"
   )
   public boolean field4730 = false;
   @OriginalMember(
      owner = "client!aj",
      name = "d",
      descriptor = "I"
   )
   private int field4735 = 0;
   @OriginalMember(
      owner = "client!aj",
      name = "g",
      descriptor = "I"
   )
   private int field4734 = 0;
   @OriginalMember(
      owner = "client!aj",
      name = "x",
      descriptor = "I"
   )
   private int field4731 = 128;
   @OriginalMember(
      owner = "client!aj",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4737 = new String[]{method2512(method2511("\r@zl\t")), method2512(method2511("\u0017\u0004z\n\\")), method2512(method2511("\u0018\u001b8.")), method2512(method2511("\u0017\u0004z\u0003\\")), method2512(method2511("\u0017\u0004z\u0006\\")), method2512(method2511("\u0017\u0004z\t\\")), method2512(method2511("\u0017\u0004z\u0004\\")), method2512(method2511("\u0017\u0004z\b\\")), method2512(method2511("\u0017\u0004z\u0000\\")), method2512(method2511("\u0017\u0004z\u0005\\")), method2512(method2511("\u0017\u0004z\u000b\\")), method2512(method2511("\u0017\u0004z\u0007\\")), method2512(method2511("\u0017\u0004z\u0001\\"))};
   @OriginalMember(
      owner = "client!aj",
      name = "h",
      descriptor = "[Z"
   )
   public static boolean[] field4716 = new boolean[8];
   @OriginalMember(
      owner = "client!aj",
      name = "r",
      descriptor = "I"
   )
   public static int field4725 = 0;
   @OriginalMember(
      owner = "client!aj",
      name = "j",
      descriptor = "I"
   )
   public static int field4711;
   @OriginalMember(
      owner = "client!aj",
      name = "b",
      descriptor = "I"
   )
   public static int field4712;
   @OriginalMember(
      owner = "client!aj",
      name = "i",
      descriptor = "I"
   )
   public static int field4714;
   @OriginalMember(
      owner = "client!aj",
      name = "e",
      descriptor = "I"
   )
   public int field4717;
   @OriginalMember(
      owner = "client!aj",
      name = "n",
      descriptor = "I"
   )
   public static int field4718;
   @OriginalMember(
      owner = "client!aj",
      name = "y",
      descriptor = "I"
   )
   public static int field4719;
   @OriginalMember(
      owner = "client!aj",
      name = "w",
      descriptor = "I"
   )
   public static int field4720;
   @OriginalMember(
      owner = "client!aj",
      name = "l",
      descriptor = "I"
   )
   public static int field4722;
   @OriginalMember(
      owner = "client!aj",
      name = "f",
      descriptor = "I"
   )
   private int field4724;
   @OriginalMember(
      owner = "client!aj",
      name = "A",
      descriptor = "I"
   )
   public static int field4727;
   @OriginalMember(
      owner = "client!aj",
      name = "z",
      descriptor = "I"
   )
   public static int field4728;
   @OriginalMember(
      owner = "client!aj",
      name = "p",
      descriptor = "I"
   )
   public static int field4736;
   @OriginalMember(
      owner = "client!aj",
      name = "s",
      descriptor = "Lwi;"
   )
   public class491 field4733;
   @OriginalMember(
      owner = "client!aj",
      name = "u",
      descriptor = "Lua;"
   )
   public static class693 field4710;
   @OriginalMember(
      owner = "client!aj",
      name = "a",
      descriptor = "[S"
   )
   private short[] field4713;
   @OriginalMember(
      owner = "client!aj",
      name = "k",
      descriptor = "[S"
   )
   private short[] field4715;
   @OriginalMember(
      owner = "client!aj",
      name = "c",
      descriptor = "[S"
   )
   private short[] field4726;
   @OriginalMember(
      owner = "client!aj",
      name = "t",
      descriptor = "[S"
   )
   private short[] field4729;

   @OriginalMember(
      owner = "client!aj",
      name = "a",
      descriptor = "(BILjj;)V",
      line = 8
   )
   private final void method2500(byte arg0, int arg1, class128 arg2) {
      int var4 = client.field4530;

      try {
         label194: {
            ++field4720;
            if (arg1 != 1) {
               if (arg1 != 2) {
                  if (arg1 == 4) {
                     this.field4732 = arg2.method1038((byte)-125);
                     if (var4 == 0) {
                        break label194;
                     }
                  }

                  if (~arg1 != -6) {
                     if (~arg1 == -7) {
                        this.field4723 = arg2.method1038((byte)-95);
                        if (var4 == 0) {
                           break label194;
                        }
                     }

                     if (~arg1 != -8) {
                        if (~arg1 != -9) {
                           if (~arg1 == -10) {
                              this.field4708 = 3;
                              this.field4709 = 8224;
                              if (var4 == 0) {
                                 break label194;
                              }
                           }

                           if (~arg1 == -11) {
                              this.field4730 = true;
                              if (var4 == 0) {
                                 break label194;
                              }
                           }

                           if (~arg1 == -12) {
                              this.field4708 = 1;
                              if (var4 == 0) {
                                 break label194;
                              }
                           }

                           if (~arg1 != -13) {
                              if (~arg1 == -14) {
                                 this.field4708 = 5;
                                 if (var4 == 0) {
                                    break label194;
                                 }
                              }

                              if (~arg1 != -15) {
                                 if (arg1 == 15) {
                                    this.field4708 = 3;
                                    this.field4709 = arg2.method1038((byte)-101);
                                    if (var4 == 0) {
                                       break label194;
                                    }
                                 }

                                 if (arg1 == 16) {
                                    this.field4708 = 3;
                                    this.field4709 = arg2.method1041(4758);
                                    if (var4 == 0) {
                                       break label194;
                                    }
                                 }

                                 if (~arg1 != -41) {
                                    if (arg1 != 41) {
                                       break label194;
                                    }

                                    int var5 = arg2.method1104(255);
                                    this.field4713 = new short[var5];
                                    this.field4715 = new short[var5];
                                    int var6 = 0;
                                    if (var4 != 0) {
                                       this.field4715[var6] = (short)arg2.method1038((byte)-106);
                                       this.field4713[var6] = (short)arg2.method1038((byte)-99);
                                       ++var6;
                                    }

                                    while(true) {
                                       while(var6 < var5) {
                                          this.field4715[var6] = (short)arg2.method1038((byte)-106);
                                          this.field4713[var6] = (short)arg2.method1038((byte)-99);
                                          ++var6;
                                       }

                                       if (var4 == 0) {
                                          if (var4 == 0) {
                                             break label194;
                                          }
                                          break;
                                       }

                                       ++var6;
                                    }
                                 }

                                 int var7 = arg2.method1104(255);
                                 this.field4726 = new short[var7];
                                 this.field4729 = new short[var7];
                                 int var8 = 0;
                                 if (var4 != 0) {
                                    this.field4729[var8] = (short)arg2.method1038((byte)-128);
                                    this.field4726[var8] = (short)arg2.method1038((byte)-105);
                                    ++var8;
                                 }

                                 while(true) {
                                    while(~var7 < ~var8) {
                                       this.field4729[var8] = (short)arg2.method1038((byte)-128);
                                       this.field4726[var8] = (short)arg2.method1038((byte)-105);
                                       ++var8;
                                    }

                                    if (var4 == 0) {
                                       if (var4 == 0) {
                                          break label194;
                                       }
                                       break;
                                    }

                                    ++var8;
                                 }
                              }

                              this.field4708 = 2;
                              this.field4709 = 256 * arg2.method1104(255);
                              if (var4 == 0) {
                                 break label194;
                              }
                           }

                           this.field4708 = 4;
                           if (var4 == 0) {
                              break label194;
                           }
                        }

                        this.field4735 = arg2.method1104(255);
                        if (var4 == 0) {
                           break label194;
                        }
                     }

                     this.field4734 = arg2.method1104(255);
                     if (var4 == 0) {
                        break label194;
                     }
                  }

                  this.field4731 = arg2.method1038((byte)-109);
                  if (var4 == 0) {
                     break label194;
                  }
               }

               this.field4721 = arg2.method1038((byte)-126);
               if (var4 == 0) {
                  break label194;
               }
            }

            this.field4724 = arg2.method1038((byte)-106);
         }

         if (arg0 < 106) {
            this.field4734 = 117;
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field4737[8] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4737[0] : field4737[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aj",
      name = "a",
      descriptor = "(ILiu;Liu;)V",
      line = 130
   )
   public static final void method2501(int arg0, class604 arg1, class604 arg2) {
      try {
         ++field4718;
         if (arg1.field8881 != null) {
            arg1.method4413((byte)4);
         }

         arg1.field8881 = arg2.field8881;
         arg1.field8886 = arg2;
         arg1.field8881.field8886 = arg1;
         if (arg0 != 0) {
            method2503(-43, -50, 87);
         }

         arg1.field8886.field8881 = arg1;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field4737[1] + arg0 + ',' + (arg1 != null ? field4737[0] : field4737[2]) + ',' + (arg2 != null ? field4737[0] : field4737[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aj",
      name = "a",
      descriptor = "(IBLs;Ls;Lha;IIILsg;IIZI)Lka;",
      line = 149
   )
   public final class497 method2502(int arg0, byte arg1, class293 arg2, class293 arg3, class66 arg4, int arg5, int arg6, int arg7, class417 arg8, int arg9, int arg10, boolean arg11, int arg12) {
      try {
         if (arg1 != 2) {
            this.field4715 = null;
         }

         ++field4736;
         return this.method2510(arg10, arg12, arg8, arg2, (byte)5, arg4, arg7, arg6, arg9, (byte)2, arg3, arg5, arg11, arg0);
      } catch (RuntimeException var15) {
         throw class670.method4877(var15, field4737[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4737[0] : field4737[2]) + ',' + (arg3 != null ? field4737[0] : field4737[2]) + ',' + (arg4 != null ? field4737[0] : field4737[2]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field4737[0] : field4737[2]) + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aj",
      name = "a",
      descriptor = "(III)I",
      line = 166
   )
   public static final int method2503(int arg0, int arg1, int arg2) {
      int var3 = client.field4530;

      try {
         ++field4712;
         int var4 = arg2;
         if (var3 != 0) {
            if (~(1 & arg1) != -1) {
               var4 = arg0 * arg2;
            }

            arg0 *= arg0;
            arg1 >>= 1;
         }

         while(true) {
            int var10000;
            byte var10001;
            if (~arg1 >= -2) {
               var10000 = ~arg1;
               var10001 = -2;
               if (var3 == 0) {
                  if (var10000 == -2) {
                     return arg0 * var4;
                  }

                  return var4;
               }
            } else {
               var10000 = ~(1 & arg1);
               var10001 = -1;
            }

            if (var10000 != var10001) {
               var4 = arg0 * var4;
            }

            arg0 *= arg0;
            arg1 >>= 1;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field4737[11] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aj",
      name = "a",
      descriptor = "(Ljj;I)V",
      line = 189
   )
   public final void method2504(class128 arg0, int arg1) {
      int var3 = client.field4530;

      try {
         ++field4714;
         if (arg1 == 31336) {
            do {
               int var4 = arg0.method1104(255);
               if (~var4 == -1) {
                  break;
               }

               this.method2500((byte)116, var4, arg0);
            } while(var3 == 0);

         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field4737[3] + (arg0 != null ? field4737[0] : field4737[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aj",
      name = "a",
      descriptor = "(Lsg;ILha;IIII)Lka;",
      line = 211
   )
   public final class497 method2505(class417 arg0, int arg1, class66 arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         ++field4728;
         if (arg6 != -10) {
            this.field4734 = -113;
         }

         return this.method2510(arg4, arg3, arg0, (class293)null, (byte)5, arg2, 0, 0, 0, (byte)2, (class293)null, arg1, false, arg5);
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field4737[7] + (arg0 != null ? field4737[0] : field4737[2]) + ',' + arg1 + ',' + (arg2 != null ? field4737[0] : field4737[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aj",
      name = "a",
      descriptor = "(ILsg;IBILha;II)Lka;",
      line = 235
   )
   public final class497 method2506(int arg0, class417 arg1, int arg2, byte arg3, int arg4, class66 arg5, int arg6, int arg7) {
      try {
         if (arg0 != 16643) {
            this.method2510(3, -118, (class417)null, (class293)null, (byte)87, (class66)null, -67, 127, 67, (byte)-102, (class293)null, -127, false, 15);
         }

         ++field4727;
         return this.method2510(arg4, arg6, arg1, (class293)null, (byte)5, arg5, 0, 0, 0, arg3, (class293)null, arg2, false, arg7);
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field4737[5] + arg0 + ',' + (arg1 != null ? field4737[0] : field4737[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field4737[0] : field4737[2]) + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aj",
      name = "a",
      descriptor = "(I)V",
      line = 246
   )
   public static final void method2507(int arg0) {
      try {
         class96.field1187 = -1;
         class283.field3939 = null;
         class280.field3897 = null;
         class616.field9011 = null;
         if (arg0 != 0) {
            method2501(113, (class604)null, (class604)null);
         }

         class445.field6759 = -1;
         class102.field1254 = null;
         class252.field3376 = -1;
         class4.field85 = -1;
         class178.field2201 = null;
         class232.field2956 = null;
         class681.field10231 = null;
         ++field4719;
         class366.field5511.method5144(true);
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field4737[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aj",
      name = "a",
      descriptor = "(BLjj;)Lkv;",
      line = 283
   )
   public static final class281 method2508(byte arg0, class128 arg1) {
      try {
         ++field4722;
         int var2 = arg1.method1104(255);
         class590 var3 = class721.method5223(-123)[arg1.method1104(arg0 + 258)];
         class378 var4 = class168.method1358(0)[arg1.method1104(255)];
         int var5 = arg1.method1066(32767);
         int var6 = arg1.method1066(32767);
         int var7 = arg1.method1038((byte)-127);
         int var8 = arg1.method1038((byte)-94);
         int var9 = arg1.method1041(4758);
         if (arg0 != -3) {
            return null;
         } else {
            int var10 = arg1.method1041(4758);
            int var11 = arg1.method1041(4758);
            boolean var12 = ~arg1.method1104(arg0 ^ -254) == -2;
            return new class281(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
         }
      } catch (RuntimeException var14) {
         throw class670.method4877(var14, field4737[9] + arg0 + ',' + (arg1 != null ? field4737[0] : field4737[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aj",
      name = "b",
      descriptor = "(I)V",
      line = 319
   )
   public static void method2509(int arg0) {
      try {
         field4716 = null;
         field4710 = null;
         if (arg0 != -6) {
            method2503(-68, -128, -97);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field4737[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aj",
      name = "a",
      descriptor = "(IILsg;Ls;BLha;IIIBLs;IZI)Lka;",
      line = 339
   )
   private final class497 method2510(int arg0, int arg1, class417 arg2, class293 arg3, byte arg4, class66 arg5, int arg6, int arg7, int arg8, byte arg9, class293 arg10, int arg11, boolean arg12, int arg13) {
      int var15 = client.field4530;

      try {
         ++field4711;
         int var16 = arg11;
         class676 var17 = this.field4721 != -1 && ~arg1 != 0 ? arg2.method3189(this.field4721, (byte)-127) : null;
         boolean var30 = arg12 & ~this.field4708 != -1;
         if (var17 != null) {
            var16 = arg11 | var17.method4940(-37, arg1, arg0, false);
         }

         if (var30) {
            var16 |= ~this.field4708 == -4 ? 7 : 2;
         }

         if (~this.field4731 != -129) {
            var16 |= 2;
         }

         if (this.field4732 != 128 || this.field4723 != 0) {
            var16 |= 5;
         }

         class748 var18 = this.field4733.field7265;
         class497 var19;
         synchronized(this.field4733.field7265) {
            var19 = (class497)this.field4733.field7265.method5454((long)(this.field4717 |= arg5.field815 << 29), 18261);
         }

         if (var19 == null || ~arg5.method632(var19.method326(), var16) != -1) {
            if (var19 != null) {
               var16 = arg5.method560(var16, var19.method326());
            }

            int var20 = var16;
            if (this.field4729 != null) {
               var20 = var16 | 16384;
            }

            if (this.field4715 != null) {
               var20 |= 32768;
            }

            class134 var21 = class307.method2325(0, this.field4724, 0, this.field4733.field7256);
            if (var21 == null) {
               return null;
            }

            if (~var21.field1704 > -14) {
               var21.method1142(2, arg4 + 48);
            }

            var19 = arg5.method547(var21, var20, this.field4733.field7267, this.field4734 + 64, this.field4735 + 850);
            if (this.field4729 != null) {
               int var22 = 0;
               if (var15 != 0 || ~this.field4729.length < ~var22) {
                  do {
                     var19.method320(this.field4729[var22], this.field4726[var22]);
                     ++var22;
                  } while(~this.field4729.length < ~var22);
               }
            }

            if (this.field4715 != null) {
               int var23 = 0;
               if (var15 != 0 || ~this.field4715.length < ~var23) {
                  do {
                     var19.method324(this.field4715[var23], this.field4713[var23]);
                     ++var23;
                  } while(~this.field4715.length < ~var23);
               }
            }

            var19.method333(var16);
            class748 var24 = this.field4733.field7265;
            synchronized(this.field4733.field7265) {
               this.field4733.field7265.method5455(arg4 + -2054, var19, (long)(this.field4717 |= arg5.field815 << 29));
            }
         }

         class497 var25 = var17 == null ? var19.method343(arg9, var16, true) : var17.method4932(arg1, 0, var16, arg0, var19, arg9, 0, arg13);
         if (~this.field4732 != -129 || this.field4731 != 128) {
            var25.method346(this.field4732, this.field4731, this.field4732);
         }

         if (arg4 != 5) {
            return null;
         } else {
            if (this.field4723 != 0) {
               if (this.field4723 == 90) {
                  var25.method316(4096);
               }

               if (~this.field4723 == -181) {
                  var25.method316(8192);
               }

               if (~this.field4723 == -271) {
                  var25.method316(12288);
               }
            }

            if (var30) {
               var25.method322(this.field4708, this.field4709, arg3, arg10, arg7, arg8, arg6);
            }

            var25.method333(arg11);
            return var25;
         }
      } catch (RuntimeException var29) {
         throw class670.method4877(var29, field4737[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4737[0] : field4737[2]) + ',' + (arg3 != null ? field4737[0] : field4737[2]) + ',' + arg4 + ',' + (arg5 != null ? field4737[0] : field4737[2]) + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + (arg10 != null ? field4737[0] : field4737[2]) + ',' + arg11 + ',' + arg12 + ',' + arg13 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2511(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 116);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2512(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 118;
            break;
         case 1:
            var10005 = 110;
            break;
         case 2:
            var10005 = 84;
            break;
         case 3:
            var10005 = 66;
            break;
         default:
            var10005 = 116;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
