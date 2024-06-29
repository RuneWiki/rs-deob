import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class class761 {
   @OriginalMember(
      owner = "client!ka",
      name = "j",
      descriptor = "Z"
   )
   public boolean field10864 = false;
   @OriginalMember(
      owner = "client!ka",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10866 = new String[]{method5497(method5496("Q%u;")), method5497(method5496("D~7y\n")), method5497(method5496("T17\u001e6\u0017")), method5497(method5496("T17\u001d6\u0017")), method5497(method5496("T17\u001a_")), method5497(method5496("T17\u0006_")), method5497(method5496("T17\u0019_")), method5497(method5496("T17\u0004_")), method5497(method5496("T17\u00106\u0017")), method5497(method5496("T17\u0016_"))};
   @OriginalMember(
      owner = "client!ka",
      name = "g",
      descriptor = "Lfm;"
   )
   public static class164 field10862 = new class164(66, -1);
   @OriginalMember(
      owner = "client!ka",
      name = "d",
      descriptor = "I"
   )
   public static int field10856;
   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "I"
   )
   public static int field10857;
   @OriginalMember(
      owner = "client!ka",
      name = "b",
      descriptor = "I"
   )
   public static int field10858;
   @OriginalMember(
      owner = "client!ka",
      name = "i",
      descriptor = "I"
   )
   public static int field10859;
   @OriginalMember(
      owner = "client!ka",
      name = "f",
      descriptor = "I"
   )
   public static int field10860;
   @OriginalMember(
      owner = "client!ka",
      name = "h",
      descriptor = "I"
   )
   public static int field10861;
   @OriginalMember(
      owner = "client!ka",
      name = "e",
      descriptor = "I"
   )
   public static int field10863;
   @OriginalMember(
      owner = "client!ka",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field10865;

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(BIZ)Lka;"
   )
   public abstract class761 method755(byte arg0, int arg1, boolean arg2);

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(IIII)V"
   )
   public abstract void method768(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(IZIII[ILlj;ILlj;II)V"
   )
   public final void method5487(int arg0, boolean arg1, int arg2, int arg3, int arg4, int[] arg5, class797 arg6, int arg7, class797 arg8, int arg9, int arg10) {
      try {
         ++field10860;
         if (arg2 != arg9) {
            this.method795();
            if (!this.method769()) {
               this.method752();
            } else {
               class514 var12 = arg6.field11588[arg2];
               class626 var13 = var12.field7302;
               class514 var14 = null;
               if (arg8 != null) {
                  var14 = arg8.field11588[arg0];
                  if (var14.field7302 != var13) {
                     var14 = null;
                  }
               }

               this.method5494(arg5, arg4, (boolean[])null, var12, arg3, var14, var13, false, arg1, arg10, arg7, (byte)-100);
               this.method764();
               this.method752();
            }
         }
      } catch (RuntimeException var16) {
         throw class612.method4503(var16, field10866[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field10866[1] : field10866[0]) + ',' + (arg6 != null ? field10866[1] : field10866[0]) + ',' + arg7 + ',' + (arg8 != null ? field10866[1] : field10866[0]) + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(B[B)V"
   )
   public abstract void method786(byte arg0, byte[] arg1);

   @OriginalMember(
      owner = "client!ka",
      name = "ia",
      descriptor = "(SS)V"
   )
   public abstract void method791(short arg0, short arg1);

   @OriginalMember(
      owner = "client!ka",
      name = "G",
      descriptor = "()I"
   )
   public abstract int method783();

   @OriginalMember(
      owner = "client!ka",
      name = "aa",
      descriptor = "(SS)V"
   )
   public abstract void method811(short arg0, short arg1);

   @OriginalMember(
      owner = "client!ka",
      name = "VA",
      descriptor = "(I)V"
   )
   public abstract void method773(int arg0);

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(I)V"
   )
   public abstract void method809(int arg0);

   @OriginalMember(
      owner = "client!ka",
      name = "c",
      descriptor = "()V"
   )
   public abstract void method795();

   @OriginalMember(
      owner = "client!ka",
      name = "ma",
      descriptor = "()I"
   )
   public abstract int method794();

   @OriginalMember(
      owner = "client!ka",
      name = "wa",
      descriptor = "()V"
   )
   public abstract void method764();

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5488(byte arg0) {
      try {
         if (arg0 >= -26) {
            field10862 = null;
         }

         field10865 = null;
         field10862 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field10866[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "O",
      descriptor = "(III)V"
   )
   public abstract void method747(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(Lgga;Lrh;II)V"
   )
   public abstract void method763(class502 arg0, class213 arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ka",
      name = "d",
      descriptor = "()V"
   )
   public abstract void method752();

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(ZII[ZILlj;IIILlj;BLlj;IILlj;)V"
   )
   public final void method5489(boolean arg0, int arg1, int arg2, boolean[] arg3, int arg4, class797 arg5, int arg6, int arg7, int arg8, class797 arg9, byte arg10, class797 arg11, int arg12, int arg13, class797 arg14) {
      try {
         ++field10863;
         if (~arg1 != 0) {
            if (arg3 != null && ~arg4 != 0) {
               this.method795();
               if (!this.method769()) {
                  this.method752();
               } else {
                  class514 var16 = arg14.field11588[arg1];
                  class626 var17 = var16.field7302;
                  class514 var18 = null;
                  if (arg9 != null) {
                     var18 = arg9.field11588[arg7];
                     if (var18.field7302 != var17) {
                        var18 = null;
                     }
                  }

                  this.method5494((int[])null, 65535, arg3, var16, arg13, var18, var17, false, arg0, arg12, 0, (byte)112);
                  class514 var19 = arg11.field11588[arg4];
                  class514 var20 = null;
                  if (arg5 != null) {
                     var20 = arg5.field11588[arg8];
                     if (var20.field7302 != var17) {
                        var20 = null;
                     }
                  }

                  this.method765(0, new int[0], 0, 0, 0, 0, arg0);
                  this.method5494((int[])null, 65535, arg3, var19, arg2, var20, var19.field7302, true, arg0, arg6, 0, (byte)-87);
                  if (arg10 > -17) {
                     this.method5491(-96, 40, -26, 7, -55, 2, 116, 73, (class751)null);
                  }

                  this.method764();
                  this.method752();
               }
            } else {
               this.method5490((byte)-103, 0, arg13, arg12, arg1, arg9, arg7, arg0, arg14);
            }
         }
      } catch (RuntimeException var22) {
         throw class612.method4503(var22, field10866[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field10866[1] : field10866[0]) + ',' + arg4 + ',' + (arg5 != null ? field10866[1] : field10866[0]) + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + (arg9 != null ? field10866[1] : field10866[0]) + ',' + arg10 + ',' + (arg11 != null ? field10866[1] : field10866[0]) + ',' + arg12 + ',' + arg13 + ',' + (arg14 != null ? field10866[1] : field10866[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "r",
      descriptor = "()Z"
   )
   public abstract boolean method767();

   @OriginalMember(
      owner = "client!ka",
      name = "na",
      descriptor = "()I"
   )
   public abstract int method782();

   @OriginalMember(
      owner = "client!ka",
      name = "v",
      descriptor = "()V"
   )
   public abstract void method780();

   @OriginalMember(
      owner = "client!ka",
      name = "LA",
      descriptor = "(I)V"
   )
   public abstract void method771(int arg0);

   @OriginalMember(
      owner = "client!ka",
      name = "P",
      descriptor = "(IIII)V"
   )
   public abstract void method766(int arg0, int arg1, int arg2, int arg3);

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "()[Lhaa;"
   )
   public abstract class3[] method784();

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(BIIIILlj;IZLlj;)V"
   )
   public final void method5490(byte arg0, int arg1, int arg2, int arg3, int arg4, class797 arg5, int arg6, boolean arg7, class797 arg8) {
      try {
         ++field10858;
         if (~arg4 != 0) {
            this.method795();
            if (!this.method769()) {
               this.method752();
            } else {
               class514 var10 = arg8.field11588[arg4];
               class626 var11 = var10.field7302;
               class514 var12 = null;
               if (arg5 != null) {
                  var12 = arg5.field11588[arg6];
                  if (var12.field7302 != var11) {
                     var12 = null;
                  }
               }

               this.method5494((int[])null, 65535, (boolean[])null, var10, arg2, var12, var11, false, arg7, arg3, arg1, (byte)60);
               if (arg0 > -102) {
                  this.method800();
               }

               this.method764();
               this.method752();
            }
         }
      } catch (RuntimeException var14) {
         throw class612.method4503(var14, field10866[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field10866[1] : field10866[0]) + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field10866[1] : field10866[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "k",
      descriptor = "(I)V"
   )
   public abstract void method806(int arg0);

   @OriginalMember(
      owner = "client!ka",
      name = "C",
      descriptor = "(I)V"
   )
   public abstract void method807(int arg0);

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(I[IIIIIZ)V"
   )
   public abstract void method765(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6);

   @OriginalMember(
      owner = "client!ka",
      name = "HA",
      descriptor = "()I"
   )
   public abstract int method779();

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(IIIIIIIILs;)V"
   )
   public final void method5491(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class751 arg8) {
      boolean var10 = client.field10022;

      try {
         ++field10857;
         boolean var11 = false;
         boolean var12 = false;
         boolean var13 = false;
         int var14 = -arg3 / 2;
         int var15 = -arg0 / 2;
         int var16 = arg8.method5401(arg6 + var14, true, arg4 - -var15);
         int var17 = arg3 / 2;
         int var18 = -arg0 / 2;
         int var19 = arg8.method5401(arg6 + var17, true, arg4 - -var18);
         int var20 = -arg3 / 2;
         int var21 = arg0 / 2;
         int var22 = arg8.method5401(arg6 - -var20, true, arg4 - -var21);
         int var23 = arg3 / 2;
         int var24 = arg0 / 2;
         int var25 = arg8.method5401(arg6 - -var23, true, arg4 + var24);
         int var26 = ~var19 >= ~var16 ? var19 : var16;
         int var27 = ~var22 <= ~var25 ? var25 : var22;
         int var28 = var19 < var25 ? var19 : var25;
         if (~arg0 != -1) {
            int var29 = (int)(Math.atan2((double)(-var27 + var26), (double)arg0) * 2607.5945876176133D) & 16383;
            if (~var29 != -1) {
               if (~arg1 != -1) {
                  label110: {
                     if (var29 > 8192) {
                        int var30 = -arg1 + 16384;
                        if (var30 <= var29) {
                           break label110;
                        }

                        var29 = var30;
                        if (!var10) {
                           break label110;
                        }
                     }

                     if (~var29 < ~arg1) {
                        var29 = arg1;
                     }
                  }
               }

               this.method785(var29);
            }
         }

         int var31 = ~var16 > ~var22 ? var16 : var22;
         if (~arg3 != -1) {
            int var32 = (int)(2607.5945876176133D * Math.atan2((double)(-var28 + var31), (double)arg3)) & 16383;
            if (~var32 != -1) {
               if (arg7 != 0) {
                  label113: {
                     if (~var32 >= -8193) {
                        if (~arg7 <= ~var32) {
                           break label113;
                        }

                        var32 = arg7;
                        if (!var10) {
                           break label113;
                        }
                     }

                     int var33 = -arg7 + 16384;
                     if (var32 < var33) {
                        var32 = var33;
                     }
                  }
               }

               this.method773(var32);
            }
         }

         int var34 = var16 + var25;
         if (arg5 < 22) {
            this.method768(1, -93, 63, -108);
         }

         if (~(var19 + var22) > ~var34) {
            var34 = var19 + var22;
         }

         int var35 = (var34 >> 1) + -arg2;
         if (~var35 != -1) {
            this.method799(0, var35, 0);
         }
      } catch (RuntimeException var37) {
         throw class612.method4503(var37, field10866[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field10866[1] : field10866[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "fa",
      descriptor = "()I"
   )
   public abstract int method801();

   @OriginalMember(
      owner = "client!ka",
      name = "EA",
      descriptor = "()I"
   )
   public abstract int method758();

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(ILlj;B)V"
   )
   public final void method5492(int arg0, class797 arg1, byte arg2) {
      boolean var4 = client.field10022;

      try {
         ++field10861;
         if (~arg0 != 0) {
            this.method795();
            if (!this.method769()) {
               this.method752();
            } else {
               class514 var5 = arg1.field11588[arg0];
               class626 var6 = var5.field7302;
               if (arg2 != 10) {
                  this.method804(-18, -61, (class502)null, true, 92, -43);
               }

               int var7 = 0;
               if (!var4 && ~var7 <= ~var5.field7294) {
                  this.method764();
                  this.method752();
               } else {
                  do {
                     short var8 = var5.field7305[var7];
                     if (var6.field8940[var8]) {
                        if (var5.field7298[var7] != -1) {
                           this.method766(0, 0, 0, 0);
                        }

                        this.method766(var6.field8943[var8], var5.field7296[var7], var5.field7295[var7], var5.field7292[var7]);
                     }

                     ++var7;
                  } while(~var7 > ~var5.field7294);

                  this.method764();
                  this.method752();
               }
            }
         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field10866[7] + arg0 + ',' + (arg1 != null ? field10866[1] : field10866[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "g",
      descriptor = "()Z"
   )
   public abstract boolean method803();

   @OriginalMember(
      owner = "client!ka",
      name = "e",
      descriptor = "()[Ldga;"
   )
   public abstract class712[] method753();

   @OriginalMember(
      owner = "client!ka",
      name = "b",
      descriptor = "()[B"
   )
   public abstract byte[] method774();

   @OriginalMember(
      owner = "client!ka",
      name = "RA",
      descriptor = "()I"
   )
   public abstract int method797();

   @OriginalMember(
      owner = "client!ka",
      name = "f",
      descriptor = "()V"
   )
   public abstract void method756();

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(Lgga;IZ)V"
   )
   public abstract void method750(class502 arg0, int arg1, boolean arg2);

   @OriginalMember(
      owner = "client!ka",
      name = "I",
      descriptor = "(I[IIIIZI[I)V"
   )
   public abstract void method762(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7);

   @OriginalMember(
      owner = "client!ka",
      name = "H",
      descriptor = "(III)V"
   )
   public abstract void method799(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!ka",
      name = "WA",
      descriptor = "()I"
   )
   public abstract int method778();

   @OriginalMember(
      owner = "client!ka",
      name = "FA",
      descriptor = "(I)V"
   )
   public abstract void method785(int arg0);

   @OriginalMember(
      owner = "client!ka",
      name = "V",
      descriptor = "()I"
   )
   public abstract int method800();

   @OriginalMember(
      owner = "client!ka",
      name = "ua",
      descriptor = "()I"
   )
   public abstract int method775();

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method5493(int arg0, int arg1) {
      class312 var2 = class324.field4826[0][arg0][arg1];

      for(int var3 = 0; var3 < 3; ++var3) {
         class312 var4 = class324.field4826[var3][arg0][arg1] = class324.field4826[var3 + 1][arg0][arg1];
         if (var4 != null) {
            for(class84 var5 = var4.field4678; var5 != null; var5 = var5.field1305) {
               class578 var6 = var5.field1299;
               if (var6.field8154 == arg0 && var6.field8160 == arg1) {
                  --var6.field6824;
               }
            }

            if (var4.field4677 != null) {
               --var4.field4677.field6824;
            }

            if (var4.field4688 != null) {
               --var4.field4688.field6824;
            }

            if (var4.field4689 != null) {
               --var4.field4689.field6824;
            }

            if (var4.field4679 != null) {
               --var4.field4679.field6824;
            }

            if (var4.field4690 != null) {
               --var4.field4690.field6824;
            }
         }
      }

      if (class324.field4826[0][arg0][arg1] == null) {
         class324.field4826[0][arg0][arg1] = new class312(0);
         class324.field4826[0][arg0][arg1].field4687 = 1;
      }

      class324.field4826[0][arg0][arg1].field4685 = var2;
      class324.field4826[3][arg0][arg1] = null;
   }

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "([II[ZLcka;ILcka;Lao;ZZIIB)V"
   )
   private final void method5494(int[] arg0, int arg1, boolean[] arg2, class514 arg3, int arg4, class514 arg5, class626 arg6, boolean arg7, boolean arg8, int arg9, int arg10, byte arg11) {
      boolean var13 = client.field10022;

      try {
         ++field10859;
         if (arg5 == null || ~arg9 == -1) {
            int var14 = 0;
            if (var13 || ~var14 > ~arg3.field7294) {
               do {
                  short var15 = arg3.field7305[var14];
                  if (arg2 != null && arg2[var15] == !arg7 && arg6.field8943[var15] != 0) {
                     ++var14;
                  } else {
                     short var16 = arg3.field7298[var14];
                     if (~var16 != 0) {
                        this.method5495(3, arg10, arg1 & arg6.field8938[var16], 0, 0, arg6.field8937[var16], 0, arg0, 0, arg8);
                     }

                     this.method5495(3, arg10, arg6.field8938[var15] & arg1, arg6.field8943[var15], arg3.field7296[var14], arg6.field8937[var15], arg3.field7295[var14], arg0, arg3.field7292[var14], arg8);
                     ++var14;
                  }
               } while(~var14 > ~arg3.field7294);

            }
         } else {
            int var17 = -9 / ((arg11 - 13) / 45);
            int var18 = 0;
            int var19 = 0;
            int var20 = 0;
            if (var13 || ~var20 > ~arg6.field8941) {
               do {
                  boolean var21 = false;
                  if (~var18 > ~arg3.field7294 && ~arg3.field7305[var18] == ~var20) {
                     var21 = true;
                  }

                  boolean var22 = false;
                  if (~var19 > ~arg5.field7294 && ~arg5.field7305[var19] == ~var20) {
                     var22 = true;
                  }

                  if (!var21 && !var22) {
                     ++var20;
                  } else {
                     if (arg2 != null && !arg7 == arg2[var20] && arg6.field8943[var20] != 0) {
                        if (var22) {
                           ++var19;
                        }

                        if (!var21) {
                           ++var20;
                           continue;
                        }

                        ++var18;
                        if (!var13) {
                           ++var20;
                           continue;
                        }
                     }

                     short var23 = 0;
                     int var24 = arg6.field8943[var20];
                     if (var24 != 3) {
                        if (var24 == 10) {
                           var23 = 128;
                        }
                     } else {
                        var23 = 128;
                     }

                     byte var25;
                     short var26;
                     short var27;
                     short var28;
                     short var29;
                     if (!var21) {
                        var25 = 0;
                        var26 = -1;
                        var27 = var23;
                        var28 = var23;
                        var29 = var23;
                        if (var13) {
                           var26 = arg3.field7298[var18];
                           var29 = arg3.field7296[var18];
                           var25 = arg3.field7300[var18];
                           var27 = arg3.field7292[var18];
                           var28 = arg3.field7295[var18];
                           ++var18;
                        }
                     } else {
                        var26 = arg3.field7298[var18];
                        var29 = arg3.field7296[var18];
                        var25 = arg3.field7300[var18];
                        var27 = arg3.field7292[var18];
                        var28 = arg3.field7295[var18];
                        ++var18;
                     }

                     short var30;
                     byte var31;
                     short var32;
                     short var33;
                     short var34;
                     if (!var22) {
                        var30 = var23;
                        var31 = 0;
                        var32 = var23;
                        var33 = -1;
                        var34 = var23;
                        if (var13) {
                           var30 = arg5.field7296[var19];
                           var34 = arg5.field7292[var19];
                           var32 = arg5.field7295[var19];
                           var33 = arg5.field7298[var19];
                           var31 = arg5.field7300[var19];
                           ++var19;
                        }
                     } else {
                        var30 = arg5.field7296[var19];
                        var34 = arg5.field7292[var19];
                        var32 = arg5.field7295[var19];
                        var33 = arg5.field7298[var19];
                        var31 = arg5.field7300[var19];
                        ++var19;
                     }

                     if (~var26 == 0) {
                        if (var33 != -1) {
                           this.method5495(3, arg10, arg1 & arg6.field8938[var33], 0, 0, arg6.field8937[var33], 0, arg0, 0, arg8);
                           if (var13) {
                              this.method5495(3, arg10, arg1 & arg6.field8938[var26], 0, 0, arg6.field8937[var26], 0, arg0, 0, arg8);
                           }
                        }
                     } else {
                        this.method5495(3, arg10, arg1 & arg6.field8938[var26], 0, 0, arg6.field8937[var26], 0, arg0, 0, arg8);
                     }

                     int var35;
                     int var36;
                     int var37;
                     label275: {
                        if (~(var25 & 2) != -1 || (1 & var31) != 0) {
                           var35 = var28;
                           var36 = var29;
                           var37 = var27;
                           if (!var13) {
                              break label275;
                           }
                        }

                        if (~var24 == -3) {
                           int var38 = 16383 & -var29 + var30;
                           int var39 = 16383 & -var28 + var32;
                           if (~var38 <= -8193) {
                              var38 -= 16384;
                           }

                           int var40;
                           if (~var39 <= -8193) {
                              var39 -= 16384;
                              var40 = -var27 + var34 & 16383;
                              var35 = arg9 * var39 / arg4 + var28 & 16383;
                              if (var40 >= 8192) {
                                 var40 -= 16384;
                              }
                           } else {
                              var40 = -var27 + var34 & 16383;
                              var35 = arg9 * var39 / arg4 + var28 & 16383;
                              if (var40 >= 8192) {
                                 var40 -= 16384;
                              }
                           }

                           var36 = 16383 & var29 - -(arg9 * var38 / arg4);
                           var37 = 16383 & arg9 * var40 / arg4 + var27;
                           if (!var13) {
                              break label275;
                           }
                        }

                        if (~var24 == -10) {
                           int var41 = 16383 & -var29 + var30;
                           if (var41 >= 8192) {
                              var41 -= 16384;
                           }

                           var37 = 0;
                           var35 = 0;
                           var36 = 16383 & arg9 * var41 / arg4 + var29;
                           if (!var13) {
                              break label275;
                           }
                        }

                        if (var24 != 7) {
                           var36 = var29 - -((-var29 + var30) * arg9 / arg4);
                           var37 = var27 - -((var34 - var27) * arg9 / arg4);
                           var35 = (-var28 + var32) * arg9 / arg4 + var28;
                           if (!var13) {
                              break label275;
                           }
                        }

                        int var42 = 63 & -var29 + var30;
                        if (~var42 <= -33) {
                           var42 -= 64;
                        }

                        var36 = 63 & arg9 * var42 / arg4 + var29;
                        var37 = var27 - -((-var27 + var34) * arg9 / arg4);
                        var35 = (-var28 + var32) * arg9 / arg4 + var28;
                     }

                     this.method5495(3, arg10, arg1 & arg6.field8938[var20], var24, var36, arg6.field8937[var20], var35, arg0, var37, arg8);
                     ++var20;
                  }
               } while(~var20 > ~arg6.field8941);

            }
         }
      } catch (RuntimeException var44) {
         throw class612.method4503(var44, field10866[2] + (arg0 != null ? field10866[1] : field10866[0]) + ',' + arg1 + ',' + (arg2 != null ? field10866[1] : field10866[0]) + ',' + (arg3 != null ? field10866[1] : field10866[0]) + ',' + arg4 + ',' + (arg5 != null ? field10866[1] : field10866[0]) + ',' + (arg6 != null ? field10866[1] : field10866[0]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(IIIII[II[IIZ)V"
   )
   private final void method5495(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int[] arg7, int arg8, boolean arg9) {
      boolean var11 = client.field10022;

      try {
         label111: {
            if (arg1 == 1) {
               if (~arg3 != -1 && ~arg3 != -2) {
                  if (arg3 == 3) {
                     int var12 = arg4;
                     arg4 = arg8;
                     arg8 = var12;
                     if (!var11) {
                        break label111;
                     }
                  }

                  if (arg3 != 2) {
                     break label111;
                  }

                  int var13 = arg4;
                  arg4 = -arg8 & 16383;
                  arg8 = 16383 & var13;
                  if (!var11) {
                     break label111;
                  }
               }

               int var14 = -arg4;
               arg4 = arg8;
               arg8 = var14;
               if (!var11) {
                  break label111;
               }
            }

            if (~arg1 == -3) {
               if (~arg3 != -1 && arg3 != 1) {
                  if (~arg3 != -3) {
                     break label111;
                  }

                  arg8 = 16383 & -arg8;
                  arg4 = 16383 & -arg4;
                  if (!var11) {
                     break label111;
                  }
               }

               arg4 = -arg4;
               arg8 = -arg8;
               if (!var11) {
                  break label111;
               }
            }

            if (arg1 == 3) {
               label120: {
                  if (~arg3 == -1 || ~arg3 == -2) {
                     int var15 = arg4;
                     arg4 = -arg8;
                     arg8 = var15;
                     if (!var11) {
                        break label120;
                     }
                  }

                  if (arg3 != 3) {
                     if (~arg3 != -3) {
                        break label120;
                     }

                     int var16 = arg4;
                     arg4 = 16383 & arg8;
                     arg8 = -var16 & 16383;
                     if (!var11) {
                        break label120;
                     }
                  }

                  int var17 = arg4;
                  arg4 = arg8;
                  arg8 = var17;
               }
            }
         }

         label68: {
            ++field10856;
            if (~arg2 != -65536) {
               this.method762(arg3, arg5, arg4, arg6, arg8, arg9, arg2, arg7);
               if (!var11) {
                  break label68;
               }
            }

            this.method765(arg3, arg5, arg4, arg6, arg8, arg1, arg9);
         }

         if (arg0 != 3) {
            field10862 = null;
         }
      } catch (RuntimeException var19) {
         throw class612.method4503(var19, field10866[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field10866[1] : field10866[0]) + ',' + arg6 + ',' + (arg7 != null ? field10866[1] : field10866[0]) + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(Lgga;Lrh;I)V"
   )
   public abstract void method805(class502 arg0, class213 arg1, int arg2);

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(IILgga;ZII)Z"
   )
   public abstract boolean method804(int arg0, int arg1, class502 arg2, boolean arg3, int arg4, int arg5);

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(Lgga;)V"
   )
   public abstract void method757(class502 arg0);

   @OriginalMember(
      owner = "client!ka",
      name = "s",
      descriptor = "(I)V"
   )
   public abstract void method798(int arg0);

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(IILgga;ZI)Z"
   )
   public abstract boolean method748(int arg0, int arg1, class502 arg2, boolean arg3, int arg4);

   @OriginalMember(
      owner = "client!ka",
      name = "p",
      descriptor = "(IILs;Ls;III)V"
   )
   public abstract void method770(int arg0, int arg1, class751 arg2, class751 arg3, int arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!ka",
      name = "da",
      descriptor = "()I"
   )
   public abstract int method749();

   @OriginalMember(
      owner = "client!ka",
      name = "ba",
      descriptor = "(Lr;)Lr;"
   )
   public abstract class412 method792(class412 arg0);

   @OriginalMember(
      owner = "client!ka",
      name = "NA",
      descriptor = "()Z"
   )
   public abstract boolean method769();

   @OriginalMember(
      owner = "client!ka",
      name = "F",
      descriptor = "()Z"
   )
   public abstract boolean method781();

   @OriginalMember(
      owner = "client!ka",
      name = "a",
      descriptor = "(Lka;IIIZ)V"
   )
   public abstract void method754(class761 arg0, int arg1, int arg2, int arg3, boolean arg4);

   @OriginalMember(
      owner = "client!ka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5496(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 119);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5497(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 63;
            break;
         case 1:
            var10005 = 80;
            break;
         case 2:
            var10005 = 25;
            break;
         case 3:
            var10005 = 87;
            break;
         default:
            var10005 = 119;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
