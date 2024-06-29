import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class692 {
   @OriginalMember(
      owner = "client!qr",
      name = "r",
      descriptor = "I"
   )
   private int field9960 = 0;
   @OriginalMember(
      owner = "client!qr",
      name = "G",
      descriptor = "I"
   )
   private int field9965 = 0;
   @OriginalMember(
      owner = "client!qr",
      name = "s",
      descriptor = "I"
   )
   private int field9967 = 1;
   @OriginalMember(
      owner = "client!qr",
      name = "f",
      descriptor = "I"
   )
   private int field9969 = 1;
   @OriginalMember(
      owner = "client!qr",
      name = "D",
      descriptor = "Lsb;"
   )
   private class261 field9961 = new class261();
   @OriginalMember(
      owner = "client!qr",
      name = "z",
      descriptor = "Z"
   )
   private boolean field9983 = false;
   @OriginalMember(
      owner = "client!qr",
      name = "a",
      descriptor = "Z"
   )
   private boolean field9985 = true;
   @OriginalMember(
      owner = "client!qr",
      name = "m",
      descriptor = "Z"
   )
   private boolean field9980 = true;
   @OriginalMember(
      owner = "client!qr",
      name = "y",
      descriptor = "Z"
   )
   private boolean field9981 = true;
   @OriginalMember(
      owner = "client!qr",
      name = "h",
      descriptor = "[Lmn;"
   )
   private class8[] field9984 = new class8[2];
   @OriginalMember(
      owner = "client!qr",
      name = "c",
      descriptor = "Z"
   )
   private boolean field9986 = true;
   @OriginalMember(
      owner = "client!qr",
      name = "A",
      descriptor = "I"
   )
   private int field9987 = 0;
   @OriginalMember(
      owner = "client!qr",
      name = "I",
      descriptor = "I"
   )
   private int field9989 = -1;
   @OriginalMember(
      owner = "client!qr",
      name = "x",
      descriptor = "Laea;"
   )
   private class678 field9976;
   @OriginalMember(
      owner = "client!qr",
      name = "i",
      descriptor = "Lsd;"
   )
   private class603 field9963;
   @OriginalMember(
      owner = "client!qr",
      name = "v",
      descriptor = "Lsd;"
   )
   private class603 field9968;
   @OriginalMember(
      owner = "client!qr",
      name = "p",
      descriptor = "Lsd;"
   )
   private class603 field9978;
   @OriginalMember(
      owner = "client!qr",
      name = "K",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9990 = new String[]{method5030(method5029("^%\u0014#\u0000")), method5030(method5029("Ty\u0014HU")), method5030(method5029("K~Va")), method5030(method5029("Ty\u0014OU")), method5030(method5029("Ty\u0014FU")), method5030(method5029("Ty\u0014DU")), method5030(method5029("Ty\u0014EU")), method5030(method5029("Ty\u0014AU")), method5030(method5029("Ty\u0014KU")), method5030(method5029("Ty\u0014IU")), method5030(method5029("Ty\u0014NU")), method5030(method5029("Ty\u0014JU")), method5030(method5029("Ty\u0014LU")), method5030(method5029("Ty\u00141\u0014KbN3U")), method5030(method5029("Ty\u0014GU"))};
   @OriginalMember(
      owner = "client!qr",
      name = "j",
      descriptor = "Lfm;"
   )
   public static class164 field9962 = new class164(88, -1);
   @OriginalMember(
      owner = "client!qr",
      name = "d",
      descriptor = "I"
   )
   public static int field9954;
   @OriginalMember(
      owner = "client!qr",
      name = "q",
      descriptor = "I"
   )
   public static int field9955;
   @OriginalMember(
      owner = "client!qr",
      name = "w",
      descriptor = "I"
   )
   public static int field9958;
   @OriginalMember(
      owner = "client!qr",
      name = "F",
      descriptor = "I"
   )
   public static int field9959;
   @OriginalMember(
      owner = "client!qr",
      name = "k",
      descriptor = "I"
   )
   public static int field9964;
   @OriginalMember(
      owner = "client!qr",
      name = "t",
      descriptor = "I"
   )
   public static int field9966;
   @OriginalMember(
      owner = "client!qr",
      name = "g",
      descriptor = "I"
   )
   public static int field9970;
   @OriginalMember(
      owner = "client!qr",
      name = "b",
      descriptor = "I"
   )
   public static int field9971;
   @OriginalMember(
      owner = "client!qr",
      name = "l",
      descriptor = "I"
   )
   public static int field9972;
   @OriginalMember(
      owner = "client!qr",
      name = "n",
      descriptor = "I"
   )
   public static int field9973;
   @OriginalMember(
      owner = "client!qr",
      name = "o",
      descriptor = "I"
   )
   public static int field9974;
   @OriginalMember(
      owner = "client!qr",
      name = "C",
      descriptor = "I"
   )
   public static int field9975;
   @OriginalMember(
      owner = "client!qr",
      name = "E",
      descriptor = "I"
   )
   public static int field9977;
   @OriginalMember(
      owner = "client!qr",
      name = "H",
      descriptor = "Llka;"
   )
   private class352 field9979;
   @OriginalMember(
      owner = "client!qr",
      name = "u",
      descriptor = "Llka;"
   )
   private class352 field9988;
   @OriginalMember(
      owner = "client!qr",
      name = "J",
      descriptor = "Lsa;"
   )
   public static class39 field9956;
   @OriginalMember(
      owner = "client!qr",
      name = "B",
      descriptor = "Lmn;"
   )
   private class8 field9982;
   @OriginalMember(
      owner = "client!qr",
      name = "e",
      descriptor = "Z"
   )
   private boolean field9957;

   @OriginalMember(
      owner = "client!qr",
      name = "a",
      descriptor = "(IB)I"
   )
   public static final int method5017(int arg0, byte arg1) {
      try {
         if (arg1 != 118) {
            return -43;
         } else {
            ++field9964;
            return arg0 >>> 8;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9990[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qr",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method5018(int arg0) {
      try {
         field9956 = null;
         field9962 = null;
         if (arg0 != 0) {
            method5019((byte)84);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9990[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qr",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method5019(byte arg0) {
      try {
         ++field9971;
         class798.field11597.method77(-85);
         int var1 = -59 % ((66 - arg0) / 44);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9990[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qr",
      name = "a",
      descriptor = "(Z)V"
   )
   private final void method5020(boolean arg0) {
      boolean var2 = client.field10022;

      try {
         ++field9974;
         boolean var3 = arg0;
         int var4 = 0;
         int var5 = 0;
         class122 var6 = (class122)this.field9961.method2245((byte)-94);
         int var7;
         if (var2) {
            var7 = var6.method1201(256);
            if (~var7 < ~var4) {
               var4 = var7;
            }

            var5 += var6.method1210(true);
            var3 = arg0 | var6.method1204(false);
            var6 = (class122)this.field9961.method2239((byte)110);
         }

         while(true) {
            int var10000;
            if (var6 == null) {
               var10000 = var4;
               if (!var2) {
                  int var8;
                  label54: {
                     if (var4 != 2) {
                        if (var4 != 1) {
                           var8 = 6408;
                           if (!var2) {
                              break label54;
                           }
                        }

                        var8 = 34842;
                        if (!var2) {
                           break label54;
                        }
                     }

                     var8 = 34836;
                  }

                  if (this.field9989 != var8) {
                     this.field9989 = var8;
                     this.field9981 = true;
                  }

                  int var9 = ~this.field9987 >= -3 ? this.field9987 : 2;
                  int var10 = var5 <= 2 ? var5 : 2;
                  if (this.field9983 != var3) {
                     this.field9983 = var3;
                     this.field9980 = true;
                  }

                  if (~var9 != ~var10) {
                     this.field9985 = this.field9981 = true;
                  }

                  this.field9987 = var5;
                  return;
               }
            } else {
               var10000 = var6.method1201(256);
            }

            var7 = var10000;
            if (~var7 < ~var4) {
               var4 = var7;
            }

            var5 += var6.method1210(true);
            var3 |= var6.method1204(false);
            var6 = (class122)this.field9961.method2239((byte)110);
         }
      } catch (RuntimeException var12) {
         throw class612.method4503(var12, field9990[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qr",
      name = "a",
      descriptor = "(IIBII)Z"
   )
   public final boolean method5021(int arg0, int arg1, byte arg2, int arg3, int arg4) {
      boolean var6 = client.field10022;

      try {
         if (arg2 <= 42) {
            this.field9965 = -8;
         }

         ++field9975;
         if (this.field9968 != null && !this.field9961.method2242(23702)) {
            if (~this.field9967 != ~arg0 || this.field9969 != arg1) {
               this.field9969 = arg1;
               this.field9967 = arg0;
               class247 var7 = this.field9961.method2245((byte)-94);
               if (var6) {
                  ((class122)var7).method1205(this.field9969, 0, this.field9967);
                  var7 = var7.field3781;
               }

               while(true) {
                  while(this.field9961.field4002 != var7) {
                     ((class122)var7).method1205(this.field9969, 0, this.field9967);
                     var7 = var7.field3781;
                  }

                  this.field9980 = true;
                  this.field9985 = true;
                  if (!var6) {
                     this.field9981 = true;
                     break;
                  }

                  var7 = var7.field3781;
               }
            }

            if (this.method5028(0)) {
               this.field9960 = arg3;
               this.field9965 = arg4;
               this.field9957 = true;
               this.field9976.method4964(true, this.field9968);
               this.field9968.method4445(0, (byte)-93);
               this.field9976.method4922(-this.field9965, this.field9969 - -this.field9960 - this.field9976.field9538, false);
               return true;
            } else {
               return false;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field9990[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qr",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method5022(int arg0) {
      boolean var2 = client.field10022;

      try {
         ++field9970;
         int var3 = -57 % ((47 - arg0) / 35);
         if (this.field9957) {
            if (this.field9978 != null) {
               int var4 = 16384;
               this.field9976.method4920(this.field9978, 1729665456);
               this.field9976.method4926(this.field9963, -4);
               this.field9978.method4449(0, (byte)90);
               this.field9963.method4445(0, (byte)42);
               if (this.field9983) {
                  var4 |= 256;
               }

               OpenGL.glBlitFramebufferEXT(0, 0, this.field9967, this.field9969, 0, 0, this.field9967, this.field9969, var4, 9728);
               this.field9976.method4913(this.field9978, -15847);
               this.field9976.method4939(-73, this.field9963);
            }

            this.field9976.method4914(-17734);
            this.field9976.method4965(0, (byte)-83);
            this.field9976.method4947(false, 1);
            this.field9976.method231();
            int var5 = 0;
            int var6 = 1;
            class122 var7 = (class122)this.field9961.method2245((byte)-94);
            class692 var10000;
            if (var2) {
               var10000 = this;
            } else if (var7 == null) {
               var10000 = this;
               if (!var2) {
                  this.field9957 = false;
                  return;
               }
            } else {
               var10000 = this;
            }

            while(true) {
               class122 var13;
               label81: {
                  class122 var8 = (class122)var10000.field9961.method2239((byte)121);
                  int var9 = var7.method1210(true);
                  int var10 = 0;
                  if (var2) {
                     var7.method1203(var10, this.field9984[var5], this.field9982, (byte)115);
                     var13 = var8;
                  } else if (~var9 >= ~var10) {
                     var13 = var8;
                     if (!var2) {
                        break label81;
                     }
                  } else {
                     var7.method1203(var10, this.field9984[var5], this.field9982, (byte)115);
                     var13 = var8;
                  }

                  while(true) {
                     label94: {
                        if (var13 != null || var9 + -1 != var10) {
                           this.field9963.method4445(var6, (byte)114);
                           OpenGL.glBegin(7);
                           OpenGL.glTexCoord2f(0.0F, (float)this.field9969);
                           OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                           OpenGL.glVertex2i(0, 0);
                           OpenGL.glTexCoord2f(0.0F, 0.0F);
                           OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                           OpenGL.glVertex2i(0, this.field9969);
                           OpenGL.glTexCoord2f((float)this.field9967, 0.0F);
                           OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                           OpenGL.glVertex2i(this.field9967, this.field9969);
                           OpenGL.glTexCoord2f((float)this.field9967, (float)this.field9969);
                           OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                           OpenGL.glVertex2i(this.field9967, 0);
                           OpenGL.glEnd();
                           if (!var2) {
                              var5 = var5 + 1 & 1;
                              var6 = 1 & var6 + 1;
                              var7.method1211(var10, (byte)97);
                              ++var10;
                              break label94;
                           }
                        }

                        this.field9976.method4951((byte)73, this.field9963);
                        this.field9976.method4922(0, 0, false);
                        OpenGL.glBegin(7);
                        OpenGL.glTexCoord2f(0.0F, (float)this.field9969);
                        OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                        OpenGL.glVertex2i(this.field9965, this.field9960);
                        OpenGL.glTexCoord2f(0.0F, 0.0F);
                        OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                        OpenGL.glVertex2i(this.field9965, this.field9969 + this.field9960);
                        OpenGL.glTexCoord2f((float)this.field9967, 0.0F);
                        OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                        OpenGL.glVertex2i(this.field9965 - -this.field9967, this.field9960 - -this.field9969);
                        OpenGL.glTexCoord2f((float)this.field9967, (float)this.field9969);
                        OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                        OpenGL.glVertex2i(this.field9967 + this.field9965, this.field9960);
                        OpenGL.glEnd();
                        var5 = var5 + 1 & 1;
                        var6 = 1 & var6 + 1;
                        var7.method1211(var10, (byte)97);
                        ++var10;
                     }

                     if (~var9 >= ~var10) {
                        var13 = var8;
                        if (!var2) {
                           break;
                        }
                     } else {
                        var7.method1203(var10, this.field9984[var5], this.field9982, (byte)115);
                        var13 = var8;
                     }
                  }
               }

               var7 = var13;
               if (var7 == null) {
                  var10000 = this;
                  if (!var2) {
                     this.field9957 = false;
                     return;
                  }
               } else {
                  var10000 = this;
               }
            }
         }
      } catch (RuntimeException var12) {
         throw class612.method4503(var12, field9990[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qr",
      name = "a",
      descriptor = "(Lts;B)Z"
   )
   public final boolean method5023(class122 arg0, byte arg1) {
      try {
         if (arg1 != 20) {
            this.method5024((byte)-13);
         }

         ++field9958;
         if (this.field9968 != null) {
            if (arg0.method1208(arg1 + -20) || arg0.method1200(256)) {
               this.field9961.method2238(arg0, 13);
               this.method5020(false);
               if (this.method5028(arg1 + -20)) {
                  if (this.field9967 != -1 && this.field9969 != -1) {
                     arg0.method1205(this.field9969, 0, this.field9967);
                  }

                  arg0.field1960 = true;
                  return true;
               }
            }

            this.method5025(arg0, (byte)70);
         }

         return false;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9990[1] + (arg0 != null ? field9990[0] : field9990[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qr",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method5024(byte arg0) {
      boolean var2 = client.field10022;

      try {
         this.field9984 = null;
         this.field9982 = null;
         ++field9972;
         this.field9979 = null;
         this.field9988 = null;
         int var3 = 91 % ((70 - arg0) / 52);
         this.field9968 = this.field9978 = this.field9963 = null;
         if (!this.field9961.method2242(23702)) {
            class247 var4 = this.field9961.method2245((byte)-94);
            if (var2 || this.field9961.field4002 != var4) {
               do {
                  ((class122)var4).method1206(124);
                  var4 = var4.field3781;
               } while(this.field9961.field4002 != var4);
            }
         }

         this.field9967 = this.field9969 = 1;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field9990[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qr",
      name = "b",
      descriptor = "(Lts;B)V"
   )
   public final void method5025(class122 arg0, byte arg1) {
      try {
         ++field9959;
         if (arg1 == 70) {
            arg0.field1960 = false;
            arg0.method1206(93);
            arg0.method2140((byte)113);
            this.method5020(false);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9990[11] + (arg0 != null ? field9990[0] : field9990[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qr",
      name = "d",
      descriptor = "(I)V"
   )
   public static final void method5026(int arg0) {
      try {
         ++field9966;
         if (class797.field11593 == null) {
            class103 var1 = new class103();
            byte[] var2 = var1.method1013(16, 128, (byte)92, 128);
            class797.field11593 = class393.method3047(1, false, var2);
         }

         if (arg0 == 16) {
            if (class193.field2802 == null) {
               class95 var3 = new class95();
               byte[] var4 = var3.method956(128, 128, 16, (byte)110);
               class193.field2802 = class393.method3047(1, false, var4);
            }
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field9990[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qr",
      name = "e",
      descriptor = "(I)Z"
   )
   public final boolean method5027(int arg0) {
      try {
         ++field9973;
         if (arg0 != 0) {
            return true;
         } else {
            return this.field9968 != null;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9990[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qr",
      name = "a",
      descriptor = "(I)Z"
   )
   private final boolean method5028(int arg0) {
      boolean var2 = client.field10022;

      try {
         if (this.field9980) {
            if (this.field9988 != null) {
               this.field9988.method2776(arg0 + -1);
               this.field9988 = null;
            }

            if (this.field9982 != null) {
               this.field9982.method5203((byte)-38);
               this.field9982 = null;
            }

            if (this.field9978 != null) {
               this.field9988 = new class352(this.field9976, 6402, this.field9967, this.field9969, this.field9976.field9673);
            }

            label111: {
               if (!this.field9983) {
                  if (this.field9988 != null) {
                     break label111;
                  }

                  this.field9988 = new class352(this.field9976, 6402, this.field9967, this.field9969);
                  if (!var2) {
                     break label111;
                  }
               }

               this.field9982 = new class8(this.field9976, 34037, 6402, this.field9967, this.field9969);
            }

            this.field9985 = true;
            this.field9986 = true;
            this.field9980 = false;
         }

         if (arg0 != 0) {
            this.field9984 = null;
         }

         ++field9955;
         if (this.field9981) {
            if (this.field9979 != null) {
               this.field9979.method2776(-1);
               this.field9979 = null;
            }

            if (this.field9984[0] != null) {
               this.field9984[0].method5203((byte)-38);
               this.field9984[0] = null;
            }

            if (this.field9984[1] != null) {
               this.field9984[1].method5203((byte)-38);
               this.field9984[1] = null;
            }

            if (this.field9978 != null) {
               this.field9979 = new class352(this.field9976, this.field9989, this.field9967, this.field9969, this.field9976.field9673);
            }

            this.field9984[0] = new class8(this.field9976, 34037, this.field9989, this.field9967, this.field9969);
            this.field9984[1] = ~this.field9987 >= -2 ? null : new class8(this.field9976, 34037, this.field9989, this.field9967, this.field9969);
            this.field9986 = true;
            this.field9981 = false;
            this.field9985 = true;
         }

         if (this.field9985) {
            label124: {
               if (this.field9978 != null) {
                  this.field9976.method4964(true, this.field9963);
                  this.field9963.method4444(16, 0);
                  this.field9963.method4444(arg0 + 16, 1);
                  this.field9963.method4444(16, 8);
                  this.field9963.method4447((byte)125, this.field9984[0], 0);
                  if (~this.field9987 < -2) {
                     this.field9963.method4447((byte)127, this.field9984[1], 1);
                  }

                  if (this.field9983) {
                     this.field9963.method4447((byte)113, this.field9982, 8);
                  }

                  this.field9976.method4951((byte)70, this.field9963);
                  this.field9976.method4964(true, this.field9978);
                  this.field9978.method4444(16, 0);
                  this.field9978.method4444(16, 8);
                  this.field9978.method4441(0, this.field9979, arg0 ^ 2);
                  this.field9978.method4441(8, this.field9988, 2);
                  this.field9976.method4951((byte)-122, this.field9978);
                  if (!var2) {
                     break label124;
                  }
               }

               this.field9976.method4964(true, this.field9963);
               this.field9963.method4444(16, 0);
               this.field9963.method4444(arg0 ^ 16, 1);
               this.field9963.method4444(16, 8);
               this.field9963.method4447((byte)110, this.field9984[0], 0);
               if (this.field9987 > 1) {
                  this.field9963.method4447((byte)111, this.field9984[1], 1);
               }

               label95: {
                  if (this.field9983) {
                     this.field9963.method4447((byte)110, this.field9982, 8);
                     if (!var2) {
                        break label95;
                     }
                  }

                  this.field9963.method4441(8, this.field9988, 2);
               }

               this.field9976.method4951((byte)0, this.field9963);
            }

            this.field9985 = false;
            this.field9986 = true;
         }

         if (this.field9986) {
            this.field9976.method4964(true, this.field9968);
            this.field9986 = !this.field9968.method4442(0);
            this.field9976.method4951((byte)-6, this.field9968);
         }

         return !this.field9986;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9990[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qr",
      name = "<init>",
      descriptor = "(Laea;)V"
   )
   public class692(class678 arg0) {
      try {
         this.field9976 = arg0;
         if (this.field9976.field9729 && this.field9976.field9777) {
            this.field9968 = this.field9963 = new class603(this.field9976);
            if (~this.field9976.field9673 < -2 && this.field9976.field9821 && this.field9976.field9734) {
               this.field9968 = this.field9978 = new class603(this.field9976);
               return;
            }
         }

      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9990[13] + (arg0 != null ? field9990[0] : field9990[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5029(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 125);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5030(char[] arg0) {
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
            var10005 = 11;
            break;
         case 2:
            var10005 = 58;
            break;
         case 3:
            var10005 = 13;
            break;
         default:
            var10005 = 125;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
