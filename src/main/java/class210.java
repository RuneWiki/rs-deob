import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ega")
public class class210 extends class70 {
   @OriginalMember(
      owner = "client!ega",
      name = "O",
      descriptor = "[B"
   )
   private byte[] field2662 = new byte[512];
   @OriginalMember(
      owner = "client!ega",
      name = "U",
      descriptor = "I"
   )
   public int field2664 = 0;
   @OriginalMember(
      owner = "client!ega",
      name = "Q",
      descriptor = "I"
   )
   public int field2665 = 4;
   @OriginalMember(
      owner = "client!ega",
      name = "S",
      descriptor = "I"
   )
   public int field2670 = 4;
   @OriginalMember(
      owner = "client!ega",
      name = "J",
      descriptor = "Z"
   )
   public boolean field2671 = true;
   @OriginalMember(
      owner = "client!ega",
      name = "R",
      descriptor = "I"
   )
   public int field2660 = 4;
   @OriginalMember(
      owner = "client!ega",
      name = "L",
      descriptor = "I"
   )
   public int field2675 = 1638;
   @OriginalMember(
      owner = "client!ega",
      name = "cb",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2680 = new String[]{method1733(method1732("\u001bw[M")), method1733(method1732("\u0010eV\u000f+]")), method1733(method1732("\u000e,\u0019\u000f\u0015")), method1733(method1732("\u0010eV\u000f,]")), method1733(method1732("\u0010eV\u000f-]")), method1733(method1732("\u0010eV\u000f ]")), method1733(method1732("\u0010eV\u000f$]")), method1733(method1732("\u0010eV\u000f']")), method1733(method1732("\u0010eV\u000f\"]")), method1733(method1732("\u0010eV\u000f/]"))};
   @OriginalMember(
      owner = "client!ega",
      name = "N",
      descriptor = "Lse;"
   )
   public static class6 field2669 = new class6(44, 6);
   @OriginalMember(
      owner = "client!ega",
      name = "K",
      descriptor = "Ljava/math/BigInteger;"
   )
   public static BigInteger field2678 = new BigInteger(method1733(method1732("D2\u0007\u0011Y")), 16);
   @OriginalMember(
      owner = "client!ega",
      name = "I",
      descriptor = "[I"
   )
   public static int[] field2679 = new int[5];
   @OriginalMember(
      owner = "client!ega",
      name = "X",
      descriptor = "I"
   )
   public static int field2661;
   @OriginalMember(
      owner = "client!ega",
      name = "V",
      descriptor = "I"
   )
   public static int field2663;
   @OriginalMember(
      owner = "client!ega",
      name = "Z",
      descriptor = "I"
   )
   public static int field2666;
   @OriginalMember(
      owner = "client!ega",
      name = "Y",
      descriptor = "I"
   )
   public static int field2667;
   @OriginalMember(
      owner = "client!ega",
      name = "T",
      descriptor = "I"
   )
   public static int field2668;
   @OriginalMember(
      owner = "client!ega",
      name = "P",
      descriptor = "I"
   )
   public static int field2674;
   @OriginalMember(
      owner = "client!ega",
      name = "bb",
      descriptor = "I"
   )
   public static int field2676;
   @OriginalMember(
      owner = "client!ega",
      name = "ab",
      descriptor = "I"
   )
   public static int field2677;
   @OriginalMember(
      owner = "client!ega",
      name = "M",
      descriptor = "[S"
   )
   private short[] field2672;
   @OriginalMember(
      owner = "client!ega",
      name = "W",
      descriptor = "[S"
   )
   private short[] field2673;

   @OriginalMember(
      owner = "client!ega",
      name = "<init>",
      descriptor = "()V"
   )
   public class210() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!ega",
      name = "a",
      descriptor = "(ZZ)Z"
   )
   public static final boolean method1727(boolean arg0, boolean arg1) {
      try {
         ++field2661;
         if (!arg1) {
            return false;
         } else {
            boolean var2 = class629.field9294.method399();
            if (arg0 == var2) {
               return true;
            } else {
               label43: {
                  if (arg0) {
                     if (class629.field9294.method440()) {
                        break label43;
                     }

                     arg0 = false;
                     if (!client.field1481) {
                        break label43;
                     }
                  }

                  class629.field9294.method438();
               }

               if (!arg0 == !var2) {
                  return false;
               } else {
                  class757.field11093.method5438(arg1, class757.field11093.field11000, !arg0 ? 0 : 1);
                  class654.method4804((byte)-87);
                  return true;
               }
            }
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field2680[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ega",
      name = "a",
      descriptor = "(ILgea;I)V"
   )
   public final void method550(int arg0, class66 arg1, int arg2) {
      boolean var4 = client.field1481;

      try {
         label120: {
            label125: {
               label126: {
                  label117: {
                     label127: {
                        ++field2667;
                        if (~arg2 != -1) {
                           if (~arg2 == -2) {
                              break label127;
                           }

                           if (~arg2 == -3) {
                              break label117;
                           }

                           if (~arg2 == -4) {
                              this.field2670 = this.field2665 = arg1.method640(255);
                              if (!var4) {
                                 break label120;
                              }
                              break label126;
                           }

                           if (~arg2 == -5) {
                              break label126;
                           }

                           if (arg2 == 5) {
                              this.field2670 = arg1.method640(255);
                              if (!var4) {
                                 break label120;
                              }
                              break label125;
                           }

                           if (arg2 != 6) {
                              break label120;
                           }

                           if (!var4) {
                              break label125;
                           }
                        }

                        this.field2671 = arg1.method640(255) == 1;
                        if (!var4) {
                           break label120;
                        }
                     }

                     this.field2660 = arg1.method640(255);
                     if (!var4) {
                        break label120;
                     }
                  }

                  this.field2675 = arg1.method652((byte)72);
                  if (~this.field2675 <= -1) {
                     break label120;
                  }

                  this.field2672 = new short[this.field2660];
                  int var6 = 0;
                  if (var4) {
                     this.field2672[var6] = (short)arg1.method652((byte)45);
                     ++var6;
                  }

                  while(true) {
                     while(var6 < this.field2660) {
                        this.field2672[var6] = (short)arg1.method652((byte)45);
                        ++var6;
                     }

                     if (!var4) {
                        if (!var4) {
                           break label120;
                        }

                        this.field2670 = this.field2665 = arg1.method640(255);
                        if (!var4) {
                           break label120;
                        }
                        break;
                     }

                     ++var6;
                  }
               }

               this.field2664 = arg1.method640(255);
               if (!var4) {
                  break label120;
               }

               this.field2670 = arg1.method640(255);
               if (!var4) {
                  break label120;
               }
            }

            this.field2665 = arg1.method640(255);
         }

         if (arg0 > -34) {
            this.method550(100, (class66)null, 33);
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field2680[1] + arg0 + ',' + (arg1 != null ? field2680[2] : field2680[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ega",
      name = "a",
      descriptor = "(Z[II)V"
   )
   public final void method1728(boolean arg0, int[] arg1, int arg2) {
      boolean var4 = client.field1481;

      try {
         if (arg0) {
            ++field2666;
            int var5 = class502.field6979[arg2] * this.field2665;
            if (this.field2660 != 1) {
               short var6 = this.field2672[0];
               if (~var6 < -9 || var6 < -8) {
                  int var7 = this.field2673[0] << 12;
                  int var8 = this.field2665 * var7 >> 12;
                  int var9 = var5 * var7 >> 12;
                  int var10 = this.field2670 * var7 >> 12;
                  int var11 = var9 >> 12;
                  int var12 = var11 + 1;
                  if (~var8 >= ~var12) {
                     var12 = 0;
                  }

                  int var13 = var9 & 4095;
                  int var14 = this.field2662[var11 & 255] & 255;
                  int var15 = class22.field336[var13];
                  int var16 = 255 & this.field2662[var12 & 255];
                  int var17 = 0;
                  if (var4 || ~class262.field3328 < ~var17) {
                     do {
                        int var18 = class17.field290[var17] * this.field2670;
                        int var19 = this.method1729(var14, var10, var15, var16, 255, var13, var7 * var18 >> 12);
                        arg1[var17] = var6 * var19 >> 12;
                        ++var17;
                     } while(~class262.field3328 < ~var17);
                  }
               }

               int var20 = 1;
               if (var4) {
                  var6 = this.field2672[var20];
               } else if (~var20 <= ~this.field2660) {
                  if (!var4) {
                     return;
                  }
               } else {
                  var6 = this.field2672[var20];
               }

               while(true) {
                  label183: {
                     int var21;
                     int var22;
                     int var23;
                     int var24;
                     int var25;
                     int var26;
                     if (var6 <= 8) {
                        if (~var6 <= 7) {
                           ++var20;
                           break label183;
                        }

                        var21 = this.field2673[var20] << 12;
                        var22 = var5 * var21 >> 12;
                        var23 = this.field2670 * var21 >> 12;
                        var24 = this.field2665 * var21 >> 12;
                        var25 = var22 >> 12;
                        var26 = var25 + 1;
                        if (~var26 <= ~var24) {
                           var26 = 0;
                        }
                     } else {
                        var21 = this.field2673[var20] << 12;
                        var22 = var5 * var21 >> 12;
                        var23 = this.field2670 * var21 >> 12;
                        var24 = this.field2665 * var21 >> 12;
                        var25 = var22 >> 12;
                        var26 = var25 + 1;
                        if (~var26 <= ~var24) {
                           var26 = 0;
                        }
                     }

                     int var27;
                     int var28;
                     int var29;
                     int var30;
                     int var34;
                     int var35;
                     int var36;
                     int var37;
                     label184: {
                        var27 = var22 & 4095;
                        var28 = class22.field336[var27];
                        var29 = this.field2662[255 & var26] & 255;
                        var30 = this.field2662[255 & var25] & 255;
                        int var31;
                        int var32;
                        int var33;
                        if (this.field2671) {
                           if (~(this.field2660 + -1) == ~var20) {
                              var34 = 0;
                              if (var4) {
                                 var35 = class17.field290[var34] * this.field2670;
                                 var36 = this.method1729(var30, var23, var28, var29, 255, var27, var21 * var35 >> 12);
                                 var37 = arg1[var34] - -(var6 * var36 >> 12);
                                 arg1[var34] = (var37 >> 1) + 2048;
                                 ++var34;
                              }
                              break label184;
                           }

                           var31 = 0;
                           if (var4) {
                              var32 = class17.field290[var31] * this.field2670;
                              var33 = this.method1729(var30, var23, var28, var29, 255, var27, var21 * var32 >> 12);
                              arg1[var31] += var6 * var33 >> 12;
                              ++var31;
                           }
                        } else {
                           var31 = 0;
                           if (var4) {
                              var32 = class17.field290[var31] * this.field2670;
                              var33 = this.method1729(var30, var23, var28, var29, 255, var27, var21 * var32 >> 12);
                              arg1[var31] += var6 * var33 >> 12;
                              ++var31;
                           }
                        }

                        while(var31 < class262.field3328) {
                           var32 = class17.field290[var31] * this.field2670;
                           var33 = this.method1729(var30, var23, var28, var29, 255, var27, var21 * var32 >> 12);
                           arg1[var31] += var6 * var33 >> 12;
                           ++var31;
                        }

                        if (!var4) {
                           ++var20;
                           break label183;
                        }

                        var34 = 0;
                        if (var4) {
                           var35 = class17.field290[var34] * this.field2670;
                           var36 = this.method1729(var30, var23, var28, var29, 255, var27, var21 * var35 >> 12);
                           var37 = arg1[var34] - -(var6 * var36 >> 12);
                           arg1[var34] = (var37 >> 1) + 2048;
                           ++var34;
                        }
                     }

                     while(var34 < class262.field3328) {
                        var35 = class17.field290[var34] * this.field2670;
                        var36 = this.method1729(var30, var23, var28, var29, 255, var27, var21 * var35 >> 12);
                        var37 = arg1[var34] - -(var6 * var36 >> 12);
                        arg1[var34] = (var37 >> 1) + 2048;
                        ++var34;
                     }

                     ++var20;
                  }

                  if (~var20 <= ~this.field2660) {
                     if (!var4) {
                        return;
                     }
                  } else {
                     var6 = this.field2672[var20];
                  }
               }
            } else {
               short var38 = this.field2672[0];
               int var39 = this.field2673[0] << 12;
               int var40 = var5 * var39 >> 12;
               int var41 = this.field2670 * var39 >> 12;
               int var42 = this.field2665 * var39 >> 12;
               int var43 = var40 >> 12;
               int var44 = var43 + 1;
               int var45 = var40 & 4095;
               if (var44 >= var42) {
                  var44 = 0;
               }

               int var46 = this.field2662[255 & var44] & 255;
               int var47 = 255 & this.field2662[255 & var43];
               int var48 = class22.field336[var45];
               if (!this.field2671) {
                  int var53 = 0;
                  if (var4 || class262.field3328 > var53) {
                     do {
                        int var54 = class17.field290[var53] * this.field2670;
                        int var55 = this.method1729(var47, var41, var48, var46, 255, var45, var39 * var54 >> 12);
                        arg1[var53] = var38 * var55 >> 12;
                        ++var53;
                     } while(class262.field3328 > var53);

                  }
               } else {
                  int var49 = 0;
                  if (var4 || ~class262.field3328 < ~var49) {
                     do {
                        int var50 = class17.field290[var49] * this.field2670;
                        int var51 = this.method1729(var47, var41, var48, var46, 255, var45, var39 * var50 >> 12);
                        int var52 = var38 * var51 >> 12;
                        arg1[var49] = (var52 >> 1) + 2048;
                        ++var49;
                     } while(~class262.field3328 < ~var49);

                  }
               }
            }
         }
      } catch (RuntimeException var57) {
         throw class93.method866(var57, field2680[9] + arg0 + ',' + (arg1 != null ? field2680[2] : field2680[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ega",
      name = "a",
      descriptor = "(IIIIIII)I"
   )
   private final int method1729(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field1481;

      try {
         ++field2668;
         int var9 = arg6 >> 12;
         int var10 = var9 + 1;
         if (~var10 <= ~arg1) {
            var10 = 0;
         }

         int var11;
         int var12;
         int var13;
         int var14;
         int var15;
         int var17;
         int var28;
         label96: {
            var28 = arg6 & 4095;
            var11 = var9 & 255;
            var12 = var28 + -4096;
            var13 = arg5 + -4096;
            var14 = var10 & arg4;
            var15 = class22.field336[var28];
            int var16 = this.field2662[arg0 + var11] & 3;
            if (~var16 >= -2) {
               var17 = var16 == 0 ? arg5 + var28 : -var28 + arg5;
               if (!var8) {
                  break label96;
               }
            }

            var17 = ~var16 == -3 ? -arg5 + var28 : -arg5 + -var28;
         }

         int var19;
         label97: {
            int var18 = this.field2662[arg0 + var14] & 3;
            if (~var18 < -2) {
               var19 = var18 != 2 ? -arg5 + -var12 : -arg5 + var12;
               if (!var8) {
                  break label97;
               }
            }

            var19 = var18 == 0 ? arg5 + var12 : -var12 + arg5;
         }

         int var21;
         int var22;
         label98: {
            int var20 = this.field2662[arg3 + var11] & 3;
            var21 = ((-var17 + var19) * var15 >> 12) + var17;
            if (var20 > 1) {
               var22 = ~var20 != -3 ? -var28 + -var13 : -var13 + var28;
               if (!var8) {
                  break label98;
               }
            }

            var22 = var20 != 0 ? -var28 + var13 : var28 + var13;
         }

         int var24;
         label99: {
            int var23 = this.field2662[arg3 + var14] & 3;
            if (~var23 < -2) {
               var24 = var23 != 2 ? -var12 - var13 : var12 - var13;
               if (!var8) {
                  break label99;
               }
            }

            var24 = var23 == 0 ? var12 - -var13 : -var12 + var13;
         }

         int var25 = ((-var22 + var24) * var15 >> 12) + var22;
         return ((-var21 + var25) * arg2 >> 12) + var21;
      } catch (RuntimeException var27) {
         throw class93.method866(var27, field2680[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ega",
      name = "j",
      descriptor = "(I)V"
   )
   public static void method1730(int arg0) {
      try {
         field2669 = null;
         if (arg0 != 8) {
            method1730(-95);
         }

         field2679 = null;
         field2678 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field2680[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ega",
      name = "a",
      descriptor = "(BI)[I"
   )
   public final int[] method331(byte arg0, int arg1) {
      try {
         ++field2674;
         int[] var3 = super.field940.method119(false, arg1);
         if (super.field940.field270) {
            this.method1728(true, var3, arg1);
         }

         if (arg0 != -63) {
            this.field2671 = true;
         }

         return var3;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field2680[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ega",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method552(int arg0) {
      boolean var2 = client.field1481;

      try {
         this.field2662 = class535.method4064((byte)101, this.field2664);
         ++field2663;
         this.method1731(-79);
         int var3 = this.field2660 - 1;
         if (arg0 > -36) {
            this.method1728(true, (int[])null, 86);
            if (!var2 && var3 < 1) {
               return;
            }
         } else if (var3 < 1) {
            return;
         }

         do {
            short var4 = this.field2672[var3];
            if (~var4 < -9 || var4 < -8) {
               return;
            }

            --this.field2660;
            --var3;
         } while(var3 >= 1);

      } catch (RuntimeException var6) {
         throw class93.method866(var6, field2680[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ega",
      name = "i",
      descriptor = "(I)V"
   )
   private final void method1731(int arg0) {
      boolean var2 = client.field1481;

      try {
         label59: {
            int var3 = 52 % ((arg0 - 7) / 53);
            if (this.field2675 > 0) {
               this.field2672 = new short[this.field2660];
               this.field2673 = new short[this.field2660];
               int var4 = 0;
               if (var2) {
                  this.field2672[var4] = (short)((int)(4096.0D * Math.pow((double)((float)this.field2675 / 4096.0F), (double)var4)));
                  this.field2673[var4] = (short)((int)Math.pow(2.0D, (double)var4));
                  ++var4;
               }

               while(true) {
                  while(var4 < this.field2660) {
                     this.field2672[var4] = (short)((int)(4096.0D * Math.pow((double)((float)this.field2675 / 4096.0F), (double)var4)));
                     this.field2673[var4] = (short)((int)Math.pow(2.0D, (double)var4));
                     ++var4;
                  }

                  if (!var2) {
                     if (!var2) {
                        break label59;
                     }
                     break;
                  }

                  ++var4;
               }
            }

            if (this.field2672 != null && this.field2672.length == this.field2660) {
               this.field2673 = new short[this.field2660];
               int var5 = 0;
               if (var2 || ~this.field2660 < ~var5) {
                  do {
                     this.field2673[var5] = (short)((int)Math.pow(2.0D, (double)var5));
                     ++var5;
                  } while(~this.field2660 < ~var5);
               }
            }
         }

         ++field2677;
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field2680[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ega",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1732(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 104);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ega",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1733(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 117;
            break;
         case 1:
            var10005 = 2;
            break;
         case 2:
            var10005 = 55;
            break;
         case 3:
            var10005 = 33;
            break;
         default:
            var10005 = 104;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
