import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public class class734 {
   @OriginalMember(
      owner = "client!pw",
      name = "n",
      descriptor = "I"
   )
   private int field10881 = 0;
   @OriginalMember(
      owner = "client!pw",
      name = "j",
      descriptor = "I"
   )
   private int field10896 = 1;
   @OriginalMember(
      owner = "client!pw",
      name = "e",
      descriptor = "I"
   )
   private int field10890 = 0;
   @OriginalMember(
      owner = "client!pw",
      name = "y",
      descriptor = "I"
   )
   private int field10901 = 1;
   @OriginalMember(
      owner = "client!pw",
      name = "t",
      descriptor = "Lum;"
   )
   private class550 field10892 = new class550();
   @OriginalMember(
      owner = "client!pw",
      name = "w",
      descriptor = "I"
   )
   private int field10903 = 0;
   @OriginalMember(
      owner = "client!pw",
      name = "k",
      descriptor = "Z"
   )
   private boolean field10904 = true;
   @OriginalMember(
      owner = "client!pw",
      name = "A",
      descriptor = "Z"
   )
   private boolean field10902 = true;
   @OriginalMember(
      owner = "client!pw",
      name = "s",
      descriptor = "I"
   )
   private int field10909 = -1;
   @OriginalMember(
      owner = "client!pw",
      name = "o",
      descriptor = "Z"
   )
   private boolean field10907 = false;
   @OriginalMember(
      owner = "client!pw",
      name = "a",
      descriptor = "Z"
   )
   private boolean field10911 = true;
   @OriginalMember(
      owner = "client!pw",
      name = "c",
      descriptor = "Z"
   )
   private boolean field10906 = true;
   @OriginalMember(
      owner = "client!pw",
      name = "x",
      descriptor = "[Ldt;"
   )
   private class251[] field10913 = new class251[2];
   @OriginalMember(
      owner = "client!pw",
      name = "f",
      descriptor = "Lck;"
   )
   private class667 field10885;
   @OriginalMember(
      owner = "client!pw",
      name = "v",
      descriptor = "Liv;"
   )
   private class105 field10893;
   @OriginalMember(
      owner = "client!pw",
      name = "i",
      descriptor = "Liv;"
   )
   private class105 field10882;
   @OriginalMember(
      owner = "client!pw",
      name = "b",
      descriptor = "Liv;"
   )
   private class105 field10884;
   @OriginalMember(
      owner = "client!pw",
      name = "I",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10915 = new String[]{method5347(method5346("5\u00050%{")), method5347(method5346("+\u0007r\u000b")), method5347(method5346(">\\0I.")), method5347(method5346("5\u00050!{")), method5347(method5346("5\u00050,{")), method5347(method5346("5\u00050.{")), method5347(method5346("5\u00050-{")), method5347(method5346("5\u00050\"{")), method5347(method5346("5\u00050#{")), method5347(method5346("5\u00050&{")), method5347(method5346("5\u00050+{")), method5347(method5346("5\u00050${")), method5347(method5346("5\u00050/{")), method5347(method5346("5\u00050 {")), method5347(method5346("5\u00050[:+\u001bjY{"))};
   @OriginalMember(
      owner = "client!pw",
      name = "H",
      descriptor = "[Lmda;"
   )
   public static class275[] field10914 = new class275[6];
   @OriginalMember(
      owner = "client!pw",
      name = "d",
      descriptor = "I"
   )
   public static int field10883;
   @OriginalMember(
      owner = "client!pw",
      name = "m",
      descriptor = "I"
   )
   public static int field10886;
   @OriginalMember(
      owner = "client!pw",
      name = "C",
      descriptor = "I"
   )
   public static int field10887;
   @OriginalMember(
      owner = "client!pw",
      name = "B",
      descriptor = "I"
   )
   public static int field10888;
   @OriginalMember(
      owner = "client!pw",
      name = "q",
      descriptor = "I"
   )
   public static int field10889;
   @OriginalMember(
      owner = "client!pw",
      name = "G",
      descriptor = "I"
   )
   public static int field10891;
   @OriginalMember(
      owner = "client!pw",
      name = "g",
      descriptor = "I"
   )
   public static int field10894;
   @OriginalMember(
      owner = "client!pw",
      name = "p",
      descriptor = "I"
   )
   public static int field10897;
   @OriginalMember(
      owner = "client!pw",
      name = "h",
      descriptor = "I"
   )
   public static int field10898;
   @OriginalMember(
      owner = "client!pw",
      name = "F",
      descriptor = "I"
   )
   public static int field10899;
   @OriginalMember(
      owner = "client!pw",
      name = "z",
      descriptor = "I"
   )
   public static int field10900;
   @OriginalMember(
      owner = "client!pw",
      name = "u",
      descriptor = "I"
   )
   public static int field10912;
   @OriginalMember(
      owner = "client!pw",
      name = "l",
      descriptor = "Ldt;"
   )
   private class251 field10910;
   @OriginalMember(
      owner = "client!pw",
      name = "r",
      descriptor = "Laga;"
   )
   private class694 field10905;
   @OriginalMember(
      owner = "client!pw",
      name = "E",
      descriptor = "Laga;"
   )
   private class694 field10908;
   @OriginalMember(
      owner = "client!pw",
      name = "D",
      descriptor = "Z"
   )
   private boolean field10895;

   @OriginalMember(
      owner = "client!pw",
      name = "b",
      descriptor = "(I)Lbu;"
   )
   public static final class21 method5334(int arg0) {
      try {
         int var1 = 106 / ((-10 - arg0) / 40);
         ++field10912;
         class746.field11056 = 0;
         return class85.method797((byte)-91);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10915[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pw",
      name = "a",
      descriptor = "(ILsl;)V"
   )
   public final void method5335(int arg0, class483 arg1) {
      try {
         arg1.field7174 = false;
         ++field10891;
         arg1.method3587(-50);
         arg1.method2720(0);
         this.method5338(18467);
         int var3 = 97 % ((arg0 - -9) / 54);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field10915[8] + arg0 + ',' + (arg1 != null ? field10915[2] : field10915[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pw",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method5336(int arg0) {
      int var2 = client.field4530;

      try {
         this.field10905 = null;
         this.field10882 = this.field10884 = this.field10893 = null;
         this.field10913 = null;
         this.field10908 = null;
         ++field10886;
         this.field10910 = null;
         if (!this.field10892.method4068(false)) {
            class347 var3 = this.field10892.method4071((byte)126);
            if (var2 != 0 || this.field10892.field8129 != var3) {
               do {
                  ((class483)var3).method3587(-25);
                  var3 = var3.field5278;
               } while(this.field10892.field8129 != var3);
            }
         }

         int var4 = 115 % ((arg0 - -48) / 56);
         this.field10901 = this.field10896 = 1;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field10915[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pw",
      name = "c",
      descriptor = "(Z)V"
   )
   public static void method5337(boolean arg0) {
      try {
         if (arg0) {
            field10914 = null;
         }

         field10914 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10915[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pw",
      name = "c",
      descriptor = "(I)V"
   )
   private final void method5338(int arg0) {
      int var2 = client.field4530;

      try {
         ++field10883;
         if (arg0 != 18467) {
            method5341(101, true, 121);
         }

         boolean var3 = false;
         int var4 = 0;
         int var5 = 0;
         class483 var6 = (class483)this.field10892.method4071((byte)127);
         int var7;
         if (var2 != 0) {
            var7 = var6.method3594(-95);
            var5 += var6.method3593((byte)95);
            if (~var4 > ~var7) {
               var4 = var7;
            }

            var3 |= var6.method3592((byte)-114);
            var6 = (class483)this.field10892.method4059((byte)112);
         }

         while(true) {
            int var10000;
            if (var6 == null) {
               var10000 = ~var4;
               if (var2 == 0) {
                  int var8;
                  label96: {
                     if (var10000 == -3) {
                        var8 = 34836;
                        if (var2 == 0) {
                           break label96;
                        }
                     }

                     if (var4 != 1) {
                        var8 = 6408;
                        if (var2 == 0) {
                           break label96;
                        }
                     }

                     var8 = 34842;
                  }

                  if (~this.field10909 != ~var8) {
                     this.field10902 = true;
                     this.field10909 = var8;
                  }

                  int var9 = ~this.field10903 < -3 ? 2 : this.field10903;
                  int var10 = var5 <= 2 ? var5 : 2;
                  if (!var3 != !this.field10907) {
                     this.field10911 = true;
                     this.field10907 = var3;
                  }

                  if (var9 != var10) {
                     this.field10906 = this.field10902 = true;
                  }

                  this.field10903 = var5;
                  return;
               }
            } else {
               var10000 = var6.method3594(-95);
            }

            var7 = var10000;
            var5 += var6.method3593((byte)95);
            if (~var4 > ~var7) {
               var4 = var7;
            }

            var3 |= var6.method3592((byte)-114);
            var6 = (class483)this.field10892.method4059((byte)112);
         }
      } catch (RuntimeException var12) {
         throw class670.method4877(var12, field10915[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pw",
      name = "a",
      descriptor = "(IIIIZ)V"
   )
   public static final void method5339(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
      try {
         class219.method1653((byte)23);
         ++field10889;
         class739.field10980 = 0L;
         int var5 = class694.method5042(true);
         if (~arg2 == -4 || ~var5 == -4) {
            arg4 = true;
         }

         int var6 = 29 % ((-6 - arg0) / 61);
         if (!class786.field11439.method573()) {
            arg4 = true;
         }

         class264.method2008(1024, arg4, arg2, var5, arg1, arg3);
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field10915[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pw",
      name = "a",
      descriptor = "(Z)Z"
   )
   private final boolean method5340(boolean arg0) {
      int var2 = client.field4530;

      try {
         ++field10894;
         if (this.field10911) {
            if (this.field10905 != null) {
               this.field10905.method5044(-111);
               this.field10905 = null;
            }

            if (this.field10910 != null) {
               this.field10910.method5015((byte)88);
               this.field10910 = null;
            }

            if (this.field10884 != null) {
               this.field10905 = new class694(this.field10885, 6402, this.field10901, this.field10896, this.field10885.field9894);
            }

            label111: {
               if (!this.field10907) {
                  if (this.field10905 != null) {
                     break label111;
                  }

                  this.field10905 = new class694(this.field10885, 6402, this.field10901, this.field10896);
                  if (var2 == 0) {
                     break label111;
                  }
               }

               this.field10910 = new class251(this.field10885, 34037, 6402, this.field10901, this.field10896);
            }

            this.field10906 = true;
            this.field10911 = false;
            this.field10904 = true;
         }

         if (this.field10902) {
            if (this.field10908 != null) {
               this.field10908.method5044(-124);
               this.field10908 = null;
            }

            if (this.field10913[0] != null) {
               this.field10913[0].method5015((byte)-118);
               this.field10913[0] = null;
            }

            if (this.field10913[1] != null) {
               this.field10913[1].method5015((byte)-95);
               this.field10913[1] = null;
            }

            if (this.field10884 != null) {
               this.field10908 = new class694(this.field10885, this.field10909, this.field10901, this.field10896, this.field10885.field9894);
            }

            this.field10913[0] = new class251(this.field10885, 34037, this.field10909, this.field10901, this.field10896);
            this.field10913[1] = ~this.field10903 >= -2 ? null : new class251(this.field10885, 34037, this.field10909, this.field10901, this.field10896);
            this.field10902 = false;
            this.field10904 = true;
            this.field10906 = true;
         }

         if (this.field10906) {
            label124: {
               if (this.field10884 != null) {
                  this.field10885.method4805(this.field10893, false);
                  this.field10893.method907(0, true);
                  this.field10893.method907(1, true);
                  this.field10893.method907(8, true);
                  this.field10893.method906(this.field10913[0], 0, 1);
                  if (~this.field10903 < -2) {
                     this.field10893.method906(this.field10913[1], 1, 1);
                  }

                  if (this.field10907) {
                     this.field10893.method906(this.field10910, 8, 1);
                  }

                  this.field10885.method4801(-75, this.field10893);
                  this.field10885.method4805(this.field10884, arg0);
                  this.field10884.method907(0, true);
                  this.field10884.method907(8, true);
                  this.field10884.method913(0, -125, this.field10908);
                  this.field10884.method913(8, 95, this.field10905);
                  this.field10885.method4801(-2, this.field10884);
                  if (var2 == 0) {
                     break label124;
                  }
               }

               this.field10885.method4805(this.field10893, false);
               this.field10893.method907(0, true);
               this.field10893.method907(1, true);
               this.field10893.method907(8, true);
               this.field10893.method906(this.field10913[0], 0, 1);
               if (this.field10903 > 1) {
                  this.field10893.method906(this.field10913[1], 1, 1);
               }

               label97: {
                  if (!this.field10907) {
                     this.field10893.method913(8, -128, this.field10905);
                     if (var2 == 0) {
                        break label97;
                     }
                  }

                  this.field10893.method906(this.field10910, 8, 1);
               }

               this.field10885.method4801(-105, this.field10893);
            }

            this.field10904 = true;
            this.field10906 = false;
         }

         if (this.field10904) {
            this.field10885.method4805(this.field10882, arg0);
            this.field10904 = !this.field10882.method898((byte)-88);
            this.field10885.method4801(-30, this.field10882);
         }

         if (arg0) {
            return true;
         } else {
            return !this.field10904;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10915[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pw",
      name = "a",
      descriptor = "(IZI)Z"
   )
   public static final boolean method5341(int arg0, boolean arg1, int arg2) {
      try {
         ++field10900;
         if (!arg1) {
            field10888 = -52;
         }

         return class70.method701(arg0, arg2, !arg1) || class728.method5305(arg0, 799078348, arg2);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10915[11] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pw",
      name = "b",
      descriptor = "(Z)V"
   )
   public final void method5342(boolean arg0) {
      int var2 = client.field4530;

      try {
         ++field10899;
         if (this.field10895) {
            if (arg0) {
               if (this.field10884 != null) {
                  this.field10885.method4772(113, this.field10884);
                  int var3 = 16384;
                  this.field10885.method4776(-4117, this.field10893);
                  this.field10884.method903(0, (byte)-121);
                  this.field10893.method912(-9765, 0);
                  if (this.field10907) {
                     var3 |= 256;
                  }

                  OpenGL.glBlitFramebufferEXT(0, 0, this.field10901, this.field10896, 0, 0, this.field10901, this.field10896, var3, 9728);
                  this.field10885.method4841(28942, this.field10884);
                  this.field10885.method4780(111, this.field10893);
               }

               this.field10885.method4817((byte)-60);
               this.field10885.method4854(-3, 0);
               this.field10885.method4796(false, 1);
               this.field10885.method607();
               int var4 = 0;
               int var5 = 1;
               class483 var6 = (class483)this.field10892.method4071((byte)127);
               class734 var10000;
               if (var2 != 0) {
                  var10000 = this;
               } else if (var6 == null) {
                  var10000 = this;
                  if (var2 == 0) {
                     this.field10895 = false;
                     return;
                  }
               } else {
                  var10000 = this;
               }

               while(true) {
                  class483 var12;
                  label84: {
                     class483 var7 = (class483)var10000.field10892.method4059((byte)116);
                     int var8 = var6.method3593((byte)99);
                     int var9 = 0;
                     if (var2 != 0) {
                        var6.method3586(this.field10913[var4], false, this.field10910, var9);
                        var12 = var7;
                     } else if (~var8 >= ~var9) {
                        var12 = var7;
                        if (var2 == 0) {
                           break label84;
                        }
                     } else {
                        var6.method3586(this.field10913[var4], false, this.field10910, var9);
                        var12 = var7;
                     }

                     while(true) {
                        label99: {
                           if (var12 != null || var8 + -1 != var9) {
                              this.field10893.method912(-9765, var5);
                              OpenGL.glBegin(7);
                              OpenGL.glTexCoord2f(0.0F, (float)this.field10896);
                              OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                              OpenGL.glVertex2i(0, 0);
                              OpenGL.glTexCoord2f(0.0F, 0.0F);
                              OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                              OpenGL.glVertex2i(0, this.field10896);
                              OpenGL.glTexCoord2f((float)this.field10901, 0.0F);
                              OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                              OpenGL.glVertex2i(this.field10901, this.field10896);
                              OpenGL.glTexCoord2f((float)this.field10901, (float)this.field10896);
                              OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                              OpenGL.glVertex2i(this.field10901, 0);
                              OpenGL.glEnd();
                              if (var2 == 0) {
                                 var5 = var5 + 1 & 1;
                                 var4 = 1 & var4 - -1;
                                 var6.method3582(0, var9);
                                 ++var9;
                                 break label99;
                              }
                           }

                           this.field10885.method4801(-66, this.field10893);
                           this.field10885.method4842(0, 0, (byte)74);
                           OpenGL.glBegin(7);
                           OpenGL.glTexCoord2f(0.0F, (float)this.field10896);
                           OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                           OpenGL.glVertex2i(this.field10890, this.field10881);
                           OpenGL.glTexCoord2f(0.0F, 0.0F);
                           OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                           OpenGL.glVertex2i(this.field10890, this.field10881 - -this.field10896);
                           OpenGL.glTexCoord2f((float)this.field10901, 0.0F);
                           OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                           OpenGL.glVertex2i(this.field10901 + this.field10890, this.field10896 + this.field10881);
                           OpenGL.glTexCoord2f((float)this.field10901, (float)this.field10896);
                           OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                           OpenGL.glVertex2i(this.field10901 + this.field10890, this.field10881);
                           OpenGL.glEnd();
                           var5 = var5 + 1 & 1;
                           var4 = 1 & var4 - -1;
                           var6.method3582(0, var9);
                           ++var9;
                        }

                        if (~var8 >= ~var9) {
                           var12 = var7;
                           if (var2 == 0) {
                              break;
                           }
                        } else {
                           var6.method3586(this.field10913[var4], false, this.field10910, var9);
                           var12 = var7;
                        }
                     }
                  }

                  var6 = var12;
                  if (var6 == null) {
                     var10000 = this;
                     if (var2 == 0) {
                        this.field10895 = false;
                        return;
                     }
                  } else {
                     var10000 = this;
                  }
               }
            }
         }
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field10915[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pw",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method5343(byte arg0) {
      try {
         ++field10898;
         int var2 = -94 / ((60 - arg0) / 50);
         return this.field10882 != null;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10915[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pw",
      name = "b",
      descriptor = "(ILsl;)Z"
   )
   public final boolean method5344(int arg0, class483 arg1) {
      try {
         if (arg0 <= 55) {
            this.method5344(50, (class483)null);
         }

         ++field10897;
         if (this.field10882 != null) {
            if (arg1.method3584((byte)-124) || arg1.method3589(101)) {
               this.field10892.method4060(23, arg1);
               this.method5338(18467);
               if (this.method5340(false)) {
                  if (~this.field10901 != 0 && ~this.field10896 != 0) {
                     arg1.method3585(this.field10896, (byte)-128, this.field10901);
                  }

                  arg1.field7174 = true;
                  return true;
               }
            }

            this.method5335(79, arg1);
         }

         return false;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10915[3] + arg0 + ',' + (arg1 != null ? field10915[2] : field10915[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pw",
      name = "a",
      descriptor = "(IIIII)Z"
   )
   public final boolean method5345(int arg0, int arg1, int arg2, int arg3, int arg4) {
      int var6 = client.field4530;

      try {
         ++field10887;
         if (this.field10882 != null && !this.field10892.method4068(false)) {
            if (this.field10901 != arg1 || ~this.field10896 != ~arg2) {
               this.field10901 = arg1;
               this.field10896 = arg2;
               class347 var7 = this.field10892.method4071((byte)126);
               if (var6 != 0) {
                  ((class483)var7).method3585(this.field10896, (byte)-120, this.field10901);
                  var7 = var7.field5278;
               }

               while(true) {
                  while(this.field10892.field8129 != var7) {
                     ((class483)var7).method3585(this.field10896, (byte)-120, this.field10901);
                     var7 = var7.field5278;
                  }

                  this.field10906 = true;
                  this.field10902 = true;
                  if (var6 == 0) {
                     this.field10911 = true;
                     break;
                  }

                  var7 = var7.field5278;
               }
            }

            if (arg4 != 0) {
               return false;
            } else if (this.method5340(false)) {
               this.field10881 = arg3;
               this.field10890 = arg0;
               this.field10895 = true;
               this.field10885.method4805(this.field10882, false);
               this.field10882.method912(-9765, 0);
               this.field10885.method4842(-this.field10890, -this.field10885.field9732 + this.field10881 + this.field10896, (byte)74);
               return true;
            } else {
               return false;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field10915[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pw",
      name = "<init>",
      descriptor = "(Lck;)V"
   )
   public class734(class667 arg0) {
      try {
         this.field10885 = arg0;
         if (this.field10885.field9957 && this.field10885.field9950) {
            this.field10882 = this.field10893 = new class105(this.field10885);
            if (~this.field10885.field9894 < -2 && this.field10885.field10007 && this.field10885.field9967) {
               this.field10882 = this.field10884 = new class105(this.field10885);
               return;
            }
         }

      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10915[14] + (arg0 != null ? field10915[2] : field10915[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5346(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 83);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5347(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 69;
            break;
         case 1:
            var10005 = 114;
            break;
         case 2:
            var10005 = 30;
            break;
         case 3:
            var10005 = 103;
            break;
         default:
            var10005 = 83;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
