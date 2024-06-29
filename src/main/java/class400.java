import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class400 {
   @OriginalMember(
      owner = "client!es",
      name = "c",
      descriptor = "[I"
   )
   private int[] field5886;
   @OriginalMember(
      owner = "client!es",
      name = "b",
      descriptor = "[B"
   )
   private byte[] field5882;
   @OriginalMember(
      owner = "client!es",
      name = "a",
      descriptor = "[I"
   )
   private int[] field5884;
   @OriginalMember(
      owner = "client!es",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5887 = new String[]{method3084(method3083(",<\u001e<\\")), method3084(method3083("2a\u001eV\t")), method3084(method3083("':\\\u0014")), method3084(method3083(",<\u001e;\\")), method3084(method3083(",<\u001eD\u001d'&DF\\")), method3084(method3083(",<\u001e:\\")), method3084(method3083("\u0007 \u0010\u001b\u001b-*G\u0017\u0006-oV\u0017\u0006i+Q\f\u0015i9Q\u0014\u0001,o")), method3084(method3083(",<\u001e9\\"))};
   @OriginalMember(
      owner = "client!es",
      name = "f",
      descriptor = "I"
   )
   public static int field5879;
   @OriginalMember(
      owner = "client!es",
      name = "e",
      descriptor = "I"
   )
   public static int field5880;
   @OriginalMember(
      owner = "client!es",
      name = "g",
      descriptor = "I"
   )
   public static int field5881;
   @OriginalMember(
      owner = "client!es",
      name = "h",
      descriptor = "I"
   )
   public static int field5883;
   @OriginalMember(
      owner = "client!es",
      name = "d",
      descriptor = "I"
   )
   public static int field5885;

   @OriginalMember(
      owner = "client!es",
      name = "a",
      descriptor = "(BI[B[BII)I"
   )
   public final int method3079(byte arg0, int arg1, byte[] arg2, byte[] arg3, int arg4, int arg5) {
      boolean var7 = client.field4564;

      try {
         ++field5885;
         if (arg4 == 0) {
            return 0;
         } else {
            int var21 = arg4 + arg5;
            int var8 = 0;
            int var9 = arg1;

            do {
               byte var10;
               label97: {
                  var10 = arg2[var9];
                  if (var10 < 0) {
                     var8 = this.field5884[var8];
                     if (var7 || !var7) {
                        break label97;
                     }
                  }

                  ++var8;
               }

               int var11;
               if ((var11 = this.field5884[var8]) < 0) {
                  arg3[arg5++] = (byte)(~var11);
                  if (arg5 >= var21) {
                     break;
                  }

                  var8 = 0;
               }

               label165: {
                  if ((var10 & 64) == 0) {
                     ++var8;
                     if (!var7) {
                        break label165;
                     }
                  }

                  var8 = this.field5884[var8];
               }

               int var12;
               if ((var12 = this.field5884[var8]) < 0) {
                  arg3[arg5++] = (byte)(~var12);
                  if (arg5 >= var21) {
                     break;
                  }

                  var8 = 0;
               }

               label159: {
                  if (~(var10 & 32) != -1) {
                     var8 = this.field5884[var8];
                     if (!var7) {
                        break label159;
                     }
                  }

                  ++var8;
               }

               int var13;
               if ((var13 = this.field5884[var8]) < 0) {
                  arg3[arg5++] = (byte)(~var13);
                  if (var21 <= arg5) {
                     break;
                  }

                  var8 = 0;
               }

               label153: {
                  if (~(var10 & 16) != -1) {
                     var8 = this.field5884[var8];
                     if (!var7) {
                        break label153;
                     }
                  }

                  ++var8;
               }

               int var14;
               if (~(var14 = this.field5884[var8]) > -1) {
                  arg3[arg5++] = (byte)(~var14);
                  if (~var21 >= ~arg5) {
                     break;
                  }

                  var8 = 0;
               }

               label147: {
                  if ((var10 & 8) != 0) {
                     var8 = this.field5884[var8];
                     if (!var7) {
                        break label147;
                     }
                  }

                  ++var8;
               }

               int var15;
               if ((var15 = this.field5884[var8]) < 0) {
                  arg3[arg5++] = (byte)(~var15);
                  if (var21 <= arg5) {
                     break;
                  }

                  var8 = 0;
               }

               label141: {
                  if (~(4 & var10) == -1) {
                     ++var8;
                     if (!var7) {
                        break label141;
                     }
                  }

                  var8 = this.field5884[var8];
               }

               int var16;
               if ((var16 = this.field5884[var8]) < 0) {
                  arg3[arg5++] = (byte)(~var16);
                  if (var21 <= arg5) {
                     break;
                  }

                  var8 = 0;
               }

               label135: {
                  if (~(2 & var10) == -1) {
                     ++var8;
                     if (!var7) {
                        break label135;
                     }
                  }

                  var8 = this.field5884[var8];
               }

               int var17;
               if (~(var17 = this.field5884[var8]) > -1) {
                  arg3[arg5++] = (byte)(~var17);
                  if (~var21 >= ~arg5) {
                     break;
                  }

                  var8 = 0;
               }

               label129: {
                  if (~(1 & var10) != -1) {
                     var8 = this.field5884[var8];
                     if (!var7) {
                        break label129;
                     }
                  }

                  ++var8;
               }

               int var18;
               if ((var18 = this.field5884[var8]) < 0) {
                  arg3[arg5++] = (byte)(~var18);
                  if (~var21 >= ~arg5) {
                     break;
                  }

                  var8 = 0;
               }

               ++var9;
            } while(!var7);

            if (arg0 >= -85) {
               this.method3082((byte[])null, -106, 110, -84, 60, (byte[])null);
            }

            return var9 - -1 - arg1;
         }
      } catch (RuntimeException var20) {
         throw class608.method4462(var20, field5887[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5887[1] : field5887[2]) + ',' + (arg3 != null ? field5887[1] : field5887[2]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!es",
      name = "a",
      descriptor = "(I)[Lum;"
   )
   public static final class548[] method3080(int arg0) {
      try {
         int var1 = -2 % ((-33 - arg0) / 58);
         ++field5880;
         return new class548[]{class485.field7041, class485.field7046, class485.field7047, class485.field7048, class485.field7049, class485.field7050, class485.field7051, class485.field7052, class485.field7053, class485.field7054, class485.field7055, class485.field7056, class485.field7057};
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5887[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!es",
      name = "a",
      descriptor = "(Lkk;IILaf;I)V"
   )
   public static final void method3081(class200 arg0, int arg1, int arg2, class457 arg3, int arg4) {
      boolean var5 = client.field4564;

      try {
         ++field5879;
         if ((arg1 & 8192) != 0) {
            int var6 = arg0.method3588(65280);
            arg3.field11241 = arg0.method3572((byte)-94);
            arg3.field11227 = arg0.method3545(117);
            arg3.field11249 = (32768 & var6) != 0;
            arg3.field11294 = 32767 & var6;
            arg3.field11218 = class29.field458 + arg3.field11294 + arg3.field11241;
         }

         byte var7 = -1;
         if ((arg1 & 1024) != 0) {
            int var8 = arg0.method3572((byte)-89);
            int[] var9 = new int[var8];
            int[] var10 = new int[var8];
            int[] var11 = new int[var8];
            int var12 = 0;
            if (var5 || var8 > var12) {
               do {
                  int var13 = arg0.method3525(0);
                  if (var13 == 65535) {
                     var13 = -1;
                  }

                  var9[var12] = var13;
                  var10[var12] = arg0.method3545(95);
                  var11[var12] = arg0.method3588(65280);
                  ++var12;
               } while(var8 > var12);
            }

            class399.method3075(var11, 1, var10, arg3, var9);
         }

         if (~(arg1 & 1) != -1) {
            int var14 = arg0.method3545(123);
            if (var14 > 0) {
               int var15 = 0;
               if (var5 || ~var15 > ~var14) {
                  do {
                     int var16;
                     int var17;
                     int var18;
                     int var19;
                     label261: {
                        var16 = -1;
                        var17 = -1;
                        var18 = arg0.method3586(117);
                        var19 = -1;
                        if (var18 != 32767) {
                           if (var18 != 32766) {
                              var17 = arg0.method3586(116);
                              if (!var5) {
                                 break label261;
                              }
                           }

                           var18 = -1;
                           if (!var5) {
                              break label261;
                           }
                        }

                        var18 = arg0.method3586(117);
                        var17 = arg0.method3586(112);
                        var16 = arg0.method3586(123);
                        var19 = arg0.method3586(123);
                     }

                     int var20 = arg0.method3586(121);
                     int var21 = arg0.method3524(255);
                     arg3.method5584(var17, var16, (byte)-52, var18, var20, var21, var19, class29.field458);
                     ++var15;
                  } while(~var15 > ~var14);
               }
            }
         }

         if (~(2048 & arg1) != -1) {
            int var22 = arg0.method3565(true);
            int var23 = arg0.method3567(31871);
            if (~var22 == -65536) {
               var22 = -1;
            }

            int var24 = arg0.method3572((byte)-99);
            int var25 = 7 & var24;
            int var26 = (124 & var24) >> 3;
            if (var26 == 15) {
               var26 = -1;
            }

            arg3.method5580(var25, 6055, var26, var22, 1, var23);
         }

         if ((arg1 & 262144) != 0) {
            int var27 = arg0.method3572((byte)-89);
            int[] var28 = new int[var27];
            int[] var29 = new int[var27];
            int var30 = 0;
            if (var5 || ~var27 < ~var30) {
               do {
                  int var31 = arg0.method3588(65280);
                  if ((var31 & 49152) == 49152) {
                     int var32 = arg0.method3539(99);
                     var28[var30] = class93.method899(var32, var31 << 16);
                     if (var5) {
                        var28[var30] = var31;
                     }
                  } else {
                     var28[var30] = var31;
                  }

                  var29[var30] = arg0.method3565(true);
                  ++var30;
               } while(~var27 < ~var30);
            }

            arg3.method5585(125, var29, var28);
         }

         if ((arg1 & 256) != 0) {
            label226: {
               arg3.field11238 = arg0.method3566(-16496688);
               if (~arg3.field11238.charAt(0) != -127) {
                  if (class304.field4398 != arg3) {
                     break label226;
                  }

                  class577.method4263(arg3.method3432(-742, false), true, arg3.method3428(true, -2), arg3.field6680, arg3.field11238, 0, 2);
                  if (!var5) {
                     break label226;
                  }
               }

               arg3.field11238 = arg3.field11238.substring(1);
               class577.method4263(arg3.method3432(-742, false), true, arg3.method3428(true, -2), arg3.field6680, arg3.field11238, 0, 2);
            }

            arg3.field11242 = 0;
            arg3.field11281 = 150;
            arg3.field11253 = 0;
         }

         if (~(16 & arg1) != -1) {
            int var33 = arg0.method3588(65280);
            if (var33 == 65535) {
               var33 = -1;
            }

            arg3.field11263 = var33;
         }

         if (~(arg1 & 2) != -1) {
            class171.field2656[arg2] = arg0.method3543(-1132613840);
         }

         if (~(arg1 & 512) != -1) {
            label214: {
               arg3.field11309 = arg0.method3556((byte)-46);
               arg3.field11244 = arg0.method3543(-1132613840);
               arg3.field11292 = arg0.method3543(-1132613840);
               arg3.field11232 = arg0.method3543(-1132613840);
               arg3.field11239 = arg0.method3565(true) - -class29.field458;
               arg3.field11274 = arg0.method3565(true) + class29.field458;
               arg3.field11256 = arg0.method3524(255);
               if (arg3.field6702) {
                  arg3.field11244 += arg3.field6670;
                  arg3.field11232 += arg3.field6670;
                  arg3.field11321 = 0;
                  arg3.field11309 += arg3.field6668;
                  arg3.field11292 += arg3.field6668;
                  if (!var5) {
                     break label214;
                  }
               }

               arg3.field11292 += arg3.field11313[0];
               arg3.field11321 = 1;
               arg3.field11309 += arg3.field11313[0];
               arg3.field11232 += arg3.field11322[0];
               arg3.field11244 += arg3.field11322[0];
            }

            arg3.field11316 = 0;
         }

         if ((arg1 & 8) != 0) {
            arg3.field6671 = arg0.method3588(65280);
            if (~arg3.field11321 == -1) {
               arg3.method5578(-16384, arg3.field6671);
               arg3.field6671 = -1;
            }
         }

         if (~(4096 & arg1) != -1) {
            arg3.field6707 = arg0.method3524(255) == 1;
         }

         if (~(arg1 & 131072) != -1) {
            arg3.field6672 = arg0.method3545(123) == 1;
         }

         if (~(arg1 & 128) != -1) {
            int var34 = arg0.method3524(255);
            byte[] var35 = new byte[var34];
            class473 var36 = new class473(var35);
            arg0.method3563(var34, 0, -1391592696, var35);
            class774.field11341[arg2] = var36;
            arg3.method3433(-67, var36);
         }

         if (arg4 < 57) {
            field5883 = 4;
         }

         if (~(arg1 & 64) != -1) {
            int var37 = arg0.method3525(0);
            if (~var37 == -65536) {
               var37 = -1;
            }

            int var38 = arg0.method3547(false);
            int var39 = arg0.method3545(-64);
            int var40 = var39 & 7;
            int var41 = (var39 & 124) >> 3;
            if (var41 == 15) {
               var41 = -1;
            }

            arg3.method5580(var40, 6055, var41, var37, 0, var38);
         }

         if ((arg1 & 65536) != 0) {
            int var42 = arg0.method3588(65280);
            int var43 = arg0.method3589(66);
            if (~var42 == -65536) {
               var42 = -1;
            }

            int var44 = arg0.method3545(97);
            int var45 = 7 & var44;
            int var46 = (var44 & 122) >> 3;
            if (~var46 == -16) {
               var46 = -1;
            }

            arg3.method5580(var45, 6055, var46, var42, 2, var43);
         }

         if ((32 & arg1) != 0) {
            int[] var47 = new int[4];
            int var48 = 0;
            if (var5) {
               var47[var48] = arg0.method3539(-59);
               if (~var47[var48] == -65536) {
                  var47[var48] = -1;
               }

               ++var48;
            }

            while(true) {
               if (~var48 <= -5) {
                  int var49 = arg0.method3545(78);
                  if (!var5) {
                     class192.method1673(arg3, var49, 0, var47);
                     break;
                  }
               } else {
                  var47[var48] = arg0.method3539(-59);
               }

               if (~var47[var48] == -65536) {
                  var47[var48] = -1;
               }

               ++var48;
            }
         }

         if (~(arg1 & 524288) != -1) {
            arg3.field11291 = arg0.method3556((byte)-46);
            arg3.field11228 = arg0.method3559(-2);
            arg3.field11243 = arg0.method3556((byte)-46);
            arg3.field11272 = (byte)arg0.method3545(83);
            arg3.field11303 = class29.field458 - -arg0.method3539(47);
            arg3.field11237 = class29.field458 - -arg0.method3525(0);
         }

         if ((arg1 & 16384) != 0) {
            var7 = arg0.method3526(false);
         }

         if (arg3.field6702) {
            if (~var7 == -128) {
               arg3.method3437(39, arg3.field6670, arg3.field6668);
            } else {
               byte var50;
               label172: {
                  if (var7 == -1) {
                     var50 = class171.field2656[arg2];
                     if (!var5) {
                        break label172;
                     }
                  }

                  var50 = var7;
               }

               class381.method2966(arg3, false, var50);
               arg3.method3429(arg3.field6668, 0, var50, arg3.field6670);
            }
         }
      } catch (RuntimeException var52) {
         throw class608.method4462(var52, field5887[7] + (arg0 != null ? field5887[1] : field5887[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field5887[1] : field5887[2]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!es",
      name = "<init>",
      descriptor = "([B)V"
   )
   public class400(byte[] arg0) {
      boolean var2 = client.field4564;
      super();

      try {
         int var3 = arg0.length;
         this.field5886 = new int[var3];
         this.field5882 = arg0;
         this.field5884 = new int[8];
         int[] var4 = new int[33];
         int var5 = 0;
         int var6 = 0;
         if (var2 || var3 > var6) {
            label239:
            do {
               byte var7 = arg0[var6];
               if (var7 == 0) {
                  ++var6;
               } else {
                  int var9;
                  int var10;
                  int var10000;
                  label244: {
                     int var8 = 1 << -var7 + 32;
                     var9 = var4[var7];
                     this.field5886[var6] = var9;
                     if (~(var9 & var8) != -1) {
                        var10 = var4[var7 + -1];
                        if (!var2) {
                           break label244;
                        }
                     }

                     label230: {
                        int var11 = var7 - 1;
                        if (var2) {
                           var10000 = var4[var11];
                        } else if (~var11 > -2) {
                           var10000 = var8 | var9;
                           if (!var2) {
                              break label230;
                           }
                        } else {
                           var10000 = var4[var11];
                        }

                        label229:
                        do {
                           while(true) {
                              int var12 = var10000;
                              if (~var9 != ~var12 && !var2) {
                                 var10000 = var8 | var9;
                                 break;
                              }

                              label246: {
                                 int var13 = 1 << -var11 + 32;
                                 if ((var12 & var13) == 0) {
                                    var4[var11] = class93.method899(var13, var12);
                                    if (!var2) {
                                       --var11;
                                       break label246;
                                    }
                                 }

                                 var4[var11] = var4[var11 - 1];
                                 if (!var2) {
                                    var10000 = var8 | var9;
                                    if (!var2) {
                                       break label229;
                                    }
                                    continue;
                                 }

                                 --var11;
                              }

                              if (~var11 > -2) {
                                 var10000 = var8 | var9;
                                 if (!var2) {
                                    break label229;
                                 }
                              } else {
                                 var10000 = var4[var11];
                              }
                           }
                        } while(var2);
                     }

                     var10 = var10000;
                  }

                  var4[var7] = var10;
                  int var14 = var7 - -1;
                  if (var2) {
                     if (var4[var14] == var9) {
                        var4[var14] = var10;
                     }

                     ++var14;
                  }

                  while(true) {
                     while(var14 <= 32) {
                        if (var4[var14] == var9) {
                           var4[var14] = var10;
                        }

                        ++var14;
                     }

                     byte var15 = 0;
                     int var16 = 0;
                     if (!var2) {
                        int var17;
                        int var10001;
                        int var23;
                        if (var2) {
                           var17 = Integer.MIN_VALUE >>> var16;
                           if ((var9 & var17) != 0) {
                              if (this.field5884[var15] == 0) {
                                 this.field5884[var15] = var5;
                              }

                              var23 = this.field5884[var15];
                              if (var2) {
                                 ++var23;
                              }
                           } else {
                              var23 = var15 + 1;
                           }
                        } else {
                           if (var7 <= var16) {
                              this.field5884[var15] = ~var6;
                              var10000 = ~var15;
                              var10001 = ~var5;
                              if (!var2) {
                                 if (var10000 <= var10001) {
                                    var5 = var15 + 1;
                                 }

                                 ++var6;
                                 break;
                              }
                           } else {
                              var10000 = Integer.MIN_VALUE;
                              var10001 = var16;
                           }

                           var17 = var10000 >>> var10001;
                           if ((var9 & var17) != 0) {
                              if (this.field5884[var15] == 0) {
                                 this.field5884[var15] = var5;
                              }

                              var23 = this.field5884[var15];
                              if (var2) {
                                 ++var23;
                              }
                           } else {
                              var23 = var15 + 1;
                           }
                        }

                        while(true) {
                           int var18 = var17 >>> 1;
                           if (~this.field5884.length < ~var23) {
                              ++var16;
                           } else {
                              int[] var19 = new int[this.field5884.length * 2];
                              int var20 = 0;
                              if (var2) {
                                 var19[var20] = this.field5884[var20];
                                 ++var20;
                              }

                              while(true) {
                                 while(~this.field5884.length < ~var20) {
                                    var19[var20] = this.field5884[var20];
                                    ++var20;
                                 }

                                 if (!var2) {
                                    this.field5884 = var19;
                                    ++var16;
                                    break;
                                 }

                                 ++var20;
                              }
                           }

                           if (var7 <= var16) {
                              this.field5884[var23] = ~var6;
                              var10000 = ~var23;
                              var10001 = ~var5;
                              if (!var2) {
                                 if (var10000 <= var10001) {
                                    var5 = var23 + 1;
                                 }

                                 ++var6;
                                 continue label239;
                              }
                           } else {
                              var10000 = Integer.MIN_VALUE;
                              var10001 = var16;
                           }

                           var17 = var10000 >>> var10001;
                           if ((var9 & var17) != 0) {
                              if (this.field5884[var23] == 0) {
                                 this.field5884[var23] = var5;
                              }

                              var23 = this.field5884[var23];
                              if (var2) {
                                 ++var23;
                              }
                           } else {
                              ++var23;
                           }
                        }
                     }

                     ++var14;
                  }
               }
            } while(var3 > var6);

         }
      } catch (RuntimeException var22) {
         throw class608.method4462(var22, field5887[4] + (arg0 != null ? field5887[1] : field5887[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!es",
      name = "a",
      descriptor = "([BIIII[B)I"
   )
   public final int method3082(byte[] arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
      boolean var7 = client.field4564;

      try {
         ++field5881;
         int var8 = 0;
         if (arg4 != -428020381) {
            method3080(-122);
         }

         int var19 = arg1 + arg2;
         int var9 = arg3 << 3;
         int var10000;
         if (var7) {
            var10000 = 255 & arg0[arg2];
         } else if (~var19 >= ~arg2) {
            var10000 = (var9 + 7 >> 3) + -arg3;
            if (!var7) {
               return var10000;
            }
         } else {
            var10000 = 255 & arg0[arg2];
         }

         while(true) {
            int var10 = var10000;
            int var11 = this.field5886[var10];
            byte var12 = this.field5882[var10];
            if (~var12 == -1) {
               throw new RuntimeException(field5887[6] + var10);
            }

            int var13 = var9 >> 3;
            int var14 = var9 & 7;
            int var15 = var8 & -var14 >> 31;
            int var16 = var13 - -(var12 + var14 + -1 >> 3);
            var9 += var12;
            int var20 = var14 + 24;
            arg5[var13] = (byte)(var8 = class93.method899(var15, var11 >>> var20));
            if (var13 < var16) {
               ++var13;
               var14 = var20 - 8;
               arg5[var13] = (byte)(var8 = var11 >>> var14);
               if (~var13 > ~var16) {
                  ++var13;
                  var14 -= 8;
                  arg5[var13] = (byte)(var8 = var11 >>> var14);
                  if (~var16 < ~var13) {
                     var14 -= 8;
                     ++var13;
                     arg5[var13] = (byte)(var8 = var11 >>> var14);
                     if (~var16 < ~var13) {
                        var14 -= 8;
                        ++var13;
                        arg5[var13] = (byte)(var8 = var11 << -var14);
                     }
                  }
               }
            }

            ++arg2;
            if (~var19 >= ~arg2) {
               var10000 = (var9 + 7 >> 3) + -arg3;
               if (!var7) {
                  return var10000;
               }
            } else {
               var10000 = 255 & arg0[arg2];
            }
         }
      } catch (RuntimeException var18) {
         throw class608.method4462(var18, field5887[5] + (arg0 != null ? field5887[1] : field5887[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field5887[1] : field5887[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!es",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3083(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 116);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!es",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3084(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 73;
            break;
         case 1:
            var10005 = 79;
            break;
         case 2:
            var10005 = 48;
            break;
         case 3:
            var10005 = 120;
            break;
         default:
            var10005 = 116;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
