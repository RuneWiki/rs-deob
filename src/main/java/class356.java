import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class356 extends class606 {
   @OriginalMember(
      owner = "client!ki",
      name = "S",
      descriptor = "I"
   )
   private int field5259 = 3216;
   @OriginalMember(
      owner = "client!ki",
      name = "I",
      descriptor = "I"
   )
   private int field5258 = 3216;
   @OriginalMember(
      owner = "client!ki",
      name = "Q",
      descriptor = "[I"
   )
   private int[] field5272 = new int[3];
   @OriginalMember(
      owner = "client!ki",
      name = "N",
      descriptor = "I"
   )
   private int field5268 = 4096;
   @OriginalMember(
      owner = "client!ki",
      name = "P",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5274 = new String[]{method2805(method2804("EjER ")), method2805(method2804("EjEP ")), method2805(method2804("EjE] ")), method2805(method2804("EjEU ")), method2805(method2804("@v\u0007v")), method2805(method2804("EjE[ ")), method2805(method2804("U-E4u")), method2805(method2804("EjEQ ")), method2805(method2804("EjEY ")), method2805(method2804("EjE_ ")), method2805(method2804("EjEW ")), method2805(method2804("EjES "))};
   @OriginalMember(
      owner = "client!ki",
      name = "M",
      descriptor = "Lbu;"
   )
   public static class234 field5269 = new class234(7, 0, 1, 1);
   @OriginalMember(
      owner = "client!ki",
      name = "R",
      descriptor = "Lae;"
   )
   public static class506 field5271 = new class506();
   @OriginalMember(
      owner = "client!ki",
      name = "G",
      descriptor = "I"
   )
   public static int field5257;
   @OriginalMember(
      owner = "client!ki",
      name = "O",
      descriptor = "I"
   )
   public static int field5260;
   @OriginalMember(
      owner = "client!ki",
      name = "K",
      descriptor = "I"
   )
   public static int field5261;
   @OriginalMember(
      owner = "client!ki",
      name = "E",
      descriptor = "I"
   )
   public static int field5262;
   @OriginalMember(
      owner = "client!ki",
      name = "D",
      descriptor = "I"
   )
   public static int field5263;
   @OriginalMember(
      owner = "client!ki",
      name = "U",
      descriptor = "I"
   )
   public static int field5264;
   @OriginalMember(
      owner = "client!ki",
      name = "T",
      descriptor = "I"
   )
   public static int field5265;
   @OriginalMember(
      owner = "client!ki",
      name = "F",
      descriptor = "I"
   )
   public static int field5266;
   @OriginalMember(
      owner = "client!ki",
      name = "J",
      descriptor = "I"
   )
   public static int field5267;
   @OriginalMember(
      owner = "client!ki",
      name = "L",
      descriptor = "Z"
   )
   public static boolean field5270;
   @OriginalMember(
      owner = "client!ki",
      name = "H",
      descriptor = "[I"
   )
   public static int[] field5273;

   @OriginalMember(
      owner = "client!ki",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   public static final void method2797(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      boolean var8 = client.field10022;

      try {
         ++field5261;
         int var9 = 0;
         int var10 = arg0;
         int var11 = 0;
         int var12 = -arg3 + arg6;
         int var13 = -arg3 + arg0;
         int var14 = arg6 * arg6;
         int var15 = arg0 * arg0;
         int var16 = var12 * var12;
         int var17 = var13 * var13;
         int var18 = var15 << 1;
         int var19 = var14 << 1;
         int var20 = var17 << 1;
         int var21 = var16 << 1;
         int var22 = arg0 << 1;
         int var23 = var13 << 1;
         int var24 = (-var22 + 1) * var14 + var18;
         int var25 = -((var22 + -1) * var19) + var15;
         int var26 = (-var23 + 1) * var16 + var20;
         int var27 = -((var23 + -1) * var21) + var17;
         int var28 = var14 << 2;
         int var29 = var15 << 2;
         int var30 = var16 << 2;
         int var31 = var17 << 2;
         int var32 = var18 * 3;
         int var33 = (var22 - 3) * var19;
         int var34 = var20 * 3;
         int var35 = (var23 + -3) * var21;
         int var36 = var29;
         int var37 = (arg0 + -1) * var28;
         int var38 = var31;
         if (arg7 != 1946806796) {
            field5270 = true;
         }

         if (~arg1 <= ~class587.field8239 && arg1 <= class767.field11011) {
            int[] var39 = class788.field11482[arg1];
            int var40 = class437.method3398(class729.field10384, (byte)-23, -arg6 + arg4, class604.field8618);
            int var41 = class437.method3398(class729.field10384, (byte)98, arg4 - -arg6, class604.field8618);
            int var42 = class437.method3398(class729.field10384, (byte)-81, -var12 + arg4, class604.field8618);
            int var43 = class437.method3398(class729.field10384, (byte)-82, arg4 + var12, class604.field8618);
            class100.method989(var40, (byte)22, var42, arg5, var39);
            class100.method989(var42, (byte)22, var43, arg2, var39);
            class100.method989(var43, (byte)22, var41, arg5, var39);
         }

         int var44 = (var13 - 1) * var30;
         int var10000;
         if (var8) {
            var10000 = ~var13 > ~arg0 ? 0 : 1;
         } else {
            if (arg0 <= 0) {
               return;
            }

            var10000 = ~var13 > ~arg0 ? 0 : 1;
         }

         while(true) {
            while(true) {
               int var45;
               label162: {
                  var45 = var10000;
                  if (~var24 > -1) {
                     if (var8) {
                        var24 += var32;
                        var25 += var36;
                        var32 += var29;
                        ++var9;
                        var36 += var29;
                     }
                  } else {
                     var10000 = var45;
                     if (!var8) {
                        break label162;
                     }

                     var36 = var45;
                  }

                  while(true) {
                     while(~var24 > -1) {
                        var24 += var32;
                        var25 += var36;
                        var32 += var29;
                        ++var9;
                        var36 += var29;
                     }

                     var10000 = var45;
                     if (!var8) {
                        break;
                     }

                     var36 = var45;
                  }
               }

               if (var10000 == 0) {
                  if (var25 < 0) {
                     var24 += var32;
                     var25 += var36;
                     ++var9;
                     var32 += var29;
                     var36 += var29;
                  }
               } else {
                  label227: {
                     if (~var26 > -1) {
                        if (var8) {
                           var27 += var38;
                           var26 += var34;
                           ++var11;
                           var38 += var31;
                           var34 += var31;
                        }
                     } else {
                        var10000 = ~var27;
                        if (!var8) {
                           if (var10000 > -1) {
                              var27 += var38;
                              var26 += var34;
                              var34 += var31;
                              ++var11;
                              var38 += var31;
                           }

                           var27 += -var35;
                           var26 += -var44;
                           var44 -= var30;
                           var35 -= var30;
                           if (var25 < 0) {
                              var24 += var32;
                              var25 += var36;
                              ++var9;
                              var32 += var29;
                              var36 += var29;
                           }
                           break label227;
                        }

                        var34 = var10000 + -1;
                     }

                     while(true) {
                        while(~var26 > -1) {
                           var27 += var38;
                           var26 += var34;
                           ++var11;
                           var38 += var31;
                           var34 += var31;
                        }

                        var10000 = ~var27;
                        if (!var8) {
                           if (var10000 > -1) {
                              var27 += var38;
                              var26 += var34;
                              var34 += var31;
                              ++var11;
                              var38 += var31;
                           }

                           var27 += -var35;
                           var26 += -var44;
                           var44 -= var30;
                           var35 -= var30;
                           if (var25 < 0) {
                              var24 += var32;
                              var25 += var36;
                              ++var9;
                              var32 += var29;
                              var36 += var29;
                           }
                           break;
                        }

                        var34 = var10000 + -1;
                     }
                  }
               }

               var24 += -var37;
               var25 += -var33;
               --var10;
               var33 -= var28;
               var37 -= var28;
               int var46 = arg1 - var10;
               int var47 = arg1 - -var10;
               if (~var47 <= ~class587.field8239) {
                  int var10001 = class767.field11011;
                  if (var8) {
                     var10000 = var46 > var10001 ? 0 : 1;
                     continue;
                  }

                  if (var46 <= var10001) {
                     int var48 = class437.method3398(class729.field10384, (byte)-56, arg4 + var9, class604.field8618);
                     int var49 = class437.method3398(class729.field10384, (byte)-52, -var9 + arg4, class604.field8618);
                     if (var45 != 0) {
                        int var50 = class437.method3398(class729.field10384, (byte)-32, arg4 + var11, class604.field8618);
                        int var51 = class437.method3398(class729.field10384, (byte)126, -var11 + arg4, class604.field8618);
                        if (class587.field8239 <= var46) {
                           int[] var52 = class788.field11482[var46];
                           class100.method989(var49, (byte)22, var51, arg5, var52);
                           class100.method989(var51, (byte)22, var50, arg2, var52);
                           class100.method989(var50, (byte)22, var48, arg5, var52);
                        }

                        if (~var47 >= ~class767.field11011) {
                           int[] var53 = class788.field11482[var47];
                           class100.method989(var49, (byte)22, var51, arg5, var53);
                           class100.method989(var51, (byte)22, var50, arg2, var53);
                           class100.method989(var50, (byte)22, var48, arg5, var53);
                           if (var8) {
                              if (~var46 <= ~class587.field8239) {
                                 class100.method989(var49, (byte)22, var48, arg5, class788.field11482[var46]);
                              }

                              if (~var47 >= ~class767.field11011) {
                                 class100.method989(var49, (byte)22, var48, arg5, class788.field11482[var47]);
                              }
                           }
                        }
                     } else {
                        if (~var46 <= ~class587.field8239) {
                           class100.method989(var49, (byte)22, var48, arg5, class788.field11482[var46]);
                        }

                        if (~var47 >= ~class767.field11011) {
                           class100.method989(var49, (byte)22, var48, arg5, class788.field11482[var47]);
                        }
                     }
                  }
               }

               if (var10 <= 0) {
                  return;
               }

               var10000 = ~var13 > ~var10 ? 0 : 1;
            }
         }
      } catch (RuntimeException var55) {
         throw class612.method4503(var55, field5274[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ki",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method9(int arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         if (arg0 != 0) {
            this.field5268 = -18;
         }

         ++field5265;
         int[] var4 = super.field8645.method2632(arg1, arg0 + 27230);
         if (super.field8645.field4884) {
            int var5 = class790.field11509 * this.field5268 >> 12;
            int[] var6 = this.method4463(class801.field11660 & arg1 + -1, 13064, 0);
            int[] var7 = this.method4463(arg1, 13064, 0);
            int[] var8 = this.method4463(arg1 + 1 & class801.field11660, arg0 ^ 13064, 0);
            int var9 = 0;
            if (var3 || ~var9 > ~class563.field8014) {
               do {
                  int var10 = (var8[var9] + -var6[var9]) * var5 >> 12;
                  int var11 = (var7[var9 + -1 & class358.field5293] - var7[class358.field5293 & var9 + 1]) * var5 >> 12;
                  int var12 = var11 >> 4;
                  if (~var12 > -1) {
                     var12 = -var12;
                  }

                  int var13 = var10 >> 4;
                  if (var13 < 0) {
                     var13 = -var13;
                  }

                  if (~var12 < -256) {
                     var12 = 255;
                  }

                  if (~var13 < -256) {
                     var13 = 255;
                  }

                  int var14 = class550.field7858[((var13 + 1) * var13 >> 1) + var12] & 255;
                  int var15 = var14 * 4096 >> 8;
                  int var16 = var11 * var14 >> 8;
                  int var17 = var10 * var14 >> 8;
                  int var18 = this.field5272[1] * var17 >> 12;
                  int var19 = this.field5272[0] * var16 >> 12;
                  int var20 = this.field5272[2] * var15 >> 12;
                  var4[var9] = var18 - -var20 + var19;
                  ++var9;
               } while(~var9 > ~class563.field8014);
            }
         }

         return var4;
      } catch (RuntimeException var22) {
         throw class612.method4503(var22, field5274[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ki",
      name = "<init>",
      descriptor = "()V"
   )
   public class356() {
      super(1, true);
   }

   @OriginalMember(
      owner = "client!ki",
      name = "h",
      descriptor = "(I)V"
   )
   public static void method2798(int arg0) {
      try {
         field5273 = null;
         field5269 = null;
         if (arg0 != 6276) {
            field5273 = null;
         }

         field5271 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field5274[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ki",
      name = "c",
      descriptor = "(B)V"
   )
   public final void method270(byte arg0) {
      try {
         this.method2799(-23915);
         if (arg0 < 118) {
            field5269 = null;
         }

         ++field5262;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field5274[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ki",
      name = "a",
      descriptor = "(Lcu;II)V"
   )
   public final void method8(class65 arg0, int arg1, int arg2) {
      try {
         if (arg2 > -6) {
            method2797(-64, -94, -13, 125, 95, -39, -106, -30);
         }

         ++field5266;
         if (~arg1 != -1) {
            if (arg1 == 1) {
               this.field5258 = arg0.method685(-2);
               return;
            }

            if (~arg1 != -3) {
               return;
            }

            if (!client.field10022) {
               this.field5259 = arg0.method685(-2);
               return;
            }
         }

         this.field5268 = arg0.method685(-2);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field5274[5] + (arg0 != null ? field5274[6] : field5274[4]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ki",
      name = "g",
      descriptor = "(I)V"
   )
   private final void method2799(int arg0) {
      try {
         ++field5264;
         double var2 = Math.cos((double)((float)this.field5259 / 4096.0F));
         this.field5272[0] = (int)(Math.sin((double)((float)this.field5258 / 4096.0F)) * var2 * 4096.0D);
         this.field5272[1] = (int)(4096.0D * Math.cos((double)((float)this.field5258 / 4096.0F)) * var2);
         this.field5272[2] = (int)(4096.0D * Math.sin((double)((float)this.field5259 / 4096.0F)));
         int var4 = this.field5272[0] * this.field5272[0] >> 12;
         int var5 = this.field5272[1] * this.field5272[1] >> 12;
         if (arg0 != -23915) {
            method2803(-9);
         }

         int var6 = this.field5272[2] * this.field5272[2] >> 12;
         int var7 = (int)(4096.0D * Math.sqrt((double)(var4 + var5 + var6 >> 12)));
         if (~var7 != -1) {
            this.field5272[2] = (this.field5272[2] << 12) / var7;
            this.field5272[0] = (this.field5272[0] << 12) / var7;
            this.field5272[1] = (this.field5272[1] << 12) / var7;
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field5274[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ki",
      name = "c",
      descriptor = "(II)I"
   )
   public static final int method2800(int arg0, int arg1) {
      try {
         if (arg1 != 1021309959) {
            return -39;
         } else {
            ++field5260;
            return arg0 >>> 7;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field5274[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ki",
      name = "a",
      descriptor = "(ZI)V"
   )
   public static final void method2801(boolean arg0, int arg1) {
      try {
         if (!arg0) {
            field5270 = true;
         }

         class171.field2567 = new int[arg1];
         class393.field5710 = new int[arg1];
         class540.field7579 = new int[arg1];
         ++field5263;
         class737.field10502 = new int[arg1];
         class123.field1974 = new int[arg1];
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field5274[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ki",
      name = "a",
      descriptor = "(BZ)V"
   )
   public static final void method2802(byte param0, boolean param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ki",
      name = "f",
      descriptor = "(I)Z"
   )
   public static final boolean method2803(int arg0) {
      boolean var1 = client.field10022;

      try {
         ++field5257;
         class173 var2 = (class173)class8.field147.method2245((byte)-94);
         if (var2 == null) {
            return false;
         } else {
            if (arg0 != -32068) {
               field5270 = true;
            }

            int var3 = 0;
            if (var1) {
               if (var2.field2586[var3] != null && ~var2.field2586[var3].field1526 == -1) {
                  return false;
               }

               if (var2.field2587[var3] != null) {
                  if (var2.field2587[var3].field1526 == 0) {
                     return false;
                  }

                  ++var3;
               } else {
                  ++var3;
               }
            }

            while(true) {
               while(var3 < var2.field2580) {
                  if (var2.field2586[var3] != null && ~var2.field2586[var3].field1526 == -1) {
                     return false;
                  }

                  if (var2.field2587[var3] != null) {
                     if (var2.field2587[var3].field1526 == 0) {
                        return false;
                     }

                     ++var3;
                  } else {
                     ++var3;
                  }
               }

               if (!var1) {
                  return true;
               }

               if (false) {
                  return false;
               }

               ++var3;
            }
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field5274[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ki",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2804(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 8);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ki",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2805(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 46;
            break;
         case 1:
            var10005 = 3;
            break;
         case 2:
            var10005 = 107;
            break;
         case 3:
            var10005 = 26;
            break;
         default:
            var10005 = 8;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
