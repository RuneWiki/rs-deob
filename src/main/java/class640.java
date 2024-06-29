import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cia")
public class class640 {
   @OriginalMember(
      owner = "client!cia",
      name = "o",
      descriptor = "Lsc;"
   )
   private class369 field9344;
   @OriginalMember(
      owner = "client!cia",
      name = "a",
      descriptor = "Ldj;"
   )
   private class363 field9357;
   @OriginalMember(
      owner = "client!cia",
      name = "l",
      descriptor = "I"
   )
   public int field9358;
   @OriginalMember(
      owner = "client!cia",
      name = "r",
      descriptor = "I"
   )
   private int field9352;
   @OriginalMember(
      owner = "client!cia",
      name = "k",
      descriptor = "I"
   )
   private int field9348;
   @OriginalMember(
      owner = "client!cia",
      name = "g",
      descriptor = "[B"
   )
   public byte[] field9342;
   @OriginalMember(
      owner = "client!cia",
      name = "d",
      descriptor = "I"
   )
   private int field9349;
   @OriginalMember(
      owner = "client!cia",
      name = "j",
      descriptor = "I"
   )
   private int field9343;
   @OriginalMember(
      owner = "client!cia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9359 = new String[]{method4630(method4629("8vH\u0000Ts")), method4630(method4629("5jEB")), method4630(method4629("8vH\u0000Ps")), method4630(method4629(" 1\u0007\u0000k")), method4630(method4629("8vH\u0000*2q@Z(s")), method4630(method4629("8vH\u0000Ws")), method4630(method4629("8vH\u0000^s")), method4630(method4629("8vH\u0000Ss")), method4630(method4629("8vH\u0000Qs")), method4630(method4629("8vH\u0000Us")), method4630(method4629("8vH\u0000Rs"))};
   @OriginalMember(
      owner = "client!cia",
      name = "m",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field9350 = new String[100];
   @OriginalMember(
      owner = "client!cia",
      name = "h",
      descriptor = "I"
   )
   public static int field9356 = 0;
   @OriginalMember(
      owner = "client!cia",
      name = "f",
      descriptor = "I"
   )
   public static int field9341;
   @OriginalMember(
      owner = "client!cia",
      name = "q",
      descriptor = "I"
   )
   public static int field9345;
   @OriginalMember(
      owner = "client!cia",
      name = "n",
      descriptor = "I"
   )
   public static int field9346;
   @OriginalMember(
      owner = "client!cia",
      name = "p",
      descriptor = "I"
   )
   public static int field9347;
   @OriginalMember(
      owner = "client!cia",
      name = "b",
      descriptor = "I"
   )
   public static int field9351;
   @OriginalMember(
      owner = "client!cia",
      name = "c",
      descriptor = "I"
   )
   public static int field9353;
   @OriginalMember(
      owner = "client!cia",
      name = "e",
      descriptor = "I"
   )
   public static int field9354;
   @OriginalMember(
      owner = "client!cia",
      name = "i",
      descriptor = "[[Lcq;"
   )
   private class495[][] field9355;

   @OriginalMember(
      owner = "client!cia",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method4621(boolean arg0) {
      boolean var2 = client.field4360;

      try {
         this.field9355 = new class495[this.field9349][this.field9343];
         ++field9353;
         int var3 = 0;
         byte var10000;
         if (var2) {
            var10000 = 0;
         } else if (~var3 <= ~this.field9343) {
            var10000 = arg0;
            if (!var2) {
               if (arg0 != 1) {
                  this.field9343 = 79;
                  return;
               }

               return;
            }
         } else {
            var10000 = 0;
         }

         while(true) {
            int var4 = var10000;
            if (var2) {
               this.field9355[var4][var3] = new class495(this.field9344, this, this.field9357, var4, var3, this.field9348, var4 * 128 + 1, var3 * 128 + 1);
               if (~this.field9355[var4][var3].field7176 == -1) {
                  this.field9355[var4][var3] = null;
               }

               ++var4;
            }

            while(true) {
               while(~var4 > ~this.field9349) {
                  this.field9355[var4][var3] = new class495(this.field9344, this, this.field9357, var4, var3, this.field9348, var4 * 128 + 1, var3 * 128 + 1);
                  if (~this.field9355[var4][var3].field7176 == -1) {
                     this.field9355[var4][var3] = null;
                  }

                  ++var4;
               }

               if (!var2) {
                  ++var3;
                  if (~var3 <= ~this.field9343) {
                     var10000 = arg0;
                     if (!var2) {
                        if (arg0 != 1) {
                           this.field9343 = 79;
                           return;
                        }

                        return;
                     }
                  } else {
                     var10000 = 0;
                  }
                  break;
               }

               if (~this.field9355[var4][var3].field7176 == -1) {
                  this.field9355[var4][var3] = null;
               }

               ++var4;
            }
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field9359[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "a",
      descriptor = "(IIIII)V"
   )
   private final void method4622(int arg0, int arg1, int arg2, int arg3, int arg4) {
      boolean var6 = client.field4360;

      try {
         ++field9345;
         if (this.field9355 != null) {
            int var7 = arg3 + arg4 >> 7;
            int var8 = arg3 - -arg2 + -2 >> 7;
            int var9 = arg1 - 1 >> 7;
            int var10 = arg1 + -1 + -1 + arg0 >> 7;
            int var11 = var7;
            if (var6 || ~var8 <= ~var7) {
               do {
                  class495[] var12 = this.field9355[var11];
                  int var13 = var9;
                  if (var6) {
                     if (var12[var9] != null) {
                        var12[var9].field7170 = true;
                     }

                     var13 = var9 + 1;
                  }

                  while(true) {
                     while(var10 >= var13) {
                        if (var12[var13] != null) {
                           var12[var13].field7170 = true;
                        }

                        ++var13;
                     }

                     if (!var6) {
                        ++var11;
                        break;
                     }

                     ++var13;
                  }
               } while(~var8 <= ~var11);

            }
         }
      } catch (RuntimeException var15) {
         throw class237.method1823(var15, field9359[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "a",
      descriptor = "(IIILr;)V"
   )
   public final void method4623(int arg0, int arg1, int arg2, class196 arg3) {
      try {
         ++field9341;
         class556 var5 = (class556)arg3;
         arg0 += var5.field7976 + 1;
         arg2 += var5.field7980 - -1;
         int var6 = this.field9358 * arg0 + arg2;
         int var7 = 0;
         if (arg1 <= -71) {
            int var8 = var5.field7986;
            int var9 = var5.field7974;
            int var10 = -var9 + this.field9358;
            int var11 = 0;
            if (~arg0 >= -1) {
               int var12 = -arg0 + 1;
               var6 += this.field9358 * var12;
               var7 += var9 * var12;
               arg0 = 1;
               var8 -= var12;
            }

            if (this.field9352 <= arg0 + var8) {
               int var13 = -this.field9352 + 1 + arg0 + var8;
               var8 -= var13;
            }

            if (arg2 <= 0) {
               int var14 = -arg2 + 1;
               var7 += var14;
               var6 += var14;
               arg2 = 1;
               var9 -= var14;
               var11 += var14;
               var10 += var14;
            }

            if (~(arg2 - -var9) <= ~this.field9358) {
               int var15 = arg2 + 1 + -this.field9358 + var9;
               var9 -= var15;
               var10 += var15;
               var11 += var15;
            }

            if (~var9 < -1 && ~var8 < -1) {
               class136.method1077(var6, 0, var8, var10, var11, var5.field7982, this.field9342, var9, var7);
               this.method4622(var8, arg0, var9, arg2, -1);
            }
         }
      } catch (RuntimeException var17) {
         throw class237.method1823(var17, field9359[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field9359[3] : field9359[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "a",
      descriptor = "(II[[ZZII)V"
   )
   public final void method4624(int param1, int param2, boolean[][] param3, boolean param4, int param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!cia",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4625(int arg0) {
      try {
         field9350 = null;
         int var1 = -86 / ((arg0 - 6) / 45);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9359[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "a",
      descriptor = "(IIZI)V"
   )
   public static final void method4626(int arg0, int arg1, boolean arg2, int arg3) {
      try {
         if (arg3 != 48000) {
            field9356 = 40;
         }

         ++field9354;
         if (~arg0 <= -8001 && arg0 <= 48000) {
            class83.field1082 = arg0;
            class598.field8790 = arg1;
            class65.field790 = arg2;
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field9359[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "a",
      descriptor = "(Lr;IIZ)Z"
   )
   public final boolean method4627(class196 arg0, int arg1, int arg2, boolean arg3) {
      try {
         ++field9346;
         class556 var5 = (class556)arg0;
         arg2 += var5.field7980 + 1;
         arg1 += var5.field7976 + 1;
         int var6 = arg2 - -(this.field9358 * arg1);
         int var7 = var5.field7986;
         int var8 = var5.field7974;
         int var9 = -var8 + this.field9358;
         if (~arg1 >= -1) {
            int var10 = -arg1 + 1;
            var7 -= var10;
            arg1 = 1;
            var6 += this.field9358 * var10;
         }

         if (~(arg1 + var7) <= ~this.field9352) {
            int var11 = var7 + 1 + arg1 + -this.field9352;
            var7 -= var11;
         }

         if (~arg2 >= -1) {
            int var12 = 1 - arg2;
            var9 += var12;
            var6 += var12;
            arg2 = 1;
            var8 -= var12;
         }

         if (arg2 + var8 >= this.field9358) {
            int var13 = -this.field9358 + arg2 + var8 + 1;
            var9 += var13;
            var8 -= var13;
         }

         if (!arg3) {
            this.field9348 = 36;
         }

         if (~var8 < -1 && ~var7 < -1) {
            byte var14 = 8;
            int var15 = (var14 + -1) * this.field9358 + var9;
            return class257.method1963(var8, var7, this.field9342, (byte)95, var6, var14, var15);
         } else {
            return false;
         }
      } catch (RuntimeException var17) {
         throw class237.method1823(var17, field9359[2] + (arg0 != null ? field9359[3] : field9359[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "b",
      descriptor = "(IIILr;)V"
   )
   public final void method4628(int arg0, int arg1, int arg2, class196 arg3) {
      try {
         ++field9351;
         class556 var5 = (class556)arg3;
         arg0 += var5.field7976 + 1;
         arg2 += var5.field7980 + 1;
         int var6 = this.field9358 * arg0 + arg2;
         int var7 = 0;
         if (arg1 == -21836) {
            int var8 = var5.field7986;
            int var9 = var5.field7974;
            int var10 = -var9 + this.field9358;
            if (~arg0 >= -1) {
               int var11 = 1 - arg0;
               var7 += var9 * var11;
               var6 += this.field9358 * var11;
               var8 -= var11;
               arg0 = 1;
            }

            int var12 = 0;
            if (~(arg0 - -var8) <= ~this.field9352) {
               int var13 = arg0 + var8 - -1 + -this.field9352;
               var8 -= var13;
            }

            if (~arg2 >= -1) {
               int var14 = 1 - arg2;
               var9 -= var14;
               var7 += var14;
               arg2 = 1;
               var12 += var14;
               var6 += var14;
               var10 += var14;
            }

            if (~this.field9358 >= ~(arg2 - -var9)) {
               int var15 = arg2 + 1 + var9 + -this.field9358;
               var12 += var15;
               var10 += var15;
               var9 -= var15;
            }

            if (var9 > 0 && ~var8 < -1) {
               class247.method1875(var6, var7, var10, false, var5.field7982, var12, var9, this.field9342, var8);
               this.method4622(var8, arg0, var9, arg2, -1);
            }
         }
      } catch (RuntimeException var17) {
         throw class237.method1823(var17, field9359[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field9359[3] : field9359[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "<init>",
      descriptor = "(Lsc;Ldj;)V"
   )
   public class640(class369 arg0, class363 arg1) {
      try {
         this.field9344 = arg0;
         this.field9357 = arg1;
         this.field9358 = (this.field9357.field4071 * this.field9357.field4062 >> this.field9344.field5279) + 2;
         this.field9352 = 2 - -(this.field9357.field4064 * this.field9357.field4062 >> this.field9344.field5279);
         this.field9348 = -this.field9357.field4065 + 7 + this.field9344.field5279;
         this.field9342 = new byte[this.field9358 * this.field9352];
         this.field9349 = this.field9357.field4071 >> this.field9348;
         this.field9343 = this.field9357.field4064 >> this.field9348;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field9359[4] + (arg0 != null ? field9359[3] : field9359[1]) + ',' + (arg1 != null ? field9359[3] : field9359[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4629(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 22);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4630(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 91;
            break;
         case 1:
            var10005 = 31;
            break;
         case 2:
            var10005 = 41;
            break;
         case 3:
            var10005 = 46;
            break;
         default:
            var10005 = 22;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
