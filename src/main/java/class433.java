import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class433 extends class302 {
   @OriginalMember(
      owner = "client!lg",
      name = "J",
      descriptor = "I"
   )
   private int field6611 = 4096;
   @OriginalMember(
      owner = "client!lg",
      name = "N",
      descriptor = "I"
   )
   private int field6612 = 0;
   @OriginalMember(
      owner = "client!lg",
      name = "P",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6615 = new String[]{method3299(method3298("\rlD\bE")), method3299(method3298("\rlD\u000bE")), method3299(method3298("\rlD\nE")), method3299(method3298("\u001a%Dg\u0010")), method3299(method3298("\rlD\u000fE")), method3299(method3298("\u000f~\u0006%"))};
   @OriginalMember(
      owner = "client!lg",
      name = "M",
      descriptor = "I"
   )
   public static int field6607 = 1;
   @OriginalMember(
      owner = "client!lg",
      name = "L",
      descriptor = "[Lbu;"
   )
   public static class21[] field6609 = new class21[0];
   @OriginalMember(
      owner = "client!lg",
      name = "O",
      descriptor = "I"
   )
   public static int field6608;
   @OriginalMember(
      owner = "client!lg",
      name = "I",
      descriptor = "I"
   )
   public static int field6610;
   @OriginalMember(
      owner = "client!lg",
      name = "H",
      descriptor = "I"
   )
   public static int field6614;
   @OriginalMember(
      owner = "client!lg",
      name = "K",
      descriptor = "[I"
   )
   public static int[] field6613;

   @OriginalMember(
      owner = "client!lg",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method401(int arg0, int arg1) {
      int var3 = client.field4530;

      try {
         if (arg1 >= -37) {
            method3297(-121);
         }

         ++field6614;
         int[] var4 = super.field4298.method3175(arg0, (byte)-127);
         if (super.field4298.field6356) {
            int[] var5 = this.method2299(arg0, false, 0);
            int var6 = 0;
            if (var3 != 0 || ~var6 > ~class344.field5238) {
               do {
                  int var7 = var5[var6];
                  if (~this.field6612 < ~var7) {
                     var4[var6] = this.field6612;
                     if (var3 == 0) {
                        ++var6;
                        continue;
                     }
                  }

                  if (~var7 >= ~this.field6611) {
                     var4[var6] = var7;
                     if (var3 != 0) {
                        var4[var6] = this.field6611;
                        ++var6;
                     } else {
                        ++var6;
                     }
                  } else {
                     var4[var6] = this.field6611;
                     ++var6;
                  }
               } while(~var6 > ~class344.field5238);
            }
         }

         return var4;
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field6615[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lg",
      name = "a",
      descriptor = "(BI)[[I"
   )
   public final int[][] method245(byte arg0, int arg1) {
      int var3 = client.field4530;

      try {
         ++field6608;
         if (arg0 != -90) {
            this.field6611 = -49;
         }

         int[][] var4 = super.field4292.method3409(arg1, arg0 ^ -90);
         if (super.field4292.field6892) {
            int[][] var5 = this.method2297(0, arg1, arg0 + 90);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int var12 = 0;
            if (var3 != 0 || class344.field5238 > var12) {
               do {
                  int var13 = var6[var12];
                  int var14 = var7[var12];
                  int var15 = var8[var12];
                  if (~this.field6612 >= ~var13) {
                     label66: {
                        if (this.field6611 < var13) {
                           var9[var12] = this.field6611;
                           if (var3 == 0) {
                              break label66;
                           }
                        }

                        var9[var12] = var13;
                        if (var3 != 0) {
                           var9[var12] = this.field6612;
                        }
                     }
                  } else {
                     var9[var12] = this.field6612;
                  }

                  if (~this.field6612 >= ~var14) {
                     label72: {
                        if (this.field6611 >= var14) {
                           var10[var12] = var14;
                           if (var3 == 0) {
                              break label72;
                           }
                        }

                        var10[var12] = this.field6611;
                        if (var3 != 0) {
                           var10[var12] = this.field6612;
                        }
                     }
                  } else {
                     var10[var12] = this.field6612;
                  }

                  if (this.field6612 <= var15) {
                     if (~this.field6611 <= ~var15) {
                        var11[var12] = var15;
                        if (var3 == 0) {
                           ++var12;
                           continue;
                        }
                     }

                     var11[var12] = this.field6611;
                     if (var3 != 0) {
                        var11[var12] = this.field6612;
                        ++var12;
                     } else {
                        ++var12;
                     }
                  } else {
                     var11[var12] = this.field6612;
                     ++var12;
                  }
               } while(class344.field5238 > var12);
            }
         }

         return var4;
      } catch (RuntimeException var17) {
         throw class670.method4877(var17, field6615[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lg",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method3297(int arg0) {
      try {
         if (arg0 != 2) {
            field6613 = null;
         }

         field6609 = null;
         field6613 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6615[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lg",
      name = "<init>",
      descriptor = "()V"
   )
   public class433() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!lg",
      name = "a",
      descriptor = "(IILjj;)V"
   )
   public final void method244(int arg0, int arg1, class128 arg2) {
      int var4 = client.field4530;

      try {
         label57: {
            label51: {
               label50: {
                  ++field6610;
                  if (arg0 != 0) {
                     if (~arg0 == -2) {
                        break label50;
                     }

                     if (arg0 != 2) {
                        break label57;
                     }

                     if (var4 == 0) {
                        break label51;
                     }
                  }

                  this.field6612 = arg2.method1038((byte)-122);
                  if (var4 == 0) {
                     break label57;
                  }
               }

               this.field6611 = arg2.method1038((byte)-121);
               if (var4 == 0) {
                  break label57;
               }
            }

            super.field4313 = arg2.method1104(255) == 1;
         }

         if (arg1 != 0) {
            this.method401(-55, -98);
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field6615[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6615[3] : field6615[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!lg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3298(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 109);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3299(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 97;
            break;
         case 1:
            var10005 = 11;
            break;
         case 2:
            var10005 = 106;
            break;
         case 3:
            var10005 = 73;
            break;
         default:
            var10005 = 109;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
