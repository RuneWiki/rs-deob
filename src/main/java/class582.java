import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class582 extends class142 {
   @OriginalMember(
      owner = "client!po",
      name = "Db",
      descriptor = "I"
   )
   private int field8362 = 1000000;
   @OriginalMember(
      owner = "client!po",
      name = "M",
      descriptor = "[[Lvs;"
   )
   private class615[][] field8371 = new class615[16][128];
   @OriginalMember(
      owner = "client!po",
      name = "P",
      descriptor = "[[Lvs;"
   )
   private class615[][] field8379 = new class615[16][128];
   @OriginalMember(
      owner = "client!po",
      name = "p",
      descriptor = "[I"
   )
   private int[] field8357 = new int[16];
   @OriginalMember(
      owner = "client!po",
      name = "J",
      descriptor = "[I"
   )
   private int[] field8372 = new int[16];
   @OriginalMember(
      owner = "client!po",
      name = "T",
      descriptor = "[I"
   )
   private int[] field8356 = new int[16];
   @OriginalMember(
      owner = "client!po",
      name = "Cb",
      descriptor = "[I"
   )
   private int[] field8368 = new int[16];
   @OriginalMember(
      owner = "client!po",
      name = "O",
      descriptor = "[I"
   )
   private int[] field8388 = new int[16];
   @OriginalMember(
      owner = "client!po",
      name = "hb",
      descriptor = "[I"
   )
   public int[] field8376 = new int[16];
   @OriginalMember(
      owner = "client!po",
      name = "rb",
      descriptor = "[I"
   )
   private int[] field8385 = new int[16];
   @OriginalMember(
      owner = "client!po",
      name = "W",
      descriptor = "[I"
   )
   public int[] field8400 = new int[16];
   @OriginalMember(
      owner = "client!po",
      name = "ub",
      descriptor = "[I"
   )
   private int[] field8404 = new int[16];
   @OriginalMember(
      owner = "client!po",
      name = "V",
      descriptor = "[I"
   )
   public int[] field8412 = new int[16];
   @OriginalMember(
      owner = "client!po",
      name = "qb",
      descriptor = "[I"
   )
   private int[] field8399 = new int[16];
   @OriginalMember(
      owner = "client!po",
      name = "G",
      descriptor = "I"
   )
   private int field8380 = 256;
   @OriginalMember(
      owner = "client!po",
      name = "K",
      descriptor = "[I"
   )
   private int[] field8415 = new int[16];
   @OriginalMember(
      owner = "client!po",
      name = "q",
      descriptor = "[I"
   )
   private int[] field8418 = new int[16];
   @OriginalMember(
      owner = "client!po",
      name = "eb",
      descriptor = "[I"
   )
   private int[] field8361 = new int[16];
   @OriginalMember(
      owner = "client!po",
      name = "gb",
      descriptor = "[I"
   )
   private int[] field8414 = new int[16];
   @OriginalMember(
      owner = "client!po",
      name = "r",
      descriptor = "[I"
   )
   private int[] field8417 = new int[16];
   @OriginalMember(
      owner = "client!po",
      name = "bb",
      descriptor = "Lgea;"
   )
   private class81 field8410 = new class81();
   @OriginalMember(
      owner = "client!po",
      name = "z",
      descriptor = "Ldka;"
   )
   private class13 field8427 = new class13(this);
   @OriginalMember(
      owner = "client!po",
      name = "tb",
      descriptor = "Lld;"
   )
   private class178 field8384;
   @OriginalMember(
      owner = "client!po",
      name = "Nb",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8434 = new String[]{method4324(method4323("A\tA\u0017<\u0019")), method4324(method4323("_\u0013\u00031")), method4324(method4323("JHAs\u0000")), method4324(method4323("A\tA\u001cU")), method4324(method4323("A\tA\u0016U")), method4324(method4323("A\tAa\u0014_\u000f\u001bcU")), method4324(method4323("A\tA\u0012<\u0019")), method4324(method4323("A\tA\u0013<\u0019")), method4324(method4323("A\tA\u0010<\u0019")), method4324(method4323("A\tA\f<\u0019")), method4324(method4323("A\tA\u0011U")), method4324(method4323("A\tA\u001aU")), method4324(method4323("A\tA\u0013U")), method4324(method4323("A\tA\u001c?\u0019")), method4324(method4323("A\tA\u0019<\u0019")), method4324(method4323("A\tA\u0011<\u0019")), method4324(method4323("A\tA\n<\u0019")), method4324(method4323("A\tA\u0015<\u0019")), method4324(method4323("A\tA\r<\u0019")), method4324(method4323("A\tA\u001b<\u0019")), method4324(method4323("A\tA\u001f<\u0019")), method4324(method4323("A\tA\u001f?\u0019")), method4324(method4323("A\tA\u0012U")), method4324(method4323("A\tA\fU")), method4324(method4323("A\tA\u001a<\u0019")), method4324(method4323("A\tA\u000f<\u0019")), method4324(method4323("A\tA\u001bU")), method4324(method4323("A\tA\u0017U")), method4324(method4323("A\tA\b<\u0019")), method4324(method4323("A\tA\u0019U")), method4324(method4323("A\tA\t<\u0019")), method4324(method4323("A\tA\u0018U")), method4324(method4323("A\tA\u0015U")), method4324(method4323("A\tA\u001e<\u0019")), method4324(method4323("A\tA\u0014U")), method4324(method4323("A\tA\u0010U")), method4324(method4323("A\tA\rU")), method4324(method4323("A\tA\u0016<\u0019")), method4324(method4323("A\tA\u0018<\u0019")), method4324(method4323("A\tA\u000e<\u0019")), method4324(method4323("A\tA\u0014<\u0019")), method4324(method4323("A\tA\u000fU")), method4324(method4323("A\tA\u001fU")), method4324(method4323("A\tA\u001eU")), method4324(method4323("A\tA\u000b<\u0019"))};
   @OriginalMember(
      owner = "client!po",
      name = "Fb",
      descriptor = "I"
   )
   public static int field8367 = 0;
   @OriginalMember(
      owner = "client!po",
      name = "s",
      descriptor = "Ljava/math/BigInteger;"
   )
   public static BigInteger field8394 = new BigInteger(method4324(method4323("\u0000V_mL")), 16);
   @OriginalMember(
      owner = "client!po",
      name = "A",
      descriptor = "I"
   )
   public static int field8420 = 0;
   @OriginalMember(
      owner = "client!po",
      name = "zb",
      descriptor = "Leb;"
   )
   public static class650 field8419 = new class650(14, 19);
   @OriginalMember(
      owner = "client!po",
      name = "cb",
      descriptor = "I"
   )
   public static int field8358;
   @OriginalMember(
      owner = "client!po",
      name = "I",
      descriptor = "I"
   )
   public static int field8359;
   @OriginalMember(
      owner = "client!po",
      name = "Z",
      descriptor = "I"
   )
   public static int field8360;
   @OriginalMember(
      owner = "client!po",
      name = "x",
      descriptor = "I"
   )
   public static int field8363;
   @OriginalMember(
      owner = "client!po",
      name = "U",
      descriptor = "I"
   )
   public static int field8364;
   @OriginalMember(
      owner = "client!po",
      name = "lb",
      descriptor = "I"
   )
   public static int field8365;
   @OriginalMember(
      owner = "client!po",
      name = "sb",
      descriptor = "I"
   )
   public static int field8366;
   @OriginalMember(
      owner = "client!po",
      name = "kb",
      descriptor = "I"
   )
   public static int field8369;
   @OriginalMember(
      owner = "client!po",
      name = "Y",
      descriptor = "I"
   )
   public static int field8370;
   @OriginalMember(
      owner = "client!po",
      name = "db",
      descriptor = "I"
   )
   public static int field8373;
   @OriginalMember(
      owner = "client!po",
      name = "pb",
      descriptor = "I"
   )
   public static int field8374;
   @OriginalMember(
      owner = "client!po",
      name = "R",
      descriptor = "I"
   )
   public static int field8375;
   @OriginalMember(
      owner = "client!po",
      name = "nb",
      descriptor = "I"
   )
   public static int field8377;
   @OriginalMember(
      owner = "client!po",
      name = "Gb",
      descriptor = "I"
   )
   public static int field8378;
   @OriginalMember(
      owner = "client!po",
      name = "Hb",
      descriptor = "I"
   )
   public static int field8381;
   @OriginalMember(
      owner = "client!po",
      name = "Kb",
      descriptor = "I"
   )
   public static int field8382;
   @OriginalMember(
      owner = "client!po",
      name = "ab",
      descriptor = "I"
   )
   public static int field8383;
   @OriginalMember(
      owner = "client!po",
      name = "xb",
      descriptor = "I"
   )
   public static int field8386;
   @OriginalMember(
      owner = "client!po",
      name = "D",
      descriptor = "I"
   )
   public static int field8387;
   @OriginalMember(
      owner = "client!po",
      name = "Ib",
      descriptor = "I"
   )
   public static int field8389;
   @OriginalMember(
      owner = "client!po",
      name = "Lb",
      descriptor = "I"
   )
   public static int field8390;
   @OriginalMember(
      owner = "client!po",
      name = "wb",
      descriptor = "I"
   )
   public static int field8391;
   @OriginalMember(
      owner = "client!po",
      name = "jb",
      descriptor = "I"
   )
   public static int field8392;
   @OriginalMember(
      owner = "client!po",
      name = "w",
      descriptor = "I"
   )
   public static int field8393;
   @OriginalMember(
      owner = "client!po",
      name = "N",
      descriptor = "I"
   )
   public static int field8395;
   @OriginalMember(
      owner = "client!po",
      name = "Bb",
      descriptor = "I"
   )
   public static int field8396;
   @OriginalMember(
      owner = "client!po",
      name = "y",
      descriptor = "I"
   )
   public static int field8397;
   @OriginalMember(
      owner = "client!po",
      name = "ob",
      descriptor = "I"
   )
   public static int field8398;
   @OriginalMember(
      owner = "client!po",
      name = "X",
      descriptor = "I"
   )
   public static int field8401;
   @OriginalMember(
      owner = "client!po",
      name = "t",
      descriptor = "I"
   )
   public static int field8402;
   @OriginalMember(
      owner = "client!po",
      name = "vb",
      descriptor = "I"
   )
   public static int field8403;
   @OriginalMember(
      owner = "client!po",
      name = "yb",
      descriptor = "I"
   )
   public static int field8405;
   @OriginalMember(
      owner = "client!po",
      name = "L",
      descriptor = "I"
   )
   public static int field8406;
   @OriginalMember(
      owner = "client!po",
      name = "C",
      descriptor = "I"
   )
   public static int field8408;
   @OriginalMember(
      owner = "client!po",
      name = "v",
      descriptor = "I"
   )
   public static int field8409;
   @OriginalMember(
      owner = "client!po",
      name = "Jb",
      descriptor = "I"
   )
   public static int field8411;
   @OriginalMember(
      owner = "client!po",
      name = "H",
      descriptor = "I"
   )
   public static int field8413;
   @OriginalMember(
      owner = "client!po",
      name = "o",
      descriptor = "I"
   )
   public static int field8416;
   @OriginalMember(
      owner = "client!po",
      name = "fb",
      descriptor = "I"
   )
   public static int field8421;
   @OriginalMember(
      owner = "client!po",
      name = "Eb",
      descriptor = "I"
   )
   public static int field8422;
   @OriginalMember(
      owner = "client!po",
      name = "u",
      descriptor = "I"
   )
   public static int field8423;
   @OriginalMember(
      owner = "client!po",
      name = "B",
      descriptor = "I"
   )
   public static int field8424;
   @OriginalMember(
      owner = "client!po",
      name = "S",
      descriptor = "I"
   )
   private int field8425;
   @OriginalMember(
      owner = "client!po",
      name = "Q",
      descriptor = "I"
   )
   private int field8426;
   @OriginalMember(
      owner = "client!po",
      name = "mb",
      descriptor = "I"
   )
   private int field8433;
   @OriginalMember(
      owner = "client!po",
      name = "F",
      descriptor = "J"
   )
   public static long field8407;
   @OriginalMember(
      owner = "client!po",
      name = "Ab",
      descriptor = "J"
   )
   private long field8429;
   @OriginalMember(
      owner = "client!po",
      name = "Mb",
      descriptor = "J"
   )
   private long field8430;
   @OriginalMember(
      owner = "client!po",
      name = "n",
      descriptor = "Lfca;"
   )
   private class92 field8432;
   @OriginalMember(
      owner = "client!po",
      name = "ib",
      descriptor = "Z"
   )
   private boolean field8428;
   @OriginalMember(
      owner = "client!po",
      name = "E",
      descriptor = "Z"
   )
   private boolean field8431;

   @OriginalMember(
      owner = "client!po",
      name = "a",
      descriptor = "(III)V"
   )
   private final void method4286(int param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!po",
      name = "f",
      descriptor = "(I)V"
   )
   public final synchronized void method4287(int arg0) {
      try {
         this.method4295(true, (byte)81);
         ++field8377;
         if (arg0 != 38) {
            this.method4294((class615)null, 2);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8434[21] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!po",
      name = "d",
      descriptor = "()Lhu;"
   )
   public final synchronized class142 method87() {
      try {
         ++field8375;
         return null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8434[26] + ')');
      }
   }

   @OriginalMember(
      owner = "client!po",
      name = "e",
      descriptor = "(I)Z"
   )
   public final synchronized boolean method4288(int arg0) {
      try {
         ++field8387;
         if (arg0 != 30244) {
            field8367 = 16;
         }

         return this.field8410.method822();
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8434[29] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!po",
      name = "a",
      descriptor = "(IBI)V"
   )
   private final void method4289(int arg0, byte arg1, int arg2) {
      try {
         this.field8385[arg2] = arg0;
         ++field8397;
         if (arg1 != 58) {
            this.method4297(-116, -24, -85);
         }

         this.field8400[arg2] = (int)(2097152.0D * Math.pow(2.0D, (double)arg0 * 5.4931640625E-4D) + 0.5D);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field8434[28] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!po",
      name = "a",
      descriptor = "(Lfca;Lnf;BLhw;I)Z"
   )
   public final synchronized boolean method4290(class92 arg0, class601 arg1, byte arg2, class141 arg3, int arg4) {
      boolean var6 = client.field4564;

      try {
         arg0.method894();
         ++field8392;
         byte var7 = 1;
         int var8 = -89 / ((25 - arg2) / 35);
         int[] var9 = null;
         if (arg4 > 0) {
            var9 = new int[]{arg4};
         }

         class697 var10 = (class697)arg0.field1490.method1567((byte)-44);
         int var10000;
         if (var6) {
            var10000 = (int)var10.field347;
         } else if (var10 == null) {
            var10000 = var7;
            if (!var6) {
               if (var7 != 0) {
                  arg0.method895();
               }

               return (boolean)var7;
            }
         } else {
            var10000 = (int)var10.field347;
         }

         while(true) {
            label87: {
               int var11 = var10000;
               class749 var12 = (class749)this.field8384.method1572((long)var11, -16289);
               if (var12 == null) {
                  var12 = class373.method2919((byte)-46, arg3, var11);
                  if (var12 == null) {
                     var7 = 0;
                     if (!var6) {
                        var10 = (class697)arg0.field1490.method1575((byte)-123);
                        break label87;
                     }

                     this.field8384.method1566(var12, 24742, (long)var11);
                  } else {
                     this.field8384.method1566(var12, 24742, (long)var11);
                  }
               }

               if (!var12.method5434(arg1, (byte)-53, var9, var10.field10213)) {
                  var7 = 0;
               }

               var10 = (class697)arg0.field1490.method1575((byte)-123);
            }

            if (var10 == null) {
               var10000 = var7;
               if (!var6) {
                  if (var7 != 0) {
                     arg0.method895();
                  }

                  return (boolean)var7;
               }
            } else {
               var10000 = (int)var10.field347;
            }
         }
      } catch (RuntimeException var14) {
         throw class608.method4462(var14, field8434[10] + (arg0 != null ? field8434[2] : field8434[1]) + ',' + (arg1 != null ? field8434[2] : field8434[1]) + ',' + arg2 + ',' + (arg3 != null ? field8434[2] : field8434[1]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!po",
      name = "a",
      descriptor = "(BIII)V"
   )
   private final void method4291(byte arg0, int arg1, int arg2, int arg3) {
      boolean var5 = client.field4564;

      try {
         this.method4317(arg1, arg2, 64, 2);
         ++field8423;
         if (~(this.field8412[arg1] & 2) != -1) {
            class615 var6 = (class615)this.field8427.field182.method2586((byte)106);
            if (var5 || var6 != null) {
               do {
                  if (var6.field8924 == arg1 && var6.field8946 < 0) {
                     this.field8379[arg1][var6.field8930] = null;
                     this.field8379[arg1][arg2] = var6;
                     int var7 = (var6.field8933 * var6.field8926 >> 12) + var6.field8923;
                     var6.field8923 += -var6.field8930 + arg2 << 8;
                     var6.field8930 = arg2;
                     var6.field8926 = -var6.field8923 + var7;
                     var6.field8933 = 4096;
                     return;
                  }

                  var6 = (class615)this.field8427.field182.method2584(1);
               } while(var6 != null);
            }
         }

         class749 var8 = (class749)this.field8384.method1572((long)this.field8418[arg1], -16289);
         if (var8 != null) {
            class122 var9 = var8.field10803[arg2];
            if (var9 != null) {
               class615 var10 = new class615();
               var10.field8938 = var9;
               var10.field8931 = var8;
               var10.field8924 = arg1;
               var10.field8942 = var8.field10796[arg2];
               var10.field8941 = var8.field10808[arg2];
               var10.field8930 = arg2;
               var10.field8929 = arg3 * arg3 * var8.field10804 * var8.field10799[arg2] + 1024 >> 11;
               var10.field8928 = 255 & var8.field10801[arg2];
               var10.field8923 = (arg2 << 8) + -(var8.field10807[arg2] & 32767);
               var10.field8935 = 0;
               var10.field8944 = 0;
               var10.field8936 = 0;
               var10.field8925 = 0;
               if (arg0 <= 64) {
                  this.field8414 = null;
               }

               label57: {
                  var10.field8946 = -1;
                  if (this.field8376[arg1] != 0) {
                     var10.field8943 = class742.method5362(var9, this.method4318(var10, 127), 0, this.method4314(-26407, var10));
                     this.method4319(var10, false, var8.field10807[arg2] < 0);
                     if (!var5) {
                        break label57;
                     }
                  }

                  var10.field8943 = class742.method5362(var9, this.method4318(var10, 127), this.method4294(var10, 128), this.method4314(-26407, var10));
               }

               if (~var8.field10807[arg2] > -1) {
                  var10.field8943.method5385(-1);
               }

               if (var10.field8941 >= 0) {
                  class615 var11 = this.field8371[arg1][var10.field8941];
                  if (var11 != null && var11.field8946 < 0) {
                     this.field8379[arg1][var11.field8930] = null;
                     var11.field8946 = 0;
                  }

                  this.field8371[arg1][var10.field8941] = var10;
               }

               this.field8427.field182.method2585(var10, 77);
               this.field8379[arg1][arg2] = var10;
            }
         }
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field8434[35] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!po",
      name = "b",
      descriptor = "(IBI)V"
   )
   public final synchronized void method4292(int param1, byte param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!po",
      name = "b",
      descriptor = "(BI)V"
   )
   private final void method4293(byte arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field8378;
         class615 var4 = (class615)this.field8427.field182.method2579(-801);
         int var10000;
         byte var10001;
         if (var3) {
            var10000 = ~arg1;
            var10001 = -1;
         } else if (var4 == null) {
            var10000 = arg0;
            var10001 = -53;
            if (!var3) {
               if (arg0 >= -53) {
                  this.method4308((byte)-70);
                  return;
               }

               return;
            }
         } else {
            var10000 = ~arg1;
            var10001 = -1;
         }

         while(true) {
            if (var10000 <= var10001) {
               if (var4.field8924 == arg1) {
                  if (var4.field8946 < 0) {
                     this.field8379[var4.field8924][var4.field8930] = null;
                     var4.field8946 = 0;
                  }

                  var4 = (class615)this.field8427.field182.method2583(1);
               } else {
                  var4 = (class615)this.field8427.field182.method2583(1);
               }
            } else {
               if (var4.field8946 < 0) {
                  this.field8379[var4.field8924][var4.field8930] = null;
                  var4.field8946 = 0;
               }

               var4 = (class615)this.field8427.field182.method2583(1);
            }

            if (var4 == null) {
               var10000 = arg0;
               var10001 = -53;
               if (!var3) {
                  if (arg0 >= -53) {
                     this.method4308((byte)-70);
                     return;
                  }

                  return;
               }
            } else {
               var10000 = ~arg1;
               var10001 = -1;
            }
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field8434[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!po",
      name = "b",
      descriptor = "(Lvs;I)I"
   )
   private final int method4294(class615 arg0, int arg1) {
      try {
         ++field8413;
         if (~this.field8372[arg0.field8924] == -1) {
            return 0;
         } else {
            class237 var3 = arg0.field8942;
            int var4 = this.field8417[arg0.field8924] * this.field8357[arg0.field8924] - -4096 >> 13;
            int var5 = var4 * var4 + 16384 >> 15;
            int var6 = arg0.field8929 * var5 - -16384 >> 15;
            int var7 = this.field8380 * var6 - -128 >> 8;
            int var8 = this.field8372[arg0.field8924] * var7 + arg1 >> 8;
            if (~var3.field3441 < -1) {
               var8 = (int)(0.5D + Math.pow(0.5D, (double)arg0.field8936 * 1.953125E-5D * (double)var3.field3441) * (double)var8);
            }

            if (var3.field3438 != null) {
               int var9 = arg0.field8925;
               int var10 = var3.field3438[arg0.field8935 - -1];
               if (var3.field3438.length + -2 > arg0.field8935) {
                  int var11 = 65280 & var3.field3438[arg0.field8935] << 8;
                  int var12 = (255 & var3.field3438[arg0.field8935 + 2]) << 8;
                  var10 += (var9 - var11) * (var3.field3438[arg0.field8935 + 3] + -var10) / (-var11 + var12);
               }

               var8 = var8 * var10 - -32 >> 6;
            }

            if (~arg0.field8946 < -1 && var3.field3451 != null) {
               int var13 = arg0.field8946;
               int var14 = var3.field3451[arg0.field8944 - -1];
               if (arg0.field8944 < var3.field3451.length + -2) {
                  int var15 = var3.field3451[arg0.field8944] << 8 & 65280;
                  int var16 = 65280 & var3.field3451[arg0.field8944 - -2] << 8;
                  var14 += (var3.field3451[arg0.field8944 + 3] + -var14) * (-var15 + var13) / (var16 - var15);
               }

               var8 = var8 * var14 - -32 >> 6;
            }

            return var8;
         }
      } catch (RuntimeException var18) {
         throw class608.method4462(var18, field8434[16] + (arg0 != null ? field8434[2] : field8434[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!po",
      name = "a",
      descriptor = "(ZB)V"
   )
   private final synchronized void method4295(boolean arg0, byte arg1) {
      try {
         this.field8410.method829();
         if (arg1 != 81) {
            this.method4296((class615)null, 81);
         }

         ++field8366;
         this.field8432 = null;
         this.method4316(arg1 + -209, arg0);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field8434[23] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!po",
      name = "c",
      descriptor = "(Lvs;I)Z"
   )
   public final boolean method4296(class615 arg0, int arg1) {
      try {
         ++field8364;
         if (arg0.field8943 == null) {
            if (arg0.field8946 >= 0) {
               arg0.method154(-103);
               if (arg0.field8941 > 0 && this.field8371[arg0.field8924][arg0.field8941] == arg0) {
                  this.field8371[arg0.field8924][arg0.field8941] = null;
               }
            }

            return true;
         } else {
            if (arg1 != 127) {
               this.method4305(85);
            }

            return false;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field8434[20] + (arg0 != null ? field8434[2] : field8434[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!po",
      name = "b",
      descriptor = "(III)V"
   )
   private final void method4297(int arg0, int arg1, int arg2) {
      try {
         ++field8381;
         if (arg0 != 0) {
            this.method4301(-21, (byte)91, -28, 14);
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field8434[17] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!po",
      name = "a",
      descriptor = "(JI)V"
   )
   private final void method4298(long param1, int param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!po",
      name = "b",
      descriptor = "(II)V"
   )
   private final void method4299(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         if (arg0 == -30786) {
            if ((4 & this.field8412[arg1]) != 0) {
               class615 var4 = (class615)this.field8427.field182.method2579(-801);
               if (var3 || var4 != null) {
                  do {
                     if (~var4.field8924 == ~arg1) {
                        var4.field8932 = 0;
                     }

                     var4 = (class615)this.field8427.field182.method2583(arg0 + 30787);
                  } while(var4 != null);
               }
            }

            ++field8393;
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field8434[15] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!po",
      name = "a",
      descriptor = "(ZBLfca;)V"
   )
   public final synchronized void method4300(boolean arg0, byte arg1, class92 arg2) {
      try {
         if (arg1 != 78) {
            this.method4320((byte)91, -18);
         }

         this.method4315(arg0, arg2, -6633, true);
         ++field8360;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field8434[25] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8434[2] : field8434[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!po",
      name = "a",
      descriptor = "(IBII)V"
   )
   private final void method4301(int arg0, byte arg1, int arg2, int arg3) {
      try {
         ++field8408;
         if (arg1 >= -39) {
            this.field8380 = -91;
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field8434[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!po",
      name = "g",
      descriptor = "(I)I"
   )
   public final int method4302(int arg0) {
      try {
         ++field8401;
         return arg0 != -20607 ? -51 : this.field8380;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8434[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!po",
      name = "a",
      descriptor = "(I)V"
   )
   public final synchronized void method86(int arg0) {
      boolean var2 = client.field4564;

      try {
         ++field8386;
         if (this.field8410.method822()) {
            int var3 = this.field8410.field1379 * this.field8362 / class755.field10967;

            label27:
            while(true) {
               long var4 = (long)arg0 * (long)var3 + this.field8430;
               if (~(this.field8429 - var4) <= -1L) {
                  this.field8430 = var4;
                  if (!var2) {
                     break;
                  }
               }

               int var6 = (int)((-this.field8430 + this.field8429 + (long)var3 + -1L) / (long)var3);
               this.field8430 += (long)var3 * (long)var6;
               arg0 -= var6;
               this.field8427.method86(var6);
               this.method4305(260);

               while(!this.field8410.method822()) {
                  if (!var2) {
                     break label27;
                  }
               }
            }
         }

         this.field8427.method86(arg0);
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field8434[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!po",
      name = "a",
      descriptor = "(Lvs;[IIII)Z"
   )
   public final boolean method4303(class615 arg0, int[] arg1, int arg2, int arg3, int arg4) {
      boolean var6 = client.field4564;

      try {
         ++field8359;
         if (arg4 != 16) {
            return false;
         } else {
            arg0.field8927 = class755.field10967 / 100;
            if (arg0.field8946 < 0 || arg0.field8943 != null && !arg0.field8943.method5372()) {
               int var7 = arg0.field8933;
               if (~var7 < -1) {
                  int var8 = var7 - (int)(Math.pow(2.0D, (double)this.field8399[arg0.field8924] * 4.921259842519685E-4D) * 16.0D + 0.5D);
                  if (var8 < 0) {
                     var8 = 0;
                  }

                  arg0.field8933 = var8;
               }

               arg0.field8943.method5353(this.method4318(arg0, 127));
               class237 var9 = arg0.field8942;
               boolean var10 = false;
               ++arg0.field8940;
               arg0.field8934 += var9.field3442;
               double var11 = (double)((arg0.field8930 + -60 << 8) + (arg0.field8933 * arg0.field8926 >> 12)) * 5.086263020833333E-6D;
               if (var9.field3441 > 0) {
                  label178: {
                     if (~var9.field3452 >= -1) {
                        arg0.field8936 += 128;
                        if (!var6) {
                           break label178;
                        }
                     }

                     arg0.field8936 += (int)(128.0D * Math.pow(2.0D, (double)var9.field3452 * var11) + 0.5D);
                  }

                  if (arg0.field8936 * var9.field3441 >= 819200) {
                     var10 = true;
                  }
               }

               int var10000;
               int var10001;
               if (var9.field3438 != null) {
                  label196: {
                     label169: {
                        if (~var9.field3447 < -1) {
                           arg0.field8925 += (int)(0.5D + Math.pow(2.0D, (double)var9.field3447 * var11) * 128.0D);
                           if (!var6) {
                              break label169;
                           }
                        }

                        arg0.field8925 += 128;
                        if (var6) {
                           arg0.field8935 += 2;
                        }
                     }

                     while(~(var9.field3438.length + -2) < ~arg0.field8935) {
                        var10000 = ~arg0.field8925;
                        var10001 = ~(var9.field3438[arg0.field8935 + 2] << 8 & 65280);
                        if (var6) {
                           break label196;
                        }

                        if (var10000 >= var10001) {
                           break;
                        }

                        arg0.field8935 += 2;
                     }

                     var10000 = ~arg0.field8935;
                     var10001 = ~(var9.field3438.length + -2);
                  }

                  if (var10000 == var10001 && var9.field3438[arg0.field8935 + 1] == 0) {
                     var10 = true;
                  }
               }

               if (arg0.field8946 >= 0 && var9.field3451 != null && ~(this.field8412[arg0.field8924] & 1) == -1 && (arg0.field8941 < 0 || this.field8371[arg0.field8924][arg0.field8941] != arg0)) {
                  label199: {
                     label142: {
                        if (var9.field3440 > 0) {
                           arg0.field8946 += (int)(0.5D + 128.0D * Math.pow(2.0D, (double)var9.field3440 * var11));
                           if (!var6) {
                              break label142;
                           }
                        }

                        arg0.field8946 += 128;
                        if (var6) {
                           arg0.field8944 += 2;
                        }
                     }

                     while(~arg0.field8944 > ~(var9.field3451.length + -2)) {
                        var10000 = arg0.field8946;
                        var10001 = (255 & var9.field3451[arg0.field8944 + 2]) << 8;
                        if (var6) {
                           break label199;
                        }

                        if (var10000 <= var10001) {
                           break;
                        }

                        arg0.field8944 += 2;
                     }

                     var10000 = ~arg0.field8944;
                     var10001 = ~(var9.field3451.length + -2);
                  }

                  if (var10000 == var10001) {
                     var10 = true;
                  }
               }

               if (!var10) {
                  arg0.field8943.method5389(arg0.field8927, this.method4294(arg0, 128), this.method4314(-26407, arg0));
                  return false;
               } else {
                  label124: {
                     arg0.field8943.method5364(arg0.field8927);
                     if (arg1 == null) {
                        arg0.field8943.method86(arg2);
                        if (!var6) {
                           break label124;
                        }
                     }

                     arg0.field8943.method85(arg1, arg3, arg2);
                  }

                  if (arg0.field8943.method5357()) {
                     this.field8427.field193.method1603(arg0.field8943);
                  }

                  arg0.method4512(true);
                  if (~arg0.field8946 <= -1) {
                     arg0.method154(arg4 ^ -125);
                     if (~arg0.field8941 < -1 && this.field8371[arg0.field8924][arg0.field8941] == arg0) {
                        this.field8371[arg0.field8924][arg0.field8941] = null;
                     }
                  }

                  return true;
               }
            } else {
               arg0.method4512(true);
               arg0.method154(108);
               if (arg0.field8941 > 0 && this.field8371[arg0.field8924][arg0.field8941] == arg0) {
                  this.field8371[arg0.field8924][arg0.field8941] = null;
               }

               return true;
            }
         }
      } catch (RuntimeException var14) {
         throw class608.method4462(var14, field8434[3] + (arg0 != null ? field8434[2] : field8434[1]) + ',' + (arg1 != null ? field8434[2] : field8434[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!po",
      name = "c",
      descriptor = "(III)V"
   )
   private final void method4304(int arg0, int arg1, int arg2) {
      try {
         ++field8370;
         this.field8404[arg2] = arg0;
         if (arg1 <= 65) {
            this.method4307(-4, 35, -20);
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field8434[12] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!po",
      name = "h",
      descriptor = "(I)V"
   )
   private final void method4305(int arg0) {
      boolean var2 = client.field4564;

      try {
         ++field8403;
         int var3 = this.field8426;
         int var4 = this.field8425;
         long var5 = this.field8429;
         if (this.field8432 != null && this.field8433 == var4) {
            this.method4315(this.field8428, this.field8432, -6633, this.field8431);
            this.method4305(260);
         } else {
            label81:
            while(true) {
               int var10000;
               int var10001;
               if (this.field8425 != var4) {
                  var10000 = arg0;
                  var10001 = 260;
                  if (!var2) {
                     if (arg0 != 260) {
                        return;
                     }

                     this.field8429 = var5;
                     this.field8425 = var4;
                     this.field8426 = var3;
                     if (this.field8432 != null && this.field8433 < var4) {
                        this.field8425 = this.field8433;
                        this.field8426 = -1;
                        this.field8429 = this.field8410.method818(this.field8425);
                        return;
                     }

                     return;
                  }
               } else {
                  var10000 = ~this.field8410.field1374[var3];
                  var10001 = ~var4;
               }

               label79:
               while(true) {
                  class81 var10;
                  if (var10000 != var10001) {
                     var3 = this.field8410.method820();
                     var4 = this.field8410.field1374[var3];
                     var10 = this.field8410;
                     var10001 = var4;
                     if (!var2) {
                        var5 = var10.method818(var4);
                        break;
                     }
                  } else {
                     this.field8410.method824(var3);
                     var10 = this.field8410;
                     var10001 = var3;
                  }

                  do {
                     int var7 = var10.method826(var10001);
                     if (~var7 != -2) {
                        if (~(128 & var7) != -1) {
                           this.method4311(2, var7);
                        }

                        this.field8410.method828(var3);
                        this.field8410.method823(var3);
                        var10000 = ~this.field8410.field1374[var3];
                        var10001 = ~var4;
                        continue label79;
                     }

                     this.field8410.method821();
                     this.field8410.method823(var3);
                     if (this.field8410.method819()) {
                        if (this.field8432 != null) {
                           this.method4300(this.field8428, (byte)78, this.field8432);
                           this.method4305(260);
                           return;
                        }

                        if (!this.field8428 || var4 == 0) {
                           break label81;
                        }

                        this.field8410.method816(var5);
                        if (var2) {
                           break label81;
                        }
                     }

                     var3 = this.field8410.method820();
                     var4 = this.field8410.field1374[var3];
                     var10 = this.field8410;
                     var10001 = var4;
                  } while(var2);

                  var5 = var10.method818(var4);
                  break;
               }
            }

            this.method4316(9, true);
            this.field8410.method829();
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field8434[24] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!po",
      name = "c",
      descriptor = "()I"
   )
   public final synchronized int method88() {
      try {
         ++field8411;
         return 0;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8434[41] + ')');
      }
   }

   @OriginalMember(
      owner = "client!po",
      name = "a",
      descriptor = "(ZI)V"
   )
   private final void method4306(boolean param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!po",
      name = "d",
      descriptor = "(III)V"
   )
   public final synchronized void method4307(int arg0, int arg1, int arg2) {
      try {
         int var4 = -89 / ((arg2 - -63) / 53);
         ++field8398;
         this.method4313((byte)127, arg0, arg1);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field8434[38] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!po",
      name = "a",
      descriptor = "(B)V"
   )
   public final synchronized void method4308(byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!po",
      name = "b",
      descriptor = "()Lhu;"
   )
   public final synchronized class142 method90() {
      try {
         ++field8382;
         return this.field8427;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8434[34] + ')');
      }
   }

   @OriginalMember(
      owner = "client!po",
      name = "a",
      descriptor = "([III)V"
   )
   public final synchronized void method85(int[] arg0, int arg1, int arg2) {
      boolean var4 = client.field4564;

      try {
         ++field8405;
         if (this.field8410.method822()) {
            int var5 = this.field8410.field1379 * this.field8362 / class755.field10967;

            label34:
            while(true) {
               long var6 = this.field8430 - -((long)arg2 * (long)var5);
               if (-var6 + this.field8429 >= 0L) {
                  this.field8430 = var6;
                  if (!var4) {
                     break;
                  }
               }

               int var8 = (int)((this.field8429 - this.field8430 + -1L + (long)var5) / (long)var5);
               this.field8430 += (long)var5 * (long)var8;
               this.field8427.method85(arg0, arg1, var8);
               arg2 -= var8;
               arg1 += var8;
               this.method4305(260);

               while(!this.field8410.method822()) {
                  if (!var4) {
                     break label34;
                  }
               }
            }
         }

         this.field8427.method85(arg0, arg1, arg2);
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field8434[22] + (arg0 != null ? field8434[2] : field8434[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!po",
      name = "a",
      descriptor = "(Lfca;IJZZ)V"
   )
   public final synchronized void method4309(class92 arg0, int arg1, long arg2, boolean arg3, boolean arg4) {
      try {
         this.method4315(arg4, arg0, -6633, arg3);
         ++field8373;
         this.method4298((long)this.field8410.field1379 * arg2, -16540);
         if (arg1 != -15350) {
            field8419 = null;
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field8434[40] + (arg0 != null ? field8434[2] : field8434[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!po",
      name = "c",
      descriptor = "(II)V"
   )
   private final void method4310(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         class615 var4 = (class615)this.field8427.field182.method2579(-801);
         int var10000;
         byte var10001;
         if (var3) {
            var10000 = ~arg0;
            var10001 = -1;
         } else if (var4 == null) {
            var10000 = arg1;
            var10001 = 15;
            if (!var3) {
               if (arg1 != 15) {
                  this.field8412 = null;
               }

               ++field8363;
               return;
            }
         } else {
            var10000 = ~arg0;
            var10001 = -1;
         }

         while(true) {
            if (var10000 <= var10001 && var4.field8924 != arg0) {
               var4 = (class615)this.field8427.field182.method2583(arg1 + -14);
            } else {
               if (var4.field8943 != null) {
                  var4.field8943.method5364(class755.field10967 / 100);
                  if (var4.field8943.method5357()) {
                     this.field8427.field193.method1603(var4.field8943);
                  }

                  var4.method4512(true);
               }

               if (var4.field8946 < 0) {
                  this.field8379[var4.field8924][var4.field8930] = null;
               }

               var4.method154(arg1 + -129);
               var4 = (class615)this.field8427.field182.method2583(arg1 + -14);
            }

            if (var4 == null) {
               var10000 = arg1;
               var10001 = 15;
               if (!var3) {
                  if (arg1 != 15) {
                     this.field8412 = null;
                  }

                  ++field8363;
                  return;
               }
            } else {
               var10000 = ~arg0;
               var10001 = -1;
            }
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field8434[18] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!po",
      name = "a",
      descriptor = "(II)V"
   )
   private final void method4311(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field8365;
         int var4 = 240 & arg1;
         if (var4 == 128) {
            int var5 = 15 & arg1;
            int var6 = 127 & arg1 >> 8;
            int var7 = arg1 >> 16 & 127;
            this.method4317(var5, var6, var7, 2);
         } else if (var4 == 144) {
            int var8 = arg1 & 15;
            int var9 = 127 & arg1 >> 8;
            int var10 = arg1 >> 16 & 127;
            if (var10 <= 0) {
               this.method4317(var8, var9, 64, 2);
            } else {
               this.method4291((byte)127, var8, var9, var10);
            }
         } else if (var4 == 160) {
            int var11 = 15 & arg1;
            int var12 = arg1 >> 8 & 127;
            int var13 = (8382925 & arg1) >> 16;
            this.method4301(var11, (byte)-66, var12, var13);
         } else if (var4 != 176) {
            if (~var4 == -193) {
               int var19 = 15 & arg1;
               int var20 = (arg1 & 32586) >> 8;
               this.method4286(-129, this.field8415[var19] + var20, var19);
            } else {
               if (arg0 != 2) {
                  this.method4308((byte)13);
               }

               if (~var4 == -209) {
                  int var21 = 15 & arg1;
                  int var22 = 127 & arg1 >> 8;
                  this.method4297(arg0 ^ 2, var22, var21);
               } else if (~var4 == -225) {
                  int var23 = arg1 & 15;
                  int var24 = ((arg1 & 8323326) >> 9) + (127 & arg1 >> 8);
                  this.method4304(var24, 75, var23);
               } else {
                  int var25 = 255 & arg1;
                  if (~var25 == -256) {
                     this.method4316(arg0 + 63, true);
                  }
               }
            }
         } else {
            int var14 = arg1 & 15;
            int var15 = (32632 & arg1) >> 8;
            int var16 = 127 & arg1 >> 16;
            if (var15 == 0) {
               this.field8415[var14] = (var16 << 14) + class66.method706(this.field8415[var14], -2080769);
            }

            if (~var15 == -33) {
               this.field8415[var14] = class66.method706(-16257, this.field8415[var14]) - -(var16 << 7);
            }

            if (var15 == 1) {
               this.field8388[var14] = (var16 << 7) + class66.method706(-16257, this.field8388[var14]);
            }

            if (var15 == 33) {
               this.field8388[var14] = var16 + class66.method706(this.field8388[var14], -128);
            }

            if (var15 == 5) {
               this.field8399[var14] = (var16 << 7) + class66.method706(this.field8399[var14], -16257);
            }

            if (~var15 == -38) {
               this.field8399[var14] = class66.method706(-128, this.field8399[var14]) + var16;
            }

            if (var15 == 7) {
               this.field8357[var14] = (var16 << 7) + class66.method706(this.field8357[var14], -16257);
            }

            if (~var15 == -40) {
               this.field8357[var14] = var16 + class66.method706(-128, this.field8357[var14]);
            }

            if (~var15 == -11) {
               this.field8414[var14] = class66.method706(this.field8414[var14], -16257) - -(var16 << 7);
            }

            if (~var15 == -43) {
               this.field8414[var14] = class66.method706(-128, this.field8414[var14]) + var16;
            }

            if (var15 == 11) {
               this.field8417[var14] = class66.method706(this.field8417[var14], -16257) + (var16 << 7);
            }

            if (var15 == 43) {
               this.field8417[var14] = var16 + class66.method706(this.field8417[var14], -128);
            }

            if (~var15 == -65) {
               label162: {
                  if (var16 < 64) {
                     this.field8412[var14] = class66.method706(this.field8412[var14], -2);
                     if (!var3) {
                        break label162;
                     }
                  }

                  this.field8412[var14] = class93.method899(this.field8412[var14], 1);
               }
            }

            if (~var15 == -66) {
               label156: {
                  if (var16 < 64) {
                     this.method4306(true, var14);
                     this.field8412[var14] = class66.method706(this.field8412[var14], -3);
                     if (!var3) {
                        break label156;
                     }
                  }

                  this.field8412[var14] = class93.method899(this.field8412[var14], 2);
               }
            }

            if (~var15 == -100) {
               this.field8368[var14] = (var16 << 7) + class66.method706(127, this.field8368[var14]);
            }

            if (var15 == 98) {
               this.field8368[var14] = var16 + class66.method706(this.field8368[var14], 16256);
            }

            if (var15 == 101) {
               this.field8368[var14] = (var16 << 7) + class66.method706(127, this.field8368[var14]) + 16384;
            }

            if (~var15 == -101) {
               this.field8368[var14] = var16 + (16384 - -class66.method706(16256, this.field8368[var14]));
            }

            if (~var15 == -121) {
               this.method4310(var14, 15);
            }

            if (~var15 == -122) {
               this.method4320((byte)-46, var14);
            }

            if (var15 == 123) {
               this.method4293((byte)-88, var14);
            }

            if (var15 == 6) {
               int var17 = this.field8368[var14];
               if (~var17 == -16385) {
                  this.field8361[var14] = (var16 << 7) + class66.method706(this.field8361[var14], -16257);
               }
            }

            if (var15 == 38) {
               int var18 = this.field8368[var14];
               if (~var18 == -16385) {
                  this.field8361[var14] = class66.method706(-128, this.field8361[var14]) + var16;
               }
            }

            if (var15 == 16) {
               this.field8376[var14] = class66.method706(-16257, this.field8376[var14]) + (var16 << 7);
            }

            if (~var15 == -49) {
               this.field8376[var14] = class66.method706(-128, this.field8376[var14]) + var16;
            }

            if (~var15 == -82) {
               label134: {
                  if (~var16 <= -65) {
                     this.field8412[var14] = class93.method899(this.field8412[var14], 4);
                     if (!var3) {
                        break label134;
                     }
                  }

                  this.method4299(-30786, var14);
                  this.field8412[var14] = class66.method706(this.field8412[var14], -5);
               }
            }

            if (~var15 == -18) {
               this.method4289((var16 << 7) + (this.field8385[var14] & -16257), (byte)58, var14);
            }

            if (~var15 == -50) {
               this.method4289((-128 & this.field8385[var14]) + var16, (byte)58, var14);
            }

         }
      } catch (RuntimeException var27) {
         throw class608.method4462(var27, field8434[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!po",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method4312(int arg0) {
      try {
         field8419 = null;
         if (arg0 != -12242) {
            method4312(-92);
         }

         field8394 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8434[32] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!po",
      name = "a",
      descriptor = "(BII)V"
   )
   private final void method4313(byte arg0, int arg1, int arg2) {
      try {
         int var4 = -118 % ((arg0 - 7) / 63);
         ++field8374;
         this.field8356[arg2] = arg1;
         this.field8415[arg2] = class66.method706(-128, arg1);
         this.method4286(-129, arg1, arg2);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field8434[37] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!po",
      name = "a",
      descriptor = "(ILvs;)I"
   )
   private final int method4314(int arg0, class615 arg1) {
      try {
         if (arg0 != -26407) {
            return 38;
         } else {
            ++field8383;
            int var3 = this.field8414[arg1.field8924];
            return var3 >= 8192 ? 16384 - ((128 - arg1.field8928) * (16384 - var3) + 32 >> 6) : arg1.field8928 * var3 + 32 >> 6;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field8434[39] + arg0 + ',' + (arg1 != null ? field8434[2] : field8434[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!po",
      name = "a",
      descriptor = "(ZLfca;IZ)V"
   )
   private final synchronized void method4315(boolean arg0, class92 arg1, int arg2, boolean arg3) {
      boolean var5 = client.field4564;

      try {
         ++field8416;
         this.method4295(arg3, (byte)81);
         this.field8410.method817(arg1.field1491);
         this.field8428 = arg0;
         this.field8430 = 0L;
         int var6 = this.field8410.method827();
         int var7 = 0;
         if (var5) {
            this.field8410.method824(var7);
            this.field8410.method828(var7);
            this.field8410.method823(var7);
            ++var7;
         }

         while(true) {
            while(var7 < var6) {
               this.field8410.method824(var7);
               this.field8410.method828(var7);
               this.field8410.method823(var7);
               ++var7;
            }

            this.field8426 = this.field8410.method820();
            if (!var5) {
               if (arg2 != -6633) {
                  return;
               }

               this.field8425 = this.field8410.field1374[this.field8426];
               this.field8429 = this.field8410.method818(this.field8425);
               return;
            }

            ++var7;
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field8434[6] + arg0 + ',' + (arg1 != null ? field8434[2] : field8434[1]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!po",
      name = "a",
      descriptor = "(IZ)V"
   )
   private final void method4316(int param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!po",
      name = "a",
      descriptor = "(IIII)V"
   )
   private final void method4317(int arg0, int arg1, int arg2, int arg3) {
      boolean var5 = client.field4564;

      try {
         ++field8391;
         class615 var6 = this.field8379[arg0][arg1];
         if (var6 != null) {
            this.field8379[arg0][arg1] = null;
            if (~(this.field8412[arg0] & arg3) == -1) {
               var6.field8946 = 0;
            } else {
               class615 var7 = (class615)this.field8427.field182.method2579(-801);
               if (var5) {
                  if (var6.field8924 == var7.field8924 && ~var7.field8946 > -1 && var6 != var7) {
                     var6.field8946 = 0;
                     return;
                  }

                  var7 = (class615)this.field8427.field182.method2583(1);
               }

               while(true) {
                  while(var7 != null) {
                     if (var6.field8924 == var7.field8924 && ~var7.field8946 > -1 && var6 != var7) {
                        var6.field8946 = 0;
                        return;
                     }

                     var7 = (class615)this.field8427.field182.method2583(1);
                  }

                  if (!var5) {
                     return;
                  }

                  var7 = (class615)this.field8427.field182.method2583(1);
               }
            }
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field8434[30] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!po",
      name = "a",
      descriptor = "(Lvs;I)I"
   )
   private final int method4318(class615 arg0, int arg1) {
      try {
         ++field8369;
         int var3 = arg0.field8923 - -(arg0.field8933 * arg0.field8926 >> 12);
         if (arg1 != 127) {
            this.method4292(-1, (byte)113, 80);
         }

         int var4 = ((this.field8404[arg0.field8924] + -8192) * this.field8361[arg0.field8924] >> 12) + var3;
         class237 var5 = arg0.field8942;
         if (var5.field3442 > 0 && (var5.field3450 > 0 || ~this.field8388[arg0.field8924] < -1)) {
            int var6 = var5.field3450 << 2;
            int var7 = var5.field3448 << 1;
            if (~arg0.field8940 > ~var7) {
               var6 = arg0.field8940 * var6 / var7;
            }

            int var8 = (this.field8388[arg0.field8924] >> 7) + var6;
            double var9 = Math.sin((double)(arg0.field8934 & 511) * 0.01227184630308513D);
            var4 += (int)((double)var8 * var9);
         }

         int var11 = (int)(0.5D + (double)(arg0.field8938.field1955 * 256) * Math.pow(2.0D, (double)var4 * 3.255208333333333E-4D) / (double)class755.field10967);
         return ~var11 <= -2 ? var11 : 1;
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field8434[14] + (arg0 != null ? field8434[2] : field8434[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!po",
      name = "a",
      descriptor = "(Lvs;ZZ)V"
   )
   public final void method4319(class615 arg0, boolean arg1, boolean arg2) {
      try {
         int var5;
         label40: {
            ++field8389;
            int var4 = arg0.field8938.field1957.length;
            if (!arg2 || !arg0.field8938.field1953) {
               var5 = (int)((long)this.field8376[arg0.field8924] * (long)var4 >> 6);
               if (!client.field4564) {
                  break label40;
               }
            }

            int var6 = var4 + var4 + -arg0.field8938.field1956;
            int var7 = var4 << 8;
            var5 = (int)((long)this.field8376[arg0.field8924] * (long)var6 >> 6);
            if (~var5 <= ~var7) {
               arg0.field8943.method5358(true);
               var5 = -var5 + var7 + var7 + -1;
            }
         }

         if (!arg1) {
            arg0.field8943.method5379(var5);
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field8434[27] + (arg0 != null ? field8434[2] : field8434[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!po",
      name = "c",
      descriptor = "(BI)V"
   )
   private final void method4320(byte arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field8395;
         if (arg1 >= 0) {
            this.field8357[arg1] = 12800;
            this.field8414[arg1] = 8192;
            this.field8417[arg1] = 16383;
            this.field8404[arg1] = 8192;
            this.field8388[arg1] = 0;
            if (arg0 != -46) {
               field8420 = -125;
            }

            this.field8399[arg1] = 8192;
            this.method4306(true, arg1);
            this.method4299(-30786, arg1);
            this.field8412[arg1] = 0;
            this.field8368[arg1] = 32767;
            this.field8361[arg1] = 256;
            this.field8376[arg1] = 0;
            this.method4289(8192, (byte)58, arg1);
         } else {
            int var6 = 0;
            if (var3) {
               this.method4320((byte)-46, var6);
               ++var6;
            }

            while(true) {
               while(var6 < 16) {
                  this.method4320((byte)-46, var6);
                  ++var6;
               }

               if (!var3) {
                  return;
               }

               ++var6;
            }
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field8434[36] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!po",
      name = "a",
      descriptor = "(IB)V"
   )
   public final synchronized void method4321(int arg0, byte arg1) {
      try {
         ++field8402;
         if (arg1 < 92) {
            this.method4296((class615)null, -117);
         }

         this.field8380 = arg0;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field8434[44] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!po",
      name = "b",
      descriptor = "(Z)V"
   )
   public final synchronized void method4322(boolean arg0) {
      boolean var2 = client.field4564;

      try {
         ++field8421;
         class749 var3 = (class749)this.field8384.method1567((byte)-44);
         if (var2) {
            var3.method5433(-18805);
            var3 = (class749)this.field8384.method1575((byte)-127);
         }

         while(true) {
            if (var3 == null) {
               if (!var2) {
                  if (!arg0) {
                     this.field8418 = null;
                     return;
                  }

                  return;
               }
            } else {
               var3.method5433(-18805);
            }

            var3 = (class749)this.field8384.method1575((byte)-127);
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field8434[31] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!po",
      name = "<init>",
      descriptor = "()V"
   )
   public class582() {
      try {
         this.field8384 = new class178(128);
         this.method4292(-1, (byte)-87, 256);
         this.method4316(-121, true);
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8434[5] + ')');
      }
   }

   @OriginalMember(
      owner = "client!po",
      name = "<init>",
      descriptor = "(Lpo;)V"
   )
   public class582(class582 arg0) {
      try {
         this.field8384 = arg0.field8384;
         this.method4292(-1, (byte)50, 256);
         this.method4316(-112, true);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8434[5] + (arg0 != null ? field8434[2] : field8434[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!po",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4323(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 125);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!po",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4324(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 49;
            break;
         case 1:
            var10005 = 102;
            break;
         case 2:
            var10005 = 111;
            break;
         case 3:
            var10005 = 93;
            break;
         default:
            var10005 = 125;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
