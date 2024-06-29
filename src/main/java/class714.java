import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class714 {
   @OriginalMember(
      owner = "client!vd",
      name = "k",
      descriptor = "I"
   )
   private int field10476 = 1;
   @OriginalMember(
      owner = "client!vd",
      name = "c",
      descriptor = "I"
   )
   private int field10481 = 1;
   @OriginalMember(
      owner = "client!vd",
      name = "e",
      descriptor = "I"
   )
   private int field10491 = 0;
   @OriginalMember(
      owner = "client!vd",
      name = "p",
      descriptor = "I"
   )
   private int field10490 = 0;
   @OriginalMember(
      owner = "client!vd",
      name = "r",
      descriptor = "Lrca;"
   )
   private class37 field10486 = new class37();
   @OriginalMember(
      owner = "client!vd",
      name = "F",
      descriptor = "Z"
   )
   private boolean field10495 = true;
   @OriginalMember(
      owner = "client!vd",
      name = "E",
      descriptor = "Z"
   )
   private boolean field10498 = true;
   @OriginalMember(
      owner = "client!vd",
      name = "u",
      descriptor = "Z"
   )
   private boolean field10499 = true;
   @OriginalMember(
      owner = "client!vd",
      name = "B",
      descriptor = "Z"
   )
   private boolean field10502 = false;
   @OriginalMember(
      owner = "client!vd",
      name = "l",
      descriptor = "Z"
   )
   private boolean field10503 = true;
   @OriginalMember(
      owner = "client!vd",
      name = "x",
      descriptor = "[Lkk;"
   )
   private class266[] field10505 = new class266[2];
   @OriginalMember(
      owner = "client!vd",
      name = "w",
      descriptor = "I"
   )
   private int field10506 = -1;
   @OriginalMember(
      owner = "client!vd",
      name = "d",
      descriptor = "I"
   )
   private int field10497 = 0;
   @OriginalMember(
      owner = "client!vd",
      name = "h",
      descriptor = "Liu;"
   )
   private class530 field10477;
   @OriginalMember(
      owner = "client!vd",
      name = "a",
      descriptor = "Lrs;"
   )
   private class734 field10489;
   @OriginalMember(
      owner = "client!vd",
      name = "v",
      descriptor = "Lrs;"
   )
   private class734 field10493;
   @OriginalMember(
      owner = "client!vd",
      name = "H",
      descriptor = "Lrs;"
   )
   private class734 field10483;
   @OriginalMember(
      owner = "client!vd",
      name = "J",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10507 = new String[]{method5222(method5221("G\n-\u001d")), method5222(method5221("RQo_\u0001")), method5222(method5221("_\u001boM\u0015G\u00165OT")), method5222(method5221("_\u001bo5T")), method5222(method5221("_\u001bo8T")), method5222(method5221("_\u001bo2T")), method5222(method5221("_\u001bo:T")), method5222(method5221("_\u001bo4T")), method5222(method5221("_\u001bo6T")), method5222(method5221("_\u001bo;T")), method5222(method5221("_\u001bo3T")), method5222(method5221("_\u001bo9T")), method5222(method5221("_\u001bo=T")), method5222(method5221("_\u001bo7T")), method5222(method5221("_\u001bo0T"))};
   @OriginalMember(
      owner = "client!vd",
      name = "A",
      descriptor = "Laka;"
   )
   public static class418 field10488 = new class418(82, 3);
   @OriginalMember(
      owner = "client!vd",
      name = "C",
      descriptor = "I"
   )
   public static int field10500 = -1;
   @OriginalMember(
      owner = "client!vd",
      name = "y",
      descriptor = "I"
   )
   public static int field10473;
   @OriginalMember(
      owner = "client!vd",
      name = "I",
      descriptor = "I"
   )
   public static int field10474;
   @OriginalMember(
      owner = "client!vd",
      name = "b",
      descriptor = "I"
   )
   public static int field10475;
   @OriginalMember(
      owner = "client!vd",
      name = "G",
      descriptor = "I"
   )
   public static int field10478;
   @OriginalMember(
      owner = "client!vd",
      name = "t",
      descriptor = "I"
   )
   public static int field10479;
   @OriginalMember(
      owner = "client!vd",
      name = "D",
      descriptor = "I"
   )
   public static int field10480;
   @OriginalMember(
      owner = "client!vd",
      name = "q",
      descriptor = "I"
   )
   public static int field10482;
   @OriginalMember(
      owner = "client!vd",
      name = "n",
      descriptor = "I"
   )
   public static int field10484;
   @OriginalMember(
      owner = "client!vd",
      name = "i",
      descriptor = "I"
   )
   public static int field10485;
   @OriginalMember(
      owner = "client!vd",
      name = "m",
      descriptor = "I"
   )
   public static int field10487;
   @OriginalMember(
      owner = "client!vd",
      name = "g",
      descriptor = "I"
   )
   public static int field10492;
   @OriginalMember(
      owner = "client!vd",
      name = "z",
      descriptor = "Lkk;"
   )
   private class266 field10501;
   @OriginalMember(
      owner = "client!vd",
      name = "j",
      descriptor = "Llt;"
   )
   private class324 field10496;
   @OriginalMember(
      owner = "client!vd",
      name = "s",
      descriptor = "Llt;"
   )
   private class324 field10504;
   @OriginalMember(
      owner = "client!vd",
      name = "f",
      descriptor = "Z"
   )
   private boolean field10472;
   @OriginalMember(
      owner = "client!vd",
      name = "o",
      descriptor = "[I"
   )
   public static int[] field10494;

   @OriginalMember(
      owner = "client!vd",
      name = "c",
      descriptor = "(I)Z"
   )
   private final boolean method5209(int arg0) {
      boolean var2 = client.field1481;

      try {
         if (this.field10503) {
            if (this.field10496 != null) {
               this.field10496.method2545(118);
               this.field10496 = null;
            }

            if (this.field10501 != null) {
               this.field10501.method4158((byte)-73);
               this.field10501 = null;
            }

            if (this.field10483 != null) {
               this.field10496 = new class324(this.field10477, 6402, this.field10476, this.field10481, this.field10477.field7636);
            }

            label111: {
               if (!this.field10502) {
                  if (this.field10496 != null) {
                     break label111;
                  }

                  this.field10496 = new class324(this.field10477, 6402, this.field10476, this.field10481);
                  if (!var2) {
                     break label111;
                  }
               }

               this.field10501 = new class266(this.field10477, 34037, 6402, this.field10476, this.field10481);
            }

            this.field10503 = false;
            this.field10495 = true;
            this.field10499 = true;
         }

         if (arg0 != 1) {
            this.method5217(true);
         }

         ++field10485;
         if (this.field10498) {
            if (this.field10504 != null) {
               this.field10504.method2545(arg0 + 125);
               this.field10504 = null;
            }

            if (this.field10505[0] != null) {
               this.field10505[0].method4158((byte)-120);
               this.field10505[0] = null;
            }

            if (this.field10505[1] != null) {
               this.field10505[1].method4158((byte)-114);
               this.field10505[1] = null;
            }

            if (this.field10483 != null) {
               this.field10504 = new class324(this.field10477, this.field10506, this.field10476, this.field10481, this.field10477.field7636);
            }

            this.field10505[0] = new class266(this.field10477, 34037, this.field10506, this.field10476, this.field10481);
            this.field10505[1] = this.field10497 <= 1 ? null : new class266(this.field10477, 34037, this.field10506, this.field10476, this.field10481);
            this.field10495 = true;
            this.field10498 = false;
            this.field10499 = true;
         }

         if (this.field10499) {
            label124: {
               if (this.field10483 == null) {
                  this.field10477.method3955(this.field10489, (byte)-52);
                  this.field10489.method5307(0, (byte)86);
                  this.field10489.method5307(1, (byte)86);
                  this.field10489.method5307(8, (byte)86);
                  this.field10489.method5304(this.field10505[0], arg0 + -1, 0);
                  if (this.field10497 > 1) {
                     this.field10489.method5304(this.field10505[1], arg0 ^ 1, 1);
                  }

                  label95: {
                     if (!this.field10502) {
                        this.field10489.method5306(this.field10496, 8, (byte)78);
                        if (!var2) {
                           break label95;
                        }
                     }

                     this.field10489.method5304(this.field10501, 0, 8);
                  }

                  this.field10477.method3995(this.field10489, (byte)-29);
                  if (!var2) {
                     break label124;
                  }
               }

               this.field10477.method3955(this.field10489, (byte)-52);
               this.field10489.method5307(0, (byte)86);
               this.field10489.method5307(1, (byte)86);
               this.field10489.method5307(8, (byte)86);
               this.field10489.method5304(this.field10505[0], 0, 0);
               if (~this.field10497 < -2) {
                  this.field10489.method5304(this.field10505[1], 0, 1);
               }

               if (this.field10502) {
                  this.field10489.method5304(this.field10501, 0, 8);
               }

               this.field10477.method3995(this.field10489, (byte)-29);
               this.field10477.method3955(this.field10483, (byte)-52);
               this.field10483.method5307(0, (byte)86);
               this.field10483.method5307(8, (byte)86);
               this.field10483.method5306(this.field10504, 0, (byte)78);
               this.field10483.method5306(this.field10496, 8, (byte)78);
               this.field10477.method3995(this.field10483, (byte)-29);
            }

            this.field10499 = false;
            this.field10495 = true;
         }

         if (this.field10495) {
            this.field10477.method3955(this.field10493, (byte)-52);
            this.field10495 = !this.field10493.method5309(-36054);
            this.field10477.method3995(this.field10493, (byte)-29);
         }

         return !this.field10495;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10507[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vd",
      name = "b",
      descriptor = "(B)Lija;"
   )
   public static final class160 method5210(byte arg0) {
      try {
         ++field10479;
         if (arg0 < 117) {
            field10488 = null;
         }

         if (class326.field4479 != null && class217.field2750 != null) {
            class217.field2750.method2312(19854, class326.field4479);
            class160 var1 = (class160)class217.field2750.method2313(86);
            if (var1 == null) {
               return null;
            } else {
               class519 var2 = class326.field4471.method4937(var1.field2052, true);
               return var2 != null && var2.field7293 && var2.method3901((byte)72, class326.field4472) ? var1 : class509.method3841(-128);
            }
         } else {
            return null;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10507[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vd",
      name = "a",
      descriptor = "(ZLwca;)Z"
   )
   public final boolean method5211(boolean arg0, class43 arg1) {
      try {
         if (!arg0) {
            this.method5217(true);
         }

         ++field10475;
         if (this.field10493 != null) {
            if (arg1.method324((byte)-80) || arg1.method319((byte)84)) {
               this.field10486.method279(!arg0, arg1);
               this.method5214((byte)5);
               if (this.method5209(1)) {
                  if (~this.field10476 != 0 && ~this.field10481 != 0) {
                     arg1.method315(this.field10476, this.field10481, 1);
                  }

                  arg1.field556 = true;
                  return true;
               }
            }

            this.method5212(arg1, 0);
         }

         return false;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10507[5] + arg0 + ',' + (arg1 != null ? field10507[1] : field10507[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vd",
      name = "a",
      descriptor = "(Lwca;I)V"
   )
   public final void method5212(class43 arg0, int arg1) {
      try {
         arg0.field556 = false;
         ++field10473;
         arg0.method321(55);
         if (arg1 != 0) {
            this.field10503 = false;
         }

         arg0.method4924(-2970);
         this.method5214((byte)5);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10507[14] + (arg0 != null ? field10507[1] : field10507[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vd",
      name = "a",
      descriptor = "(IIIII)Z"
   )
   public final boolean method5213(int arg0, int arg1, int arg2, int arg3, int arg4) {
      boolean var6 = client.field1481;

      try {
         ++field10480;
         int var7 = -10 / ((34 - arg3) / 45);
         if (this.field10493 != null && !this.field10486.method285((byte)-123)) {
            if (~this.field10476 != ~arg4 || ~this.field10481 != ~arg1) {
               this.field10481 = arg1;
               this.field10476 = arg4;
               class673 var8 = this.field10486.method288(0);
               if (var6) {
                  ((class43)var8).method315(this.field10476, this.field10481, 1);
                  var8 = var8.field9972;
               }

               while(true) {
                  while(this.field10486.field527 != var8) {
                     ((class43)var8).method315(this.field10476, this.field10481, 1);
                     var8 = var8.field9972;
                  }

                  this.field10499 = true;
                  this.field10498 = true;
                  if (!var6) {
                     this.field10503 = true;
                     break;
                  }

                  var8 = var8.field9972;
               }
            }

            if (this.method5209(1)) {
               this.field10472 = true;
               this.field10491 = arg0;
               this.field10490 = arg2;
               this.field10477.method3955(this.field10493, (byte)-52);
               this.field10493.method5308(0, -5806);
               this.field10477.method3999(-49, this.field10481 - (-this.field10491 - -this.field10477.field7615), -this.field10490);
               return true;
            } else {
               return false;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field10507[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vd",
      name = "a",
      descriptor = "(B)V"
   )
   private final void method5214(byte arg0) {
      boolean var2 = client.field1481;

      try {
         ++field10482;
         boolean var3 = false;
         if (arg0 != 5) {
            this.field10490 = -14;
         }

         int var4 = 0;
         int var5 = 0;
         class43 var6 = (class43)this.field10486.method288(arg0 ^ 5);
         int var7;
         if (var2) {
            var7 = var6.method318(1);
            var5 += var6.method316((byte)-112);
            if (var4 < var7) {
               var4 = var7;
            }

            var3 |= var6.method320(28429);
            var6 = (class43)this.field10486.method290(17958);
         }

         while(true) {
            int var10000;
            if (var6 == null) {
               var10000 = var4;
               if (!var2) {
                  int var8;
                  label91: {
                     if (var4 == 2) {
                        var8 = 34836;
                        if (!var2) {
                           break label91;
                        }
                     }

                     if (~var4 == -2) {
                        var8 = 34842;
                        if (!var2) {
                           break label91;
                        }
                     }

                     var8 = 6408;
                  }

                  if (~this.field10506 != ~var8) {
                     this.field10506 = var8;
                     this.field10498 = true;
                  }

                  int var9 = ~this.field10497 >= -3 ? this.field10497 : 2;
                  int var10 = var5 > 2 ? 2 : var5;
                  if (var9 != var10) {
                     this.field10499 = this.field10498 = true;
                  }

                  this.field10497 = var5;
                  if (!var3 == this.field10502) {
                     this.field10502 = var3;
                     this.field10503 = true;
                     return;
                  }

                  return;
               }
            } else {
               var10000 = var6.method318(1);
            }

            var7 = var10000;
            var5 += var6.method316((byte)-112);
            if (var4 < var7) {
               var4 = var7;
            }

            var3 |= var6.method320(28429);
            var6 = (class43)this.field10486.method290(17958);
         }
      } catch (RuntimeException var12) {
         throw class93.method866(var12, field10507[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vd",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method5215(boolean arg0) {
      boolean var2 = client.field1481;

      try {
         this.field10501 = null;
         this.field10504 = null;
         if (!arg0) {
            this.field10486 = null;
         }

         this.field10493 = this.field10483 = this.field10489 = null;
         this.field10496 = null;
         this.field10505 = null;
         ++field10484;
         if (!this.field10486.method285((byte)-128)) {
            class673 var3 = this.field10486.method288(0);
            if (var2 || this.field10486.field527 != var3) {
               do {
                  ((class43)var3).method321(113);
                  var3 = var3.field9972;
               } while(this.field10486.field527 != var3);
            }
         }

         this.field10476 = this.field10481 = 1;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field10507[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vd",
      name = "c",
      descriptor = "(Z)V"
   )
   public static final void method5216(boolean arg0) {
      try {
         class234.field2904 = null;
         if (!arg0) {
            class9.field199 = null;
            class754.field11050 = null;
            class350.field4787 = null;
            class54.field742 = null;
            ++field10487;
            class426.field5801 = null;
            class86.field1183 = null;
            class554.field8141 = null;
            class439.field5980 = null;
            class794.field11618 = null;
            class258.field3259 = null;
            class693.field10172 = null;
            class98.field1306 = null;
            class59.field770 = null;
            class332.field4586 = null;
            class209.field2657 = null;
            class762.field11159 = null;
            class426.field5803 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10507[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vd",
      name = "b",
      descriptor = "(Z)Z"
   )
   public final boolean method5217(boolean arg0) {
      try {
         ++field10478;
         if (arg0) {
            method5210((byte)-98);
         }

         return this.field10493 != null;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10507[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vd",
      name = "a",
      descriptor = "(Lid;I)V"
   )
   public static final void method5218(class438 arg0, int arg1) {
      boolean var2 = client.field1481;

      try {
         ++field10492;
         arg0.method125(arg1 ^ -656);
         boolean var3 = false;
         if (arg1 != -14210) {
            method5218((class438)null, 53);
         }

         class438 var4 = (class438)class723.field10572.method5265(-125);
         boolean var10000;
         if (var2) {
            var10000 = class586.method4371(arg0.method3382(false), var4.method3382(false), (byte)56);
         } else if (var4 == null) {
            var10000 = var3;
            if (!var2) {
               if (!var3) {
                  class723.field10572.method5267((byte)102, arg0);
                  return;
               }

               return;
            }
         } else {
            var10000 = class586.method4371(arg0.method3382(false), var4.method3382(false), (byte)56);
         }

         do {
            while(true) {
               if (var10000) {
                  class435.method3359(-83, arg0, var4);
                  var3 = true;
                  if (!var2) {
                     var10000 = var3;
                     break;
                  }

                  var4 = (class438)class723.field10572.method5266(false);
               } else {
                  var4 = (class438)class723.field10572.method5266(false);
               }

               if (var4 == null) {
                  var10000 = var3;
                  if (!var2) {
                     if (!var3) {
                        class723.field10572.method5267((byte)102, arg0);
                        return;
                     }

                     return;
                  }
               } else {
                  var10000 = class586.method4371(arg0.method3382(false), var4.method3382(false), (byte)56);
               }
            }
         } while(var2);

         if (!var3) {
            class723.field10572.method5267((byte)102, arg0);
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field10507[8] + (arg0 != null ? field10507[1] : field10507[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vd",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method5219(int arg0) {
      try {
         field10488 = null;
         if (arg0 >= -26) {
            field10500 = -2;
         }

         field10494 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10507[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vd",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method5220(int arg0) {
      boolean var2 = client.field1481;

      try {
         ++field10474;
         if (this.field10472) {
            if (this.field10483 != null) {
               int var3 = 16384;
               this.field10477.method3961(arg0 ^ 29940, this.field10483);
               this.field10477.method4017(arg0 ^ 29825, this.field10489);
               this.field10483.method5313(0, true);
               this.field10489.method5308(0, -5806);
               if (this.field10502) {
                  var3 |= 256;
               }

               OpenGL.glBlitFramebufferEXT(0, 0, this.field10476, this.field10481, 0, 0, this.field10476, this.field10481, var3, 9728);
               this.field10477.method3991(0, this.field10483);
               this.field10477.method4035(this.field10489, 14231);
            }

            this.field10477.method4008(arg0 + 29947);
            this.field10477.method4012(0, -120);
            this.field10477.method4009(1, 1);
            this.field10477.method443();
            if (arg0 == -29949) {
               int var4 = 0;
               int var5 = 1;
               class43 var6 = (class43)this.field10486.method288(0);
               class714 var10000;
               if (var2) {
                  var10000 = this;
               } else if (var6 == null) {
                  var10000 = this;
                  if (!var2) {
                     this.field10472 = false;
                     return;
                  }
               } else {
                  var10000 = this;
               }

               while(true) {
                  class43 var12;
                  label82: {
                     class43 var7 = (class43)var10000.field10486.method290(17958);
                     int var8 = var6.method316((byte)123);
                     int var9 = 0;
                     if (var2) {
                        var6.method323(this.field10505[var4], var9, this.field10501, (byte)-128);
                        var12 = var7;
                     } else if (~var8 >= ~var9) {
                        var12 = var7;
                        if (!var2) {
                           break label82;
                        }
                     } else {
                        var6.method323(this.field10505[var4], var9, this.field10501, (byte)-128);
                        var12 = var7;
                     }

                     while(true) {
                        label94: {
                           if (var12 == null && ~(var8 + -1) == ~var9) {
                              this.field10477.method3995(this.field10489, (byte)-29);
                              this.field10477.method3999(-45, 0, 0);
                              OpenGL.glBegin(7);
                              OpenGL.glTexCoord2f(0.0F, (float)this.field10481);
                              OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                              OpenGL.glVertex2i(this.field10490, this.field10491);
                              OpenGL.glTexCoord2f(0.0F, 0.0F);
                              OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                              OpenGL.glVertex2i(this.field10490, this.field10491 + this.field10481);
                              OpenGL.glTexCoord2f((float)this.field10476, 0.0F);
                              OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                              OpenGL.glVertex2i(this.field10490 + this.field10476, this.field10491 + this.field10481);
                              OpenGL.glTexCoord2f((float)this.field10476, (float)this.field10481);
                              OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                              OpenGL.glVertex2i(this.field10490 - -this.field10476, this.field10491);
                              OpenGL.glEnd();
                              if (!var2) {
                                 var5 = 1 & var5 - -1;
                                 var4 = 1 & var4 - -1;
                                 var6.method325(-112, var9);
                                 ++var9;
                                 break label94;
                              }
                           }

                           this.field10489.method5308(var5, -5806);
                           OpenGL.glBegin(7);
                           OpenGL.glTexCoord2f(0.0F, (float)this.field10481);
                           OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                           OpenGL.glVertex2i(0, 0);
                           OpenGL.glTexCoord2f(0.0F, 0.0F);
                           OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                           OpenGL.glVertex2i(0, this.field10481);
                           OpenGL.glTexCoord2f((float)this.field10476, 0.0F);
                           OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                           OpenGL.glVertex2i(this.field10476, this.field10481);
                           OpenGL.glTexCoord2f((float)this.field10476, (float)this.field10481);
                           OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                           OpenGL.glVertex2i(this.field10476, 0);
                           OpenGL.glEnd();
                           var5 = 1 & var5 - -1;
                           var4 = 1 & var4 - -1;
                           var6.method325(-112, var9);
                           ++var9;
                        }

                        if (~var8 >= ~var9) {
                           var12 = var7;
                           if (!var2) {
                              break;
                           }
                        } else {
                           var6.method323(this.field10505[var4], var9, this.field10501, (byte)-128);
                           var12 = var7;
                        }
                     }
                  }

                  var6 = var12;
                  if (var6 == null) {
                     var10000 = this;
                     if (!var2) {
                        this.field10472 = false;
                        return;
                     }
                  } else {
                     var10000 = this;
                  }
               }
            }
         }
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field10507[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vd",
      name = "<init>",
      descriptor = "(Liu;)V"
   )
   public class714(class530 arg0) {
      try {
         this.field10477 = arg0;
         if (this.field10477.field7780 && this.field10477.field7695) {
            this.field10493 = this.field10489 = new class734(this.field10477);
            if (~this.field10477.field7636 < -2 && this.field10477.field7730 && this.field10477.field7739) {
               this.field10493 = this.field10483 = new class734(this.field10477);
               return;
            }
         }

      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10507[2] + (arg0 != null ? field10507[1] : field10507[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5221(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 124);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5222(char[] arg0) {
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
            var10005 = 127;
            break;
         case 2:
            var10005 = 65;
            break;
         case 3:
            var10005 = 113;
            break;
         default:
            var10005 = 124;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
