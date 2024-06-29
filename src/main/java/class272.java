import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public class class272 extends class302 {
   @OriginalMember(
      owner = "client!oba",
      name = "I",
      descriptor = "I"
   )
   private int field3786 = 0;
   @OriginalMember(
      owner = "client!oba",
      name = "H",
      descriptor = "I"
   )
   private int field3792 = 4096;
   @OriginalMember(
      owner = "client!oba",
      name = "S",
      descriptor = "I"
   )
   private int field3790 = 0;
   @OriginalMember(
      owner = "client!oba",
      name = "M",
      descriptor = "I"
   )
   private int field3793 = 16;
   @OriginalMember(
      owner = "client!oba",
      name = "P",
      descriptor = "I"
   )
   private int field3796 = 2000;
   @OriginalMember(
      owner = "client!oba",
      name = "T",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3797 = new String[]{method2102(method2101("ei\u00157\u0004nc\u001a 2}g")), method2102(method2101("ee\u00001\f\u007fS\u00106\u000bly\u0018'")), method2102(method2101("v\"Z}\u0010")), method2102(method2101("cy\u0018?")), method2102(method2101("ee\u0000>\f\u007fg\u0007")), method2102(method2101("ei\u00157\u0004nc\u001a 2}~\u0015*\b\u007f")), method2102(method2101("ee\u001a'2`m\u00046\tji")), method2102(method2101("nc\u0019#\f~\u007f")), method2102(method2101("k`\u001b<\u001f~d\u00157\u0002z\u007f")), method2102(method2101("`m\u00047\u0002y\u007f")), method2102(method2101("bx\u001c6\u001fai\u00026\u0001")), method2102(method2101("~o\u0006<\u0001an\u0015!")), method2102(method2101("`m\u00045\u0001lk")), method2102(method2101("bn\u0015}.%")), method2102(method2101("ye\u00196\u001fom\u0006\f\thj\u0015&\u0001y")), method2102(method2101("cm\u001962do\u001b=\u001e")), method2102(method2101("n~\u001b \u001e")), method2102(method2101("ee\u001a'2ei\u00157\u0004nc\u001a ")), method2102(method2101("ee\u001a'2`m\u0004>\f\u007fg\u0011!\u001e")), method2102(method2101("bn\u0015}(%")), method2102(method2101("bn\u0015},%")), method2102(method2101("bn\u0015}*%")), method2102(method2101("bn\u0015}+%")), method2102(method2101("bn\u0015})%"))};
   @OriginalMember(
      owner = "client!oba",
      name = "L",
      descriptor = "Lnn;"
   )
   public static class436 field3785 = new class436(method2102(method2101("ZX&\u0010")), method2102(method2101("bj\u0012:\u000eh")), method2102(method2101("R~\u0017")), 1);
   @OriginalMember(
      owner = "client!oba",
      name = "N",
      descriptor = "I"
   )
   public static int field3787;
   @OriginalMember(
      owner = "client!oba",
      name = "Q",
      descriptor = "I"
   )
   public static int field3788;
   @OriginalMember(
      owner = "client!oba",
      name = "O",
      descriptor = "I"
   )
   public static int field3789;
   @OriginalMember(
      owner = "client!oba",
      name = "R",
      descriptor = "I"
   )
   public static int field3791;
   @OriginalMember(
      owner = "client!oba",
      name = "J",
      descriptor = "I"
   )
   public static int field3794;
   @OriginalMember(
      owner = "client!oba",
      name = "K",
      descriptor = "I"
   )
   public static int field3795;

   @OriginalMember(
      owner = "client!oba",
      name = "<init>",
      descriptor = "()V",
      line = 3
   )
   public class272() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!oba",
      name = "a",
      descriptor = "(IILjj;)V",
      line = 6
   )
   public final void method244(int arg0, int arg1, class128 arg2) {
      try {
         ++field3791;
         if (arg1 != 0) {
            this.field3796 = -102;
         }

         if (~arg0 != -1) {
            if (arg0 == 1) {
               this.field3796 = arg2.method1038((byte)-118);
               return;
            }

            if (~arg0 == -3) {
               this.field3793 = arg2.method1104(255);
               return;
            }

            if (arg0 == 3) {
               this.field3790 = arg2.method1038((byte)-105);
               return;
            }

            if (arg0 != 4) {
               return;
            }

            if (client.field4530 == 0) {
               this.field3792 = arg2.method1038((byte)-93);
               return;
            }
         }

         this.field3786 = arg2.method1104(255);
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field3797[22] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3797[2] : field3797[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!oba",
      name = "a",
      descriptor = "(Leaa;I)V",
      line = 71
   )
   public static final void method2098(class526 arg0, int arg1) {
      try {
         class334.field4776 = arg0.method3902(field3797[4], 75);
         ++field3794;
         class132.field1652 = arg0.method3902(field3797[1], arg1 + -11102);
         if (arg1 != 11197) {
            field3785 = null;
         }

         class518.field7552 = arg0.method3902(field3797[14], 117);
         class532.field7776 = arg0.method3902(field3797[0], arg1 ^ 11233);
         class348.field5288 = arg0.method3902(field3797[5], 127);
         class309.field4403 = arg0.method3902(field3797[17], 68);
         class675.field10135 = arg0.method3902(field3797[18], 66);
         class352.field5347 = arg0.method3902(field3797[12], 76);
         class577.field8573 = arg0.method3902(field3797[16], arg1 ^ 11209);
         class225.field2895 = arg0.method3902(field3797[9], 70);
         class309.field4399 = arg0.method3902(field3797[11], 102);
         class290.field4069 = arg0.method3902(field3797[15], 127);
         class205.field2632 = arg0.method3902(field3797[8], 102);
         class687.field10358 = arg0.method3902(field3797[7], 64);
         class639.field9305 = arg0.method3902(field3797[10], arg1 + -11131);
         class382.field5862 = arg0.method3902(field3797[6], arg1 ^ 11242);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field3797[13] + (arg0 != null ? field3797[2] : field3797[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oba",
      name = "a",
      descriptor = "(IBIIII)V",
      line = 98
   )
   public static final void method2099(int param0, byte param1, int param2, int param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!oba",
      name = "a",
      descriptor = "(II)[I",
      line = 125
   )
   public final int[] method401(int arg0, int arg1) {
      int var3 = client.field4530;

      try {
         ++field3787;
         if (arg1 > -37) {
            field3788 = -38;
         }

         int[] var4 = super.field4298.method3175(arg0, (byte)-127);
         if (super.field4298.field6356) {
            int var5 = this.field3792 >> 1;
            int[][] var6 = super.field4298.method3176(-1);
            Random var7 = new Random((long)this.field3786);
            int var8 = 0;
            if (var3 != 0 || ~var8 > ~this.field3796) {
               do {
                  int var9 = ~this.field3792 < -1 ? this.field3790 - var5 - -class413.method3157(var7, this.field3792, (byte)54) : this.field3790;
                  int var10 = (4089 & var9) >> 4;
                  int var11 = class413.method3157(var7, class344.field5238, (byte)54);
                  int var12 = class413.method3157(var7, class501.field7439, (byte)54);
                  int var13 = (class724.field10777[var10] * this.field3793 >> 12) + var11;
                  int var14 = (class731.field10851[var10] * this.field3793 >> 12) + var12;
                  int var15 = -var12 + var14;
                  int var16 = -var11 + var13;
                  if (var16 == 0 && ~var15 == -1) {
                     ++var8;
                  } else {
                     if (var15 < 0) {
                        var15 = -var15;
                     }

                     boolean var10000;
                     if (~var16 > -1) {
                        var16 = -var16;
                        var10000 = var16 < var15;
                     } else {
                        var10000 = var16 < var15;
                     }

                     boolean var17 = var10000;
                     if (var17) {
                        int var18 = var11;
                        var11 = var12;
                        int var19 = var13;
                        var12 = var18;
                        var13 = var14;
                        var14 = var19;
                     }

                     if (~var11 < ~var13) {
                        int var20 = var11;
                        int var21 = var12;
                        var11 = var13;
                        var13 = var20;
                        var12 = var14;
                        var14 = var21;
                     }

                     int var22 = var12;
                     int var23 = -var11 + var13;
                     int var24 = -var12 + var14;
                     int var25 = -var23 / 2;
                     int var26 = 2048 / var23;
                     int var27 = 1024 - (class413.method3157(var7, 4096, (byte)54) >> 2);
                     int var35;
                     if (~var24 > -1) {
                        var24 = -var24;
                        var35 = var14 > var12 ? 1 : -1;
                     } else {
                        var35 = var14 > var12 ? 1 : -1;
                     }

                     int var28 = var35;
                     int var29 = var11;
                     if (var3 == 0 && var11 >= var13) {
                        ++var8;
                     } else {
                        do {
                           int var30 = (var29 - var11) * var26 + (var27 - -1024);
                           int var31 = class264.field3612 & var29;
                           int var32 = class275.field3837 & var22;
                           if (var17) {
                              var6[var32][var31] = var30;
                              if (var3 != 0) {
                                 var6[var31][var32] = var30;
                              }
                           } else {
                              var6[var31][var32] = var30;
                           }

                           var25 += var24;
                           if (~var25 < -1) {
                              var22 -= -var28;
                              var25 -= var23;
                           }

                           ++var29;
                        } while(var29 < var13);

                        ++var8;
                     }
                  }
               } while(~var8 > ~this.field3796);
            }
         }

         return var4;
      } catch (RuntimeException var34) {
         throw class670.method4877(var34, field3797[20] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oba",
      name = "f",
      descriptor = "(I)V",
      line = 265
   )
   public static void method2100(int arg0) {
      try {
         if (arg0 != 0) {
            field3785 = null;
         }

         field3785 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3797[19] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oba",
      name = "b",
      descriptor = "(B)V",
      line = 281
   )
   public final void method708(byte arg0) {
      try {
         class378.method2923(-128);
         if (arg0 >= -87) {
            this.field3786 = -44;
         }

         ++field3795;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field3797[23] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2101(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 109);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2102(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 13;
            break;
         case 1:
            var10005 = 12;
            break;
         case 2:
            var10005 = 116;
            break;
         case 3:
            var10005 = 83;
            break;
         default:
            var10005 = 109;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
