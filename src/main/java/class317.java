import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!caa")
public class class317 extends class22 {
   @OriginalMember(
      owner = "client!caa",
      name = "j",
      descriptor = "Lcs;"
   )
   private class357 field4586;
   @OriginalMember(
      owner = "client!caa",
      name = "F",
      descriptor = "Lmaa;"
   )
   private class494 field4576;
   @OriginalMember(
      owner = "client!caa",
      name = "x",
      descriptor = "Lke;"
   )
   private class622 field4569;
   @OriginalMember(
      owner = "client!caa",
      name = "C",
      descriptor = "I"
   )
   private int field4592;
   @OriginalMember(
      owner = "client!caa",
      name = "q",
      descriptor = "I"
   )
   private int field4587;
   @OriginalMember(
      owner = "client!caa",
      name = "G",
      descriptor = "I"
   )
   private int field4585;
   @OriginalMember(
      owner = "client!caa",
      name = "l",
      descriptor = "I"
   )
   private int field4581;
   @OriginalMember(
      owner = "client!caa",
      name = "o",
      descriptor = "[[F"
   )
   private float[][] field4584;
   @OriginalMember(
      owner = "client!caa",
      name = "m",
      descriptor = "[[F"
   )
   private float[][] field4589;
   @OriginalMember(
      owner = "client!caa",
      name = "s",
      descriptor = "[[F"
   )
   private float[][] field4579;
   @OriginalMember(
      owner = "client!caa",
      name = "p",
      descriptor = "I"
   )
   private int field4572;
   @OriginalMember(
      owner = "client!caa",
      name = "w",
      descriptor = "Lld;"
   )
   private class178 field4590;
   @OriginalMember(
      owner = "client!caa",
      name = "v",
      descriptor = "Lrn;"
   )
   private class280 field4591;
   @OriginalMember(
      owner = "client!caa",
      name = "t",
      descriptor = "Ljaclib/memory/Stream;"
   )
   private Stream field4571;
   @OriginalMember(
      owner = "client!caa",
      name = "E",
      descriptor = "Ljaclib/memory/Stream;"
   )
   private Stream field4573;
   @OriginalMember(
      owner = "client!caa",
      name = "H",
      descriptor = "Lsd;"
   )
   private class102 field4583;
   @OriginalMember(
      owner = "client!caa",
      name = "A",
      descriptor = "I"
   )
   private int field4575;
   @OriginalMember(
      owner = "client!caa",
      name = "I",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4594 = new String[]{method2485(method2484("p\u007f\u000b\u0002")), method2485(method2484("}k\u0006@\u000bwd\u000e\u001a\t6")), method2485(method2484("e$I@J")), method2485(method2484("}k\u0006@t6")), method2485(method2484("}k\u0006@u6")), method2485(method2484("}k\u0006@r6")), method2485(method2484("}k\u0006@v6")), method2485(method2484("}k\u0006@s6"))};
   @OriginalMember(
      owner = "client!caa",
      name = "u",
      descriptor = "[I"
   )
   public static int[] field4574 = new int[8];
   @OriginalMember(
      owner = "client!caa",
      name = "r",
      descriptor = "[I"
   )
   public static int[] field4580 = new int[]{0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4};
   @OriginalMember(
      owner = "client!caa",
      name = "n",
      descriptor = "I"
   )
   public static int field4577;
   @OriginalMember(
      owner = "client!caa",
      name = "D",
      descriptor = "I"
   )
   public static int field4578;
   @OriginalMember(
      owner = "client!caa",
      name = "k",
      descriptor = "I"
   )
   public static int field4582;
   @OriginalMember(
      owner = "client!caa",
      name = "z",
      descriptor = "I"
   )
   public static int field4588;
   @OriginalMember(
      owner = "client!caa",
      name = "y",
      descriptor = "I"
   )
   public static int field4593;
   @OriginalMember(
      owner = "client!caa",
      name = "B",
      descriptor = "Lne;"
   )
   public static class335 field4570;

   @OriginalMember(
      owner = "client!caa",
      name = "a",
      descriptor = "(II[[ZIZ)V",
      line = 4
   )
   public final void method2479(int arg0, int arg1, boolean[][] arg2, int arg3, boolean arg4) {
      boolean var6 = client.field4564;

      try {
         ++field4582;
         if (this.field4591 != null) {
            if (~this.field4592 >= ~(arg1 + arg3)) {
               if (this.field4587 >= -arg1 + arg3) {
                  if (this.field4585 <= arg0 + arg1) {
                     if (~this.field4581 <= ~(-arg1 + arg0)) {
                        int var7 = this.field4585;
                        if (!arg4) {
                           while(~var7 >= ~this.field4581) {
                              int var8 = this.field4592;
                              if (var6 || var8 <= this.field4587) {
                                 do {
                                    int var9 = var8 - arg3;
                                    int var10 = -arg0 + var7;
                                    if (~(-arg1) > ~var9 && ~var9 > ~arg1 && -arg1 < var10 && ~var10 > ~arg1 && arg2[arg1 + var9][arg1 + var10]) {
                                       this.field4586.method2734((byte)((int)(255.0F * this.field4569.method4556((byte)108))), (byte)-11);
                                       this.field4586.method1202(0, this.field4583, 10);
                                       this.field4586.method1166((byte)121, this.field4586.field5337);
                                       this.field4586.method1175(0, 0, this.field4591, 0, this.field4572 / 3, class421.field6132, this.field4575);
                                       return;
                                    }

                                    ++var8;
                                 } while(var8 <= this.field4587);
                              }

                              ++var7;
                           }

                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var12) {
         throw class608.method4462(var12, field4594[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4594[2] : field4594[0]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!caa",
      name = "a",
      descriptor = "(SI)V",
      line = 72
   )
   private final void method2480(short arg0, int arg1) {
      try {
         if (arg1 < 19) {
            this.field4579 = null;
         }

         label19: {
            if (Stream.method5090()) {
               this.field4573.method5094(arg0);
               if (!client.field4564) {
                  break label19;
               }
            }

            this.field4573.method5093(arg0);
         }

         ++field4588;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4594[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!caa",
      name = "a",
      descriptor = "(ZII)V",
      line = 93
   )
   public static final void method2481(boolean arg0, int arg1, int arg2) {
      boolean var3 = client.field4564;

      try {
         label144: {
            ++field4593;
            if (class370.field5484 > class370.field5488) {
               class370.field5488 = (float)((double)class370.field5488 / 30.0D + (double)class370.field5488);
               if (class370.field5488 > class370.field5484) {
                  class370.field5488 = class370.field5484;
               }

               class632.method4645(-128);
               class370.field5493 = (int)class370.field5488 >> 1;
               class370.field5485 = class759.method5491(0, class370.field5493);
               if (!var3) {
                  break label144;
               }
            }

            if (class370.field5484 < class370.field5488) {
               class370.field5488 = (float)((double)class370.field5488 - (double)class370.field5488 / 30.0D);
               if (class370.field5484 > class370.field5488) {
                  class370.field5488 = class370.field5484;
               }

               class632.method4645(30);
               class370.field5493 = (int)class370.field5488 >> 1;
               class370.field5485 = class759.method5491(0, class370.field5493);
            }
         }

         if (~class493.field7185 != 0 && ~class3.field22 != 0) {
            int var4 = class493.field7185 - class755.field10968;
            if (var4 < 2 || var4 > 2) {
               var4 /= 8;
            }

            int var5 = -class48.field1043 + class3.field22;
            if (var5 < 2 || var5 > 2) {
               var5 /= 8;
            }

            class755.field10968 += var4;
            if (~var4 == -1 && var5 == 0) {
               class3.field22 = -1;
               class493.field7185 = -1;
            }

            class48.field1043 -= -var5;
            class632.method4645(-11);
         }

         if (arg0) {
            label124: {
               if (~class265.field3776 >= -1) {
                  class669.field9744 = -1;
                  class580.field8338 = -1;
                  if (!var3) {
                     break label124;
                  }
               }

               --class372.field5541;
               if (class372.field5541 == 0) {
                  --class265.field3776;
                  class372.field5541 = 100;
               }
            }

            if (class28.field429 && class791.field11560 != null) {
               class78 var6 = (class78)class791.field11560.method2579(-801);
               if (var3 || var6 != null) {
                  do {
                     label152: {
                        class155 var7 = class370.field5480.method3207(var6.field1346.field3806, 36);
                        if (!var6.method800(arg1, arg2, Integer.MAX_VALUE)) {
                           if (!var6.field1346.field3802) {
                              break label152;
                           }

                           var6.field1346.field3802 = false;
                           class161.method1473(class396.field5821, var6.field1346.field3806, var7.field2505);
                           if (!var3) {
                              break label152;
                           }
                        }

                        if (var7.field2496 != null) {
                           if (var7.field2496[4] != null) {
                              class388.method3010((long)var6.field1346.field3806, -1, true, (long)var6.field1346.field3806, 0, false, -114, false, var7.field2505, var7.field2507, 1002, -1, var7.field2496[4]);
                           }

                           if (var7.field2496[3] != null) {
                              class388.method3010((long)var6.field1346.field3806, -1, true, (long)var6.field1346.field3806, 0, false, -116, false, var7.field2505, var7.field2507, 1009, -1, var7.field2496[3]);
                           }

                           if (var7.field2496[2] != null) {
                              class388.method3010((long)var6.field1346.field3806, -1, true, (long)var6.field1346.field3806, 0, false, -127, false, var7.field2505, var7.field2507, 1001, -1, var7.field2496[2]);
                           }

                           if (var7.field2496[1] != null) {
                              class388.method3010((long)var6.field1346.field3806, -1, true, (long)var6.field1346.field3806, 0, false, -122, false, var7.field2505, var7.field2507, 1008, -1, var7.field2496[1]);
                           }

                           if (var7.field2496[0] != null) {
                              class388.method3010((long)var6.field1346.field3806, -1, true, (long)var6.field1346.field3806, 0, false, -105, false, var7.field2505, var7.field2507, 1012, -1, var7.field2496[0]);
                           }
                        }

                        if (!var6.field1346.field3802) {
                           var6.field1346.field3802 = true;
                           class161.method1473(class98.field1583, var6.field1346.field3806, var7.field2505);
                        }

                        if (var6.field1346.field3802) {
                           class161.method1473(class323.field4650, var6.field1346.field3806, var7.field2505);
                        }
                     }

                     var6 = (class78)class791.field11560.method2583(1);
                  } while(var6 != null);

               }
            }
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field4594[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!caa",
      name = "a",
      descriptor = "(IBIIIII)V",
      line = 236
   )
   private final void method2482(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field4564;

      try {
         ++field4578;
         long var9 = -1L;
         int var11 = arg5 - -(arg3 << this.field4576.field4081);
         int var12 = (arg0 << this.field4576.field4081) + arg6;
         int var13 = this.field4576.method2287(118, var12, var11);
         if (~(127 & arg5) == -1 || (arg6 & 127) == 0) {
            var9 = 65535L & (long)var11 | (long)var12 << 16 & 65535L << 16;
            class22 var14 = this.field4590.method1572(var9, -16289);
            if (var14 != null) {
               this.method2480(((class499)var14).field7291, 65);
               return;
            }
         }

         short var15 = (short)(this.field4575++);
         if (~var9 != 0L) {
            this.field4590.method1566(new class499(var15), 24742, var9);
         }

         float var17;
         float var18;
         float var19;
         label118: {
            int var16 = -9 % ((70 - arg1) / 46);
            if (arg5 == 0 && arg6 == 0) {
               var17 = this.field4589[arg2][arg4];
               var18 = this.field4584[arg2][arg4];
               var19 = this.field4579[arg2][arg4];
               if (!var8) {
                  break label118;
               }
            }

            if (~this.field4576.field4083 == ~arg5 && arg6 == 0) {
               var19 = this.field4579[arg2 + 1][arg4];
               var18 = this.field4584[arg2 + 1][arg4];
               var17 = this.field4589[arg2 - -1][arg4];
               if (!var8) {
                  break label118;
               }
            }

            if (this.field4576.field4083 != arg5 || this.field4576.field4083 != arg6) {
               if (~arg5 != -1 || ~this.field4576.field4083 != ~arg6) {
                  float var20 = (float)arg5 / (float)this.field4576.field4083;
                  float var21 = (float)arg6 / (float)this.field4576.field4083;
                  float var22 = this.field4579[arg2][arg4];
                  float var23 = this.field4589[arg2][arg4];
                  float var24 = this.field4584[arg2][arg4];
                  float var25 = this.field4579[arg2 + 1][arg4];
                  float var26 = this.field4589[arg2 + 1][arg4];
                  float var27 = this.field4584[arg2 - -1][arg4];
                  float var28 = (this.field4579[arg2 + 1][arg4 - -1] - var25) * var20 + var25;
                  float var29 = (this.field4579[arg2][arg4 + 1] - var22) * var20 + var22;
                  float var30 = (this.field4589[arg2][arg4 + 1] + -var23) * var20 + var23;
                  float var31 = (this.field4589[arg2 + 1][arg4 - -1] + -var26) * var20 + var26;
                  float var32 = (this.field4584[arg2][arg4 + 1] + -var24) * var20 + var24;
                  var19 = (var28 - var29) * var21 + var29;
                  float var33 = (this.field4584[arg2 - -1][arg4 + 1] - var27) * var20 + var27;
                  var17 = (var31 - var30) * var21 + var30;
                  var18 = (-var32 + var33) * var21 + var32;
                  if (!var8) {
                     break label118;
                  }
               }

               var17 = this.field4589[arg2][arg4 - -1];
               var19 = this.field4579[arg2][arg4 + 1];
               var18 = this.field4584[arg2][arg4 + 1];
               if (!var8) {
                  break label118;
               }
            }

            var19 = this.field4579[arg2 - -1][arg4 + 1];
            var17 = this.field4589[arg2 + 1][arg4 - -1];
            var18 = this.field4584[arg2 + 1][arg4 + 1];
         }

         float var34 = (float)(this.field4569.method4560((byte)104) + -var11);
         float var35 = (float)(this.field4569.method4563(1) + -var13);
         float var36 = (float)(-var12 + this.field4569.method4557((byte)-123));
         float var37 = (float)Math.sqrt((double)(var36 * var36 + var34 * var34 + var35 * var35));
         float var38 = 1.0F / var37;
         float var39 = var35 * var38;
         float var40 = var34 * var38;
         float var41 = var36 * var38;
         float var42 = var37 / (float)this.field4569.method4564((byte)-108);
         float var43 = 1.0F - var42 * var42;
         if (var43 < 0.0F) {
            var43 = 0.0F;
         }

         float var44 = var18 * var41 + var17 * var39 + var19 * var40;
         if (var44 < 0.0F) {
            var44 = 0.0F;
         }

         float var45 = var43 * var44 * 2.0F;
         if (var45 > 1.0F) {
            var45 = 1.0F;
         }

         int var46 = this.field4569.method4559((byte)87);
         int var47 = (int)((float)(var46 >> 16 & 255) * var45);
         if (var47 > 255) {
            var47 = 255;
         }

         int var48 = (int)((float)(255 & var46 >> 8) * var45);
         if (~var48 < -256) {
            var48 = 255;
         }

         int var49 = (int)((float)(255 & var46) * var45);
         if (var49 > 255) {
            var49 = 255;
         }

         label70: {
            if (!Stream.method5090()) {
               this.field4571.method5091((float)var11);
               this.field4571.method5091((float)var13);
               this.field4571.method5091((float)var12);
               if (!var8) {
                  break label70;
               }
            }

            this.field4571.method5082((float)var11);
            this.field4571.method5082((float)var13);
            this.field4571.method5082((float)var12);
         }

         label65: {
            if (this.field4586.field5281 != 0) {
               this.field4571.method5084(var47);
               this.field4571.method5084(var48);
               this.field4571.method5084(var49);
               if (!var8) {
                  break label65;
               }
            }

            this.field4571.method5084(var49);
            this.field4571.method5084(var48);
            this.field4571.method5084(var47);
         }

         this.field4571.method5084(255);
         this.method2480(var15, 61);
      } catch (RuntimeException var51) {
         throw class608.method4462(var51, field4594[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!caa",
      name = "a",
      descriptor = "(I)V",
      line = 419
   )
   public static void method2483(int arg0) {
      try {
         field4574 = null;
         field4580 = null;
         field4570 = null;
         if (arg0 != -19887) {
            method2483(98);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field4594[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!caa",
      name = "<init>",
      descriptor = "(Lcs;Lmaa;Lke;[I)V",
      line = 432
   )
   public class317(class357 param1, class494 param2, class622 param3, int[] param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!caa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2484(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 55);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!caa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2485(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 30;
            break;
         case 1:
            var10005 = 10;
            break;
         case 2:
            var10005 = 103;
            break;
         case 3:
            var10005 = 110;
            break;
         default:
            var10005 = 55;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
