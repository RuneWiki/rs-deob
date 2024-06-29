import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public class class524 extends class629 {
   @OriginalMember(
      owner = "client!eaa",
      name = "F",
      descriptor = "I"
   )
   private int field7666 = 4096;
   @OriginalMember(
      owner = "client!eaa",
      name = "J",
      descriptor = "Z"
   )
   private boolean field7664 = true;
   @OriginalMember(
      owner = "client!eaa",
      name = "M",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7673 = new String[]{method3943(method3942("lO'nN!")), method3943(method3942("r\u0000hn~")), method3943(method3942("g[*,")), method3943(method3942("lO'nM!")), method3943(method3942("lO'nF!")), method3943(method3942("lO'nO!")), method3943(method3942("lO'nL!"))};
   @OriginalMember(
      owner = "client!eaa",
      name = "D",
      descriptor = "Leb;"
   )
   public static class650 field7668 = new class650(8, 7);
   @OriginalMember(
      owner = "client!eaa",
      name = "G",
      descriptor = "F"
   )
   public static float field7669;
   @OriginalMember(
      owner = "client!eaa",
      name = "L",
      descriptor = "I"
   )
   public static int field7665;
   @OriginalMember(
      owner = "client!eaa",
      name = "I",
      descriptor = "I"
   )
   public static int field7667;
   @OriginalMember(
      owner = "client!eaa",
      name = "K",
      descriptor = "I"
   )
   public static int field7670;
   @OriginalMember(
      owner = "client!eaa",
      name = "H",
      descriptor = "I"
   )
   public static int field7671;
   @OriginalMember(
      owner = "client!eaa",
      name = "E",
      descriptor = "I"
   )
   public static int field7672;

   @OriginalMember(
      owner = "client!eaa",
      name = "a",
      descriptor = "(Lhw;[IBLhw;)V",
      line = 4
   )
   public static final void method3939(class141 arg0, int[] arg1, byte arg2, class141 arg3) {
      try {
         ++field7672;
         if (arg1 != null) {
            class621.field9057 = arg1;
         }

         class360.field5393 = arg0;
         if (arg2 != 53) {
            field7665 = 40;
         }

         class696.field10200 = arg3;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field7673[3] + (arg0 != null ? field7673[1] : field7673[2]) + ',' + (arg1 != null ? field7673[1] : field7673[2]) + ',' + arg2 + ',' + (arg3 != null ? field7673[1] : field7673[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!eaa",
      name = "a",
      descriptor = "(Luda;II)V",
      line = 21
   )
   public final void method241(class473 arg0, int arg1, int arg2) {
      boolean var4 = client.field4564;

      try {
         label48: {
            label42: {
               if (arg2 != 0) {
                  if (~arg2 != -2) {
                     break label48;
                  }

                  if (!var4) {
                     break label42;
                  }
               }

               this.field7666 = arg0.method3565(true);
               if (!var4) {
                  break label48;
               }
            }

            this.field7664 = ~arg0.method3564((byte)-86) == -2;
         }

         ++field7671;
         if (arg1 != 0) {
            this.field7664 = false;
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field7673[4] + (arg0 != null ? field7673[1] : field7673[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eaa",
      name = "c",
      descriptor = "(III)V",
      line = 57
   )
   public static final void method3940(int arg0, int arg1, int arg2) {
      boolean var3 = client.field4564;

      try {
         int var4;
         int var7;
         label110: {
            ++field7670;
            var4 = class511.field7461.method3351(class100.field1623.method961(class385.field5684, true), true);
            int var10000;
            if (!class510.field7456) {
               label102: {
                  class587 var5 = (class587)class685.field10080.method2579(-801);
                  if (var3) {
                     var10000 = class485.method3665(var5, -105);
                  } else if (var5 == null) {
                     var4 += 8;
                     var10000 = class234.field3420;
                     if (!var3) {
                        break label102;
                     }
                  } else {
                     var10000 = class485.method3665(var5, -105);
                  }

                  while(true) {
                     int var6 = var10000;
                     if (~var6 < ~var4) {
                        var4 = var6;
                     }

                     var5 = (class587)class685.field10080.method2583(1);
                     if (var5 == null) {
                        var4 += 8;
                        var10000 = class234.field3420;
                        if (!var3) {
                           break;
                        }
                     } else {
                        var10000 = class485.method3665(var5, -105);
                     }
                  }
               }

               class756.field10976 = (var10000 != 0 ? 26 : 22) + class103.field1686 * 16;
               var7 = class103.field1686 * 16 + 21;
               if (!var3) {
                  break label110;
               }
            }

            label81: {
               class59 var8 = (class59)class26.field398.method5680(false);
               if (var3) {
                  var10000 = ~var8.field1133;
               } else if (var8 == null) {
                  var7 = class255.field3622 * 16 - -21;
                  var4 += 8;
                  var10000 = class234.field3420;
                  if (!var3) {
                     break label81;
                  }
               } else {
                  var10000 = ~var8.field1133;
               }

               while(true) {
                  int var9;
                  if (var10000 == -2) {
                     var9 = class485.method3665((class587)var8.field1134.field11533.field4412, arg2 + 116);
                     if (var3) {
                        var9 = class124.method1207(10759, var8);
                     }
                  } else {
                     var9 = class124.method1207(10759, var8);
                  }

                  if (var4 < var9) {
                     var4 = var9;
                  }

                  var8 = (class59)class26.field398.method5676(-13612);
                  if (var8 == null) {
                     var7 = class255.field3622 * 16 - -21;
                     var4 += 8;
                     var10000 = class234.field3420;
                     if (!var3) {
                        break;
                     }
                  } else {
                     var10000 = ~var8.field1133;
                  }
               }
            }

            class756.field10976 = (var10000 == 0 ? 22 : 26) + class255.field3622 * 16;
         }

         int var10 = -(var4 / arg2) + arg1;
         if (~class720.field10406 > ~(var4 + var10)) {
            var10 = -var4 + class720.field10406;
         }

         if (var10 < 0) {
            var10 = 0;
         }

         int var11 = arg0;
         if (var7 + arg0 > class218.field3296) {
            var11 = -var7 + class218.field3296;
         }

         if (var11 < 0) {
            var11 = 0;
         }

         class582.field8424 = var10;
         class733.field10544 = var4;
         class442.field6452 = true;
         class583.field8437 = var11;
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field7673[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eaa",
      name = "<init>",
      descriptor = "()V",
      line = 246
   )
   public class524() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!eaa",
      name = "a",
      descriptor = "(II)[[I",
      line = 142
   )
   public final int[][] method243(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field7667;
         if (arg1 != 0) {
            this.field7666 = -122;
         }

         int[][] var4 = super.field9169.method785((byte)84, arg0);
         if (super.field9169.field1332) {
            int[] var5 = this.method4622((byte)123, 0, arg0 + -1 & class37.field902);
            int[] var6 = this.method4622((byte)118, 0, arg0);
            int[] var7 = this.method4622((byte)121, 0, arg0 + 1 & class37.field902);
            int[] var8 = var4[0];
            int[] var9 = var4[1];
            int[] var10 = var4[2];
            int var11 = 0;
            if (var3 || ~var11 > ~class66.field1214) {
               do {
                  int var12 = (var7[var11] + -var5[var11]) * this.field7666;
                  int var13 = (var6[var11 + 1 & class704.field10259] + -var6[var11 - 1 & class704.field10259]) * this.field7666;
                  int var14 = var13 >> 12;
                  int var15 = var12 >> 12;
                  int var16 = var14 * var14 >> 12;
                  int var17 = var15 * var15 >> 12;
                  int var18 = (int)(Math.sqrt((double)((float)(var16 + 4096 + var17) / 4096.0F)) * 4096.0D);
                  int var19;
                  int var20;
                  int var21;
                  if (~var18 != -1) {
                     var19 = var12 / var18;
                     var20 = 16777216 / var18;
                     var21 = var13 / var18;
                     if (var3) {
                        var20 = 0;
                        var21 = 0;
                        var19 = 0;
                     }
                  } else {
                     var20 = 0;
                     var21 = 0;
                     var19 = 0;
                  }

                  if (this.field7664) {
                     var21 = 2048 - -(var21 >> 1);
                     var19 = 2048 - -(var19 >> 1);
                     var20 = (var20 >> 1) + 2048;
                  }

                  var8[var11] = var21;
                  var9[var11] = var19;
                  var10[var11] = var20;
                  ++var11;
               } while(~var11 > ~class66.field1214);
            }
         }

         return var4;
      } catch (RuntimeException var23) {
         throw class608.method4462(var23, field7673[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eaa",
      name = "g",
      descriptor = "(I)V",
      line = 226
   )
   public static void method3941(int arg0) {
      try {
         field7668 = null;
         if (arg0 != 0) {
            method3939((class141)null, (int[])null, (byte)93, (class141)null);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field7673[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eaa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3942(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 3);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eaa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3943(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 9;
            break;
         case 1:
            var10005 = 46;
            break;
         case 2:
            var10005 = 70;
            break;
         case 3:
            var10005 = 64;
            break;
         default:
            var10005 = 3;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
