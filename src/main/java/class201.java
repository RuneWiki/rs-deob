import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class201 extends class707 implements class86 {
   @OriginalMember(
      owner = "client!kk",
      name = "eb",
      descriptor = "Z"
   )
   private boolean field2524;
   @OriginalMember(
      owner = "client!kk",
      name = "fb",
      descriptor = "S"
   )
   private short field2515;
   @OriginalMember(
      owner = "client!kk",
      name = "N",
      descriptor = "B"
   )
   private byte field2512;
   @OriginalMember(
      owner = "client!kk",
      name = "M",
      descriptor = "Z"
   )
   private boolean field2533;
   @OriginalMember(
      owner = "client!kk",
      name = "gb",
      descriptor = "B"
   )
   private byte field2517;
   @OriginalMember(
      owner = "client!kk",
      name = "R",
      descriptor = "Z"
   )
   private boolean field2521;
   @OriginalMember(
      owner = "client!kk",
      name = "T",
      descriptor = "Lr;"
   )
   private class193 field2528;
   @OriginalMember(
      owner = "client!kk",
      name = "Z",
      descriptor = "Lka;"
   )
   private class497 field2534;
   @OriginalMember(
      owner = "client!kk",
      name = "nb",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2536 = new String[]{method1552(method1551("^\u001b=hP")), method1552(method1551("N^=\u0002\u0005")), method1552(method1551("K@\u007f*")), method1552(method1551("N^=\u0015\u0005")), method1552(method1551("N^=\u0017\u0005")), method1552(method1551("N^=\u000f\u0005")), method1552(method1551("N^=\u0014\u0005")), method1552(method1551("N^=\u0007l\r")), method1552(method1551("N^=\u0010\u0005")), method1552(method1551("N^=\u0003l\r")), method1552(method1551("N^=\b\u0005")), method1552(method1551("N^=\t\u0005")), method1552(method1551("N^=\u0005l\r")), method1552(method1551("N^=\r\u0005")), method1552(method1551("N^=\u000e\u0005")), method1552(method1551("N^=\n\u0005")), method1552(method1551("N^=\u0016\u0005")), method1552(method1551("N^=\f\u0005")), method1552(method1551("N^=\u000b\u0005")), method1552(method1551("N^=zDK\\gx\u0005")), method1552(method1551("N^=\u0002l\r")), method1552(method1551("N^=\u0012\u0005"))};
   @OriginalMember(
      owner = "client!kk",
      name = "bb",
      descriptor = "Lwia;"
   )
   public static class791 field2535 = new class791(16);
   @OriginalMember(
      owner = "client!kk",
      name = "db",
      descriptor = "I"
   )
   public static int field2508;
   @OriginalMember(
      owner = "client!kk",
      name = "ab",
      descriptor = "I"
   )
   public static int field2509;
   @OriginalMember(
      owner = "client!kk",
      name = "U",
      descriptor = "I"
   )
   public static int field2510;
   @OriginalMember(
      owner = "client!kk",
      name = "kb",
      descriptor = "I"
   )
   public static int field2511;
   @OriginalMember(
      owner = "client!kk",
      name = "hb",
      descriptor = "I"
   )
   public static int field2513;
   @OriginalMember(
      owner = "client!kk",
      name = "lb",
      descriptor = "I"
   )
   public static int field2514;
   @OriginalMember(
      owner = "client!kk",
      name = "Y",
      descriptor = "I"
   )
   public static int field2516;
   @OriginalMember(
      owner = "client!kk",
      name = "jb",
      descriptor = "I"
   )
   public static int field2518;
   @OriginalMember(
      owner = "client!kk",
      name = "X",
      descriptor = "I"
   )
   public static int field2519;
   @OriginalMember(
      owner = "client!kk",
      name = "P",
      descriptor = "I"
   )
   public static int field2520;
   @OriginalMember(
      owner = "client!kk",
      name = "V",
      descriptor = "I"
   )
   public static int field2522;
   @OriginalMember(
      owner = "client!kk",
      name = "mb",
      descriptor = "I"
   )
   public static int field2523;
   @OriginalMember(
      owner = "client!kk",
      name = "ib",
      descriptor = "I"
   )
   public static int field2525;
   @OriginalMember(
      owner = "client!kk",
      name = "Q",
      descriptor = "I"
   )
   public static int field2526;
   @OriginalMember(
      owner = "client!kk",
      name = "L",
      descriptor = "I"
   )
   public static int field2527;
   @OriginalMember(
      owner = "client!kk",
      name = "W",
      descriptor = "I"
   )
   public static int field2529;
   @OriginalMember(
      owner = "client!kk",
      name = "S",
      descriptor = "I"
   )
   public static int field2530;
   @OriginalMember(
      owner = "client!kk",
      name = "O",
      descriptor = "I"
   )
   public static int field2531;
   @OriginalMember(
      owner = "client!kk",
      name = "cb",
      descriptor = "Lcka;"
   )
   private class185 field2532;

   @OriginalMember(
      owner = "client!kk",
      name = "a",
      descriptor = "(IILha;I)Z",
      line = 3
   )
   public final boolean method20(int arg0, int arg1, class66 arg2, int arg3) {
      try {
         ++field2513;
         class497 var5 = this.method1549(arg1, -17729, arg2);
         if (var5 != null) {
            class540 var6 = arg2.method659();
            var6.method1530(super.field9003, super.field8998, super.field9007);
            return class88.field1076 ? var5.method331(arg3, arg0, var6, false, 0, class221.field2828) : var5.method318(arg3, arg0, var6, false, 0);
         } else {
            return false;
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field2536[21] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2536[0] : field2536[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "a",
      descriptor = "(Lha;B)V",
      line = 22
   )
   public final void method351(class66 arg0, byte arg1) {
      try {
         ++field2511;
         if (arg1 >= -115) {
            this.method1549(89, 102, (class66)null);
         }

         Object var3 = null;
         class193 var5;
         if (this.field2528 == null && this.field2521) {
            class630 var4 = this.method1550(262144, arg0, -127, true);
            var5 = var4 == null ? null : var4.field9164;
         } else {
            var5 = this.field2528;
            this.field2528 = null;
         }

         if (var5 != null) {
            class227.method1715(var5, super.field9005, super.field9003, super.field9007, (boolean[])null);
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field2536[17] + (arg0 != null ? field2536[0] : field2536[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "j",
      descriptor = "(I)Z",
      line = 50
   )
   public final boolean method5(int arg0) {
      try {
         ++field2529;
         if (arg0 != -26787) {
            this.field2515 = -31;
         }

         return this.field2534 != null ? this.field2534.method295() : false;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2536[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "<init>",
      descriptor = "(Lha;Lde;IIIIIZIIII)V",
      line = 68
   )
   public class201(class66 arg0, class557 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
      super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);

      try {
         this.field2524 = arg7;
         this.field2515 = (short)arg1.field8274;
         this.field2512 = (byte)arg11;
         super.field9003 = arg4;
         super.field9007 = arg6;
         this.field2533 = ~arg1.field8317 != -1 && !arg7;
         this.field2517 = (byte)arg10;
         this.field2521 = arg0.method634() && arg1.field8341 && !this.field2524 && class261.field3566.field9453.method3566(125) != 0;
         class630 var13 = this.method1550(2048, arg0, -69, this.field2521);
         if (var13 != null) {
            this.field2528 = var13.field9164;
            this.field2534 = var13.field9161;
         }
      } catch (RuntimeException var15) {
         throw class670.method4877(var15, field2536[19] + (arg0 != null ? field2536[0] : field2536[2]) + ',' + (arg1 != null ? field2536[0] : field2536[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "a",
      descriptor = "(I)Z",
      line = 95
   )
   public final boolean method353(int arg0) {
      try {
         ++field2508;
         if (arg0 != 1197) {
            this.method358(62);
         }

         return this.field2521;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2536[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "a",
      descriptor = "(Lha;I)Lvw;",
      line = 106
   )
   public final class319 method10(class66 arg0, int arg1) {
      try {
         ++field2514;
         if (this.field2534 == null) {
            return null;
         } else {
            class540 var3 = arg0.method659();
            if (arg1 != -1) {
               return null;
            } else {
               var3.method1530(super.field10583 + super.field9003, super.field8998, super.field10573 + super.field9007);
               class319 var4 = class487.method3611(this.field2533, (byte)-48, 1);
               if (class88.field1076) {
                  this.field2534.method338(var3, var4.field4560[0], class221.field2828, 0);
                  if (client.field4530 == 0) {
                     return var4;
                  }
               }

               this.field2534.method301(var3, var4.field4560[0], 0);
               return var4;
            }
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field2536[9] + (arg0 != null ? field2536[0] : field2536[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "e",
      descriptor = "(B)V",
      line = 133
   )
   public static void method1547(byte arg0) {
      try {
         if (arg0 < 82) {
            field2535 = null;
         }

         field2535 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field2536[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "b",
      descriptor = "(ILha;)Lcka;",
      line = 143
   )
   public final class185 method16(int arg0, class66 arg1) {
      try {
         if (arg0 > -114) {
            this.field2515 = -65;
         }

         ++field2526;
         if (this.field2532 == null) {
            this.field2532 = class356.method2778(super.field8998, this.method1549(0, -17729, arg1), (byte)127, super.field9003, super.field9007);
         }

         return this.field2532;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field2536[15] + arg0 + ',' + (arg1 != null ? field2536[0] : field2536[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "h",
      descriptor = "(I)Z",
      line = 159
   )
   public final boolean method2(int arg0) {
      try {
         if (arg0 != -7577) {
            this.field2524 = false;
         }

         ++field2527;
         if (this.field2534 == null) {
            return true;
         } else {
            return !this.field2534.method332();
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2536[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "b",
      descriptor = "(I)I",
      line = 178
   )
   public final int method350(int arg0) {
      try {
         ++field2520;
         return arg0 != 25061 ? 0 : this.field2515 & 65535;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2536[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "a",
      descriptor = "(ILha;)V",
      line = 189
   )
   public final void method354(int arg0, class66 arg1) {
      try {
         ++field2510;
         Object var3 = null;
         class193 var5;
         if (this.field2528 == null && this.field2521) {
            class630 var4 = this.method1550(262144, arg1, -80, true);
            var5 = var4 == null ? null : var4.field9164;
         } else {
            var5 = this.field2528;
            this.field2528 = null;
         }

         if (arg0 != 30494) {
            method1547((byte)122);
         }

         if (var5 != null) {
            class234.method1757(var5, super.field9005, super.field9003, super.field9007, (boolean[])null);
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field2536[6] + arg0 + ',' + (arg1 != null ? field2536[0] : field2536[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "a",
      descriptor = "(Llh;IIIII)V",
      line = 220
   )
   public static final void method1548(class552 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      int var6 = client.field4530;

      try {
         ++field2525;
         if (arg0.field8169 != -1 || arg0.field8181 != null) {
            int var7;
            int var8;
            label208: {
               var7 = arg4;
               var8 = arg0.field8170 * class261.field3566.field9429.method1271(arg4 + 101) >> 8;
               if (arg5 <= arg0.field8183) {
                  if (arg0.field8179 <= arg5) {
                     break label208;
                  }

                  var7 = -arg5 + arg0.field8179 + arg4;
                  if (var6 == 0) {
                     break label208;
                  }
               }

               var7 += -arg0.field8183 + arg5;
            }

            label201: {
               if (~arg0.field8192 <= ~arg3) {
                  if (~arg0.field8164 >= ~arg3) {
                     break label201;
                  }

                  var7 += -arg3 + arg0.field8164;
                  if (var6 == 0) {
                     break label201;
                  }
               }

               var7 += -arg0.field8192 + arg3;
            }

            if (~arg0.field8174 != -1 && arg0.field8174 >= var7 + -256 && class261.field3566.field9429.method1271(95) != 0 && arg0.field8178 == arg2) {
               var7 -= 256;
               if (~var7 > -1) {
                  var7 = 0;
               }

               int var9 = -arg0.field8173 + arg0.field8174;
               if (~var9 > -1) {
                  var9 = arg0.field8174;
               }

               int var10 = var8;
               int var11 = var7 - arg0.field8173;
               if (var11 > 0 && ~var9 < -1) {
                  var10 = (-var11 + var9) * var8 / var9;
               }

               class693.field10418.method3046(-101);
               int var12 = 8192;
               int var13 = (arg0.field8183 + arg0.field8179) / 2 + -arg5;
               int var14 = (arg0.field8192 + arg0.field8164) / 2 + -arg3;
               if (~var13 != -1 || ~var14 != -1) {
                  int var15 = 16383 & -class292.field4078 + -((int)(2607.5945876176133D * Math.atan2((double)var13, (double)var14))) + -4096;
                  if (~var15 < -8193) {
                     var15 = -var15 + 16384;
                  }

                  int var16;
                  label216: {
                     if (~var7 >= -1) {
                        var16 = 8192;
                        if (var6 == 0) {
                           break label216;
                        }
                     }

                     if (var7 >= 4096) {
                        var16 = 16384;
                        if (var6 == 0) {
                           break label216;
                        }
                     }

                     var16 = var7 * 8192 / 4096 + 8192;
                  }

                  var12 = var15 * var16 / 8192 - -(-var16 + 16384 >> 1);
               }

               label171: {
                  if (arg0.field8176 == null) {
                     if (arg0.field8169 < 0) {
                        break label171;
                     }

                     int var17 = ~arg0.field8193 == -257 && arg0.field8194 == 256 ? 256 : class7.method59((byte)-56, arg0.field8193, arg0.field8194);
                     if (!arg0.field8163) {
                        class294 var18 = class294.method2243(class491.field7266, arg0.field8169, 0);
                        if (var18 == null) {
                           break label171;
                        }

                        class640 var19 = var18.method2241().method4606(class550.field8139);
                        class727 var20 = class727.method5291(var19, var17, var10 << 6, var12);
                        var20.method5266(-1);
                        class149.field1871.method5589(var20);
                        arg0.field8176 = var20;
                        if (var6 == 0) {
                           break label171;
                        }
                     }

                     if (arg0.field8186 == null) {
                        arg0.field8186 = class116.method965(class604.field8882, arg0.field8169);
                     }

                     if (arg0.field8186 == null) {
                        break label171;
                     }

                     if (arg0.field8184 == null) {
                        arg0.field8184 = arg0.field8186.method970(new int[]{22050});
                     }

                     if (arg0.field8184 == null) {
                        break label171;
                     }

                     class727 var21 = class727.method5291(arg0.field8184, var17, var10 << 6, var12);
                     var21.method5266(-1);
                     class149.field1871.method5589(var21);
                     arg0.field8176 = var21;
                     if (var6 == 0) {
                        break label171;
                     }
                  }

                  arg0.field8176.method5276(var10);
                  arg0.field8176.method5282(var12);
               }

               if (arg0.field8182 == null) {
                  if (arg0.field8181 != null && (arg0.field8165 -= arg1) <= 0) {
                     int var22 = arg0.field8193 == 256 && ~arg0.field8194 == -257 ? 256 : (int)(Math.random() * (double)(-arg0.field8194 + arg0.field8193)) + arg0.field8194;
                     if (arg0.field8189) {
                        if (arg0.field8188 == null) {
                           int var23 = (int)(Math.random() * (double)arg0.field8181.length);
                           arg0.field8188 = class116.method965(class604.field8882, arg0.field8181[var23]);
                        }

                        if (arg0.field8188 != null) {
                           if (arg0.field8195 == null) {
                              arg0.field8195 = arg0.field8188.method970(new int[]{22050});
                           }

                           if (arg0.field8195 != null) {
                              class727 var24 = class727.method5291(arg0.field8195, var22, var10 << 6, var12);
                              var24.method5266(0);
                              class149.field1871.method5589(var24);
                              arg0.field8182 = var24;
                              arg0.field8165 = arg0.field8166 - -((int)((double)(-arg0.field8166 + arg0.field8175) * Math.random()));
                              return;
                           }
                        }
                     } else {
                        int var25 = (int)(Math.random() * (double)arg0.field8181.length);
                        class294 var26 = class294.method2243(class491.field7266, arg0.field8181[var25], 0);
                        if (var26 == null) {
                           return;
                        }

                        class640 var27 = var26.method2241().method4606(class550.field8139);
                        class727 var28 = class727.method5291(var27, var22, var10 << 6, var12);
                        var28.method5266(0);
                        class149.field1871.method5589(var28);
                        arg0.field8182 = var28;
                        arg0.field8165 = (int)((double)(arg0.field8175 - arg0.field8166) * Math.random()) + arg0.field8166;
                     }

                     return;
                  }
               } else {
                  arg0.field8182.method5276(var10);
                  arg0.field8182.method5282(var12);
                  if (arg0.field8182.method2716(0)) {
                     return;
                  }

                  arg0.field8188 = null;
                  arg0.field8195 = null;
                  arg0.field8182 = null;
               }

            } else {
               if (arg0.field8176 != null) {
                  class149.field1871.method5585(arg0.field8176);
                  arg0.field8176 = null;
                  arg0.field8184 = null;
                  arg0.field8186 = null;
               }

               if (arg0.field8182 != null) {
                  class149.field1871.method5585(arg0.field8182);
                  arg0.field8182 = null;
                  arg0.field8188 = null;
                  arg0.field8195 = null;
               }

            }
         }
      } catch (RuntimeException var30) {
         throw class670.method4877(var30, field2536[18] + (arg0 != null ? field2536[0] : field2536[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "d",
      descriptor = "(I)V",
      line = 488
   )
   public final void method352(int arg0) {
      try {
         if (this.field2534 != null) {
            this.field2534.method296();
         }

         if (arg0 != 23291) {
            this.field2515 = 33;
         }

         ++field2530;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2536[20] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "a",
      descriptor = "(IILha;)Lka;",
      line = 504
   )
   private final class497 method1549(int arg0, int arg1, class66 arg2) {
      try {
         ++field2522;
         if (arg1 != -17729) {
            this.field2534 = null;
         }

         if (this.field2534 != null && ~arg2.method632(this.field2534.method326(), arg0) == -1) {
            return this.field2534;
         } else {
            class630 var4 = this.method1550(arg0, arg2, -103, false);
            return var4 != null ? var4.field9161 : null;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field2536[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2536[0] : field2536[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "c",
      descriptor = "(I)I",
      line = 526
   )
   public final int method358(int arg0) {
      try {
         int var2 = 83 / ((arg0 - -79) / 34);
         ++field2509;
         return this.field2512;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field2536[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "e",
      descriptor = "(I)I",
      line = 537
   )
   public final int method355(int arg0) {
      try {
         ++field2518;
         if (arg0 != -29081) {
            field2535 = null;
         }

         return this.field2517;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2536[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "b",
      descriptor = "(Lha;I)V",
      line = 549
   )
   public final void method4(class66 arg0, int arg1) {
      try {
         ++field2531;
         if (arg1 != 50) {
            this.method351((class66)null, (byte)-122);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field2536[4] + (arg0 != null ? field2536[0] : field2536[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "k",
      descriptor = "(I)I",
      line = 562
   )
   public final int method11(int arg0) {
      try {
         if (arg0 != 0) {
            return 127;
         } else {
            ++field2516;
            return this.field2534 != null ? this.field2534.method339() : 0;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2536[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "f",
      descriptor = "(I)I",
      line = 573
   )
   public final int method6(int arg0) {
      try {
         ++field2523;
         if (arg0 <= 44) {
            return 107;
         } else {
            return this.field2534 == null ? 0 : this.field2534.method299();
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2536[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "a",
      descriptor = "(ILha;IZ)Lou;",
      line = 584
   )
   private final class630 method1550(int arg0, class66 arg1, int arg2, boolean arg3) {
      int var5 = client.field4530;

      try {
         ++field2519;
         class557 var6 = class151.field1896.method5072(30, 65535 & this.field2515);
         if (arg2 > -56) {
            this.method16(14, (class66)null);
         }

         class293 var7;
         class293 var8;
         if (this.field2524) {
            var7 = class147.field1843[0];
            var8 = class650.field9484[super.field9005];
            if (var5 == 0) {
               return var6.method4126(arg0, this.field2517, var8, super.field9007, super.field8998, var7, this.field2512, arg1, (class661)null, arg3, super.field9003, -28187);
            }
         }

         var8 = class147.field1843[super.field9005];
         if (~super.field9005 <= -4) {
            var7 = null;
            if (var5 == 0) {
               return var6.method4126(arg0, this.field2517, var8, super.field9007, super.field8998, var7, this.field2512, arg1, (class661)null, arg3, super.field9003, -28187);
            }
         }

         var7 = class147.field1843[super.field9005 + 1];
         return var6.method4126(arg0, this.field2517, var8, super.field9007, super.field8998, var7, this.field2512, arg1, (class661)null, arg3, super.field9003, -28187);
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field2536[5] + arg0 + ',' + (arg1 != null ? field2536[0] : field2536[2]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1551(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 45);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1552(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 37;
            break;
         case 1:
            var10005 = 53;
            break;
         case 2:
            var10005 = 19;
            break;
         case 3:
            var10005 = 70;
            break;
         default:
            var10005 = 45;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
