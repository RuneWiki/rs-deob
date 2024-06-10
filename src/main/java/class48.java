import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loginapplet!w")
public abstract class class48 {
   @OriginalMember(
      owner = "loginapplet!w",
      name = "a",
      descriptor = "[I"
   )
   private int[] field342;
   @OriginalMember(
      owner = "loginapplet!w",
      name = "b",
      descriptor = "I"
   )
   private int field343;
   @OriginalMember(
      owner = "loginapplet!w",
      name = "c",
      descriptor = "[I"
   )
   public int[] field344;
   @OriginalMember(
      owner = "loginapplet!w",
      name = "d",
      descriptor = "Lsa;"
   )
   public static class41 field345 = class8.method31(70, "de");
   @OriginalMember(
      owner = "loginapplet!w",
      name = "e",
      descriptor = "[[I"
   )
   private int[][] field346;
   @OriginalMember(
      owner = "loginapplet!w",
      name = "f",
      descriptor = "[[I"
   )
   private int[][] field347;
   @OriginalMember(
      owner = "loginapplet!w",
      name = "g",
      descriptor = "Lv;"
   )
   private class46 field348;
   @OriginalMember(
      owner = "loginapplet!w",
      name = "h",
      descriptor = "[Ljava/lang/Object;"
   )
   public Object[] field349;
   @OriginalMember(
      owner = "loginapplet!w",
      name = "i",
      descriptor = "I"
   )
   public int field350;
   @OriginalMember(
      owner = "loginapplet!w",
      name = "j",
      descriptor = "[I"
   )
   private int[] field351;
   @OriginalMember(
      owner = "loginapplet!w",
      name = "k",
      descriptor = "[[Ljava/lang/Object;"
   )
   private Object[][] field352;
   @OriginalMember(
      owner = "loginapplet!w",
      name = "l",
      descriptor = "Z"
   )
   private boolean field353;
   @OriginalMember(
      owner = "loginapplet!w",
      name = "m",
      descriptor = "[I"
   )
   private int[] field354;
   @OriginalMember(
      owner = "loginapplet!w",
      name = "n",
      descriptor = "[Lv;"
   )
   private class46[] field355;
   @OriginalMember(
      owner = "loginapplet!w",
      name = "o",
      descriptor = "[I"
   )
   private int[] field356;
   @OriginalMember(
      owner = "loginapplet!w",
      name = "p",
      descriptor = "I"
   )
   public static int field357;
   @OriginalMember(
      owner = "loginapplet!w",
      name = "q",
      descriptor = "I"
   )
   public static int field358 = 0;
   @OriginalMember(
      owner = "loginapplet!w",
      name = "r",
      descriptor = "Z"
   )
   public boolean field359;

   @OriginalMember(
      owner = "loginapplet!w",
      name = "a",
      descriptor = "(ILsa;)[B",
      line = 5
   )
   public final byte[] method228(int arg0, class41 arg1) {
      try {
         if (arg0 >= -40) {
            return (byte[])null;
         } else {
            int var3 = this.method236(class10.field82, 100);
            return 0 != ~var3 ? this.method231(15064, arg1, class10.field82) : this.method231(15064, class10.field82, arg1);
         }
      } catch (RuntimeException var4) {
         throw class28.method139(var4, "w.L(" + arg0 + ',' + (arg1 != null ? "{...}" : "null") + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!w",
      name = "a",
      descriptor = "(II)V",
      line = 21
   )
   private final void method229(int arg0, int arg1) {
      try {
         if (arg0 != -30646) {
            method235(true);
         }

      } catch (RuntimeException var4) {
         throw class28.method139(var4, "w.G(" + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!w",
      name = "a",
      descriptor = "(IB)Z",
      line = 44
   )
   public static final boolean method230(int arg0, byte arg1) {
      try {
         if (97 <= arg0 && -123 <= ~arg0) {
            return true;
         } else if (-66 >= ~arg0 && 90 >= arg0) {
            return true;
         } else if (~arg0 <= -49 && arg0 <= 57) {
            return true;
         } else {
            if (arg1 >= -64) {
               method235(false);
            }

            return false;
         }
      } catch (RuntimeException var3) {
         throw class28.method139(var3, "w.E(" + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!w",
      name = "a",
      descriptor = "(ILsa;Lsa;)[B",
      line = 67
   )
   private final byte[] method231(int arg0, class41 arg1, class41 arg2) {
      try {
         if (arg0 != 15064) {
            this.field350 = 120;
         }

         class41 var8 = arg2.method203((byte)118);
         class41 var7 = arg1.method203((byte)111);
         int var4 = this.field348.method224(var8.method192((byte)22), 124);
         int var5 = this.field355[var4].method224(var7.method192((byte)22), 119);
         return this.method237(var5, var4, true);
      } catch (RuntimeException var6) {
         throw class28.method139(var6, "w.O(" + arg0 + ',' + (arg1 != null ? "{...}" : "null") + ',' + (arg2 != null ? "{...}" : "null") + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!w",
      name = "a",
      descriptor = "(IZLsa;)I",
      line = 95
   )
   public final int method232(int arg0, boolean arg1, class41 arg2) {
      try {
         if (!arg1) {
            return 70;
         } else {
            class41 var6 = arg2.method203((byte)31);
            return this.field355[arg0].method224(var6.method192((byte)22), 120);
         }
      } catch (RuntimeException var5) {
         throw class28.method139(var5, "w.K(" + arg0 + ',' + arg1 + ',' + (arg2 != null ? "{...}" : "null") + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!w",
      name = "a",
      descriptor = "(II[I)Z",
      line = 108
   )
   private final boolean method233(int arg0, int arg1, int[] arg2) {
      try {
         if (null == this.field349[arg0]) {
            return false;
         } else {
            int var4 = this.field342[arg0];
            Object[] var6 = this.field352[arg0];
            int[] var5 = this.field347[arg0];
            boolean var7 = true;

            for(int var8 = arg1; var4 > var8; ++var8) {
               if (null == var6[var5[var8]]) {
                  var7 = false;
                  break;
               }
            }

            if (var7) {
               return true;
            } else {
               byte[] var21;
               if (null != arg2 && (arg2[0] != 0 || arg2[1] != 0 || -1 != ~arg2[2] || 0 != arg2[3])) {
                  var21 = loginapplet.method129(true, 277, this.field349[arg0]);
                  class13 var9 = new class13(var21);
                  var9.method68(arg2, 25720, var9.field102.length, 5);
               } else {
                  var21 = loginapplet.method129(false, 277, this.field349[arg0]);
               }

               byte[] var22;
               try {
                  var22 = class42.method215(arg1 + 3268, var21);
               } catch (RuntimeException var19) {
                  throw class28.method139(var19, "T3 - " + (arg2 != null) + "," + arg0 + "," + var21.length + "," + class19.method91(var21, (byte)15, var21.length) + "," + class19.method91(var21, (byte)64, -2 + var21.length) + "," + this.field354[arg0] + "," + this.field343);
               }

               if (this.field359) {
                  this.field349[arg0] = null;
               }

               if (-2 <= ~var4) {
                  if (!this.field353) {
                     var6[var5[0]] = class4.method23(var22, false, true);
                  } else {
                     var6[var5[0]] = var22;
                  }
               } else {
                  int var10 = var22.length;
                  int var23 = var10 - 1;
                  int var11 = 255 & var22[var23];
                  int var24 = var23 - var4 * var11 * 4;
                  class13 var12 = new class13(var22);
                  var12.field105 = var24;
                  int[] var13 = new int[var4];

                  int var15;
                  int var16;
                  for(int var14 = 0; ~var14 > ~var11; ++var14) {
                     var15 = 0;

                     for(var16 = 0; ~var4 < ~var16; ++var16) {
                        var15 += var12.method64(-1);
                        var13[var16] += var15;
                     }
                  }

                  byte[][] var25 = new byte[var4][];

                  for(var15 = 0; ~var15 > ~var4; ++var15) {
                     var25[var15] = new byte[var13[var15]];
                     var13[var15] = 0;
                  }

                  var12.field105 = var24;
                  var15 = 0;

                  for(var16 = 0; ~var16 > ~var11; ++var16) {
                     int var17 = 0;

                     for(int var18 = 0; var4 > var18; ++var18) {
                        var17 += var12.method64(-1);
                        class47.method227(var22, var15, var25[var18], var13[var18], var17);
                        var13[var18] += var17;
                        var15 += var17;
                     }
                  }

                  for(var16 = 0; var16 < var4; ++var16) {
                     if (!this.field353) {
                        var6[var5[var16]] = class4.method23(var25[var16], false, true);
                     } else {
                        var6[var5[var16]] = var25[var16];
                     }
                  }
               }

               return true;
            }
         }
      } catch (RuntimeException var20) {
         throw class28.method139(var20, "w.F(" + arg0 + ',' + arg1 + ',' + (arg2 != null ? "{...}" : "null") + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!w",
      name = "a",
      descriptor = "(I[IBI)[B",
      line = 268
   )
   private final byte[] method234(int arg0, int[] arg1, byte arg2, int arg3) {
      try {
         if (arg2 > -19) {
            this.method229(112, 124);
         }

         if (arg3 >= 0 && this.field352.length > arg3 && null != this.field352[arg3] && arg0 >= 0 && ~this.field352[arg3].length < ~arg0) {
            if (this.field352[arg3][arg0] == null) {
               boolean var5 = this.method233(arg3, 0, arg1);
               if (!var5) {
                  this.method229(-30646, arg3);
                  var5 = this.method233(arg3, 0, arg1);
                  if (!var5) {
                     return null;
                  }
               }
            }

            byte[] var7 = loginapplet.method129(false, 277, this.field352[arg3][arg0]);
            if (this.field353) {
               this.field352[arg3][arg0] = null;
            }

            return var7;
         } else {
            return null;
         }
      } catch (RuntimeException var6) {
         throw class28.method139(var6, "w.M(" + arg0 + ',' + (arg1 != null ? "{...}" : "null") + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!w",
      name = "a",
      descriptor = "(Z)V",
      line = 312
   )
   public static void method235(boolean arg0) {
      try {
         if (arg0) {
            field345 = null;
         }
      } catch (RuntimeException var2) {
         throw class28.method139(var2, "w.N(" + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!w",
      name = "a",
      descriptor = "(Lsa;I)I",
      line = 348
   )
   public final int method236(class41 arg0, int arg1) {
      try {
         class41 var5 = arg0.method203((byte)69);
         if (arg1 != 100) {
            this.field343 = -42;
         }

         return this.field348.method224(var5.method192((byte)22), 114);
      } catch (RuntimeException var4) {
         throw class28.method139(var4, "w.H(" + (arg0 != null ? "{...}" : "null") + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!w",
      name = "a",
      descriptor = "(IIZ)[B",
      line = 359
   )
   public final byte[] method237(int arg0, int arg1, boolean arg2) {
      try {
         if (!arg2) {
            this.method229(119, 22);
         }

         return this.method234(arg0, (int[])null, (byte)-20, arg1);
      } catch (RuntimeException var5) {
         throw class28.method139(var5, "w.J(" + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!w",
      name = "a",
      descriptor = "(I[B)V",
      line = 369
   )
   public final void method238(int arg0, byte[] arg1) {
      try {
         this.field343 = class19.method91(arg1, (byte)31, arg1.length);
         class13 var3 = new class13(class42.method215(3268, arg1));
         int var4 = var3.method66(false);
         if (~var4 != -6 && ~var4 != -7) {
            throw new RuntimeException("Incorrect JS5 protocol number: " + var4);
         } else {
            if (6 <= var4) {
               var3.method64(-1);
            }

            int var5 = var3.method66(false);
            int var6 = 0;
            this.field350 = var3.method67((byte)-118);
            int var7 = -1;
            this.field344 = new int[this.field350];

            int var8;
            for(var8 = 0; ~this.field350 < ~var8; ++var8) {
               this.field344[var8] = var6 += var3.method67((byte)-60);
               if (var7 < this.field344[var8]) {
                  var7 = this.field344[var8];
               }
            }

            this.field342 = new int[var7 - -1];
            this.field354 = new int[1 + var7];
            this.field352 = new Object[1 + var7][];
            this.field356 = new int[1 + var7];
            this.field347 = new int[1 + var7][];
            this.field349 = new Object[var7 - -1];
            if (~var5 != -1) {
               this.field351 = new int[var7 - -1];

               for(var8 = 0; ~this.field350 < ~var8; ++var8) {
                  this.field351[this.field344[var8]] = var3.method64(-1);
               }

               this.field348 = new class46(this.field351);
            }

            for(var8 = 0; this.field350 > var8; ++var8) {
               this.field354[this.field344[var8]] = var3.method64(-1);
            }

            if (arg0 > -46) {
               this.field347 = (int[][])((int[][])null);
            }

            for(var8 = 0; ~this.field350 < ~var8; ++var8) {
               this.field356[this.field344[var8]] = var3.method64(-1);
            }

            for(var8 = 0; var8 < this.field350; ++var8) {
               this.field342[this.field344[var8]] = var3.method67((byte)111);
            }

            int var9;
            int var10;
            int var11;
            for(var8 = 0; ~this.field350 < ~var8; ++var8) {
               var6 = 0;
               var11 = -1;
               var9 = this.field344[var8];
               var10 = this.field342[var9];
               this.field347[var9] = new int[var10];

               for(int var12 = 0; var12 < var10; ++var12) {
                  int var13 = this.field347[var9][var12] = var6 += var3.method67((byte)106);
                  if (~var11 > ~var13) {
                     var11 = var13;
                  }
               }

               this.field352[var9] = new Object[var11 + 1];
            }

            if (~var5 != -1) {
               this.field346 = new int[1 + var7][];
               this.field355 = new class46[1 + var7];

               for(var8 = 0; ~var8 > ~this.field350; ++var8) {
                  var9 = this.field344[var8];
                  var10 = this.field342[var9];
                  this.field346[var9] = new int[this.field352[var9].length];

                  for(var11 = 0; ~var10 < ~var11; ++var11) {
                     this.field346[var9][this.field347[var9][var11]] = var3.method64(-1);
                  }

                  this.field355[var9] = new class46(this.field346[var9]);
               }
            }

         }
      } catch (RuntimeException var14) {
         throw class28.method139(var14, "w.I(" + arg0 + ',' + (arg1 != null ? "{...}" : "null") + ')');
      }
   }

   @OriginalMember(
      owner = "loginapplet!w",
      name = "<init>",
      descriptor = "(ZZ)V",
      line = 519
   )
   public class48(boolean arg0, boolean arg1) {
      try {
         this.field359 = arg0;
         this.field353 = arg1;
      } catch (RuntimeException var4) {
         throw class28.method139(var4, "w.<init>(" + arg0 + ',' + arg1 + ')');
      }
   }
}
