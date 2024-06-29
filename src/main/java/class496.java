import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public class class496 extends class70 {
   @OriginalMember(
      owner = "client!maa",
      name = "A",
      descriptor = "Z"
   )
   public boolean field7355 = true;
   @OriginalMember(
      owner = "client!maa",
      name = "T",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7357 = new String[]{method3700(method3699("S0\u0018^G\u0016")), method3700(method3699("E\u007fW^v")), method3700(method3699("S0\u0018^Y\u0016")), method3700(method3699("P$\u0015\u001c")), method3700(method3699("\u0010\u007fW")), method3700(method3699("S0\u0018^]\u0016")), method3700(method3699("S0\u0018^@\u0016")), method3700(method3699("S0\u0018^X\u0016")), method3700(method3699("S0\u0018^[\u0016")), method3700(method3699("S0\u0018^E\u0016")), method3700(method3699("S0\u0018^^\u0016")), method3700(method3699("S0\u0018^B\u0016")), method3700(method3699("S0\u0018^Z\u0016")), method3700(method3699("S0\u0018^A\u0016")), method3700(method3699("S0\u0018^F\u0016")), method3700(method3699("S0\u0018^_\u0016")), method3700(method3699("S0\u0018^D\u0016"))};
   @OriginalMember(
      owner = "client!maa",
      name = "L",
      descriptor = "[Ljj;"
   )
   public static class128[] field7338 = new class128[2048];
   @OriginalMember(
      owner = "client!maa",
      name = "I",
      descriptor = "Lada;"
   )
   public static class173 field7336 = new class173();
   @OriginalMember(
      owner = "client!maa",
      name = "D",
      descriptor = "[I"
   )
   public static int[] field7349 = new int[13];
   @OriginalMember(
      owner = "client!maa",
      name = "x",
      descriptor = "I"
   )
   public static int field7337;
   @OriginalMember(
      owner = "client!maa",
      name = "z",
      descriptor = "I"
   )
   public static int field7340;
   @OriginalMember(
      owner = "client!maa",
      name = "E",
      descriptor = "I"
   )
   public static int field7342;
   @OriginalMember(
      owner = "client!maa",
      name = "y",
      descriptor = "I"
   )
   public static int field7344;
   @OriginalMember(
      owner = "client!maa",
      name = "S",
      descriptor = "I"
   )
   public static int field7345;
   @OriginalMember(
      owner = "client!maa",
      name = "J",
      descriptor = "I"
   )
   public static int field7346;
   @OriginalMember(
      owner = "client!maa",
      name = "R",
      descriptor = "I"
   )
   public static int field7347;
   @OriginalMember(
      owner = "client!maa",
      name = "C",
      descriptor = "I"
   )
   public static int field7348;
   @OriginalMember(
      owner = "client!maa",
      name = "N",
      descriptor = "I"
   )
   public static int field7350;
   @OriginalMember(
      owner = "client!maa",
      name = "B",
      descriptor = "I"
   )
   public static int field7351;
   @OriginalMember(
      owner = "client!maa",
      name = "Q",
      descriptor = "I"
   )
   public static int field7353;
   @OriginalMember(
      owner = "client!maa",
      name = "K",
      descriptor = "I"
   )
   public static int field7354;
   @OriginalMember(
      owner = "client!maa",
      name = "F",
      descriptor = "I"
   )
   public static int field7356;
   @OriginalMember(
      owner = "client!maa",
      name = "H",
      descriptor = "Leq;"
   )
   public class221 field7339;
   @OriginalMember(
      owner = "client!maa",
      name = "P",
      descriptor = "[I"
   )
   private int[] field7335;
   @OriginalMember(
      owner = "client!maa",
      name = "O",
      descriptor = "[I"
   )
   public int[] field7352;
   @OriginalMember(
      owner = "client!maa",
      name = "M",
      descriptor = "[Ljava/lang/String;"
   )
   private String[] field7341;
   @OriginalMember(
      owner = "client!maa",
      name = "G",
      descriptor = "[[I"
   )
   private int[][] field7343;

   @OriginalMember(
      owner = "client!maa",
      name = "b",
      descriptor = "(B)V",
      line = 3
   )
   public final void method3685(byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!maa",
      name = "a",
      descriptor = "(Ljj;B[I)V",
      line = 27
   )
   public final void method3686(class128 arg0, byte arg1, int[] arg2) {
      int var4 = client.field4530;

      try {
         ++field7351;
         if (this.field7335 != null) {
            if (arg1 != 61) {
               field7349 = null;
            }

            int var5 = 0;
            if (var4 == 0) {
               if (~this.field7335.length >= ~var5) {
                  return;
               }

               if (arg2.length <= var5) {
                  return;
               }
            }

            do {
               int var6 = this.method3697((byte)-92, var5).field10734;
               if (~var6 < -1) {
                  arg0.method1078((long)arg2[var5], var6, arg1 + -60);
               }

               ++var5;
               if (~this.field7335.length >= ~var5) {
                  return;
               }
            } while(arg2.length > var5);

         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field7357[8] + (arg0 != null ? field7357[1] : field7357[3]) + ',' + arg1 + ',' + (arg2 != null ? field7357[1] : field7357[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!maa",
      name = "a",
      descriptor = "(ILjj;I)V",
      line = 56
   )
   private final void method3687(int arg0, class128 arg1, int arg2) {
      int var4 = client.field4530;

      try {
         label95: {
            ++field7337;
            if (arg2 == 1) {
               this.field7341 = class136.method1163('<', arg1.method1083((byte)92), 107);
               if (var4 == 0) {
                  break label95;
               }
            }

            if (~arg2 != -3) {
               if (arg2 != 3) {
                  if (~arg2 != -5) {
                     break label95;
                  }

                  this.field7355 = false;
                  if (var4 == 0) {
                     break label95;
                  }
               }

               int var5 = arg1.method1104(255);
               this.field7343 = new int[var5][];
               this.field7335 = new int[var5];
               int var6 = 0;
               if (var4 != 0 || ~var6 > ~var5) {
                  do {
                     int var7 = arg1.method1038((byte)-100);
                     class721 var8 = class622.method4493(var7, (byte)65);
                     if (var8 == null) {
                        ++var6;
                     } else {
                        this.field7335[var6] = var7;
                        this.field7343[var6] = new int[var8.field10731];
                        int var9 = 0;
                        if (var4 != 0) {
                           this.field7343[var6][var9] = arg1.method1038((byte)-93);
                           ++var9;
                        }

                        while(var8.field10731 > var9) {
                           this.field7343[var6][var9] = arg1.method1038((byte)-93);
                           ++var9;
                        }

                        ++var6;
                     }
                  } while(~var6 > ~var5);
               }

               if (var4 == 0) {
                  break label95;
               }
            }

            int var10 = arg1.method1104(255);
            this.field7352 = new int[var10];
            int var11 = 0;
            if (var4 != 0 || var11 < var10) {
               do {
                  this.field7352[var11] = arg1.method1038((byte)-107);
                  ++var11;
               } while(var11 < var10);
            }
         }

         if (arg0 < 28) {
            this.method3697((byte)115, 67);
         }
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field7357[10] + arg0 + ',' + (arg1 != null ? field7357[1] : field7357[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!maa",
      name = "a",
      descriptor = "(B)Ljava/lang/String;",
      line = 132
   )
   public final String method3688(byte arg0) {
      int var2 = client.field4530;

      try {
         if (arg0 != 121) {
            return null;
         } else {
            ++field7345;
            StringBuffer var3 = new StringBuffer(80);
            if (this.field7341 == null) {
               return "";
            } else {
               var3.append(this.field7341[0]);
               int var4 = 1;
               if (var2 != 0) {
                  var3.append(field7357[4]);
                  var3.append(this.field7341[var4]);
                  ++var4;
               }

               while(true) {
                  while(this.field7341.length > var4) {
                     var3.append(field7357[4]);
                     var3.append(this.field7341[var4]);
                     ++var4;
                  }

                  if (var2 == 0) {
                     return var3.toString();
                  }

                  ++var4;
               }
            }
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field7357[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!maa",
      name = "g",
      descriptor = "(I)I",
      line = 159
   )
   public final int method3689(int arg0) {
      try {
         ++field7350;
         if (arg0 != -1888) {
            field7338 = null;
         }

         return this.field7335 == null ? 0 : this.field7335.length;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7357[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!maa",
      name = "a",
      descriptor = "(Ljj;I)V",
      line = 173
   )
   public final void method3690(class128 arg0, int arg1) {
      int var3 = client.field4530;

      try {
         if (arg1 != -1) {
            this.field7335 = null;
         }

         ++field7346;

         do {
            int var4 = arg0.method1104(255);
            if (~var4 == -1) {
               break;
            }

            this.method3687(78, arg0, var4);
         } while(var3 == 0);

      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field7357[9] + (arg0 != null ? field7357[1] : field7357[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!maa",
      name = "a",
      descriptor = "(ILln;)V",
      line = 194
   )
   public static final void method3691(int param0, class397 param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!maa",
      name = "b",
      descriptor = "(IIZ)I",
      line = 565
   )
   public final int method3692(int arg0, int arg1, boolean arg2) {
      try {
         ++field7354;
         if (this.field7335 != null && arg1 >= 0 && this.field7335.length >= arg1) {
            if (this.field7343[arg1] != null && ~arg0 <= -1 && this.field7343[arg1].length >= arg0) {
               if (arg2) {
                  field7349 = null;
               }

               return this.field7343[arg1][arg0];
            } else {
               return -1;
            }
         } else {
            return -1;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field7357[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!maa",
      name = "a",
      descriptor = "(ILjj;)Ljava/lang/String;",
      line = 585
   )
   public final String method3693(int arg0, class128 arg1) {
      int var3 = client.field4530;

      try {
         if (arg0 < 25) {
            return null;
         } else {
            ++field7340;
            StringBuffer var4 = new StringBuffer(80);
            if (this.field7335 != null) {
               int var5 = 0;
               if (var3 != 0 || this.field7335.length > var5) {
                  do {
                     var4.append(this.field7341[var5]);
                     var4.append(this.field7339.method1679(arg1.method1097(0, class622.method4493(this.field7335[var5], (byte)65).field10730), 112, this.field7343[var5], this.method3697((byte)-96, var5)));
                     ++var5;
                  } while(this.field7335.length > var5);
               }
            }

            var4.append(this.field7341[this.field7341.length - 1]);
            return var4.toString();
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field7357[15] + arg0 + ',' + (arg1 != null ? field7357[1] : field7357[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!maa",
      name = "c",
      descriptor = "(III)Z",
      line = 614
   )
   public static final boolean method3694(int arg0, int arg1, int arg2) {
      try {
         ++field7344;
         if (arg0 != -11201) {
            field7338 = null;
         }

         return (1024 & arg2) != 0;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field7357[11] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!maa",
      name = "h",
      descriptor = "(I)V",
      line = 626
   )
   public static final void method3695(int arg0) {
      try {
         class686.field10293.method5445(697465426);
         ++field7356;
         int var1 = 21 / ((arg0 - -80) / 45);
         class466.field6990.method5445(697465426);
         class781.field11392.method5445(697465426);
         class537.field7854.method5445(697465426);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field7357[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!maa",
      name = "f",
      descriptor = "(I)V",
      line = 652
   )
   public static void method3696(int arg0) {
      try {
         field7338 = null;
         if (arg0 == 0) {
            field7336 = null;
            field7349 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field7357[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!maa",
      name = "a",
      descriptor = "(BI)Lcj;",
      line = 666
   )
   public final class721 method3697(byte arg0, int arg1) {
      try {
         if (arg0 > -58) {
            return null;
         } else {
            ++field7348;
            return this.field7335 != null && ~arg1 <= -1 && ~this.field7335.length <= ~arg1 ? class622.method4493(this.field7335[arg1], (byte)65) : null;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field7357[13] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!maa",
      name = "a",
      descriptor = "(IIZI[IIIZIII[IIILega;)I",
      line = 688
   )
   public static final int method3698(int param0, int param1, boolean param2, int param3, int[] param4, int param5, int param6, boolean param7, int param8, int param9, int param10, int[] param11, int param12, int param13, class739 param14) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!maa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3699(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 11);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!maa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3700(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 62;
            break;
         case 1:
            var10005 = 81;
            break;
         case 2:
            var10005 = 121;
            break;
         case 3:
            var10005 = 112;
            break;
         default:
            var10005 = 11;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
