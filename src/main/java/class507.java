import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cga")
public class class507 extends class302 {
   @OriginalMember(
      owner = "client!cga",
      name = "H",
      descriptor = "I"
   )
   private int field7487 = 4;
   @OriginalMember(
      owner = "client!cga",
      name = "L",
      descriptor = "I"
   )
   private int field7485 = 4;
   @OriginalMember(
      owner = "client!cga",
      name = "T",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7493 = new String[]{method3765(method3764("u\u001f\u0012\u0010<>")), method3765(method3764("x\r\u001fR")), method3765(method3764("u\u001f\u0012\u0010;>")), method3765(method3764("mV]\u0010\u0000")), method3765(method3764("c\u0015")), method3765(method3764("c\u0014")), method3765(method3764("u\u001f\u0012\u0010,>")), method3765(method3764("u\u001f\u0012\u0010>>")), method3765(method3764("u\u001f\u0012\u0010/>")), method3765(method3764("a\u0011\u001d")), method3765(method3764("u\u001f\u0012\u0010:>")), method3765(method3764("u\u001f\u0012\u00108>")), method3765(method3764("u\u001f\u0012\u0010?>"))};
   @OriginalMember(
      owner = "client!cga",
      name = "P",
      descriptor = "[I"
   )
   public static int[] field7489 = new int[2];
   @OriginalMember(
      owner = "client!cga",
      name = "I",
      descriptor = "F"
   )
   public static float field7482;
   @OriginalMember(
      owner = "client!cga",
      name = "J",
      descriptor = "I"
   )
   public static int field7481;
   @OriginalMember(
      owner = "client!cga",
      name = "S",
      descriptor = "I"
   )
   public static int field7483;
   @OriginalMember(
      owner = "client!cga",
      name = "O",
      descriptor = "I"
   )
   public static int field7484;
   @OriginalMember(
      owner = "client!cga",
      name = "R",
      descriptor = "I"
   )
   public static int field7486;
   @OriginalMember(
      owner = "client!cga",
      name = "K",
      descriptor = "I"
   )
   public static int field7488;
   @OriginalMember(
      owner = "client!cga",
      name = "Q",
      descriptor = "I"
   )
   public static int field7490;
   @OriginalMember(
      owner = "client!cga",
      name = "N",
      descriptor = "I"
   )
   public static int field7491;
   @OriginalMember(
      owner = "client!cga",
      name = "M",
      descriptor = "I"
   )
   public static int field7492;

   @OriginalMember(
      owner = "client!cga",
      name = "<init>",
      descriptor = "()V",
      line = 3
   )
   public class507() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!cga",
      name = "c",
      descriptor = "(III)Z",
      line = 10
   )
   public static final boolean method3759(int arg0, int arg1, int arg2) {
      try {
         ++field7484;
         if (arg0 != -1) {
            return true;
         } else {
            return (32768 & arg1) != 0;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field7493[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cga",
      name = "a",
      descriptor = "(IILjj;)V",
      line = 23
   )
   public final void method244(int arg0, int arg1, class128 arg2) {
      int var4 = client.field4530;

      try {
         label37: {
            label36: {
               if (arg0 != 0) {
                  if (arg0 != 1) {
                     break label37;
                  }

                  if (var4 == 0) {
                     break label36;
                  }
               }

               this.field7485 = arg2.method1104(255);
               if (var4 == 0) {
                  break label37;
               }
            }

            this.field7487 = arg2.method1104(255);
         }

         if (arg1 != 0) {
            method3763(-88);
         }

         ++field7492;
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field7493[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7493[3] : field7493[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cga",
      name = "f",
      descriptor = "(I)V",
      line = 58
   )
   public static void method3760(int arg0) {
      try {
         if (arg0 >= 39) {
            field7489 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field7493[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cga",
      name = "a",
      descriptor = "(BI)[[I",
      line = 69
   )
   public final int[][] method245(byte arg0, int arg1) {
      int var3 = client.field4530;

      try {
         ++field7491;
         int[][] var4 = super.field4292.method3409(arg1, 0);
         if (arg0 != -90) {
            method3760(91);
         }

         if (super.field4292.field6892) {
            int var5;
            int[][] var7;
            label40: {
               var5 = class344.field5238 / this.field7485;
               int var6 = class501.field7439 / this.field7487;
               if (~var6 >= -1) {
                  var7 = this.method2297(0, 0, 0);
                  if (var3 == 0) {
                     break label40;
                  }
               }

               int var8 = arg1 % var6;
               var7 = this.method2297(0, class501.field7439 * var8 / var6, 0);
            }

            int[] var9 = var7[0];
            int[] var10 = var7[1];
            int[] var11 = var7[2];
            int[] var12 = var4[0];
            int[] var13 = var4[1];
            int[] var14 = var4[2];
            int var15 = 0;
            if (var3 != 0 || ~class344.field5238 < ~var15) {
               do {
                  int var17;
                  if (~var5 < -1) {
                     int var16 = var15 % var5;
                     var17 = class344.field5238 * var16 / var5;
                     if (var3 != 0) {
                        var17 = 0;
                     }
                  } else {
                     var17 = 0;
                  }

                  var12[var15] = var9[var17];
                  var13[var15] = var10[var17];
                  var14[var15] = var11[var17];
                  ++var15;
               } while(~class344.field5238 < ~var15);
            }
         }

         return var4;
      } catch (RuntimeException var19) {
         throw class670.method4877(var19, field7493[12] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cga",
      name = "h",
      descriptor = "(I)I",
      line = 137
   )
   public static final int method3761(int arg0) {
      int var1 = client.field4530;

      try {
         if (arg0 < 113) {
            return -64;
         } else {
            ++field7488;
            boolean var2 = false;
            boolean var3 = false;
            boolean var4 = false;
            if (class755.field11144.field10710 && !class755.field11144.field10706) {
               label132: {
                  var2 = true;
                  if (class488.field7219.field9191 < 512 && ~class488.field7219.field9191 != -1) {
                     var2 = false;
                  }

                  if (!class719.field10719.startsWith(field7493[9])) {
                     var3 = true;
                     if (var1 == 0) {
                        break label132;
                     }
                  }

                  var4 = true;
                  var3 = true;
               }
            }

            if (class682.field10242) {
               var2 = false;
            }

            if (class634.field9236) {
               var4 = false;
            }

            if (class176.field2178) {
               var3 = false;
            }

            if (!var2 && !var3 && !var4) {
               return class642.method4614((byte)-20);
            } else {
               int var5 = -1;
               int var6 = -1;
               int var7 = -1;
               if (var2) {
                  try {
                     var5 = class68.method685(-102, 1000, 2);
                  } catch (Exception var16) {
                  }
               }

               if (var4) {
                  try {
                     var7 = class68.method685(-32, 1000, 3);
                     if (class261.field3566.field9464.method4225(114) == 3) {
                        label133: {
                           long var9;
                           label134: {
                              class110 var8 = class786.field11439.method595();
                              var9 = 281474976710655L & var8.field1344;
                              int var11 = var8.field1347;
                              if (~var11 != -4319) {
                                 if (var11 != 4098) {
                                    break label133;
                                 }

                                 if (var1 == 0) {
                                    break label134;
                                 }
                              }

                              var3 &= var9 >= 64425238954L;
                              if (var1 == 0) {
                                 break label133;
                              }
                           }

                           var3 &= ~var9 <= -60129613780L;
                        }
                     }
                  } catch (Exception var17) {
                  }
               }

               if (var3) {
                  try {
                     var6 = class68.method685(-50, 1000, 1);
                  } catch (Exception var15) {
                  }
               }

               if (~var5 == 0 && ~var6 == 0 && var7 == -1) {
                  return class642.method4614((byte)106);
               } else {
                  int var12 = (int)((float)var6 * 1.1F);
                  int var13 = (int)((float)var7 * 1.1F);
                  if (var13 < var5 && var5 > var12) {
                     return class227.method1716(var5, 1);
                  } else {
                     return ~var12 <= ~var13 ? class131.method1121(var12, 1, (byte)-114) : class131.method1121(var13, 3, (byte)-114);
                  }
               }
            }
         }
      } catch (RuntimeException var18) {
         throw class670.method4877(var18, field7493[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cga",
      name = "a",
      descriptor = "(ILjj;)Lht;",
      line = 319
   )
   public static final class607 method3762(int arg0, class128 arg1) {
      try {
         ++field7481;
         class158 var2 = class689.method5020(0, arg1);
         int var3 = arg1.method1066(32767);
         return arg0 != 512 ? null : new class607(var2.field5647, var2.field5640, var2.field5636, var2.field5631, var2.field5645, var2.field5637, var2.field5644, var2.field5638, var2.field5639, var2.field2010, var2.field2011, var2.field2006, var2.field2005, var2.field2012, var2.field2013, var3);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field7493[10] + arg0 + ',' + (arg1 != null ? field7493[3] : field7493[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cga",
      name = "g",
      descriptor = "(I)V",
      line = 334
   )
   public static final void method3763(int arg0) {
      int var1 = client.field4530;

      try {
         ++field7490;
         class111.method946(-1263464541, class261.field3566.field9446.method1176(95));
         int var2 = (class731.field10844 >> 12) + (class718.field10676 >> 3);
         class551.field8158 = class693.field10418.field9010 = 0;
         int var3 = (class669.field10064 >> 3) + (class232.field2947 >> 12);
         class693.field10418.method5001(arg0 ^ -2005, 8, 8);
         byte var4 = 18;
         class164.field2057 = new int[var4];
         class433.field6613 = new int[var4];
         class467.field7002 = new byte[var4][];
         class37.field402 = new byte[var4][];
         class706.field10568 = new byte[var4][];
         class336.field4809 = new int[var4];
         class483.field7165 = new byte[var4][];
         class447.field6796 = new int[var4];
         class357.field5408 = new int[var4];
         class483.field7166 = new int[var4];
         class219.field2790 = new int[var4][4];
         class238.field3026 = new byte[var4][];
         int var5 = 0;
         if (arg0 == -2028) {
            int var7;
            label66: {
               int var6 = (var2 - (class323.field4603 >> 4)) / 8;
               if (var1 != 0) {
                  var7 = (var3 - (class178.field2197 >> 4)) / 8;
               } else if (~(((class323.field4603 >> 4) + var2) / 8) > ~var6) {
                  var7 = var5;
                  if (var1 == 0) {
                     break label66;
                  }
               } else {
                  var7 = (var3 - (class178.field2197 >> 4)) / 8;
               }

               while(true) {
                  if (var1 != 0 || ~(((class178.field2197 >> 4) + var3) / 8) <= ~var7) {
                     do {
                        int var8 = (var6 << 8) - -var7;
                        class483.field7166[var5] = var8;
                        class336.field4809[var5] = class614.field8980.method3902("m" + var6 + "_" + var7, 90);
                        class447.field6796[var5] = class614.field8980.method3902("l" + var6 + "_" + var7, class774.method5578(arg0, -1957));
                        class433.field6613[var5] = class614.field8980.method3902("n" + var6 + "_" + var7, 92);
                        class164.field2057[var5] = class614.field8980.method3902(field7493[4] + var6 + "_" + var7, 78);
                        class357.field5408[var5] = class614.field8980.method3902(field7493[5] + var6 + "_" + var7, class774.method5578(arg0, -1952));
                        if (~class433.field6613[var5] == 0) {
                           class336.field4809[var5] = -1;
                           class447.field6796[var5] = -1;
                           class164.field2057[var5] = -1;
                           class357.field5408[var5] = -1;
                        }

                        ++var5;
                        ++var7;
                     } while(~(((class178.field2197 >> 4) + var3) / 8) <= ~var7);
                  }

                  ++var6;
                  if (~(((class323.field4603 >> 4) + var2) / 8) > ~var6) {
                     var7 = var5;
                     if (var1 == 0) {
                        break;
                     }
                  } else {
                     var7 = (var3 - (class178.field2197 >> 4)) / 8;
                  }
               }
            }

            if (var1 != 0) {
               class433.field6613[var7] = -1;
               class336.field4809[var7] = -1;
               class447.field6796[var7] = -1;
               class164.field2057[var7] = -1;
               class357.field5408[var7] = -1;
               ++var7;
            }

            while(true) {
               while(class433.field6613.length > var7) {
                  class433.field6613[var7] = -1;
                  class336.field4809[var7] = -1;
                  class447.field6796[var7] = -1;
                  class164.field2057[var7] = -1;
                  class357.field5408[var7] = -1;
                  ++var7;
               }

               if (var1 == 0) {
                  byte var9;
                  label37: {
                     if (class672.field10112 != 3) {
                        var9 = 8;
                        if (var1 == 0) {
                           break label37;
                        }
                     }

                     var9 = 4;
                  }

                  class153.method1263(false, var2, -1, var3, var9);
                  return;
               }

               ++var7;
            }
         }
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field7493[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cga",
      name = "a",
      descriptor = "(II)[I",
      line = 425
   )
   public final int[] method401(int arg0, int arg1) {
      int var3 = client.field4530;

      try {
         ++field7483;
         int[] var4 = super.field4298.method3175(arg0, (byte)-127);
         if (super.field4298.field6356) {
            int var5;
            int[] var7;
            label45: {
               var5 = class344.field5238 / this.field7485;
               int var6 = class501.field7439 / this.field7487;
               if (~var6 >= -1) {
                  var7 = this.method2299(0, false, 0);
                  if (var3 == 0) {
                     break label45;
                  }
               }

               int var8 = arg0 % var6;
               var7 = this.method2299(class501.field7439 * var8 / var6, false, 0);
            }

            int var9 = 0;
            if (var3 != 0 || class344.field5238 > var9) {
               do {
                  if (var5 <= 0) {
                     var4[var9] = var7[0];
                     if (var3 == 0) {
                        ++var9;
                        continue;
                     }
                  }

                  int var10 = var9 % var5;
                  var4[var9] = var7[class344.field5238 * var10 / var5];
                  ++var9;
               } while(class344.field5238 > var9);
            }
         }

         if (arg1 > -37) {
            field7489 = null;
         }

         return var4;
      } catch (RuntimeException var12) {
         throw class670.method4877(var12, field7493[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3764(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 125);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3765(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 22;
            break;
         case 1:
            var10005 = 120;
            break;
         case 2:
            var10005 = 115;
            break;
         case 3:
            var10005 = 62;
            break;
         default:
            var10005 = 125;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
