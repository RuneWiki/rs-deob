import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loginapplet!sa")
public class class41 implements class27 {
   @OriginalMember(
      owner = "loginapplet!sa",
      name = "a",
      descriptor = "Lsa;"
   )
   private static class41 field306 = class8.method31(-108, "Bitte warten Sie)1 w-=hrend wir Ihre Daten -Uberpr-Ufen)3");
   @OriginalMember(
      owner = "loginapplet!sa",
      name = "b",
      descriptor = "Lsa;"
   )
   private static class41 field307 = class8.method31(36, "Die von Ihnen angegebene Information ist ung-Ultig)3 Bitte versuchen Sie es erneut oder setzen Sie sich mit dem Passwort)2Team in Verbindung)3");
   @OriginalMember(
      owner = "loginapplet!sa",
      name = "c",
      descriptor = "I"
   )
   public static int field308 = 0;
   @OriginalMember(
      owner = "loginapplet!sa",
      name = "d",
      descriptor = "[B"
   )
   public byte[] field309;
   @OriginalMember(
      owner = "loginapplet!sa",
      name = "e",
      descriptor = "Lsa;"
   )
   public static class41 field310 = class8.method31(-88, "en");
   @OriginalMember(
      owner = "loginapplet!sa",
      name = "f",
      descriptor = "Lsa;"
   )
   private static class41 field311 = class8.method31(-99, "Um fortzufahren)1 m-Ussen Sie einen g-Ultigen Benutzernamen eingeben)3 Bitte versuchen Sie es erneut)3");
   @OriginalMember(
      owner = "loginapplet!sa",
      name = "g",
      descriptor = "Lsa;"
   )
   private static class41 field312 = class8.method31(109, "Der Teil der Webseite)1 mit dem Sie sich zu verbinden versuchen)1 ist gerade offline)3 Bitte versuchen Sie es sp-=ter erneut)3");
   @OriginalMember(
      owner = "loginapplet!sa",
      name = "h",
      descriptor = "Lsa;"
   )
   private static class41 field313 = class8.method31(-107, "Bitte warten Sie einen Moment)1 w-=hrend wir Sie weiterleiten)3");
   @OriginalMember(
      owner = "loginapplet!sa",
      name = "i",
      descriptor = "[Lsa;"
   )
   public static class41[] field314 = new class41[]{field313, field311, field307, field306, field312, field321, field315, field317};
   @OriginalMember(
      owner = "loginapplet!sa",
      name = "j",
      descriptor = "Lsa;"
   )
   private static class41 field315 = class8.method31(-107, "Passwort:");
   @OriginalMember(
      owner = "loginapplet!sa",
      name = "k",
      descriptor = "I"
   )
   public int field316;
   @OriginalMember(
      owner = "loginapplet!sa",
      name = "l",
      descriptor = "Lsa;"
   )
   private static class41 field317 = class8.method31(30, "Benutzername:");
   @OriginalMember(
      owner = "loginapplet!sa",
      name = "m",
      descriptor = "Z"
   )
   private boolean field318 = true;
   @OriginalMember(
      owner = "loginapplet!sa",
      name = "n",
      descriptor = "I"
   )
   private int field319;
   @OriginalMember(
      owner = "loginapplet!sa",
      name = "o",
      descriptor = "I"
   )
   public static int field320 = 0;
   @OriginalMember(
      owner = "loginapplet!sa",
      name = "p",
      descriptor = "Lsa;"
   )
   private static class41 field321 = class8.method31(122, "Leider ist das Einloggen in diesen Teil der Webseite fehlgeschlagen)3 Bitte versuchen Sie es sp-=ter erneut)3");
   // $FF: synthetic field
   @OriginalMember(
      owner = "loginapplet!sa",
      name = "q",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field322;

   @OriginalMember(
      owner = "loginapplet!sa",
      name = "a",
      descriptor = "(Lsa;Z)Lsa;",
      line = 7
   )
   public final class41 method189(class41 arg0, boolean arg1) {
      try {
         if (!this.field318) {
            throw new IllegalArgumentException();
         } else {
            if (arg1) {
               this.method204(-111, 8);
            }

            this.field319 = 0;
            if (this.field316 - -arg0.field316 > this.field309.length) {
               int var3;
               for(var3 = 1; var3 < this.field316 + arg0.field316; var3 += var3) {
               }

               byte[] var4 = new byte[var3];
               class47.method227(this.field309, 0, var4, 0, this.field316);
               this.field309 = var4;
            }

            class47.method227(arg0.field309, 0, this.field309, this.field316, arg0.field316);
            this.field316 += arg0.field316;
            return this;
         }
      } catch (RuntimeException var5) {
         throw class28.method139(var5, "sa.Q(" + (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!sa",
      name = "a",
      descriptor = "(BI)Lsa;",
      line = 48
   )
   public final class41 method190(byte arg0, int arg1) {
      try {
         if (arg0 != 46) {
            field321 = (class41)null;
         }

         return this.method208(arg1, 105, this.field316);
      } catch (RuntimeException var4) {
         throw class28.method139(var4, "sa.D(" + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!sa",
      name = "a",
      descriptor = "(ILea;)V",
      line = 60
   )
   public final void method191(int arg0, class13 arg1) {
      try {
         long var3 = 0L;
         long var5 = 0L;

         for(int var7 = 19; -1 >= ~var7; --var7) {
            var3 *= 38L;
            byte var8 = 0;
            if (this.field316 > var7) {
               var8 = this.field309[var7];
            }

            if (~var8 <= -66 && ~var8 >= -91) {
               var3 += (long)(-63 - -var8);
            } else if (~var8 <= -98 && var8 <= 122) {
               var3 += (long)(-97 + var8 + 2);
            } else if (~var8 <= -49 && -58 <= ~var8) {
               var3 += (long)(-20 + var8);
            } else if (0 != var8) {
               ++var3;
            }

            if (10 == var7) {
               var5 = var3;
               var3 = 0L;
            }
         }

         arg1.method72((byte)71, var3);
         arg1.method72((byte)-117, var5);
         if (arg0 <= 26) {
            field310 = (class41)null;
         }

      } catch (RuntimeException var9) {
         throw class28.method139(var9, "sa.O(" + arg0 + ',' + (arg1 != null ? "{...}" : "null") + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!sa",
      name = "a",
      descriptor = "(B)I",
      line = 117
   )
   public final int method192(byte arg0) {
      try {
         int var2 = 0;

         for(int var3 = 0; var3 < this.field316; ++var3) {
            var2 = (var2 << -636134939) - (var2 + -(this.field309[var3] & 255));
         }

         return arg0 != 22 ? -46 : var2;
      } catch (RuntimeException var4) {
         throw class28.method139(var4, "sa.T(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!sa",
      name = "toString",
      descriptor = "()Ljava/lang/String;",
      line = 143
   )
   public final String toString() {
      try {
         throw new RuntimeException();
      } catch (RuntimeException var2) {
         throw class28.method139(var2, "sa.toString()");
      }
   }

   @OriginalMember(
      owner = "loginapplet!sa",
      name = "a",
      descriptor = "(IIZ)V",
      line = 175
   )
   public final void method193(int arg0, int arg1, boolean arg2) {
      try {
         if (0 < arg1 && -256 <= ~arg1) {
            this.field309[arg0] = (byte)arg1;
            if (!arg2) {
               field307 = (class41)null;
            }

         } else {
            throw new IllegalArgumentException("invalid char");
         }
      } catch (RuntimeException var5) {
         throw class28.method139(var5, "sa.N(" + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!sa",
      name = "a",
      descriptor = "(II)I",
      line = 189
   )
   public final int method194(int arg0, int arg1) {
      try {
         return arg1 != 28738 ? 113 : this.field309[arg0] & 255;
      } catch (RuntimeException var4) {
         throw class28.method139(var4, "sa.P(" + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!sa",
      name = "a",
      descriptor = "(BLsa;)Z",
      line = 205
   )
   public final boolean method195(byte arg0, class41 arg1) {
      try {
         if (arg1.field316 > this.field316) {
            return false;
         } else {
            for(int var3 = 0; ~arg1.field316 < ~var3; ++var3) {
               if (~arg1.field309[var3] != ~this.field309[var3]) {
                  return false;
               }
            }

            if (arg0 != 33) {
               this.method194(43, -96);
            }

            return true;
         }
      } catch (RuntimeException var4) {
         throw class28.method139(var4, "sa.S(" + arg0 + ',' + (arg1 != null ? "{...}" : "null") + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!sa",
      name = "hashCode",
      descriptor = "()I",
      line = 230
   )
   public final int hashCode() {
      try {
         return this.method192((byte)22);
      } catch (RuntimeException var2) {
         throw class28.method139(var2, "sa.hashCode()");
      }
   }

   @OriginalMember(
      owner = "loginapplet!sa",
      name = "a",
      descriptor = "(I)I",
      line = 241
   )
   public final int method196(int arg0) {
      try {
         if (arg0 < 123) {
            this.method206(-120);
         }

         return this.field316;
      } catch (RuntimeException var3) {
         throw class28.method139(var3, "sa.L(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!sa",
      name = "b",
      descriptor = "(B)Lsa;",
      line = 257
   )
   public final class41 method197(byte arg0) {
      try {
         if (arg0 != -39) {
            this.field316 = -67;
         }

         if (this.field318) {
            this.field319 = 0;
            if (~this.field309.length != ~this.field316) {
               byte[] var2 = new byte[this.field316];
               class47.method227(this.field309, 0, var2, 0, this.field316);
               this.field309 = var2;
            }

            return this;
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var3) {
         throw class28.method139(var3, "sa.U(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!sa",
      name = "a",
      descriptor = "(Lsa;I)Z",
      line = 292
   )
   public final boolean method198(class41 arg0, int arg1) {
      try {
         if (arg0 != null) {
            if (this.field316 != arg0.field316) {
               return false;
            } else {
               if (!this.field318 || !arg0.field318) {
                  if (this.field319 == 0) {
                     this.field319 = this.method192((byte)22);
                     if (~this.field319 == -1) {
                        this.field319 = 1;
                     }
                  }

                  if (0 == arg0.field319) {
                     arg0.field319 = arg0.method192((byte)22);
                     if (0 == arg0.field319) {
                        arg0.field319 = 1;
                     }
                  }

                  if (~arg0.field319 != ~this.field319) {
                     return false;
                  }
               }

               if (arg1 != -91) {
                  this.method193(74, 23, true);
               }

               for(int var3 = 0; var3 < this.field316; ++var3) {
                  if (arg0.field309[var3] != this.field309[var3]) {
                     return false;
                  }
               }

               return true;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var4) {
         throw class28.method139(var4, "sa.M(" + (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!sa",
      name = "c",
      descriptor = "(B)Lsa;",
      line = 349
   )
   public final class41 method199(byte arg0) {
      try {
         long var2 = this.method202((byte)106);
         if (arg0 <= 16) {
            this.method193(-113, -95, false);
         }

         synchronized(field322 == null ? (field322 = method211("sa")) : field322) {
            class25 var5;
            if (class10.field83 == null) {
               class10.field83 = new class12(4096);
            } else {
               for(var5 = (class25)class10.field83.method51(var2, 100); null != var5; var5 = (class25)class10.field83.method50(-127)) {
                  if (this.method198(var5.field171, -91)) {
                     return var5.field171;
                  }
               }
            }

            var5 = new class25();
            var5.field171 = this;
            this.field318 = false;
            class10.field83.method54(-1, var5, var2);
         }

         return this;
      } catch (RuntimeException var8) {
         throw class28.method139(var8, "sa.A(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!sa",
      name = "a",
      descriptor = "(Lsa;IZ)Lsa;",
      line = 387
   )
   public final class41 method200(class41 arg0, int arg1, boolean arg2) {
      try {
         if (this.field318) {
            if (arg1 > this.field316) {
               throw new IllegalArgumentException();
            } else {
               this.field319 = 0;
               if (this.field309.length < arg0.field316 + arg1) {
                  int var4;
                  for(var4 = 1; ~(arg0.field316 + arg1) < ~var4; var4 += var4) {
                  }

                  byte[] var5 = new byte[var4];
                  class47.method227(this.field309, 0, var5, 0, this.field316);
                  this.field309 = var5;
               }

               class47.method227(arg0.field309, 0, this.field309, arg1, arg0.field316);
               if (arg2) {
                  this.method209(-24, -128);
               }

               if (~(arg0.field316 + arg1) < ~this.field316) {
                  this.field316 = arg0.field316 + arg1;
               }

               return this;
            }
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var6) {
         throw class28.method139(var6, "sa.J(" + (arg0 != null ? "{...}" : "null") + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!sa",
      name = "b",
      descriptor = "(I)Lsa;",
      line = 455
   )
   public final class41 method201(int arg0) {
      try {
         int var2;
         for(var2 = 0; ~this.field316 < ~var2 && (0 <= this.field309[var2] && 32 >= this.field309[var2] || ~(this.field309[var2] & 255) == -161); ++var2) {
         }

         int var3;
         for(var3 = this.field316; ~var3 < ~var2 && (0 <= this.field309[var3 - 1] && ~this.field309[-1 + var3] >= -33 || ~(255 & this.field309[-1 + var3]) == -161); --var3) {
         }

         if (~var2 == -1 && var3 == this.field316) {
            return this;
         } else {
            class41 var4 = new class41();
            if (arg0 != -3783) {
               this.field318 = true;
            }

            var4.field316 = -var2 + var3;
            var4.field309 = new byte[var4.field316];

            for(int var5 = 0; var5 < var4.field316; ++var5) {
               var4.field309[var5] = this.field309[var2 + var5];
            }

            return var4;
         }
      } catch (RuntimeException var6) {
         throw class28.method139(var6, "sa.K(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!sa",
      name = "d",
      descriptor = "(B)J",
      line = 512
   )
   private final long method202(byte arg0) {
      try {
         if (arg0 <= 71) {
            return 126L;
         } else {
            long var2 = 0L;

            for(int var4 = 0; this.field316 > var4; ++var4) {
               var2 = -var2 + ((var2 << 785496581) - -((long)(255 & this.field309[var4])));
            }

            return var2;
         }
      } catch (RuntimeException var5) {
         throw class28.method139(var5, "sa.V(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!sa",
      name = "e",
      descriptor = "(B)Lsa;",
      line = 548
   )
   public final class41 method203(byte arg0) {
      try {
         class41 var2 = new class41();
         var2.field316 = this.field316;
         var2.field309 = new byte[this.field316];

         for(int var3 = 0; this.field316 > var3; ++var3) {
            byte var4 = this.field309[var3];
            if (65 <= var4 && 90 >= var4 || -64 <= var4 && 33 <= ~var4 && var4 != -41) {
               var4 = (byte)(var4 + 32);
            }

            var2.field309[var3] = var4;
         }

         if (arg0 <= 17) {
            return (class41)null;
         } else {
            return var2;
         }
      } catch (RuntimeException var5) {
         throw class28.method139(var5, "sa.G(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!sa",
      name = "b",
      descriptor = "(II)V",
      line = 619
   )
   public final void method204(int arg0, int arg1) {
      try {
         this.field319 = 0;
         if (this.field318) {
            if (-1 < ~arg1) {
               throw new IllegalArgumentException();
            } else {
               int var3;
               if (this.field309.length < arg1) {
                  for(var3 = 1; ~var3 > ~arg1; var3 += var3) {
                  }

                  byte[] var4 = new byte[var3];
                  class47.method227(this.field309, 0, var4, 0, this.field316);
                  this.field309 = var4;
               }

               if (arg0 != 65) {
                  field310 = (class41)null;
               }

               for(var3 = this.field316; var3 < arg1; ++var3) {
                  this.field309[var3] = 32;
               }

               this.field316 = arg1;
            }
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var5) {
         throw class28.method139(var5, "sa.R(" + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!sa",
      name = "c",
      descriptor = "(I)V",
      line = 673
   )
   public static void method205(int arg0) {
      try {
         field317 = null;
         field312 = null;
         field306 = null;
         field313 = null;
         int var1 = -24 % ((-7 - arg0) / 41);
         field311 = null;
         field314 = null;
         field310 = null;
         field315 = null;
         field321 = null;
         field307 = null;
      } catch (RuntimeException var2) {
         throw class28.method139(var2, "sa.B(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!sa",
      name = "d",
      descriptor = "(I)I",
      line = 697
   )
   public final int method206(int arg0) {
      try {
         return arg0 != 32729 ? -123 : this.method209(10, -48);
      } catch (RuntimeException var3) {
         throw class28.method139(var3, "sa.H(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!sa",
      name = "e",
      descriptor = "(I)J",
      line = 715
   )
   public final long method207(int arg0) {
      try {
         if (arg0 != 11405) {
            field308 = -39;
         }

         long var2 = 0L;

         for(int var4 = 0; var4 < this.field316 && 12 > var4; ++var4) {
            var2 *= 37L;
            byte var5 = this.field309[var4];
            if (var5 >= 65 && 90 >= var5) {
               var2 += (long)(-65 + var5 + 1);
            } else if (var5 >= 97 && 122 >= var5) {
               var2 += (long)(var5 + -96);
            } else if (-49 >= ~var5 && var5 <= 57) {
               var2 += (long)(27 + var5 + -48);
            }
         }

         while(var2 % 37L == 0L && -1L != ~var2) {
            var2 /= 37L;
         }

         return var2;
      } catch (RuntimeException var6) {
         throw class28.method139(var6, "sa.I(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!sa",
      name = "equals",
      descriptor = "(Ljava/lang/Object;)Z",
      line = 756
   )
   public final boolean equals(Object arg0) {
      try {
         if (!(arg0 instanceof class41)) {
            throw new IllegalArgumentException();
         } else {
            return this.method198((class41)arg0, -91);
         }
      } catch (RuntimeException var3) {
         throw class28.method139(var3, "sa.equals(" + (arg0 != null ? "{...}" : "null") + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!sa",
      name = "a",
      descriptor = "(III)Lsa;",
      line = 776
   )
   public final class41 method208(int arg0, int arg1, int arg2) {
      try {
         class41 var4 = new class41();
         var4.field316 = arg2 - arg0;
         var4.field309 = new byte[-arg0 + arg2];
         if (arg1 <= 22) {
            field311 = (class41)null;
         }

         class47.method227(this.field309, arg0, var4.field309, 0, var4.field316);
         return var4;
      } catch (RuntimeException var5) {
         throw class28.method139(var5, "sa.C(" + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!sa",
      name = "c",
      descriptor = "(II)I",
      line = 791
   )
   public final int method209(int arg0, int arg1) {
      try {
         if (-2 < ~arg0 || 36 < arg0) {
            arg0 = 10;
         }

         if (arg1 != -48) {
            field320 = -17;
         }

         boolean var3 = false;
         int var5 = 0;
         boolean var4 = false;

         for(int var6 = 0; ~this.field316 < ~var6; ++var6) {
            int var7 = 255 & this.field309[var6];
            if (-1 == ~var6) {
               if (~var7 == -46) {
                  var3 = true;
                  continue;
               }

               if (~var7 == -44) {
                  continue;
               }
            }

            if (48 <= var7 && -58 <= ~var7) {
               var7 -= 48;
            } else if (~var7 <= -66 && var7 <= 90) {
               var7 -= 55;
            } else {
               if (~var7 > -98 || 122 < var7) {
                  throw new NumberFormatException();
               }

               var7 -= 87;
            }

            if (arg0 <= var7) {
               throw new NumberFormatException();
            }

            if (var3) {
               var7 = -var7;
            }

            int var8 = var5 * arg0 - -var7;
            if (~var5 != ~(var8 / arg0)) {
               throw new NumberFormatException();
            }

            var5 = var8;
            var4 = true;
         }

         if (!var4) {
            throw new NumberFormatException();
         } else {
            return var5;
         }
      } catch (RuntimeException var9) {
         throw class28.method139(var9, "sa.F(" + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!sa",
      name = "b",
      descriptor = "(BI)Lsa;",
      line = 866
   )
   public final class41 method210(byte arg0, int arg1) {
      try {
         if (arg0 != 64) {
            method205(-111);
         }

         if (-1 > ~arg1 && 255 >= arg1) {
            if (!this.field318) {
               throw new IllegalArgumentException();
            } else {
               this.field319 = 0;
               if (~this.field316 == ~this.field309.length) {
                  int var3;
                  for(var3 = 1; ~var3 >= ~this.field316; var3 += var3) {
                  }

                  byte[] var4 = new byte[var3];
                  class47.method227(this.field309, 0, var4, 0, this.field316);
                  this.field309 = var4;
               }

               this.field309[this.field316++] = (byte)arg1;
               return this;
            }
         } else {
            throw new IllegalArgumentException("invalid char:" + arg1);
         }
      } catch (RuntimeException var5) {
         throw class28.method139(var5, "sa.E(" + arg0 + ',' + arg1 + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "loginapplet!sa",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;",
      line = 353
   )
   public static Class method211(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }
}
