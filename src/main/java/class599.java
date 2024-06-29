import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class599 {
   @OriginalMember(
      owner = "client!hj",
      name = "M",
      descriptor = "I"
   )
   private int field8333 = 0;
   @OriginalMember(
      owner = "client!hj",
      name = "q",
      descriptor = "I"
   )
   private int field8342 = 0;
   @OriginalMember(
      owner = "client!hj",
      name = "z",
      descriptor = "I"
   )
   private int field8343 = 1;
   @OriginalMember(
      owner = "client!hj",
      name = "E",
      descriptor = "I"
   )
   private int field8339 = 1;
   @OriginalMember(
      owner = "client!hj",
      name = "x",
      descriptor = "Lod;"
   )
   private class536 field8331 = new class536();
   @OriginalMember(
      owner = "client!hj",
      name = "B",
      descriptor = "[Lmj;"
   )
   private class684[] field8350 = new class684[2];
   @OriginalMember(
      owner = "client!hj",
      name = "C",
      descriptor = "Z"
   )
   private boolean field8348 = false;
   @OriginalMember(
      owner = "client!hj",
      name = "i",
      descriptor = "I"
   )
   private int field8352 = -1;
   @OriginalMember(
      owner = "client!hj",
      name = "n",
      descriptor = "Z"
   )
   private boolean field8353 = true;
   @OriginalMember(
      owner = "client!hj",
      name = "g",
      descriptor = "I"
   )
   private int field8347 = 0;
   @OriginalMember(
      owner = "client!hj",
      name = "o",
      descriptor = "Z"
   )
   private boolean field8364 = true;
   @OriginalMember(
      owner = "client!hj",
      name = "l",
      descriptor = "Z"
   )
   private boolean field8361 = true;
   @OriginalMember(
      owner = "client!hj",
      name = "b",
      descriptor = "Z"
   )
   private boolean field8360 = true;
   @OriginalMember(
      owner = "client!hj",
      name = "K",
      descriptor = "Lor;"
   )
   private class670 field8335;
   @OriginalMember(
      owner = "client!hj",
      name = "e",
      descriptor = "Lle;"
   )
   private class325 field8336;
   @OriginalMember(
      owner = "client!hj",
      name = "A",
      descriptor = "Lle;"
   )
   private class325 field8341;
   @OriginalMember(
      owner = "client!hj",
      name = "I",
      descriptor = "Lle;"
   )
   private class325 field8330;
   @OriginalMember(
      owner = "client!hj",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8365 = new String[]{method4373(method4372("\u007f^@$\u0004")), method4373(method4372("\u007f^@ \u0004")), method4373(method4372("\u007f^@+\u0004")), method4373(method4372("\u007f^@#\u0004")), method4373(method4372("yA\u0002\u000e")), method4373(method4372("l\u001a@LQ")), method4373(method4372("\u007f^@&\u0004")), method4373(method4372("\u007f^@^Ey]\u001a\\\u0004")), method4373(method4372("\u007f^@(\u0004")), method4373(method4372("\u007f^@!\u0004")), method4373(method4372("\u007f^@%\u0004")), method4373(method4372("\u007f^@*\u0004")), method4373(method4372("\u007f^@'\u0004"))};
   @OriginalMember(
      owner = "client!hj",
      name = "c",
      descriptor = "Ldd;"
   )
   public static class735 field8351 = new class735(15, 0, 1, 0);
   @OriginalMember(
      owner = "client!hj",
      name = "F",
      descriptor = "I"
   )
   public static int field8357 = 0;
   @OriginalMember(
      owner = "client!hj",
      name = "k",
      descriptor = "[[Z"
   )
   public static boolean[][] field8363 = new boolean[][]{new boolean[4], {false, true, true, false}, {true, false, true, false}, {true, false, true, false}, {false, false, true, false}, {false, false, true, false}, {true, false, true, false}, {true, false, false, true}, {true, false, false, true}, {true, true, false, false}, new boolean[4], {false, true, false, true}, new boolean[4]};
   @OriginalMember(
      owner = "client!hj",
      name = "t",
      descriptor = "I"
   )
   public static int field8329;
   @OriginalMember(
      owner = "client!hj",
      name = "v",
      descriptor = "I"
   )
   public static int field8332;
   @OriginalMember(
      owner = "client!hj",
      name = "s",
      descriptor = "I"
   )
   public static int field8334;
   @OriginalMember(
      owner = "client!hj",
      name = "f",
      descriptor = "I"
   )
   public static int field8337;
   @OriginalMember(
      owner = "client!hj",
      name = "w",
      descriptor = "I"
   )
   public static int field8338;
   @OriginalMember(
      owner = "client!hj",
      name = "D",
      descriptor = "I"
   )
   public static int field8340;
   @OriginalMember(
      owner = "client!hj",
      name = "d",
      descriptor = "I"
   )
   public static int field8344;
   @OriginalMember(
      owner = "client!hj",
      name = "j",
      descriptor = "I"
   )
   public static int field8345;
   @OriginalMember(
      owner = "client!hj",
      name = "y",
      descriptor = "I"
   )
   public static int field8354;
   @OriginalMember(
      owner = "client!hj",
      name = "H",
      descriptor = "Lmu;"
   )
   public static class318 field8358;
   @OriginalMember(
      owner = "client!hj",
      name = "h",
      descriptor = "Lpaa;"
   )
   private class655 field8349;
   @OriginalMember(
      owner = "client!hj",
      name = "m",
      descriptor = "Lpaa;"
   )
   private class655 field8356;
   @OriginalMember(
      owner = "client!hj",
      name = "r",
      descriptor = "Lmj;"
   )
   private class684 field8355;
   @OriginalMember(
      owner = "client!hj",
      name = "u",
      descriptor = "Z"
   )
   private boolean field8346;
   @OriginalMember(
      owner = "client!hj",
      name = "a",
      descriptor = "[Lg;"
   )
   public static class165[] field8362;
   @OriginalMember(
      owner = "client!hj",
      name = "p",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field8359;

   @OriginalMember(
      owner = "client!hj",
      name = "c",
      descriptor = "(B)V"
   )
   public final void method4362(byte arg0) {
      boolean var2 = client.field4273;

      try {
         this.field8356 = null;
         this.field8350 = null;
         this.field8349 = null;
         this.field8341 = this.field8330 = this.field8336 = null;
         this.field8355 = null;
         if (arg0 > 92) {
            ++field8344;
            if (!this.field8331.method3858((byte)-63)) {
               class500 var3 = this.field8331.method3855(120);
               if (var2 || this.field8331.field7319 != var3) {
                  do {
                     ((class224)var3).method1712((byte)114);
                     var3 = var3.field6867;
                  } while(this.field8331.field7319 != var3);
               }
            }

            this.field8343 = this.field8339 = 1;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field8365[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hj",
      name = "a",
      descriptor = "(IIIZI)Z"
   )
   public final boolean method4363(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
      boolean var6 = client.field4273;

      try {
         if (arg3) {
            this.method4370((byte)30, (class224)null);
         }

         ++field8334;
         if (this.field8341 != null && !this.field8331.method3858((byte)-63)) {
            if (~this.field8343 != ~arg0 || ~this.field8339 != ~arg2) {
               this.field8339 = arg2;
               this.field8343 = arg0;
               class500 var7 = this.field8331.method3855(-31);
               if (var6) {
                  ((class224)var7).method1711(this.field8343, this.field8339, 127);
                  var7 = var7.field6867;
               }

               while(true) {
                  while(this.field8331.field7319 != var7) {
                     ((class224)var7).method1711(this.field8343, this.field8339, 127);
                     var7 = var7.field6867;
                  }

                  this.field8360 = true;
                  this.field8364 = true;
                  if (!var6) {
                     this.field8361 = true;
                     break;
                  }

                  var7 = var7.field6867;
               }
            }

            if (this.method4365(-21002)) {
               this.field8333 = arg1;
               this.field8346 = true;
               this.field8342 = arg4;
               this.field8335.method4899((byte)-124, this.field8341);
               this.field8341.method2460(-6052, 0);
               this.field8335.method4865(-this.field8342, -this.field8335.field9621 + this.field8333 + this.field8339, (byte)92);
               return true;
            } else {
               return false;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field8365[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hj",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method4364(int arg0) {
      boolean var2 = client.field4273;

      try {
         ++field8354;
         if (this.field8346) {
            if (this.field8330 != null) {
               int var3 = 16384;
               this.field8335.method4914(-1, this.field8330);
               this.field8335.method4868(this.field8336, (byte)127);
               this.field8330.method2462(true, 0);
               this.field8336.method2460(-6052, 0);
               if (this.field8348) {
                  var3 |= 256;
               }

               OpenGL.glBlitFramebufferEXT(0, 0, this.field8343, this.field8339, 0, 0, this.field8343, this.field8339, var3, 9728);
               this.field8335.method4882(this.field8330, 3584);
               this.field8335.method4887(false, this.field8336);
            }

            this.field8335.method4892(true);
            this.field8335.method4912(1, 0);
            this.field8335.method4879(0, 1);
            this.field8335.method593();
            int var4 = 0;
            if (arg0 != 9728) {
               this.method4369((byte)4);
            }

            int var5 = 1;
            class224 var6 = (class224)this.field8331.method3855(arg0 + -9807);
            class599 var10000;
            if (var2) {
               var10000 = this;
            } else if (var6 == null) {
               var10000 = this;
               if (!var2) {
                  this.field8346 = false;
                  return;
               }
            } else {
               var10000 = this;
            }

            while(true) {
               class224 var12;
               label82: {
                  class224 var7 = (class224)var10000.field8331.method3866((byte)125);
                  int var8 = var6.method1717(arg0 + -9630);
                  int var9 = 0;
                  if (var2) {
                     var6.method1706(var9, this.field8355, this.field8350[var4], (byte)-61);
                     var12 = var7;
                  } else if (var8 <= var9) {
                     var12 = var7;
                     if (!var2) {
                        break label82;
                     }
                  } else {
                     var6.method1706(var9, this.field8355, this.field8350[var4], (byte)-61);
                     var12 = var7;
                  }

                  while(true) {
                     label94: {
                        if (var12 == null && ~(var8 + -1) == ~var9) {
                           this.field8335.method4864((byte)-48, this.field8336);
                           this.field8335.method4865(0, 0, (byte)104);
                           OpenGL.glBegin(7);
                           OpenGL.glTexCoord2f(0.0F, (float)this.field8339);
                           OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                           OpenGL.glVertex2i(this.field8342, this.field8333);
                           OpenGL.glTexCoord2f(0.0F, 0.0F);
                           OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                           OpenGL.glVertex2i(this.field8342, this.field8333 - -this.field8339);
                           OpenGL.glTexCoord2f((float)this.field8343, 0.0F);
                           OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                           OpenGL.glVertex2i(this.field8343 + this.field8342, this.field8333 - -this.field8339);
                           OpenGL.glTexCoord2f((float)this.field8343, (float)this.field8339);
                           OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                           OpenGL.glVertex2i(this.field8342 - -this.field8343, this.field8333);
                           OpenGL.glEnd();
                           if (!var2) {
                              var4 = var4 + 1 & 1;
                              var6.method1707(var9, 1);
                              var5 = 1 & var5 + 1;
                              ++var9;
                              break label94;
                           }
                        }

                        this.field8336.method2460(-6052, var5);
                        OpenGL.glBegin(7);
                        OpenGL.glTexCoord2f(0.0F, (float)this.field8339);
                        OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                        OpenGL.glVertex2i(0, 0);
                        OpenGL.glTexCoord2f(0.0F, 0.0F);
                        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                        OpenGL.glVertex2i(0, this.field8339);
                        OpenGL.glTexCoord2f((float)this.field8343, 0.0F);
                        OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                        OpenGL.glVertex2i(this.field8343, this.field8339);
                        OpenGL.glTexCoord2f((float)this.field8343, (float)this.field8339);
                        OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                        OpenGL.glVertex2i(this.field8343, 0);
                        OpenGL.glEnd();
                        var4 = var4 + 1 & 1;
                        var6.method1707(var9, 1);
                        var5 = 1 & var5 + 1;
                        ++var9;
                     }

                     if (var8 <= var9) {
                        var12 = var7;
                        if (!var2) {
                           break;
                        }
                     } else {
                        var6.method1706(var9, this.field8355, this.field8350[var4], (byte)-61);
                        var12 = var7;
                     }
                  }
               }

               var6 = var12;
               if (var6 == null) {
                  var10000 = this;
                  if (!var2) {
                     this.field8346 = false;
                     return;
                  }
               } else {
                  var10000 = this;
               }
            }
         }
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field8365[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hj",
      name = "a",
      descriptor = "(I)Z"
   )
   private final boolean method4365(int arg0) {
      boolean var2 = client.field4273;

      try {
         ++field8329;
         if (this.field8361) {
            if (this.field8356 != null) {
               this.field8356.method4730((byte)47);
               this.field8356 = null;
            }

            if (this.field8355 != null) {
               this.field8355.method4124((byte)118);
               this.field8355 = null;
            }

            if (this.field8330 != null) {
               this.field8356 = new class655(this.field8335, 6402, this.field8343, this.field8339, this.field8335.field9705);
            }

            label111: {
               if (!this.field8348) {
                  if (this.field8356 != null) {
                     break label111;
                  }

                  this.field8356 = new class655(this.field8335, 6402, this.field8343, this.field8339);
                  if (!var2) {
                     break label111;
                  }
               }

               this.field8355 = new class684(this.field8335, 34037, 6402, this.field8343, this.field8339);
            }

            this.field8361 = false;
            this.field8353 = true;
            this.field8360 = true;
         }

         if (arg0 != -21002) {
            this.method4371((class224)null, -55);
         }

         if (this.field8364) {
            if (this.field8349 != null) {
               this.field8349.method4730((byte)42);
               this.field8349 = null;
            }

            if (this.field8350[0] != null) {
               this.field8350[0].method4124((byte)121);
               this.field8350[0] = null;
            }

            if (this.field8350[1] != null) {
               this.field8350[1].method4124((byte)117);
               this.field8350[1] = null;
            }

            if (this.field8330 != null) {
               this.field8349 = new class655(this.field8335, this.field8352, this.field8343, this.field8339, this.field8335.field9705);
            }

            this.field8350[0] = new class684(this.field8335, 34037, this.field8352, this.field8343, this.field8339);
            this.field8350[1] = this.field8347 <= 1 ? null : new class684(this.field8335, 34037, this.field8352, this.field8343, this.field8339);
            this.field8364 = false;
            this.field8353 = true;
            this.field8360 = true;
         }

         if (this.field8360) {
            label124: {
               if (this.field8330 == null) {
                  this.field8335.method4899((byte)-94, this.field8336);
                  this.field8336.method2446(0, (byte)81);
                  this.field8336.method2446(1, (byte)81);
                  this.field8336.method2446(8, (byte)81);
                  this.field8336.method2455(0, this.field8350[0], 117);
                  if (~this.field8347 < -2) {
                     this.field8336.method2455(1, this.field8350[1], 100);
                  }

                  label95: {
                     if (!this.field8348) {
                        this.field8336.method2461(true, 8, this.field8356);
                        if (!var2) {
                           break label95;
                        }
                     }

                     this.field8336.method2455(8, this.field8355, -124);
                  }

                  this.field8335.method4864((byte)-48, this.field8336);
                  if (!var2) {
                     break label124;
                  }
               }

               this.field8335.method4899((byte)-127, this.field8336);
               this.field8336.method2446(0, (byte)81);
               this.field8336.method2446(1, (byte)81);
               this.field8336.method2446(8, (byte)81);
               this.field8336.method2455(0, this.field8350[0], arg0 ^ 21042);
               if (~this.field8347 < -2) {
                  this.field8336.method2455(1, this.field8350[1], -86);
               }

               if (this.field8348) {
                  this.field8336.method2455(8, this.field8355, 69);
               }

               this.field8335.method4864((byte)-48, this.field8336);
               this.field8335.method4899((byte)-81, this.field8330);
               this.field8330.method2446(0, (byte)81);
               this.field8330.method2446(8, (byte)81);
               this.field8330.method2461(true, 0, this.field8349);
               this.field8330.method2461(true, 8, this.field8356);
               this.field8335.method4864((byte)-48, this.field8330);
            }

            this.field8353 = true;
            this.field8360 = false;
         }

         if (this.field8353) {
            this.field8335.method4899((byte)-106, this.field8341);
            this.field8353 = !this.field8341.method2453(arg0 ^ -21119);
            this.field8335.method4864((byte)-48, this.field8341);
         }

         return !this.field8353;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field8365[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hj",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method4366(int arg0, int arg1, int arg2) {
      try {
         int var3 = 76 % ((-67 - arg1) / 43);
         ++field8337;
         return ~(2048 & arg2) != -1 && (arg0 & 55) != 0;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field8365[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hj",
      name = "a",
      descriptor = "(B)V"
   )
   private final void method4367(byte arg0) {
      boolean var2 = client.field4273;

      try {
         ++field8338;
         if (arg0 == 15) {
            boolean var3 = false;
            int var4 = 0;
            int var5 = 0;
            class224 var6 = (class224)this.field8331.method3855(120);
            int var7;
            if (var2) {
               var7 = var6.method1716(true);
               if (~var7 < ~var4) {
                  var4 = var7;
               }

               var5 += var6.method1717(114);
               var3 |= var6.method1714(false);
               var6 = (class224)this.field8331.method3866((byte)125);
            }

            while(true) {
               int var10000;
               if (var6 == null) {
                  var10000 = ~var4;
                  if (!var2) {
                     int var8;
                     label67: {
                        if (var10000 != -3) {
                           if (~var4 != -2) {
                              var8 = 6408;
                              if (!var2) {
                                 break label67;
                              }
                           }

                           var8 = 34842;
                           if (!var2) {
                              break label67;
                           }
                        }

                        var8 = 34836;
                     }

                     if (~this.field8352 != ~var8) {
                        this.field8364 = true;
                        this.field8352 = var8;
                     }

                     int var9 = this.field8347 <= 2 ? this.field8347 : 2;
                     int var10 = var5 > 2 ? 2 : var5;
                     if (!this.field8348 != !var3) {
                        this.field8348 = var3;
                        this.field8361 = true;
                     }

                     if (~var9 != ~var10) {
                        this.field8360 = this.field8364 = true;
                     }

                     this.field8347 = var5;
                     return;
                  }
               } else {
                  var10000 = var6.method1716(true);
               }

               var7 = var10000;
               if (~var7 < ~var4) {
                  var4 = var7;
               }

               var5 += var6.method1717(114);
               var3 |= var6.method1714(false);
               var6 = (class224)this.field8331.method3866((byte)125);
            }
         }
      } catch (RuntimeException var12) {
         throw class534.method3846(var12, field8365[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hj",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method4368(int arg0) {
      try {
         field8362 = null;
         field8363 = null;
         field8351 = null;
         if (arg0 == 1) {
            field8359 = null;
            field8358 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field8365[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hj",
      name = "b",
      descriptor = "(B)Z"
   )
   public final boolean method4369(byte arg0) {
      try {
         if (arg0 != 67) {
            this.method4365(69);
         }

         ++field8345;
         return this.field8341 != null;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field8365[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hj",
      name = "a",
      descriptor = "(BLta;)V"
   )
   public final void method4370(byte arg0, class224 arg1) {
      try {
         ++field8332;
         if (arg0 == 58) {
            arg1.field2808 = false;
            arg1.method1712((byte)99);
            arg1.method3609(85);
            this.method4367((byte)15);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field8365[3] + arg0 + ',' + (arg1 != null ? field8365[5] : field8365[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hj",
      name = "a",
      descriptor = "(Lta;I)Z"
   )
   public final boolean method4371(class224 arg0, int arg1) {
      try {
         ++field8340;
         if (this.field8341 != null) {
            if (arg0.method1708(0) || arg0.method1710(false)) {
               this.field8331.method3859(2, arg0);
               this.method4367((byte)15);
               if (this.method4365(-21002)) {
                  if (~this.field8343 != 0 && this.field8339 != -1) {
                     arg0.method1711(this.field8343, this.field8339, -104);
                  }

                  arg0.field2808 = true;
                  return true;
               }
            }

            this.method4370((byte)58, arg0);
         }

         return arg1 != 0 ? false : false;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field8365[8] + (arg0 != null ? field8365[5] : field8365[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hj",
      name = "<init>",
      descriptor = "(Lor;)V"
   )
   public class599(class670 arg0) {
      try {
         this.field8335 = arg0;
         if (this.field8335.field9857 && this.field8335.field9809) {
            this.field8341 = this.field8336 = new class325(this.field8335);
            if (~this.field8335.field9705 < -2 && this.field8335.field9844 && this.field8335.field9848) {
               this.field8341 = this.field8330 = new class325(this.field8335);
               return;
            }
         }

      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field8365[7] + (arg0 != null ? field8365[5] : field8365[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4372(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 44);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4373(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 23;
            break;
         case 1:
            var10005 = 52;
            break;
         case 2:
            var10005 = 110;
            break;
         case 3:
            var10005 = 98;
            break;
         default:
            var10005 = 44;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
