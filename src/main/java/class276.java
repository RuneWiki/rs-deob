import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public class class276 extends class213 {
   @OriginalMember(
      owner = "client!oca",
      name = "E",
      descriptor = "I"
   )
   public int field3676 = 4;
   @OriginalMember(
      owner = "client!oca",
      name = "V",
      descriptor = "Z"
   )
   public boolean field3684 = true;
   @OriginalMember(
      owner = "client!oca",
      name = "W",
      descriptor = "[B"
   )
   private byte[] field3677 = new byte[512];
   @OriginalMember(
      owner = "client!oca",
      name = "X",
      descriptor = "I"
   )
   public int field3679 = 4;
   @OriginalMember(
      owner = "client!oca",
      name = "K",
      descriptor = "I"
   )
   public int field3688 = 4;
   @OriginalMember(
      owner = "client!oca",
      name = "G",
      descriptor = "I"
   )
   public int field3681 = 0;
   @OriginalMember(
      owner = "client!oca",
      name = "N",
      descriptor = "I"
   )
   public int field3690 = 1638;
   @OriginalMember(
      owner = "client!oca",
      name = "J",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3692 = new String[]{method2105(method2104("NZ2K")), method2105(method2104("[\u0001p\t|")), method2105(method2104("OL?\tF\b")), method2105(method2104("OL?\tB\b")), method2105(method2104("OL?\tE\b")), method2105(method2104("OL?\tC\b")), method2105(method2104("OL?\tJ\b")), method2105(method2104("OL?\t@\b")), method2105(method2104("OL?\tG\b")), method2105(method2104("OL?\tD\b"))};
   @OriginalMember(
      owner = "client!oca",
      name = "F",
      descriptor = "Ltv;"
   )
   public static class590 field3680 = new class590(8);
   @OriginalMember(
      owner = "client!oca",
      name = "R",
      descriptor = "I"
   )
   public static int field3673;
   @OriginalMember(
      owner = "client!oca",
      name = "P",
      descriptor = "I"
   )
   public static int field3674;
   @OriginalMember(
      owner = "client!oca",
      name = "L",
      descriptor = "I"
   )
   public static int field3682;
   @OriginalMember(
      owner = "client!oca",
      name = "U",
      descriptor = "I"
   )
   public static int field3683;
   @OriginalMember(
      owner = "client!oca",
      name = "D",
      descriptor = "I"
   )
   public static int field3685;
   @OriginalMember(
      owner = "client!oca",
      name = "I",
      descriptor = "I"
   )
   public static int field3686;
   @OriginalMember(
      owner = "client!oca",
      name = "H",
      descriptor = "I"
   )
   public static int field3687;
   @OriginalMember(
      owner = "client!oca",
      name = "M",
      descriptor = "I"
   )
   public static int field3689;
   @OriginalMember(
      owner = "client!oca",
      name = "S",
      descriptor = "I"
   )
   public static int field3691;
   @OriginalMember(
      owner = "client!oca",
      name = "T",
      descriptor = "[S"
   )
   private short[] field3675;
   @OriginalMember(
      owner = "client!oca",
      name = "Q",
      descriptor = "[S"
   )
   private short[] field3678;

   @OriginalMember(
      owner = "client!oca",
      name = "a",
      descriptor = "(IIIIIII)I"
   )
   private final int method2098(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field4273;

      try {
         ++field3674;
         int var9 = arg4 >> 12;
         int var10 = var9 + 1;
         if (~arg1 >= ~var10) {
            var10 = 0;
         }

         int var11;
         int var12;
         int var13;
         int var14;
         int var15;
         int var17;
         int var28;
         label100: {
            var28 = arg4 & 4095;
            var11 = var9 & 255;
            var12 = var28 + -4096;
            var13 = arg3 + -4096;
            var14 = var10 & 255;
            var15 = class628.field8813[var28];
            int var16 = this.field3677[var11 - -arg0] & 3;
            if (var16 > 1) {
               var17 = var16 == 2 ? -arg3 + var28 : -arg3 + -var28;
               if (!var8) {
                  break label100;
               }
            }

            var17 = var16 != 0 ? -var28 + arg3 : arg3 + var28;
         }

         int var19;
         label101: {
            int var18 = this.field3677[var14 - -arg0] & 3;
            if (var18 > 1) {
               var19 = ~var18 != -3 ? -var12 - arg3 : var12 - arg3;
               if (!var8) {
                  break label101;
               }
            }

            var19 = var18 != 0 ? -var12 + arg3 : arg3 + var12;
         }

         int var21;
         int var22;
         label102: {
            int var20 = 3 & this.field3677[var11 - -arg5];
            var21 = ((-var17 + var19) * var15 >> 12) + var17;
            if (var20 <= 1) {
               var22 = ~var20 == -1 ? var28 + var13 : -var28 + var13;
               if (!var8) {
                  break label102;
               }
            }

            var22 = var20 == 2 ? -var13 + var28 : -var28 + -var13;
         }

         int var23 = this.field3677[var14 - -arg5] & 3;
         if (arg6 != -1630303476) {
            this.field3681 = 119;
         }

         int var24;
         label103: {
            if (~var23 < -2) {
               var24 = ~var23 != -3 ? -var12 + -var13 : -var13 + var12;
               if (!var8) {
                  break label103;
               }
            }

            var24 = ~var23 == -1 ? var12 + var13 : -var12 + var13;
         }

         int var25 = ((-var22 + var24) * var15 >> 12) + var22;
         return var21 - -((-var21 + var25) * arg2 >> 12);
      } catch (RuntimeException var27) {
         throw class534.method3846(var27, field3692[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oca",
      name = "b",
      descriptor = "(Z)V"
   )
   public static void method2099(boolean arg0) {
      try {
         if (arg0) {
            field3680 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field3692[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oca",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method1457(int arg0) {
      boolean var2 = client.field4273;

      try {
         ++field3682;
         this.field3677 = class790.method5699(this.field3681, -44);
         this.method2100(73);
         int var3 = this.field3679 + -1;
         int var10000;
         if (var2) {
            var10000 = this.field3675[var3];
         } else if (var3 < 1) {
            var10000 = arg0;
            if (!var2) {
               if (arg0 != 28274) {
                  this.method1457(-106);
                  return;
               }

               return;
            }
         } else {
            var10000 = this.field3675[var3];
         }

         while(true) {
            while(true) {
               int var4 = var10000;
               if (~var4 >= -9) {
                  if (~var4 <= 7) {
                     --this.field3679;
                     --var3;
                     if (var3 < 1) {
                        var10000 = arg0;
                        if (!var2) {
                           if (arg0 != 28274) {
                              this.method1457(-106);
                              return;
                           }

                           return;
                        }
                     } else {
                        var10000 = this.field3675[var3];
                     }
                  } else {
                     var10000 = arg0;
                     if (!var2) {
                        if (arg0 != 28274) {
                           this.method1457(-106);
                           return;
                        }

                        return;
                     }
                  }
               } else {
                  var10000 = arg0;
                  if (!var2) {
                     if (arg0 != 28274) {
                        this.method1457(-106);
                        return;
                     }

                     return;
                  }
               }
            }
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field3692[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oca",
      name = "g",
      descriptor = "(I)V"
   )
   private final void method2100(int arg0) {
      boolean var2 = client.field4273;

      try {
         label71: {
            if (this.field3690 <= 0) {
               if (this.field3675 == null || this.field3675.length != this.field3679) {
                  break label71;
               }

               this.field3678 = new short[this.field3679];
               int var3 = 0;
               if (var2) {
                  this.field3678[var3] = (short)((int)Math.pow(2.0D, (double)var3));
                  ++var3;
               }

               while(true) {
                  while(~var3 > ~this.field3679) {
                     this.field3678[var3] = (short)((int)Math.pow(2.0D, (double)var3));
                     ++var3;
                  }

                  if (!var2) {
                     if (!var2) {
                        break label71;
                     }
                     break;
                  }

                  ++var3;
               }
            }

            this.field3678 = new short[this.field3679];
            this.field3675 = new short[this.field3679];
            int var4 = 0;
            if (var2 || this.field3679 > var4) {
               do {
                  this.field3675[var4] = (short)((int)(Math.pow((double)((float)this.field3690 / 4096.0F), (double)var4) * 4096.0D));
                  this.field3678[var4] = (short)((int)Math.pow(2.0D, (double)var4));
                  ++var4;
               } while(this.field3679 > var4);
            }
         }

         if (arg0 < 61) {
            this.field3688 = 48;
         }

         ++field3689;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field3692[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oca",
      name = "a",
      descriptor = "([IIB)V"
   )
   public final void method2101(int[] arg0, int arg1, byte arg2) {
      boolean var4 = client.field4273;

      try {
         ++field3685;
         int var5 = class551.field7586[arg1] * this.field3676;
         if (arg2 == 43) {
            if (this.field3679 != 1) {
               short var6 = this.field3675[0];
               if (var6 > 8 || ~var6 > 7) {
                  int var7 = this.field3678[0] << 12;
                  int var8 = this.field3676 * var7 >> 12;
                  int var9 = var5 * var7 >> 12;
                  int var10 = this.field3688 * var7 >> 12;
                  int var11 = var9 >> 12;
                  int var12 = var11 + 1;
                  if (var12 >= var8) {
                     var12 = 0;
                  }

                  int var13 = var9 & 4095;
                  int var14 = class628.field8813[var13];
                  int var15 = 255 & this.field3677[255 & var12];
                  int var16 = 255 & this.field3677[255 & var11];
                  int var17 = 0;
                  if (var4 || ~class576.field7916 < ~var17) {
                     do {
                        int var18 = class534.field7301[var17] * this.field3688;
                        int var19 = this.method2098(var16, var10, var14, var13, var7 * var18 >> 12, var15, -1630303476);
                        arg0[var17] = var6 * var19 >> 12;
                        ++var17;
                     } while(~class576.field7916 < ~var17);
                  }
               }

               int var20 = 1;
               if (var4) {
                  var6 = this.field3675[var20];
               } else if (this.field3679 <= var20) {
                  if (!var4) {
                     return;
                  }
               } else {
                  var6 = this.field3675[var20];
               }

               while(true) {
                  if (var6 <= 8 && var6 >= -8) {
                     ++var20;
                  } else {
                     label174: {
                        int var21 = this.field3678[var20] << 12;
                        int var22 = this.field3688 * var21 >> 12;
                        int var23 = var5 * var21 >> 12;
                        int var24 = this.field3676 * var21 >> 12;
                        int var25 = var23 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var23 & 4095;
                        if (var24 <= var26) {
                           var26 = 0;
                        }

                        int var28 = 255 & this.field3677[var26 & 255];
                        int var29 = class628.field8813[var27];
                        int var30 = 255 & this.field3677[255 & var25];
                        if (this.field3684 && this.field3679 + -1 == var20) {
                           int var31 = 0;
                           if (var4 || class576.field7916 > var31) {
                              do {
                                 int var32 = class534.field7301[var31] * this.field3688;
                                 int var33 = this.method2098(var30, var22, var29, var27, var21 * var32 >> 12, var28, -1630303476);
                                 int var34 = (var6 * var33 >> 12) + arg0[var31];
                                 arg0[var31] = (var34 >> 1) + 2048;
                                 ++var31;
                              } while(class576.field7916 > var31);
                           }

                           if (!var4) {
                              ++var20;
                              break label174;
                           }
                        }

                        int var35 = 0;
                        int var36;
                        int var37;
                        if (var4) {
                           var36 = class534.field7301[var35] * this.field3688;
                           var37 = this.method2098(var30, var22, var29, var27, var21 * var36 >> 12, var28, -1630303476);
                           arg0[var35] += var6 * var37 >> 12;
                           ++var35;
                        }

                        while(~var35 > ~class576.field7916) {
                           var36 = class534.field7301[var35] * this.field3688;
                           var37 = this.method2098(var30, var22, var29, var27, var21 * var36 >> 12, var28, -1630303476);
                           arg0[var35] += var6 * var37 >> 12;
                           ++var35;
                        }

                        ++var20;
                     }
                  }

                  if (this.field3679 <= var20) {
                     if (!var4) {
                        return;
                     }
                  } else {
                     var6 = this.field3675[var20];
                  }
               }
            } else {
               short var38 = this.field3675[0];
               int var39 = this.field3678[0] << 12;
               int var40 = this.field3688 * var39 >> 12;
               int var41 = var5 * var39 >> 12;
               int var42 = this.field3676 * var39 >> 12;
               int var43 = var41 >> 12;
               int var44 = var43 + 1;
               if (~var44 <= ~var42) {
                  var44 = 0;
               }

               int var45 = var41 & 4095;
               int var46 = this.field3677[255 & var44] & 255;
               int var47 = class628.field8813[var45];
               int var48 = this.field3677[255 & var43] & 255;
               if (this.field3684) {
                  int var52 = 0;
                  if (var4 || var52 < class576.field7916) {
                     do {
                        int var53 = class534.field7301[var52] * this.field3688;
                        int var54 = this.method2098(var48, var40, var47, var45, var39 * var53 >> 12, var46, -1630303476);
                        int var55 = var38 * var54 >> 12;
                        arg0[var52] = 2048 - -(var55 >> 1);
                        ++var52;
                     } while(var52 < class576.field7916);

                  }
               } else {
                  int var49 = 0;
                  if (var4 || var49 < class576.field7916) {
                     do {
                        int var50 = class534.field7301[var49] * this.field3688;
                        int var51 = this.method2098(var48, var40, var47, var45, var39 * var50 >> 12, var46, -1630303476);
                        arg0[var49] = var38 * var51 >> 12;
                        ++var49;
                     } while(var49 < class576.field7916);

                  }
               }
            }
         }
      } catch (RuntimeException var57) {
         throw class534.method3846(var57, field3692[8] + (arg0 != null ? field3692[1] : field3692[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oca",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method215(int arg0, int arg1) {
      try {
         ++field3687;
         int[] var3 = super.field2650.method3769(arg0, arg1 + -2064866512);
         if (super.field2650.field7140) {
            this.method2101(var3, arg0, (byte)43);
         }

         if (arg1 != 2064866508) {
            this.field3690 = -73;
         }

         return var3;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field3692[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oca",
      name = "<init>",
      descriptor = "()V"
   )
   public class276() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!oca",
      name = "a",
      descriptor = "(Lwm;II)V"
   )
   public final void method217(class594 arg0, int arg1, int arg2) {
      boolean var4 = client.field4273;

      try {
         label116: {
            label120: {
               label121: {
                  label113: {
                     label122: {
                        if (~arg2 != -1) {
                           if (arg2 == 1) {
                              break label122;
                           }

                           if (~arg2 == -3) {
                              break label113;
                           }

                           if (~arg2 == -4) {
                              this.field3688 = this.field3676 = arg0.method4288((byte)110);
                              if (!var4) {
                                 break label116;
                              }
                              break label121;
                           }

                           if (arg2 == 4) {
                              break label121;
                           }

                           if (~arg2 == -6) {
                              this.field3688 = arg0.method4288((byte)100);
                              if (!var4) {
                                 break label116;
                              }
                              break label120;
                           }

                           if (~arg2 != -7) {
                              break label116;
                           }

                           if (!var4) {
                              break label120;
                           }
                        }

                        this.field3684 = ~arg0.method4288((byte)74) == -2;
                        if (!var4) {
                           break label116;
                        }
                     }

                     this.field3679 = arg0.method4288((byte)127);
                     if (!var4) {
                        break label116;
                     }
                  }

                  this.field3690 = arg0.method4333(-54);
                  if (this.field3690 >= 0) {
                     break label116;
                  }

                  this.field3675 = new short[this.field3679];
                  int var6 = 0;
                  if (var4) {
                     this.field3675[var6] = (short)arg0.method4333(-126);
                     ++var6;
                  }

                  while(true) {
                     while(~var6 > ~this.field3679) {
                        this.field3675[var6] = (short)arg0.method4333(-126);
                        ++var6;
                     }

                     if (!var4) {
                        if (!var4) {
                           break label116;
                        }

                        this.field3688 = this.field3676 = arg0.method4288((byte)110);
                        if (!var4) {
                           break label116;
                        }
                        break;
                     }

                     ++var6;
                  }
               }

               this.field3681 = arg0.method4288((byte)70);
               if (!var4) {
                  break label116;
               }

               this.field3688 = arg0.method4288((byte)100);
               if (!var4) {
                  break label116;
               }
            }

            this.field3676 = arg0.method4288((byte)79);
         }

         ++field3683;
         int var7 = -27 % ((arg1 - 68) / 48);
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field3692[2] + (arg0 != null ? field3692[1] : field3692[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oca",
      name = "b",
      descriptor = "(II)I"
   )
   public static final int method2102(int arg0, int arg1) {
      return class584.field8014 != null ? class584.field8014[arg0][arg1] & 65535 : 0;
   }

   @OriginalMember(
      owner = "client!oca",
      name = "a",
      descriptor = "(IIB)Z"
   )
   public static final boolean method2103(int arg0, int arg1, byte arg2) {
      try {
         ++field3691;
         if (arg2 <= 23) {
            field3680 = null;
         }

         return (16 & arg0) != 0;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field3692[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2104(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 1);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2105(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 32;
            break;
         case 1:
            var10005 = 47;
            break;
         case 2:
            var10005 = 94;
            break;
         case 3:
            var10005 = 39;
            break;
         default:
            var10005 = 1;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
