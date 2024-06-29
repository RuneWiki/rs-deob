import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class582 extends class294 {
   @OriginalMember(
      owner = "client!cq",
      name = "z",
      descriptor = "[B"
   )
   public byte[] field8581;
   @OriginalMember(
      owner = "client!cq",
      name = "r",
      descriptor = "[Lec;"
   )
   public class184[] field8587;
   @OriginalMember(
      owner = "client!cq",
      name = "n",
      descriptor = "[B"
   )
   public byte[] field8591;
   @OriginalMember(
      owner = "client!cq",
      name = "s",
      descriptor = "[I"
   )
   private int[] field8583;
   @OriginalMember(
      owner = "client!cq",
      name = "y",
      descriptor = "[B"
   )
   public byte[] field8584;
   @OriginalMember(
      owner = "client!cq",
      name = "q",
      descriptor = "[S"
   )
   public short[] field8594;
   @OriginalMember(
      owner = "client!cq",
      name = "v",
      descriptor = "[Lss;"
   )
   public class559[] field8588;
   @OriginalMember(
      owner = "client!cq",
      name = "o",
      descriptor = "I"
   )
   public int field8585;
   @OriginalMember(
      owner = "client!cq",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8596 = new String[]{method4354(method4353("\r#R_4")), method4354(method4353("\u0000'\u0010v")), method4354(method4353("\u0015|R4a")), method4354(method4353("\r#RX4")), method4354(method4353("\r#R^4")), method4354(method4353("\r#R[4")), method4354(method4353("\r#RY4")), method4354(method4353("\r#R\\4")), method4354(method4353("\r#R&u\u0000;\b$4"))};
   @OriginalMember(
      owner = "client!cq",
      name = "m",
      descriptor = "Lhf;"
   )
   public static class588 field8586 = new class588();
   @OriginalMember(
      owner = "client!cq",
      name = "x",
      descriptor = "I"
   )
   public static int field8595 = 13156520;
   @OriginalMember(
      owner = "client!cq",
      name = "w",
      descriptor = "I"
   )
   public static int field8582;
   @OriginalMember(
      owner = "client!cq",
      name = "t",
      descriptor = "I"
   )
   public static int field8589;
   @OriginalMember(
      owner = "client!cq",
      name = "u",
      descriptor = "I"
   )
   public static int field8590;
   @OriginalMember(
      owner = "client!cq",
      name = "A",
      descriptor = "I"
   )
   public static int field8592;
   @OriginalMember(
      owner = "client!cq",
      name = "p",
      descriptor = "I"
   )
   public static int field8593;

   @OriginalMember(
      owner = "client!cq",
      name = "a",
      descriptor = "(Lah;B)V"
   )
   public static final void method4347(class626 arg0, byte arg1) {
      try {
         ++field8593;
         arg0.field9072 = null;
         if (~class789.field11550 > -21) {
            class774.field11381.method1813(arg0, 0);
            ++class789.field11550;
         }

         if (arg1 >= -27) {
            field8595 = -68;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8596[3] + (arg0 != null ? field8596[2] : field8596[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cq",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4348(int arg0) {
      try {
         field8586 = null;
         if (arg0 != 128) {
            method4349(-69, -52, -119, 89, -59, -30, -19);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8596[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cq",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public static final void method4349(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         class540.field8137 = arg4;
         ++field8592;
         class369.field5740 = arg2;
         class634.field9181 = arg1;
         class598.field8772 = arg3;
         if (arg5 != 0) {
            method4348(120);
         }

         class63.field840 = arg6;
         class420.field6494 = arg0;
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field8596[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cq",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method4350(byte arg0) {
      try {
         int var2 = 62 / ((-30 - arg0) / 58);
         this.field8583 = null;
         ++field8582;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8596[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cq",
      name = "a",
      descriptor = "(Ljo;I[I[B)Z"
   )
   public final boolean method4351(class507 arg0, int arg1, int[] arg2, byte[] arg3) {
      try {
         ++field8589;
         boolean var5 = true;
         int var6 = 0;
         class184 var7 = null;
         if (arg1 < 88) {
            return false;
         } else {
            for(int var8 = 0; ~var8 > -129; ++var8) {
               if (arg3 == null || arg3[var8] != 0) {
                  int var9 = this.field8583[var8];
                  if (~var9 != -1) {
                     if (~var6 != ~var9) {
                        var6 = var9--;
                        if (~(var9 & 1) != -1) {
                           var7 = arg0.method3937((byte)-110, var9 >> 2, arg2);
                        } else {
                           var7 = arg0.method3936(arg2, var9 >> 2, (byte)126);
                        }

                        if (var7 == null) {
                           var5 = false;
                        }
                     }

                     if (var7 != null) {
                        this.field8587[var8] = var7;
                        this.field8583[var8] = 0;
                     }
                  }
               }
            }

            return var5;
         }
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field8596[7] + (arg0 != null ? field8596[2] : field8596[1]) + ',' + arg1 + ',' + (arg2 != null ? field8596[2] : field8596[1]) + ',' + (arg3 != null ? field8596[2] : field8596[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cq",
      name = "<init>",
      descriptor = "()V"
   )
   public class582() {
   }

   @OriginalMember(
      owner = "client!cq",
      name = "<init>",
      descriptor = "([B)V"
   )
   public class582(byte[] arg0) {
      try {
         this.field8581 = new byte[128];
         this.field8587 = new class184[128];
         this.field8591 = new byte[128];
         this.field8583 = new int[128];
         this.field8584 = new byte[128];
         this.field8594 = new short[128];
         this.field8588 = new class559[128];
         class354 var2 = new class354(arg0);

         int var3;
         for(var3 = 0; ~var2.field5428[var2.field5436 + var3] != -1; ++var3) {
         }

         byte[] var4 = new byte[var3];

         for(int var5 = 0; ~var3 < ~var5; ++var5) {
            var4[var5] = var2.method2886((byte)88);
         }

         ++var2.field5436;
         ++var3;
         int var6 = var2.field5436;
         var2.field5436 += var3;

         int var7;
         for(var7 = 0; var2.field5428[var2.field5436 + var7] != 0; ++var7) {
         }

         byte[] var8 = new byte[var7];

         for(int var9 = 0; var9 < var7; ++var9) {
            var8[var9] = var2.method2886((byte)88);
         }

         ++var2.field5436;
         ++var7;
         int var10 = var2.field5436;
         var2.field5436 += var7;

         int var11;
         for(var11 = 0; var2.field5428[var2.field5436 + var11] != 0; ++var11) {
         }

         byte[] var12 = new byte[var11];

         for(int var13 = 0; var11 > var13; ++var13) {
            var12[var13] = var2.method2886((byte)88);
         }

         ++var11;
         ++var2.field5436;
         byte[] var14 = new byte[var11];
         int var15;
         if (~var11 < -2) {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;

            for(int var17 = 2; ~var17 > ~var11; ++var17) {
               int var18 = var2.method2855(-31007);
               if (~var18 == -1) {
                  var16 = var15++;
               } else {
                  if (var16 >= var18) {
                     --var18;
                  }

                  var16 = var18;
               }

               var14[var17] = (byte)var16;
            }
         } else {
            var15 = var11;
         }

         class559[] var19 = new class559[var15];

         for(int var20 = 0; var20 < var19.length; ++var20) {
            class559 var21 = var19[var20] = new class559();
            int var22 = var2.method2855(-31007);
            if (var22 > 0) {
               var21.field8315 = new byte[var22 * 2];
            }

            int var23 = var2.method2855(-31007);
            if (var23 > 0) {
               var21.field8320 = new byte[var23 * 2 + 2];
               var21.field8320[1] = 64;
            }
         }

         int var24 = var2.method2855(-31007);
         byte[] var25 = ~var24 >= -1 ? null : new byte[var24 * 2];
         int var26 = var2.method2855(-31007);
         byte[] var27 = ~var26 >= -1 ? null : new byte[var26 * 2];

         int var28;
         for(var28 = 0; var2.field5428[var2.field5436 + var28] != 0; ++var28) {
         }

         byte[] var29 = new byte[var28];

         for(int var30 = 0; var28 > var30; ++var30) {
            var29[var30] = var2.method2886((byte)88);
         }

         ++var2.field5436;
         ++var28;
         int var31 = 0;

         for(int var32 = 0; var32 < 128; ++var32) {
            var31 += var2.method2855(-31007);
            this.field8594[var32] = (short)var31;
         }

         int var33 = 0;

         for(int var34 = 0; ~var34 > -129; ++var34) {
            var33 += var2.method2855(-31007);
            this.field8594[var34] = (short)(this.field8594[var34] + (var33 << 8));
         }

         int var35 = 0;
         int var36 = 0;
         int var37 = 0;

         for(int var38 = 0; ~var38 > -129; ++var38) {
            if (~var35 == -1) {
               if (var36 < var29.length) {
                  var35 = var29[var36++];
               } else {
                  var35 = -1;
               }

               var37 = var2.method2891(0);
            }

            this.field8594[var38] = (short)(this.field8594[var38] + class408.method3277(var37 + -1 << 14, 32768));
            this.field8583[var38] = var37;
            --var35;
         }

         int var39 = 0;
         int var40 = 0;
         int var41 = 0;

         for(int var42 = 0; ~var42 > -129; ++var42) {
            if (this.field8583[var42] != 0) {
               if (~var40 == -1) {
                  if (var39 >= var4.length) {
                     var40 = -1;
                  } else {
                     var40 = var4[var39++];
                  }

                  var41 = var2.field5428[var6++] + -1;
               }

               --var40;
               this.field8581[var42] = (byte)var41;
            }
         }

         int var43 = 0;
         int var44 = 0;
         int var45 = 0;

         for(int var46 = 0; ~var46 > -129; ++var46) {
            if (this.field8583[var46] != 0) {
               if (var44 == 0) {
                  var45 = 16 + var2.field5428[var10++] << 2;
                  if (var43 >= var8.length) {
                     var44 = -1;
                  } else {
                     var44 = var8[var43++];
                  }
               }

               --var44;
               this.field8591[var46] = (byte)var45;
            }
         }

         int var47 = 0;
         int var48 = 0;
         class559 var49 = null;

         for(int var50 = 0; var50 < 128; ++var50) {
            if (~this.field8583[var50] != -1) {
               if (~var47 == -1) {
                  var49 = var19[var14[var48]];
                  if (var48 >= var12.length) {
                     var47 = -1;
                  } else {
                     var47 = var12[var48++];
                  }
               }

               this.field8588[var50] = var49;
               --var47;
            }
         }

         int var51 = 0;
         int var52 = 0;
         int var53 = 0;

         for(int var54 = 0; var54 < 128; ++var54) {
            if (var51 == 0) {
               if (~var52 <= ~var29.length) {
                  var51 = -1;
               } else {
                  var51 = var29[var52++];
               }

               if (this.field8583[var54] > 0) {
                  var53 = var2.method2855(-31007) - -1;
               }
            }

            this.field8584[var54] = (byte)var53;
            --var51;
         }

         this.field8585 = 1 + var2.method2855(-31007);

         for(int var55 = 0; ~var55 > ~var15; ++var55) {
            class559 var56 = var19[var55];
            if (var56.field8315 != null) {
               for(int var57 = 1; ~var57 > ~var56.field8315.length; var57 += 2) {
                  var56.field8315[var57] = var2.method2886((byte)88);
               }
            }

            if (var56.field8320 != null) {
               for(int var58 = 3; ~var58 > ~(var56.field8320.length + -2); var58 += 2) {
                  var56.field8320[var58] = var2.method2886((byte)88);
               }
            }
         }

         if (var25 != null) {
            for(int var59 = 1; ~var25.length < ~var59; var59 += 2) {
               var25[var59] = var2.method2886((byte)88);
            }
         }

         if (var27 != null) {
            for(int var60 = 1; var27.length > var60; var60 += 2) {
               var27[var60] = var2.method2886((byte)88);
            }
         }

         for(int var61 = 0; ~var61 > ~var15; ++var61) {
            class559 var62 = var19[var61];
            if (var62.field8320 != null) {
               int var63 = 0;

               for(int var64 = 2; ~var64 > ~var62.field8320.length; var64 += 2) {
                  var63 = var2.method2855(-31007) + var63 + 1;
                  var62.field8320[var64] = (byte)var63;
               }
            }
         }

         for(int var65 = 0; var65 < var15; ++var65) {
            class559 var66 = var19[var65];
            if (var66.field8315 != null) {
               int var67 = 0;

               for(int var68 = 2; ~var66.field8315.length < ~var68; var68 += 2) {
                  var67 = 1 + (var67 - -var2.method2855(-31007));
                  var66.field8315[var68] = (byte)var67;
               }
            }
         }

         if (var25 != null) {
            int var69 = var2.method2855(-31007);
            var25[0] = (byte)var69;

            for(int var70 = 2; ~var25.length < ~var70; var70 += 2) {
               var69 = 1 + (var69 - -var2.method2855(-31007));
               var25[var70] = (byte)var69;
            }

            byte var71 = var25[0];
            byte var72 = var25[1];

            for(int var73 = 0; var73 < var71; ++var73) {
               this.field8584[var73] = (byte)(this.field8584[var73] * var72 + 32 >> 6);
            }

            int var74 = 2;

            while(var25.length > var74) {
               byte var75 = var25[var74];
               byte var76 = var25[var74 - -1];
               int var77 = (-var71 + var75) / 2 + (-var71 + var75) * var72;

               for(int var78 = var71; var78 < var75; ++var78) {
                  int var79 = class62.method476(var77, var75 - var71, (byte)-123);
                  this.field8584[var78] = (byte)(this.field8584[var78] * var79 + 32 >> 6);
                  var77 += var76 - var72;
               }

               var71 = var75;
               var74 += 2;
               var72 = var76;
            }

            Object var80 = null;

            for(int var81 = var71; var81 < 128; ++var81) {
               this.field8584[var81] = (byte)(this.field8584[var81] * var72 + 32 >> 6);
            }
         }

         if (var27 != null) {
            int var82 = var2.method2855(-31007);
            var27[0] = (byte)var82;

            for(int var83 = 2; var83 < var27.length; var83 += 2) {
               var82 += 1 - -var2.method2855(-31007);
               var27[var83] = (byte)var82;
            }

            byte var84 = var27[0];
            int var85 = var27[1] << 1;

            for(int var86 = 0; ~var86 > ~var84; ++var86) {
               int var87 = (this.field8591[var86] & 255) - -var85;
               if (var87 < 0) {
                  var87 = 0;
               }

               if (~var87 < -129) {
                  var87 = 128;
               }

               this.field8591[var86] = (byte)var87;
            }

            for(int var88 = 2; var88 < var27.length; var88 += 2) {
               byte var89 = var27[var88];
               int var90 = var27[var88 - -1] << 1;
               int var91 = (var89 - var84) / 2 + (-var84 + var89) * var85;

               for(int var92 = var84; var89 > var92; ++var92) {
                  int var93 = class62.method476(var91, -var84 + var89, (byte)-123);
                  int var94 = (255 & this.field8591[var92]) + var93;
                  if (~var94 > -1) {
                     var94 = 0;
                  }

                  if (~var94 < -129) {
                     var94 = 128;
                  }

                  var91 += -var85 + var90;
                  this.field8591[var92] = (byte)var94;
               }

               var85 = var90;
               var84 = var89;
            }

            for(int var95 = var84; ~var95 > -129; ++var95) {
               int var96 = (this.field8591[var95] & 255) + var85;
               if (var96 < 0) {
                  var96 = 0;
               }

               if (~var96 < -129) {
                  var96 = 128;
               }

               this.field8591[var95] = (byte)var96;
            }

            Object var97 = null;
         }

         for(int var98 = 0; var98 < var15; ++var98) {
            var19[var98].field8321 = var2.method2855(-31007);
         }

         for(int var99 = 0; var15 > var99; ++var99) {
            class559 var100 = var19[var99];
            if (var100.field8315 != null) {
               var100.field8313 = var2.method2855(-31007);
            }

            if (var100.field8320 != null) {
               var100.field8317 = var2.method2855(-31007);
            }

            if (~var100.field8321 < -1) {
               var100.field8322 = var2.method2855(-31007);
            }
         }

         for(int var101 = 0; var15 > var101; ++var101) {
            var19[var101].field8319 = var2.method2855(-31007);
         }

         for(int var102 = 0; ~var102 > ~var15; ++var102) {
            class559 var103 = var19[var102];
            if (var103.field8319 > 0) {
               var103.field8312 = var2.method2855(-31007);
            }
         }

         for(int var104 = 0; ~var15 < ~var104; ++var104) {
            class559 var105 = var19[var104];
            if (var105.field8312 > 0) {
               var105.field8316 = var2.method2855(-31007);
            }
         }

      } catch (RuntimeException var107) {
         throw class482.method3757(var107, field8596[8] + (arg0 != null ? field8596[2] : field8596[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cq",
      name = "b",
      descriptor = "(I)I"
   )
   public static final int method4352(int arg0) {
      try {
         if (arg0 != -11254) {
            method4348(19);
         }

         ++field8590;
         return 16;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8596[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4353(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 28);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4354(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 110;
            break;
         case 1:
            var10005 = 82;
            break;
         case 2:
            var10005 = 124;
            break;
         case 3:
            var10005 = 26;
            break;
         default:
            var10005 = 28;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
