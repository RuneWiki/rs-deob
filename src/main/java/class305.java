import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class305 {
   @OriginalMember(
      owner = "client!sb",
      name = "j",
      descriptor = "Lvda;"
   )
   private class192 field4354;
   @OriginalMember(
      owner = "client!sb",
      name = "d",
      descriptor = "Ldh;"
   )
   private class338 field4355;
   @OriginalMember(
      owner = "client!sb",
      name = "e",
      descriptor = "I"
   )
   public int field4357;
   @OriginalMember(
      owner = "client!sb",
      name = "n",
      descriptor = "I"
   )
   private int field4348;
   @OriginalMember(
      owner = "client!sb",
      name = "p",
      descriptor = "I"
   )
   private int field4344;
   @OriginalMember(
      owner = "client!sb",
      name = "f",
      descriptor = "[B"
   )
   public byte[] field4346;
   @OriginalMember(
      owner = "client!sb",
      name = "h",
      descriptor = "I"
   )
   private int field4358;
   @OriginalMember(
      owner = "client!sb",
      name = "a",
      descriptor = "I"
   )
   private int field4347;
   @OriginalMember(
      owner = "client!sb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4360 = new String[]{method2316(method2315("\u0010r/1")), method2316(method2315("\u0005)ms+")), method2316(method2315("\rem\u001a~")), method2316(method2315("\rem\u001b~")), method2316(method2315("\rem\u001e~")), method2316(method2315("\rem\u001c~")), method2316(method2315("\rema?\u0010n7c~")), method2316(method2315("\rem\u0019~")), method2316(method2315("\rem\u0018~")), method2316(method2315("\rem\u001f~"))};
   @OriginalMember(
      owner = "client!sb",
      name = "i",
      descriptor = "I"
   )
   public static int field4343 = -1;
   @OriginalMember(
      owner = "client!sb",
      name = "o",
      descriptor = "I"
   )
   public static int field4345;
   @OriginalMember(
      owner = "client!sb",
      name = "q",
      descriptor = "I"
   )
   public static int field4349;
   @OriginalMember(
      owner = "client!sb",
      name = "m",
      descriptor = "I"
   )
   public static int field4351;
   @OriginalMember(
      owner = "client!sb",
      name = "g",
      descriptor = "I"
   )
   public static int field4352;
   @OriginalMember(
      owner = "client!sb",
      name = "k",
      descriptor = "I"
   )
   public static int field4353;
   @OriginalMember(
      owner = "client!sb",
      name = "b",
      descriptor = "I"
   )
   public static int field4356;
   @OriginalMember(
      owner = "client!sb",
      name = "c",
      descriptor = "I"
   )
   public static int field4359;
   @OriginalMember(
      owner = "client!sb",
      name = "l",
      descriptor = "[[Lag;"
   )
   private class711[][] field4350;

   @OriginalMember(
      owner = "client!sb",
      name = "a",
      descriptor = "(Lr;III)V"
   )
   public final void method2308(class193 arg0, int arg1, int arg2, int arg3) {
      try {
         ++field4356;
         class366 var5 = (class366)arg0;
         arg3 += var5.field5499 - arg1;
         arg2 += var5.field5500 + 1;
         int var6 = this.field4357 * arg2 + arg3;
         int var7 = 0;
         int var8 = var5.field5501;
         int var9 = var5.field5502;
         int var10 = this.field4357 - var9;
         if (~arg2 >= -1) {
            int var11 = -arg2 + 1;
            var6 += this.field4357 * var11;
            arg2 = 1;
            var7 += var9 * var11;
            var8 -= var11;
         }

         int var12 = 0;
         if (this.field4348 <= arg2 + var8) {
            int var13 = -this.field4348 + var8 + arg2 + 1;
            var8 -= var13;
         }

         if (arg3 <= 0) {
            int var14 = -arg3 + 1;
            arg3 = 1;
            var9 -= var14;
            var12 += var14;
            var7 += var14;
            var6 += var14;
            var10 += var14;
         }

         if (arg3 + var9 >= this.field4357) {
            int var15 = -this.field4357 + arg3 - (-var9 - 1);
            var10 += var15;
            var12 += var15;
            var9 -= var15;
         }

         if (~var9 < -1 && ~var8 < -1) {
            class253.method1907(var12, var5.field5510, arg1, this.field4346, var9, var10, var6, var8, var7);
            this.method2311(arg3, arg2, var8, var9, arg1 ^ -16635);
         }
      } catch (RuntimeException var17) {
         throw class670.method4877(var17, field4360[9] + (arg0 != null ? field4360[1] : field4360[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sb",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method2309(int arg0) {
      int var2 = client.field4530;

      try {
         this.field4350 = new class711[this.field4358][this.field4347];
         ++field4352;
         int var3 = arg0;
         if (var2 != 0 || arg0 < this.field4347) {
            do {
               int var4 = 0;
               if (var2 != 0) {
                  this.field4350[var4][var3] = new class711(this.field4355, this, this.field4354, var4, var3, this.field4344, var4 * 128 - -1, var3 * 128 + 1);
                  if (~this.field4350[var4][var3].field10615 == -1) {
                     this.field4350[var4][var3] = null;
                  }

                  ++var4;
               }

               while(true) {
                  while(~var4 > ~this.field4358) {
                     this.field4350[var4][var3] = new class711(this.field4355, this, this.field4354, var4, var3, this.field4344, var4 * 128 - -1, var3 * 128 + 1);
                     if (~this.field4350[var4][var3].field10615 == -1) {
                        this.field4350[var4][var3] = null;
                     }

                     ++var4;
                  }

                  if (var2 == 0) {
                     ++var3;
                     break;
                  }

                  if (~this.field4350[var4][var3].field10615 == -1) {
                     this.field4350[var4][var3] = null;
                  }

                  ++var4;
               }
            } while(var3 < this.field4347);

         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field4360[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sb",
      name = "a",
      descriptor = "(IIILr;)V"
   )
   public final void method2310(int arg0, int arg1, int arg2, class193 arg3) {
      try {
         if (arg2 != -27848) {
            method2314(1, (class166)null);
         }

         ++field4359;
         class366 var5 = (class366)arg3;
         arg0 += var5.field5500 + 1;
         arg1 += var5.field5499 + 1;
         int var6 = this.field4357 * arg0 + arg1;
         int var7 = 0;
         int var8 = var5.field5501;
         int var9 = var5.field5502;
         int var10 = -var9 + this.field4357;
         int var11 = 0;
         if (~arg0 >= -1) {
            int var12 = 1 - arg0;
            var6 += this.field4357 * var12;
            arg0 = 1;
            var7 += var9 * var12;
            var8 -= var12;
         }

         if (arg0 + var8 >= this.field4348) {
            int var13 = var8 - (-1 - -this.field4348) + arg0;
            var8 -= var13;
         }

         if (arg1 <= 0) {
            int var14 = -arg1 + 1;
            var11 += var14;
            var10 += var14;
            arg1 = 1;
            var7 += var14;
            var6 += var14;
            var9 -= var14;
         }

         if (this.field4357 <= arg1 + var9) {
            int var15 = var9 + 1 + arg1 + -this.field4357;
            var9 -= var15;
            var10 += var15;
            var11 += var15;
         }

         if (var9 > 0 && var8 > 0) {
            class256.method1923(77, this.field4346, var10, var6, var9, var5.field5510, var7, var8, var11);
            this.method2311(arg1, arg0, var8, var9, 16634);
         }
      } catch (RuntimeException var17) {
         throw class670.method4877(var17, field4360[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field4360[1] : field4360[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sb",
      name = "a",
      descriptor = "(IIIII)V"
   )
   private final void method2311(int arg0, int arg1, int arg2, int arg3, int arg4) {
      int var6 = client.field4530;

      try {
         ++field4353;
         if (this.field4350 != null) {
            int var7 = arg0 + -1 >> 7;
            int var8 = arg0 + -1 + arg3 + -1 >> 7;
            int var9 = arg1 - 1 >> 7;
            int var10 = arg1 - 1 + arg2 - 1 >> 7;
            if (arg4 == 16634) {
               int var11 = var7;
               if (var6 != 0 || ~var8 <= ~var7) {
                  do {
                     class711[] var12 = this.field4350[var11];
                     int var13 = var9;
                     if (var6 != 0) {
                        if (var12[var9] != null) {
                           var12[var9].field10616 = true;
                        }

                        var13 = var9 + 1;
                     }

                     while(true) {
                        while(var13 <= var10) {
                           if (var12[var13] != null) {
                              var12[var13].field10616 = true;
                           }

                           ++var13;
                        }

                        if (var6 == 0) {
                           ++var11;
                           break;
                        }

                        ++var13;
                     }
                  } while(~var8 <= ~var11);

               }
            }
         }
      } catch (RuntimeException var15) {
         throw class670.method4877(var15, field4360[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sb",
      name = "a",
      descriptor = "(IIBLr;)Z"
   )
   public final boolean method2312(int arg0, int arg1, byte arg2, class193 arg3) {
      try {
         if (arg2 < 10) {
            this.field4348 = 17;
         }

         ++field4351;
         class366 var5 = (class366)arg3;
         arg1 += var5.field5500 + 1;
         arg0 += var5.field5499 + 1;
         int var6 = this.field4357 * arg1 + arg0;
         int var7 = var5.field5501;
         int var8 = var5.field5502;
         if (arg1 <= 0) {
            int var9 = -arg1 + 1;
            var7 -= var9;
            var6 += this.field4357 * var9;
            arg1 = 1;
         }

         int var10 = -var8 + this.field4357;
         if (arg1 + var7 >= this.field4348) {
            int var11 = arg1 - (-var7 + -1) + -this.field4348;
            var7 -= var11;
         }

         if (arg0 <= 0) {
            int var12 = -arg0 + 1;
            var10 += var12;
            var8 -= var12;
            arg0 = 1;
            var6 += var12;
         }

         if (~this.field4357 >= ~(arg0 - -var8)) {
            int var13 = arg0 + var8 - this.field4357 + 1;
            var8 -= var13;
            var10 += var13;
         }

         if (var8 > 0 && var7 > 0) {
            byte var14 = 8;
            int var15 = (var14 + -1) * this.field4357 + var10;
            return class180.method1415(var15, (byte)55, this.field4346, var7, var14, var8, var6);
         } else {
            return false;
         }
      } catch (RuntimeException var17) {
         throw class670.method4877(var17, field4360[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field4360[1] : field4360[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sb",
      name = "a",
      descriptor = "(IIZI[[ZZ)V"
   )
   public final void method2313(int param1, int param2, boolean param3, int param4, boolean[][] param5, boolean param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!sb",
      name = "a",
      descriptor = "(ILwea;)V"
   )
   public static final void method2314(int arg0, class166 arg1) {
      int var2 = client.field4530;

      try {
         arg1.field2083 = false;
         if (arg1.field2081 != null) {
            arg1.field2081.field9032 = 0;
         }

         ++field4349;
         class166 var3 = arg1.method182();
         if (var2 != 0) {
            method2314(-123, var3);
            var3 = arg1.method176();
         }

         while(true) {
            int var10000;
            if (var3 == null) {
               var10000 = arg0;
               if (var2 == 0) {
                  if (arg0 > -94) {
                     method2314(32, (class166)null);
                     return;
                  }

                  return;
               }
            } else {
               var10000 = -123;
            }

            method2314(var10000, var3);
            var3 = arg1.method176();
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field4360[5] + arg0 + ',' + (arg1 != null ? field4360[1] : field4360[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sb",
      name = "<init>",
      descriptor = "(Ldh;Lvda;)V"
   )
   public class305(class338 arg0, class192 arg1) {
      try {
         this.field4354 = arg1;
         this.field4355 = arg0;
         this.field4357 = (this.field4354.field4087 * this.field4354.field4080 >> this.field4355.field5069) + 2;
         this.field4348 = (this.field4354.field4081 * this.field4354.field4080 >> this.field4355.field5069) + 2;
         this.field4344 = 7 - (-this.field4355.field5069 + this.field4354.field4086);
         this.field4346 = new byte[this.field4357 * this.field4348];
         this.field4358 = this.field4354.field4087 >> this.field4344;
         this.field4347 = this.field4354.field4081 >> this.field4344;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field4360[6] + (arg0 != null ? field4360[1] : field4360[0]) + ',' + (arg1 != null ? field4360[1] : field4360[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2315(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 86);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2316(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 126;
            break;
         case 1:
            var10005 = 7;
            break;
         case 2:
            var10005 = 67;
            break;
         case 3:
            var10005 = 93;
            break;
         default:
            var10005 = 86;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
