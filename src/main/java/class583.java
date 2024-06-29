import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class583 {
   @OriginalMember(
      owner = "client!wg",
      name = "s",
      descriptor = "I"
   )
   private int field8608 = 1;
   @OriginalMember(
      owner = "client!wg",
      name = "h",
      descriptor = "I"
   )
   private int field8620 = 0;
   @OriginalMember(
      owner = "client!wg",
      name = "z",
      descriptor = "I"
   )
   private int field8612 = 1;
   @OriginalMember(
      owner = "client!wg",
      name = "B",
      descriptor = "I"
   )
   private int field8622 = 0;
   @OriginalMember(
      owner = "client!wg",
      name = "o",
      descriptor = "Lsn;"
   )
   private class675 field8602 = new class675();
   @OriginalMember(
      owner = "client!wg",
      name = "i",
      descriptor = "Z"
   )
   private boolean field8624 = true;
   @OriginalMember(
      owner = "client!wg",
      name = "C",
      descriptor = "[Lbka;"
   )
   private class396[] field8626 = new class396[2];
   @OriginalMember(
      owner = "client!wg",
      name = "p",
      descriptor = "Z"
   )
   private boolean field8630 = true;
   @OriginalMember(
      owner = "client!wg",
      name = "A",
      descriptor = "Z"
   )
   private boolean field8629 = true;
   @OriginalMember(
      owner = "client!wg",
      name = "j",
      descriptor = "Z"
   )
   private boolean field8632 = true;
   @OriginalMember(
      owner = "client!wg",
      name = "m",
      descriptor = "I"
   )
   private int field8631 = 0;
   @OriginalMember(
      owner = "client!wg",
      name = "J",
      descriptor = "I"
   )
   private int field8633 = -1;
   @OriginalMember(
      owner = "client!wg",
      name = "n",
      descriptor = "Z"
   )
   private boolean field8628 = false;
   @OriginalMember(
      owner = "client!wg",
      name = "G",
      descriptor = "Lc;"
   )
   private class652 field8600;
   @OriginalMember(
      owner = "client!wg",
      name = "K",
      descriptor = "Lqga;"
   )
   private class358 field8611;
   @OriginalMember(
      owner = "client!wg",
      name = "H",
      descriptor = "Lqga;"
   )
   private class358 field8610;
   @OriginalMember(
      owner = "client!wg",
      name = "r",
      descriptor = "Lqga;"
   )
   private class358 field8605;
   @OriginalMember(
      owner = "client!wg",
      name = "L",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8634 = new String[]{method4367(method4366("\u0000[MS\u0012\u0019U\u0017QS")), method4367(method4366("\f\u0012MA\u0006")), method4367(method4366("\u0019I\u000f\u0003")), method4367(method4366("\u0000[M$S")), method4367(method4366("\u0000[M%S")), method4367(method4366("\u0000[M-S")), method4367(method4366("\u0000[M&S")), method4367(method4366("\u0000[M'S")), method4367(method4366("\u0000[M+S")), method4367(method4366("\u0000[M.S")), method4367(method4366("\u0000[M)S")), method4367(method4366("\u0000[M*S")), method4367(method4366("\u0000[M(S")), method4367(method4366("\u0000[M,S"))};
   @OriginalMember(
      owner = "client!wg",
      name = "a",
      descriptor = "I"
   )
   public static int field8616 = 0;
   @OriginalMember(
      owner = "client!wg",
      name = "q",
      descriptor = "J"
   )
   public static long field8621 = -1L;
   @OriginalMember(
      owner = "client!wg",
      name = "d",
      descriptor = "I"
   )
   public static int field8597;
   @OriginalMember(
      owner = "client!wg",
      name = "E",
      descriptor = "I"
   )
   public static int field8598;
   @OriginalMember(
      owner = "client!wg",
      name = "f",
      descriptor = "I"
   )
   public static int field8601;
   @OriginalMember(
      owner = "client!wg",
      name = "y",
      descriptor = "I"
   )
   public static int field8603;
   @OriginalMember(
      owner = "client!wg",
      name = "c",
      descriptor = "I"
   )
   public static int field8604;
   @OriginalMember(
      owner = "client!wg",
      name = "l",
      descriptor = "I"
   )
   public static int field8606;
   @OriginalMember(
      owner = "client!wg",
      name = "b",
      descriptor = "I"
   )
   public static int field8609;
   @OriginalMember(
      owner = "client!wg",
      name = "u",
      descriptor = "I"
   )
   public static int field8613;
   @OriginalMember(
      owner = "client!wg",
      name = "w",
      descriptor = "I"
   )
   public static int field8614;
   @OriginalMember(
      owner = "client!wg",
      name = "t",
      descriptor = "I"
   )
   public static int field8615;
   @OriginalMember(
      owner = "client!wg",
      name = "D",
      descriptor = "I"
   )
   public static int field8617;
   @OriginalMember(
      owner = "client!wg",
      name = "e",
      descriptor = "I"
   )
   public static int field8619;
   @OriginalMember(
      owner = "client!wg",
      name = "g",
      descriptor = "Lda;"
   )
   public static class288 field8599;
   @OriginalMember(
      owner = "client!wg",
      name = "F",
      descriptor = "Lbka;"
   )
   private class396 field8627;
   @OriginalMember(
      owner = "client!wg",
      name = "x",
      descriptor = "Lija;"
   )
   public static class605 field8607;
   @OriginalMember(
      owner = "client!wg",
      name = "v",
      descriptor = "Ldda;"
   )
   private class688 field8623;
   @OriginalMember(
      owner = "client!wg",
      name = "I",
      descriptor = "Ldda;"
   )
   private class688 field8625;
   @OriginalMember(
      owner = "client!wg",
      name = "k",
      descriptor = "Z"
   )
   private boolean field8618;

   @OriginalMember(
      owner = "client!wg",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method4355(int arg0) {
      try {
         ++field8609;
         if (arg0 != 1) {
            return false;
         } else {
            return this.field8610 != null;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8634[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wg",
      name = "a",
      descriptor = "(BLia;)Z"
   )
   public final boolean method4356(byte arg0, class284 arg1) {
      try {
         ++field8617;
         if (this.field8610 != null) {
            if (arg1.method2369(false) || arg1.method2370(1)) {
               this.field8602.method4980(arg1, 0);
               this.method4360(10954);
               if (this.method4364(-113)) {
                  if (this.field8608 != -1 && ~this.field8612 != 0) {
                     arg1.method2368(this.field8612, this.field8608, 7283);
                  }

                  arg1.field4486 = true;
                  return true;
               }
            }

            this.method4362(true, arg1);
         }

         if (arg0 <= 110) {
            field8598 = -27;
         }

         return false;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8634[11] + arg0 + ',' + (arg1 != null ? field8634[1] : field8634[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wg",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method4357(int arg0) {
      boolean var2 = client.field1786;

      try {
         this.field8625 = null;
         this.field8627 = null;
         this.field8610 = this.field8605 = this.field8611 = null;
         ++field8619;
         if (arg0 != -3580) {
            method4359(118);
         }

         this.field8626 = null;
         this.field8623 = null;
         if (!this.field8602.method4978(arg0 + 19170)) {
            class294 var3 = this.field8602.method4972((byte)-84);
            if (var2 || this.field8602.field10053 != var3) {
               do {
                  ((class284)var3).method2371((byte)44);
                  var3 = var3.field4656;
               } while(this.field8602.field10053 != var3);
            }
         }

         this.field8608 = this.field8612 = 1;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field8634[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wg",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method4358(byte arg0) {
      boolean var2 = client.field1786;

      try {
         ++field8604;
         if (this.field8618) {
            if (this.field8605 != null) {
               int var3 = 16384;
               this.field8600.method4780(1, this.field8605);
               this.field8600.method4782(this.field8611, -4);
               this.field8605.method2937(0, arg0 ^ 78);
               this.field8611.method2930((byte)114, 0);
               if (this.field8628) {
                  var3 |= 256;
               }

               OpenGL.glBlitFramebufferEXT(0, 0, this.field8608, this.field8612, 0, 0, this.field8608, this.field8612, var3, 9728);
               this.field8600.method4755(9741, this.field8605);
               this.field8600.method4744(this.field8611, (byte)84);
            }

            if (arg0 != 78) {
               field8616 = 6;
            }

            this.field8600.method4802(false);
            this.field8600.method4783(arg0 ^ 2958, 0);
            this.field8600.method4765(1, (byte)-3);
            this.field8600.method701();
            int var4 = 0;
            int var5 = 1;
            class284 var6 = (class284)this.field8602.method4972((byte)-84);
            class583 var10000;
            if (var2) {
               var10000 = this;
            } else if (var6 == null) {
               var10000 = this;
               if (!var2) {
                  this.field8618 = false;
                  return;
               }
            } else {
               var10000 = this;
            }

            while(true) {
               class284 var12;
               label84: {
                  class284 var7 = (class284)var10000.field8602.method4975((byte)105);
                  int var8 = var6.method2377(3077);
                  int var9 = 0;
                  if (var2) {
                     var6.method2372(false, this.field8627, var9, this.field8626[var4]);
                     var12 = var7;
                  } else if (var8 <= var9) {
                     var12 = var7;
                     if (!var2) {
                        break label84;
                     }
                  } else {
                     var6.method2372(false, this.field8627, var9, this.field8626[var4]);
                     var12 = var7;
                  }

                  while(true) {
                     label98: {
                        if (var12 != null || ~(var8 + -1) != ~var9) {
                           this.field8611.method2930((byte)122, var5);
                           OpenGL.glBegin(7);
                           OpenGL.glTexCoord2f(0.0F, (float)this.field8612);
                           OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                           OpenGL.glVertex2i(0, 0);
                           OpenGL.glTexCoord2f(0.0F, 0.0F);
                           OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                           OpenGL.glVertex2i(0, this.field8612);
                           OpenGL.glTexCoord2f((float)this.field8608, 0.0F);
                           OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                           OpenGL.glVertex2i(this.field8608, this.field8612);
                           OpenGL.glTexCoord2f((float)this.field8608, (float)this.field8612);
                           OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                           OpenGL.glVertex2i(this.field8608, 0);
                           OpenGL.glEnd();
                           if (!var2) {
                              var5 = var5 + 1 & 1;
                              var6.method2374(0, var9);
                              var4 = var4 + 1 & 1;
                              ++var9;
                              break label98;
                           }
                        }

                        this.field8600.method4746(-1, this.field8611);
                        this.field8600.method4799(0, (byte)-92, 0);
                        OpenGL.glBegin(7);
                        OpenGL.glTexCoord2f(0.0F, (float)this.field8612);
                        OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                        OpenGL.glVertex2i(this.field8620, this.field8622);
                        OpenGL.glTexCoord2f(0.0F, 0.0F);
                        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                        OpenGL.glVertex2i(this.field8620, this.field8622 + this.field8612);
                        OpenGL.glTexCoord2f((float)this.field8608, 0.0F);
                        OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                        OpenGL.glVertex2i(this.field8620 + this.field8608, this.field8622 + this.field8612);
                        OpenGL.glTexCoord2f((float)this.field8608, (float)this.field8612);
                        OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                        OpenGL.glVertex2i(this.field8620 + this.field8608, this.field8622);
                        OpenGL.glEnd();
                        var5 = var5 + 1 & 1;
                        var6.method2374(0, var9);
                        var4 = var4 + 1 & 1;
                        ++var9;
                     }

                     if (var8 <= var9) {
                        var12 = var7;
                        if (!var2) {
                           break;
                        }
                     } else {
                        var6.method2372(false, this.field8627, var9, this.field8626[var4]);
                        var12 = var7;
                     }
                  }
               }

               var6 = var12;
               if (var6 == null) {
                  var10000 = this;
                  if (!var2) {
                     this.field8618 = false;
                     return;
                  }
               } else {
                  var10000 = this;
               }
            }
         }
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field8634[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wg",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method4359(int arg0) {
      try {
         field8607 = null;
         if (arg0 == 21829) {
            field8599 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8634[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wg",
      name = "a",
      descriptor = "(I)V"
   )
   private final void method4360(int arg0) {
      boolean var2 = client.field1786;

      try {
         ++field8597;
         boolean var3 = false;
         int var4 = 0;
         int var5 = 0;
         class284 var6 = (class284)this.field8602.method4972((byte)-84);
         int var7;
         if (var2) {
            var7 = var6.method2375(116);
            if (var7 > var4) {
               var4 = var7;
            }

            var5 += var6.method2377(arg0 ^ 9935);
            var3 |= var6.method2376((byte)47);
            var6 = (class284)this.field8602.method4975((byte)117);
         }

         while(true) {
            int var10000;
            if (var6 == null) {
               var10000 = ~var4;
               if (!var2) {
                  int var8;
                  label68: {
                     if (var10000 != -3) {
                        if (var4 == 1) {
                           var8 = 34842;
                           if (!var2) {
                              break label68;
                           }
                        }

                        var8 = 6408;
                        if (!var2) {
                           break label68;
                        }
                     }

                     var8 = 34836;
                  }

                  if (this.field8633 != var8) {
                     this.field8632 = true;
                     this.field8633 = var8;
                  }

                  int var9 = this.field8631 <= 2 ? this.field8631 : 2;
                  int var10 = var5 > 2 ? 2 : var5;
                  this.field8631 = var5;
                  if (var9 != var10) {
                     this.field8624 = this.field8632 = true;
                  }

                  if (arg0 != 10954) {
                     this.field8605 = null;
                  }

                  if (!var3 != !this.field8628) {
                     this.field8630 = true;
                     this.field8628 = var3;
                     return;
                  }

                  return;
               }
            } else {
               var10000 = var6.method2375(116);
            }

            var7 = var10000;
            if (var7 > var4) {
               var4 = var7;
            }

            var5 += var6.method2377(arg0 ^ 9935);
            var3 |= var6.method2376((byte)47);
            var6 = (class284)this.field8602.method4975((byte)117);
         }
      } catch (RuntimeException var12) {
         throw class482.method3757(var12, field8634[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wg",
      name = "a",
      descriptor = "(ZII)Ljava/lang/String;"
   )
   public static final String method4361(boolean arg0, int arg1, int arg2) {
      try {
         ++field8606;
         if (arg0 && ~arg1 <= -1) {
            if (arg2 != -123) {
               field8621 = -59L;
            }

            return class43.method309(arg0, 10, 36, arg1);
         } else {
            return Integer.toString(arg1);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8634[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wg",
      name = "a",
      descriptor = "(ZLia;)V"
   )
   public final void method4362(boolean arg0, class284 arg1) {
      try {
         if (arg0) {
            ++field8614;
            arg1.field4486 = false;
            arg1.method2371((byte)-124);
            arg1.method2477(1976);
            this.method4360(10954);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8634[3] + arg0 + ',' + (arg1 != null ? field8634[1] : field8634[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wg",
      name = "a",
      descriptor = "(IIIII)Z"
   )
   public final boolean method4363(int arg0, int arg1, int arg2, int arg3, int arg4) {
      boolean var6 = client.field1786;

      try {
         ++field8615;
         if (this.field8610 != null && !this.field8602.method4978(15590)) {
            if (~this.field8608 != ~arg2 || ~this.field8612 != ~arg0) {
               this.field8608 = arg2;
               this.field8612 = arg0;
               class294 var7 = this.field8602.method4972((byte)-84);
               if (var6) {
                  ((class284)var7).method2368(this.field8612, this.field8608, 7283);
                  var7 = var7.field4656;
               }

               while(true) {
                  while(this.field8602.field10053 != var7) {
                     ((class284)var7).method2368(this.field8612, this.field8608, 7283);
                     var7 = var7.field4656;
                  }

                  this.field8624 = true;
                  this.field8630 = true;
                  if (!var6) {
                     this.field8632 = true;
                     break;
                  }

                  var7 = var7.field4656;
               }
            }

            if (arg3 != 0) {
               return false;
            } else if (this.method4364(arg3 ^ -118)) {
               this.field8618 = true;
               this.field8620 = arg1;
               this.field8622 = arg4;
               this.field8600.method4796(true, this.field8610);
               this.field8610.method2930((byte)116, 0);
               this.field8600.method4799(-this.field8620, (byte)-92, this.field8612 - this.field8600.field9472 + this.field8622);
               return true;
            } else {
               return false;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field8634[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wg",
      name = "e",
      descriptor = "(I)Z"
   )
   private final boolean method4364(int arg0) {
      boolean var2 = client.field1786;

      try {
         ++field8601;
         if (this.field8630) {
            if (this.field8625 != null) {
               this.field8625.method5067((byte)96);
               this.field8625 = null;
            }

            if (this.field8627 != null) {
               this.field8627.method5758(9728);
               this.field8627 = null;
            }

            if (this.field8605 != null) {
               this.field8625 = new class688(this.field8600, 6402, this.field8608, this.field8612, this.field8600.field9605);
            }

            label110: {
               if (this.field8628) {
                  this.field8627 = new class396(this.field8600, 34037, 6402, this.field8608, this.field8612);
                  if (!var2) {
                     break label110;
                  }
               }

               if (this.field8625 == null) {
                  this.field8625 = new class688(this.field8600, 6402, this.field8608, this.field8612);
               }
            }

            this.field8624 = true;
            this.field8630 = false;
            this.field8629 = true;
         }

         if (this.field8632) {
            if (this.field8623 != null) {
               this.field8623.method5067((byte)96);
               this.field8623 = null;
            }

            if (this.field8626[0] != null) {
               this.field8626[0].method5758(9728);
               this.field8626[0] = null;
            }

            if (this.field8626[1] != null) {
               this.field8626[1].method5758(9728);
               this.field8626[1] = null;
            }

            if (this.field8605 != null) {
               this.field8623 = new class688(this.field8600, this.field8633, this.field8608, this.field8612, this.field8600.field9605);
            }

            this.field8626[0] = new class396(this.field8600, 34037, this.field8633, this.field8608, this.field8612);
            this.field8626[1] = ~this.field8631 >= -2 ? null : new class396(this.field8600, 34037, this.field8633, this.field8608, this.field8612);
            this.field8632 = false;
            this.field8624 = true;
            this.field8629 = true;
         }

         if (this.field8624) {
            label123: {
               if (this.field8605 != null) {
                  this.field8600.method4796(true, this.field8611);
                  this.field8611.method2933(0, -16640);
                  this.field8611.method2933(1, -16640);
                  this.field8611.method2933(8, -16640);
                  this.field8611.method2932(10409, 0, this.field8626[0]);
                  if (this.field8631 > 1) {
                     this.field8611.method2932(10409, 1, this.field8626[1]);
                  }

                  if (this.field8628) {
                     this.field8611.method2932(10409, 8, this.field8627);
                  }

                  this.field8600.method4746(-1, this.field8611);
                  this.field8600.method4796(true, this.field8605);
                  this.field8605.method2933(0, -16640);
                  this.field8605.method2933(8, -16640);
                  this.field8605.method2927(this.field8623, 0, 71);
                  this.field8605.method2927(this.field8625, 8, 85);
                  this.field8600.method4746(-1, this.field8605);
                  if (!var2) {
                     break label123;
                  }
               }

               this.field8600.method4796(true, this.field8611);
               this.field8611.method2933(0, -16640);
               this.field8611.method2933(1, -16640);
               this.field8611.method2933(8, -16640);
               this.field8611.method2932(10409, 0, this.field8626[0]);
               if (~this.field8631 < -2) {
                  this.field8611.method2932(10409, 1, this.field8626[1]);
               }

               label98: {
                  if (this.field8628) {
                     this.field8611.method2932(10409, 8, this.field8627);
                     if (!var2) {
                        break label98;
                     }
                  }

                  this.field8611.method2927(this.field8625, 8, 59);
               }

               this.field8600.method4746(-1, this.field8611);
            }

            this.field8629 = true;
            this.field8624 = false;
         }

         if (arg0 > -73) {
            this.field8630 = true;
         }

         if (this.field8629) {
            this.field8600.method4796(true, this.field8610);
            this.field8629 = !this.field8610.method2929((byte)-80);
            this.field8600.method4746(-1, this.field8610);
         }

         return !this.field8629;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8634[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wg",
      name = "a",
      descriptor = "(Ljava/lang/String;I)J"
   )
   public static final long method4365(String arg0, int arg1) {
      boolean var2 = client.field1786;

      try {
         long var3;
         label115: {
            ++field8613;
            var3 = 0L;
            int var5 = arg0.length();
            int var6 = 0;
            if (arg1 != -12607) {
               method4361(true, -94, 62);
               if (var2) {
                  var3 *= 37L;
               } else if (var5 <= var6) {
                  if (!var2) {
                     if (var2) {
                        var3 /= 37L;
                     }
                     break label115;
                  }
               } else {
                  var3 *= 37L;
               }
            } else if (var5 <= var6) {
               if (!var2) {
                  if (var2) {
                     var3 /= 37L;
                  }
                  break label115;
               }
            } else {
               var3 *= 37L;
            }

            while(true) {
               label123: {
                  char var7 = arg0.charAt(var6);
                  if (~var7 <= -66 && ~var7 >= -91) {
                     var3 += (long)(var7 + -65 + 1);
                     if (!var2) {
                        break label123;
                     }
                  }

                  if (var7 >= 'a' && ~var7 >= -123) {
                     var3 += (long)(var7 + -97 + 1);
                     if (!var2) {
                        break label123;
                     }
                  }

                  if (~var7 <= -49 && var7 <= '9') {
                     var3 += (long)(var7 + -48 + 27);
                  }
               }

               if (var3 >= 177917621779460413L) {
                  if (!var2) {
                     break;
                  }

                  ++var6;
               } else {
                  ++var6;
               }

               if (var5 <= var6) {
                  if (!var2) {
                     if (var2) {
                        var3 /= 37L;
                     }
                     break;
                  }
               } else {
                  var3 *= 37L;
               }
            }
         }

         long var10000;
         while(~(var3 % 37L) == -1L) {
            var10000 = var3;
            if (var2) {
               return var10000;
            }

            if (var3 == 0L) {
               break;
            }

            var3 /= 37L;
         }

         var10000 = var3;
         return var10000;
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field8634[6] + (arg0 != null ? field8634[1] : field8634[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wg",
      name = "<init>",
      descriptor = "(Lc;)V"
   )
   public class583(class652 arg0) {
      try {
         this.field8600 = arg0;
         if (this.field8600.field9737 && this.field8600.field9700) {
            this.field8610 = this.field8611 = new class358(this.field8600);
            if (this.field8600.field9605 > 1 && this.field8600.field9732 && this.field8600.field9685) {
               this.field8610 = this.field8605 = new class358(this.field8600);
               return;
            }
         }

      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8634[0] + (arg0 != null ? field8634[1] : field8634[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4366(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 123);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4367(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 119;
            break;
         case 1:
            var10005 = 60;
            break;
         case 2:
            var10005 = 99;
            break;
         case 3:
            var10005 = 111;
            break;
         default:
            var10005 = 123;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
