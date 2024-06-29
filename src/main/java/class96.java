import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oia")
public class class96 extends class629 {
   @OriginalMember(
      owner = "client!oia",
      name = "K",
      descriptor = "I"
   )
   private int field1536 = 2000;
   @OriginalMember(
      owner = "client!oia",
      name = "F",
      descriptor = "I"
   )
   private int field1542 = 4096;
   @OriginalMember(
      owner = "client!oia",
      name = "I",
      descriptor = "I"
   )
   private int field1543 = 0;
   @OriginalMember(
      owner = "client!oia",
      name = "G",
      descriptor = "I"
   )
   private int field1544 = 16;
   @OriginalMember(
      owner = "client!oia",
      name = "H",
      descriptor = "I"
   )
   private int field1539 = 0;
   @OriginalMember(
      owner = "client!oia",
      name = "N",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1546 = new String[]{method925(method924("\nw\u0005dnM")), method925(method924("\u000bk\b&")), method925(method924("\u001e0JdV")), method925(method924("\nw\u0005daM")), method925(method924("\nw\u0005dbM")), method925(method924("\nw\u0005dfM"))};
   @OriginalMember(
      owner = "client!oia",
      name = "J",
      descriptor = "[I"
   )
   public static int[] field1537 = new int[25];
   @OriginalMember(
      owner = "client!oia",
      name = "D",
      descriptor = "I"
   )
   public static int field1540;
   @OriginalMember(
      owner = "client!oia",
      name = "L",
      descriptor = "I"
   )
   public static int field1541;
   @OriginalMember(
      owner = "client!oia",
      name = "M",
      descriptor = "I"
   )
   public static int field1545;
   @OriginalMember(
      owner = "client!oia",
      name = "E",
      descriptor = "Lhw;"
   )
   public static class141 field1538;

   @OriginalMember(
      owner = "client!oia",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method901(int arg0) {
      try {
         if (arg0 != 245880940) {
            this.method901(90);
         }

         ++field1545;
         class375.method2933(256);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1546[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oia",
      name = "b",
      descriptor = "(Z)V"
   )
   public static void method923(boolean arg0) {
      try {
         field1538 = null;
         field1537 = null;
         if (arg0) {
            method923(false);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field1546[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oia",
      name = "<init>",
      descriptor = "()V"
   )
   public class96() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!oia",
      name = "a",
      descriptor = "(Luda;II)V"
   )
   public final void method241(class473 arg0, int arg1, int arg2) {
      boolean var4 = client.field4564;

      try {
         label64: {
            label63: {
               label62: {
                  label61: {
                     label60: {
                        if (arg2 != 0) {
                           if (arg2 == 1) {
                              break label60;
                           }

                           if (arg2 == 2) {
                              break label61;
                           }

                           if (~arg2 == -4) {
                              break label62;
                           }

                           if (~arg2 != -5) {
                              break label64;
                           }

                           if (!var4) {
                              break label63;
                           }
                        }

                        this.field1539 = arg0.method3564((byte)-88);
                        if (!var4) {
                           break label64;
                        }
                     }

                     this.field1536 = arg0.method3565(true);
                     if (!var4) {
                        break label64;
                     }
                  }

                  this.field1544 = arg0.method3564((byte)-42);
                  if (!var4) {
                     break label64;
                  }
               }

               this.field1543 = arg0.method3565(true);
               if (!var4) {
                  break label64;
               }
            }

            this.field1542 = arg0.method3565(true);
         }

         if (arg1 != 0) {
            this.method241((class473)null, -83, -27);
         }

         ++field1540;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field1546[0] + (arg0 != null ? field1546[2] : field1546[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oia",
      name = "b",
      descriptor = "(II)[I"
   )
   public final int[] method45(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field1541;
         int[] var4 = super.field9161.method3870((byte)56, arg0);
         if (arg1 != 2048) {
            this.method45(75, 8);
         }

         if (super.field9161.field7474) {
            int var5 = this.field1542 >> 1;
            int[][] var6 = super.field9161.method3869((byte)-88);
            Random var7 = new Random((long)this.field1539);
            int var8 = 0;
            int var10000;
            if (var3) {
               var10000 = this.field1542 <= 0 ? this.field1543 : this.field1543 + class398.method3070(this.field1542, var7, (byte)99) + -var5;
            } else {
               if (~this.field1536 >= ~var8) {
                  return var4;
               }

               var10000 = this.field1542 <= 0 ? this.field1543 : this.field1543 + class398.method3070(this.field1542, var7, (byte)99) + -var5;
            }

            while(true) {
               label151: {
                  int var9 = var10000;
                  int var10 = var9 >> 4 & 255;
                  int var11 = class398.method3070(class66.field1214, var7, (byte)17);
                  int var12 = class398.method3070(class686.field10095, var7, (byte)45);
                  int var13 = (class549.field7922[var10] * this.field1544 >> 12) + var11;
                  int var14 = (class320.field4618[var10] * this.field1544 >> 12) + var12;
                  int var15 = var14 - var12;
                  int var16 = var13 - var11;
                  if (var16 == 0) {
                     if (~var15 == -1) {
                        ++var8;
                        break label151;
                     }

                     if (~var15 > -1) {
                        var15 = -var15;
                     }
                  } else if (~var15 > -1) {
                     var15 = -var15;
                  }

                  boolean var17;
                  int var18;
                  int var19;
                  if (var16 < 0) {
                     var16 = -var16;
                     var17 = ~var15 < ~var16;
                     if (var17) {
                        var18 = var11;
                        var19 = var13;
                        var11 = var12;
                        var12 = var18;
                        var13 = var14;
                        var14 = var19;
                     }
                  } else {
                     var17 = ~var15 < ~var16;
                     if (var17) {
                        var18 = var11;
                        var19 = var13;
                        var11 = var12;
                        var12 = var18;
                        var13 = var14;
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
                     var27 = 1024 + -(class398.method3070(4096, var7, (byte)50) >> 2);
                     var28 = ~var12 >= ~var14 ? -1 : 1;
                     if (var24 < 0) {
                        var24 = -var24;
                     }
                  } else {
                     var22 = var12;
                     var23 = -var11 + var13;
                     var24 = -var12 + var14;
                     var25 = -var23 / 2;
                     var26 = 2048 / var23;
                     var27 = 1024 + -(class398.method3070(4096, var7, (byte)50) >> 2);
                     var28 = ~var14 >= ~var12 ? -1 : 1;
                     if (var24 < 0) {
                        var24 = -var24;
                     }
                  }

                  int var29 = var11;
                  if (!var3 && var11 >= var13) {
                     ++var8;
                  } else {
                     while(true) {
                        int var30 = var27 + 1024 - -((var29 - var11) * var26);
                        int var31 = class704.field10259 & var29;
                        int var32 = var22 & class37.field902;
                        var25 += var24;
                        if (var17) {
                           var6[var32][var31] = var30;
                           if (var3) {
                              var6[var31][var32] = var30;
                           }
                        } else {
                           var6[var31][var32] = var30;
                        }

                        if (~var25 < -1) {
                           var22 += var28;
                           var25 -= var23;
                        }

                        ++var29;
                        if (var29 >= var13) {
                           ++var8;
                           break;
                        }
                     }
                  }
               }

               if (~this.field1536 >= ~var8) {
                  break;
               }

               var10000 = this.field1542 <= 0 ? this.field1543 : this.field1543 + class398.method3070(this.field1542, var7, (byte)99) + -var5;
            }
         }

         return var4;
      } catch (RuntimeException var34) {
         throw class608.method4462(var34, field1546[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method924(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 43);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method925(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 101;
            break;
         case 1:
            var10005 = 30;
            break;
         case 2:
            var10005 = 100;
            break;
         case 3:
            var10005 = 74;
            break;
         default:
            var10005 = 43;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
