import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class415 extends class213 {
   @OriginalMember(
      owner = "client!lp",
      name = "I",
      descriptor = "I"
   )
   private int field5833 = 4096;
   @OriginalMember(
      owner = "client!lp",
      name = "N",
      descriptor = "I"
   )
   private int field5834 = 2000;
   @OriginalMember(
      owner = "client!lp",
      name = "F",
      descriptor = "I"
   )
   private int field5836 = 0;
   @OriginalMember(
      owner = "client!lp",
      name = "L",
      descriptor = "I"
   )
   private int field5832 = 0;
   @OriginalMember(
      owner = "client!lp",
      name = "E",
      descriptor = "I"
   )
   private int field5837 = 16;
   @OriginalMember(
      owner = "client!lp",
      name = "J",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5842 = new String[]{method3145(method3144("Q\u0005\u0019,m")), method3145(method3144("S\u0000[\u000b")), method3145(method3144("F[\u0019I8")), method3145(method3144("Q\u0005\u0019%m")), method3145(method3144("Q\u0005\u0019$m")), method3145(method3144("Q\u0005\u0019 m")), method3145(method3144("Q\u0005\u0019&m")), method3145(method3144("Q\u0005\u0019#m"))};
   @OriginalMember(
      owner = "client!lp",
      name = "M",
      descriptor = "[I"
   )
   public static int[] field5840 = new int[16];
   @OriginalMember(
      owner = "client!lp",
      name = "O",
      descriptor = "I"
   )
   public static int field5831;
   @OriginalMember(
      owner = "client!lp",
      name = "G",
      descriptor = "I"
   )
   public static int field5835;
   @OriginalMember(
      owner = "client!lp",
      name = "D",
      descriptor = "I"
   )
   public static int field5838;
   @OriginalMember(
      owner = "client!lp",
      name = "H",
      descriptor = "I"
   )
   public static int field5839;
   @OriginalMember(
      owner = "client!lp",
      name = "K",
      descriptor = "I"
   )
   public static int field5841;

   @OriginalMember(
      owner = "client!lp",
      name = "a",
      descriptor = "(Lwm;II)V"
   )
   public final void method217(class594 arg0, int arg1, int arg2) {
      boolean var4 = client.field4273;

      try {
         label60: {
            label59: {
               label58: {
                  label57: {
                     label56: {
                        if (~arg2 != -1) {
                           if (arg2 == 1) {
                              break label56;
                           }

                           if (~arg2 == -3) {
                              break label57;
                           }

                           if (~arg2 == -4) {
                              break label58;
                           }

                           if (arg2 != 4) {
                              break label60;
                           }

                           if (!var4) {
                              break label59;
                           }
                        }

                        this.field5832 = arg0.method4288((byte)123);
                        if (!var4) {
                           break label60;
                        }
                     }

                     this.field5834 = arg0.method4280(-19104);
                     if (!var4) {
                        break label60;
                     }
                  }

                  this.field5837 = arg0.method4288((byte)100);
                  if (!var4) {
                     break label60;
                  }
               }

               this.field5836 = arg0.method4280(-19104);
               if (!var4) {
                  break label60;
               }
            }

            this.field5833 = arg0.method4280(-19104);
         }

         int var6 = 126 / ((arg1 - 68) / 48);
         ++field5839;
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field5842[5] + (arg0 != null ? field5842[2] : field5842[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lp",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method3141(byte arg0) {
      try {
         field5840 = null;
         if (arg0 <= 31) {
            field5840 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5842[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lp",
      name = "<init>",
      descriptor = "()V"
   )
   public class415() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!lp",
      name = "b",
      descriptor = "(II)V"
   )
   public static final void method3142(int arg0, int arg1) {
      try {
         ++field5831;
         if (~arg1 != 0) {
            if (arg0 > -61) {
               field5840 = null;
            }

            if (class388.field5433[arg1]) {
               class639.field9016.method709(arg1, true);
               class468.field6451[arg1] = null;
               class549.field7503[arg1] = null;
               class388.field5433[arg1] = false;
            }
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5842[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lp",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method1457(int arg0) {
      try {
         ++field5835;
         if (arg0 == 28274) {
            class39.method296((byte)56);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5842[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lp",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method215(int arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         ++field5838;
         if (arg1 != 2064866508) {
            return null;
         } else {
            int[] var4 = super.field2650.method3769(arg0, -4);
            if (super.field2650.field7140) {
               int var5 = this.field5833 >> 1;
               int[][] var6 = super.field2650.method3772(0);
               Random var7 = new Random((long)this.field5832);
               int var8 = 0;
               int var10000;
               if (var3) {
                  var10000 = this.field5833 <= 0 ? this.field5836 : this.field5836 + class221.method1687(var7, -98, this.field5833) + -var5;
               } else {
                  if (~this.field5834 >= ~var8) {
                     return var4;
                  }

                  var10000 = this.field5833 <= 0 ? this.field5836 : this.field5836 + class221.method1687(var7, -98, this.field5833) + -var5;
               }

               while(true) {
                  label151: {
                     int var9 = var10000;
                     int var10 = (var9 & 4084) >> 4;
                     int var11 = class221.method1687(var7, 76, class576.field7916);
                     int var12 = class221.method1687(var7, 104, class392.field5515);
                     int var13 = (class210.field2607[var10] * this.field5837 >> 12) + var11;
                     int var14 = (class667.field9487[var10] * this.field5837 >> 12) + var12;
                     int var15 = var14 - var12;
                     int var16 = -var11 + var13;
                     if (~var16 == -1) {
                        if (var15 == 0) {
                           ++var8;
                           break label151;
                        }

                        if (~var16 > -1) {
                           var16 = -var16;
                        }
                     } else if (~var16 > -1) {
                        var16 = -var16;
                     }

                     boolean var17;
                     int var18;
                     int var19;
                     if (var15 < 0) {
                        var15 = -var15;
                        var17 = var15 > var16;
                        if (var17) {
                           var18 = var11;
                           var19 = var13;
                           var11 = var12;
                           var13 = var14;
                           var12 = var18;
                           var14 = var19;
                        }
                     } else {
                        var17 = var15 > var16;
                        if (var17) {
                           var18 = var11;
                           var19 = var13;
                           var11 = var12;
                           var13 = var14;
                           var12 = var18;
                           var14 = var19;
                        }
                     }

                     int var22;
                     int var23;
                     int var24;
                     int var25;
                     int var26;
                     int var27;
                     int var28;
                     if (var11 > var13) {
                        int var20 = var11;
                        var11 = var13;
                        var13 = var20;
                        var22 = var14;
                        var23 = -var11 + var20;
                        var24 = -var14 + var12;
                        var25 = -var23 / 2;
                        var26 = 2048 / var23;
                        var27 = 1024 - (class221.method1687(var7, 33, 4096) >> 2);
                        var28 = var12 > var14 ? 1 : -1;
                        if (var24 < 0) {
                           var24 = -var24;
                        }
                     } else {
                        var22 = var12;
                        var23 = -var11 + var13;
                        var24 = -var12 + var14;
                        var25 = -var23 / 2;
                        var26 = 2048 / var23;
                        var27 = 1024 - (class221.method1687(var7, 33, 4096) >> 2);
                        var28 = var14 > var12 ? 1 : -1;
                        if (var24 < 0) {
                           var24 = -var24;
                        }
                     }

                     int var29 = var11;
                     if (!var3 && var11 >= var13) {
                        ++var8;
                     } else {
                        while(true) {
                           int var30 = (-var11 + var29) * var26 + var27 + 1024;
                           int var31 = class676.field9924 & var29;
                           int var32 = class40.field468 & var22;
                           var25 += var24;
                           if (!var17) {
                              var6[var31][var32] = var30;
                              if (var3) {
                                 var6[var32][var31] = var30;
                              }
                           } else {
                              var6[var32][var31] = var30;
                           }

                           if (~var25 < -1) {
                              var22 -= -var28;
                              var25 += -var23;
                           }

                           ++var29;
                           if (var29 >= var13) {
                              ++var8;
                              break;
                           }
                        }
                     }
                  }

                  if (~this.field5834 >= ~var8) {
                     break;
                  }

                  var10000 = this.field5833 <= 0 ? this.field5836 : this.field5836 + class221.method1687(var7, -98, this.field5833) + -var5;
               }
            }

            return var4;
         }
      } catch (RuntimeException var34) {
         throw class534.method3846(var34, field5842[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lp",
      name = "a",
      descriptor = "(Lpl;I)I"
   )
   public static final int method3143(class680 arg0, int arg1) {
      boolean var2 = client.field4273;

      try {
         ++field5841;
         class392 var3 = arg0.field9989;
         int var4 = 99 / ((-61 - arg1) / 55);
         if (var3.field5516 != null) {
            var3 = var3.method2986(102, class259.field3320);
            if (var3 == null) {
               return -1;
            }
         }

         int var5 = var3.field5526;
         class120 var6 = arg0.method4086((byte)-128);
         if (~arg0.field7822 == 0 || arg0.field7814) {
            var5 = var3.field5523;
            if (!var2) {
               return var5;
            }
         }

         if (arg0.field7822 == var6.field1457 || ~arg0.field7822 == ~var6.field1485 || arg0.field7822 == var6.field1505 || ~arg0.field7822 == ~var6.field1483) {
            var5 = var3.field5495;
            if (!var2) {
               return var5;
            }
         }

         if (~arg0.field7822 == ~var6.field1492 || arg0.field7822 == var6.field1477 || arg0.field7822 == var6.field1467 || arg0.field7822 == var6.field1496) {
            var5 = var3.field5475;
         }

         return var5;
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field5842[3] + (arg0 != null ? field5842[2] : field5842[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3144(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 69);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3145(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 61;
            break;
         case 1:
            var10005 = 117;
            break;
         case 2:
            var10005 = 55;
            break;
         case 3:
            var10005 = 103;
            break;
         default:
            var10005 = 69;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
