import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class641 extends class264 {
   @OriginalMember(
      owner = "client!te",
      name = "S",
      descriptor = "[B"
   )
   private byte[] field9367 = new byte[512];
   @OriginalMember(
      owner = "client!te",
      name = "K",
      descriptor = "I"
   )
   public int field9371 = 4;
   @OriginalMember(
      owner = "client!te",
      name = "I",
      descriptor = "Z"
   )
   public boolean field9362 = true;
   @OriginalMember(
      owner = "client!te",
      name = "R",
      descriptor = "I"
   )
   public int field9373 = 1638;
   @OriginalMember(
      owner = "client!te",
      name = "N",
      descriptor = "I"
   )
   public int field9364 = 4;
   @OriginalMember(
      owner = "client!te",
      name = "J",
      descriptor = "I"
   )
   public int field9375 = 0;
   @OriginalMember(
      owner = "client!te",
      name = "G",
      descriptor = "I"
   )
   public int field9378 = 4;
   @OriginalMember(
      owner = "client!te",
      name = "Y",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9379 = new String[]{method4638(method4637("{9\rrk")), method4638(method4637("{9\rxk")), method4638(method4637("tr\r\u0017>")), method4638(method4637("a)OU")), method4638(method4637("{9\r{k")), method4638(method4637("{9\rqk")), method4638(method4637("{9\r}k")), method4638(method4637("{9\r|k")), method4638(method4637("{9\r\u007fk")), method4638(method4637("{9\rzk")), method4638(method4637("{9\rpk"))};
   @OriginalMember(
      owner = "client!te",
      name = "U",
      descriptor = "Lll;"
   )
   public static class387 field9368 = new class387();
   @OriginalMember(
      owner = "client!te",
      name = "X",
      descriptor = "Ljava/util/Hashtable;"
   )
   public static Hashtable field9377 = new Hashtable();
   @OriginalMember(
      owner = "client!te",
      name = "V",
      descriptor = "I"
   )
   public static int field9360;
   @OriginalMember(
      owner = "client!te",
      name = "T",
      descriptor = "I"
   )
   public static int field9363;
   @OriginalMember(
      owner = "client!te",
      name = "H",
      descriptor = "I"
   )
   public static int field9365;
   @OriginalMember(
      owner = "client!te",
      name = "O",
      descriptor = "I"
   )
   public static int field9366;
   @OriginalMember(
      owner = "client!te",
      name = "M",
      descriptor = "I"
   )
   public static int field9369;
   @OriginalMember(
      owner = "client!te",
      name = "F",
      descriptor = "I"
   )
   public static int field9372;
   @OriginalMember(
      owner = "client!te",
      name = "Q",
      descriptor = "I"
   )
   public static int field9374;
   @OriginalMember(
      owner = "client!te",
      name = "L",
      descriptor = "I"
   )
   public static int field9376;
   @OriginalMember(
      owner = "client!te",
      name = "W",
      descriptor = "[S"
   )
   private short[] field9361;
   @OriginalMember(
      owner = "client!te",
      name = "P",
      descriptor = "[S"
   )
   private short[] field9370;

   @OriginalMember(
      owner = "client!te",
      name = "a",
      descriptor = "(Z[II)V"
   )
   public final void method4631(boolean arg0, int[] arg1, int arg2) {
      boolean var4 = client.field4360;

      try {
         ++field9376;
         if (arg0) {
            int var5 = class666.field9668[arg2] * this.field9364;
            if (~this.field9378 != -2) {
               short var6 = this.field9370[0];
               if (var6 > 8 || ~var6 > 7) {
                  int var7 = this.field9361[0] << 12;
                  int var8 = this.field9364 * var7 >> 12;
                  int var9 = var5 * var7 >> 12;
                  int var10 = this.field9371 * var7 >> 12;
                  int var11 = var9 >> 12;
                  int var12 = var11 - -1;
                  int var13 = var9 & 4095;
                  if (~var12 <= ~var8) {
                     var12 = 0;
                  }

                  int var14 = this.field9367[var12 & 255] & 255;
                  int var15 = this.field9367[var11 & 255] & 255;
                  int var16 = class693.field10190[var13];
                  int var17 = 0;
                  if (var4 || class430.field6152 > var17) {
                     do {
                        int var18 = class258.field3496[var17] * this.field9371;
                        int var19 = this.method4634(var7 * var18 >> 12, -121, var16, var15, var14, var10, var13);
                        arg1[var17] = var6 * var19 >> 12;
                        ++var17;
                     } while(class430.field6152 > var17);
                  }
               }

               int var20 = 1;
               if (var4) {
                  var6 = this.field9370[var20];
               } else if (this.field9378 <= var20) {
                  if (!var4) {
                     return;
                  }
               } else {
                  var6 = this.field9370[var20];
               }

               while(true) {
                  if (var6 <= 8 && ~var6 <= 7) {
                     ++var20;
                  } else {
                     label178: {
                        int var21 = this.field9361[var20] << 12;
                        int var22 = this.field9371 * var21 >> 12;
                        int var23 = this.field9364 * var21 >> 12;
                        int var24 = var5 * var21 >> 12;
                        int var25 = var24 >> 12;
                        int var26 = var25 + 1;
                        if (var26 >= var23) {
                           var26 = 0;
                        }

                        int var27 = var24 & 4095;
                        int var28 = this.field9367[var26 & 255] & 255;
                        int var29 = class693.field10190[var27];
                        int var30 = this.field9367[var25 & 255] & 255;
                        if (this.field9362 && ~(this.field9378 - 1) == ~var20) {
                           int var31 = 0;
                           if (var4 || ~class430.field6152 < ~var31) {
                              do {
                                 int var32 = class258.field3496[var31] * this.field9371;
                                 int var33 = this.method4634(var21 * var32 >> 12, -121, var29, var30, var28, var22, var27);
                                 int var34 = arg1[var31] - -(var6 * var33 >> 12);
                                 arg1[var31] = (var34 >> 1) + 2048;
                                 ++var31;
                              } while(~class430.field6152 < ~var31);
                           }

                           if (!var4) {
                              ++var20;
                              break label178;
                           }
                        }

                        int var35 = 0;
                        int var36;
                        int var37;
                        if (var4) {
                           var36 = class258.field3496[var35] * this.field9371;
                           var37 = this.method4634(var21 * var36 >> 12, -123, var29, var30, var28, var22, var27);
                           arg1[var35] += var6 * var37 >> 12;
                           ++var35;
                        }

                        while(~class430.field6152 < ~var35) {
                           var36 = class258.field3496[var35] * this.field9371;
                           var37 = this.method4634(var21 * var36 >> 12, -123, var29, var30, var28, var22, var27);
                           arg1[var35] += var6 * var37 >> 12;
                           ++var35;
                        }

                        ++var20;
                     }
                  }

                  if (this.field9378 <= var20) {
                     if (!var4) {
                        return;
                     }
                  } else {
                     var6 = this.field9370[var20];
                  }
               }
            } else {
               int var38 = this.field9361[0] << 12;
               short var39 = this.field9370[0];
               int var40 = this.field9364 * var38 >> 12;
               int var41 = var5 * var38 >> 12;
               int var42 = this.field9371 * var38 >> 12;
               int var43 = var41 >> 12;
               int var44 = var43 - -1;
               if (~var40 >= ~var44) {
                  var44 = 0;
               }

               int var45 = var41 & 4095;
               int var46 = class693.field10190[var45];
               int var47 = 255 & this.field9367[var44 & 255];
               int var48 = 255 & this.field9367[255 & var43];
               if (this.field9362) {
                  int var52 = 0;
                  if (var4 || ~var52 > ~class430.field6152) {
                     do {
                        int var53 = class258.field3496[var52] * this.field9371;
                        int var54 = this.method4634(var38 * var53 >> 12, -120, var46, var48, var47, var42, var45);
                        int var55 = var39 * var54 >> 12;
                        arg1[var52] = (var55 >> 1) + 2048;
                        ++var52;
                     } while(~var52 > ~class430.field6152);

                  }
               } else {
                  int var49 = 0;
                  if (var4 || var49 < class430.field6152) {
                     do {
                        int var50 = class258.field3496[var49] * this.field9371;
                        int var51 = this.method4634(var38 * var50 >> 12, -124, var46, var48, var47, var42, var45);
                        arg1[var49] = var39 * var51 >> 12;
                        ++var49;
                     } while(var49 < class430.field6152);

                  }
               }
            }
         }
      } catch (RuntimeException var57) {
         throw class237.method1823(var57, field9379[7] + arg0 + ',' + (arg1 != null ? field9379[2] : field9379[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!te",
      name = "b",
      descriptor = "(B)V"
   )
   private final void method4632(byte arg0) {
      boolean var2 = client.field4360;

      try {
         label64: {
            if (this.field9373 > 0) {
               this.field9361 = new short[this.field9378];
               this.field9370 = new short[this.field9378];
               int var3 = 0;
               if (var2) {
                  this.field9370[var3] = (short)((int)(4096.0D * Math.pow((double)((float)this.field9373 / 4096.0F), (double)var3)));
                  this.field9361[var3] = (short)((int)Math.pow(2.0D, (double)var3));
                  ++var3;
               }

               while(true) {
                  while(~this.field9378 < ~var3) {
                     this.field9370[var3] = (short)((int)(4096.0D * Math.pow((double)((float)this.field9373 / 4096.0F), (double)var3)));
                     this.field9361[var3] = (short)((int)Math.pow(2.0D, (double)var3));
                     ++var3;
                  }

                  if (!var2) {
                     if (!var2) {
                        break label64;
                     }
                     break;
                  }

                  ++var3;
               }
            }

            if (this.field9370 != null && this.field9370.length == this.field9378) {
               this.field9361 = new short[this.field9378];
               int var4 = 0;
               if (var2 || this.field9378 > var4) {
                  do {
                     this.field9361[var4] = (short)((int)Math.pow(2.0D, (double)var4));
                     ++var4;
                  } while(this.field9378 > var4);
               }
            }
         }

         if (arg0 >= -19) {
            field9377 = null;
         }

         ++field9366;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field9379[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!te",
      name = "a",
      descriptor = "(ILwf;I)V"
   )
   public final void method3(int arg0, class147 arg1, int arg2) {
      boolean var4 = client.field4360;

      try {
         ++field9363;
         if (arg2 >= 49) {
            if (arg0 != 0) {
               label112: {
                  if (arg0 == 1) {
                     this.field9378 = arg1.method1143(-15465);
                     return;
                  }

                  if (~arg0 != -3) {
                     if (~arg0 == -4) {
                        this.field9371 = this.field9364 = arg1.method1143(-15465);
                        return;
                     }

                     if (~arg0 == -5) {
                        this.field9375 = arg1.method1143(-15465);
                        return;
                     }

                     if (arg0 == 5) {
                        this.field9371 = arg1.method1143(-15465);
                        return;
                     }

                     if (~arg0 == -7) {
                        if (!var4) {
                           this.field9364 = arg1.method1143(-15465);
                           return;
                        }
                        break label112;
                     }
                  } else {
                     this.field9373 = arg1.method1187((byte)-80);
                     if (~this.field9373 > -1) {
                        this.field9370 = new short[this.field9378];
                        int var6 = 0;
                        if (var4) {
                           this.field9370[var6] = (short)arg1.method1187((byte)66);
                           ++var6;
                        }

                        while(true) {
                           while(~this.field9378 < ~var6) {
                              this.field9370[var6] = (short)arg1.method1187((byte)66);
                              ++var6;
                           }

                           if (!var4) {
                              return;
                           }

                           ++var6;
                        }
                     }
                  }

                  return;
               }
            }

            this.field9362 = ~arg1.method1143(-15465) == -2;
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field9379[1] + arg0 + ',' + (arg1 != null ? field9379[2] : field9379[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!te",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method6(int arg0, int arg1) {
      try {
         int var3 = -5 % ((24 - arg1) / 44);
         ++field9360;
         int[] var4 = super.field3641.method3079(-14361, arg0);
         if (super.field3641.field5922) {
            this.method4631(true, var4, arg0);
         }

         return var4;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field9379[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!te",
      name = "<init>",
      descriptor = "()V"
   )
   public class641() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!te",
      name = "c",
      descriptor = "(Z)V"
   )
   public static final void method4633(boolean arg0) {
      boolean var1 = client.field4360;

      try {
         class503.field7302 = 0;
         if (arg0) {
            ++field9369;
            class360.field4901 = 0;
            int var2 = 0;
            if (var1 || class131.field1670 > var2) {
               do {
                  int var3 = class50.field658 * var2;
                  int var4 = 0;
                  if (var1 || class50.field658 > var4) {
                     do {
                        int var5 = var3 + var4;
                        class12.field133[var5].method2(class347.field4686 * var4, class88.field1146 * var2, class347.field4686, class88.field1146, 0, 0, true, true);
                        ++var4;
                     } while(class50.field658 > var4);
                  }

                  ++var2;
               } while(class131.field1670 > var2);

            }
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field9379[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!te",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method413(int arg0) {
      boolean var2 = client.field4360;

      try {
         if (arg0 < 49) {
            method4635(-87);
         }

         this.field9367 = class106.method870((byte)56, this.field9375);
         ++field9374;
         this.method4632((byte)-118);
         int var3 = this.field9378 + -1;
         if (var2 || var3 >= 1) {
            do {
               short var4 = this.field9370[var3];
               if (~var4 < -9 || ~var4 > 7) {
                  return;
               }

               --this.field9378;
               --var3;
            } while(var3 >= 1);

         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field9379[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!te",
      name = "a",
      descriptor = "(IIIIIII)I"
   )
   private final int method4634(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field4360;

      try {
         ++field9365;
         int var9 = arg0 >> 12;
         int var10 = var9 - -1;
         if (~arg5 >= ~var10) {
            var10 = 0;
         }

         int var11 = var9 & 255;
         int var28 = arg0 & 4095;
         int var12 = var10 & 255;
         if (arg1 >= -118) {
            return -115;
         } else {
            int var13;
            int var14;
            int var16;
            int var17;
            label100: {
               var13 = var28 + -4096;
               var14 = arg6 + -4096;
               int var15 = this.field9367[arg3 + var11] & 3;
               var16 = class693.field10190[var28];
               if (var15 <= 1) {
                  var17 = ~var15 == -1 ? var28 + arg6 : -var28 + arg6;
                  if (!var8) {
                     break label100;
                  }
               }

               var17 = ~var15 == -3 ? -arg6 + var28 : -var28 + -arg6;
            }

            int var19;
            label101: {
               int var18 = 3 & this.field9367[arg3 + var12];
               if (var18 <= 1) {
                  var19 = var18 == 0 ? arg6 + var13 : -var13 + arg6;
                  if (!var8) {
                     break label101;
                  }
               }

               var19 = var18 == 2 ? -arg6 + var13 : -arg6 + -var13;
            }

            int var21;
            int var22;
            label102: {
               int var20 = 3 & this.field9367[arg4 + var11];
               var21 = var17 - -((-var17 + var19) * var16 >> 12);
               if (~var20 >= -2) {
                  var22 = var20 != 0 ? var14 - var28 : var28 + var14;
                  if (!var8) {
                     break label102;
                  }
               }

               var22 = ~var20 == -3 ? var28 - var14 : -var28 + -var14;
            }

            int var24;
            label103: {
               int var23 = 3 & this.field9367[arg4 + var12];
               if (~var23 >= -2) {
                  var24 = var23 == 0 ? var13 + var14 : var14 - var13;
                  if (!var8) {
                     break label103;
                  }
               }

               var24 = var23 != 2 ? -var13 + -var14 : -var14 + var13;
            }

            int var25 = ((-var22 + var24) * var16 >> 12) + var22;
            return ((var25 - var21) * arg2 >> 12) + var21;
         }
      } catch (RuntimeException var27) {
         throw class237.method1823(var27, field9379[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!te",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method4635(int arg0) {
      try {
         field9368 = null;
         if (arg0 >= -127) {
            field9377 = null;
         }

         field9377 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field9379[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!te",
      name = "b",
      descriptor = "(II)V"
   )
   public static final void method4636(int arg0, int arg1) {
      try {
         ++field9372;
         int var2 = -class423.field6029 + class96.field1234;
         if (var2 >= 100) {
            class380.field5481 = 1;
            class25.field376 = -1;
            class744.field10854 = -1;
         } else {
            int var3 = (int)class273.field3753;
            if (~(class532.field7591 >> 8) < ~var3) {
               var3 = class532.field7591 >> 8;
            }

            if (class491.field7034[4] && class135.field1725[4] + 128 > var3) {
               var3 = class135.field1725[4] + 128;
            }

            float var5;
            int var6;
            label31: {
               int var4 = (int)class117.field1467 + class681.field10030 & 16383;
               class472.method3420(var4, -200 + class102.method851(class561.field8019, (byte)127, class564.field8045.field10694, class564.field8045.field10693), class310.field4257, (byte)-82, var3, arg1, (var3 >> 3) * 3 + 600 << 2, class725.field10585);
               var5 = (float)arg0 + -((float)((-var2 + 100) * (-var2 + 100) * (-var2 + 100)) / 1000000.0F);
               class207.field2966 = (int)((float)(-class67.field819 + class207.field2966) * var5 + (float)class67.field819);
               class782.field11465 = (int)((float)(class782.field11465 - class524.field7520) * var5 + (float)class524.field7520);
               class421.field6021 = (int)((float)(class421.field6021 - class330.field4496) * var5 + (float)class330.field4496);
               class224.field3188 = (int)((float)(class224.field3188 - class423.field6033) * var5 + (float)class423.field6033);
               var6 = -class500.field7248 + class10.field96;
               if (var6 <= 8192) {
                  if (~var6 <= 8191) {
                     break label31;
                  }

                  var6 += 16384;
                  if (!client.field4360) {
                     break label31;
                  }
               }

               var6 -= 16384;
            }

            class10.field96 = (int)((float)var6 * var5 + (float)class500.field7248);
            class10.field96 &= 16383;
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field9379[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!te",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4637(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 67);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!te",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4638(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 15;
            break;
         case 1:
            var10005 = 92;
            break;
         case 2:
            var10005 = 35;
            break;
         case 3:
            var10005 = 57;
            break;
         default:
            var10005 = 67;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
