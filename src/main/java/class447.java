import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class447 {
   @OriginalMember(
      owner = "client!ij",
      name = "h",
      descriptor = "Ltv;"
   )
   private class590 field6184 = new class590(16);
   @OriginalMember(
      owner = "client!ij",
      name = "e",
      descriptor = "Lqh;"
   )
   private class74 field6182;
   @OriginalMember(
      owner = "client!ij",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6190 = new String[]{method3324(method3323("A+Vkq")), method3324(method3323("A+Voq")), method3324(method3323("SoV\u0007$")), method3324(method3323("F4\u0014E")), method3324(method3323("A+V\u00150F(\f\u0017q")), method3324(method3323("A+Vmq")), method3324(method3323("A+Vnq")), method3324(method3323("A+Vhq")), method3324(method3323("J5")), method3324(method3323("A+Vjq"))};
   @OriginalMember(
      owner = "client!ij",
      name = "c",
      descriptor = "Z"
   )
   public static boolean field6183 = false;
   @OriginalMember(
      owner = "client!ij",
      name = "j",
      descriptor = "I"
   )
   public static int field6180;
   @OriginalMember(
      owner = "client!ij",
      name = "d",
      descriptor = "I"
   )
   public static int field6185;
   @OriginalMember(
      owner = "client!ij",
      name = "f",
      descriptor = "I"
   )
   public static int field6186;
   @OriginalMember(
      owner = "client!ij",
      name = "i",
      descriptor = "I"
   )
   public static int field6187;
   @OriginalMember(
      owner = "client!ij",
      name = "a",
      descriptor = "I"
   )
   public static int field6188;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!ij",
      name = "g",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field6189;
   @OriginalMember(
      owner = "client!ij",
      name = "b",
      descriptor = "[Lbo;"
   )
   public static class763[] field6181;

   @OriginalMember(
      owner = "client!ij",
      name = "a",
      descriptor = "()V"
   )
   public static final void method3315() {
      for(int var0 = 0; var0 < class494.field6789; ++var0) {
         if (!class756.field10969[var0]) {
            class730 var1 = class166.field2104[var0];
            class127 var2 = var1.field10676;
            int var3 = var1.field10691;
            int var4 = var2.method1066(-1) - class187.field2291;
            int var5 = (var4 * 2 >> class76.field965) + 1;
            int var6 = 0;
            int[] var7 = new int[var5 * var5];
            int var8 = var2.method1063(-1) - var4 >> class76.field965;
            int var9 = var2.method1067(-1) - var4 >> class76.field965;
            int var10 = var2.method1067(-1) + var4 >> class76.field965;
            if (var9 < 0) {
               var6 -= var9;
               var9 = 0;
            }

            if (var10 >= class304.field4042) {
               var10 = class304.field4042 - 1;
            }

            for(int var11 = var9; var11 <= var10; ++var11) {
               short var12 = var1.field10681[var6];
               int var13 = var12 >>> 8;
               int var14 = var5 * var6 + var13;
               int var15 = (var12 >>> 8) + var8;
               int var16 = (var12 & 255) + var15 - 1;
               if (var15 < 0) {
                  var14 -= var15;
                  var15 = 0;
               }

               if (var16 >= class635.field8973) {
                  var16 = class635.field8973 - 1;
               }

               for(int var17 = var15; var17 <= var16; ++var17) {
                  byte var18 = 1;
                  class47 var19 = class737.method5341(var3, var17, var11, field6189 != null ? field6189 : (field6189 = method3322(field6190[8])));
                  if (var19 != null && var19.field546 != 0) {
                     if (var19.field546 == 1) {
                        boolean var20 = var17 - 1 >= var15;
                        boolean var21 = var17 + 1 <= var16;
                        if (!var20 && var11 + 1 <= var10) {
                           short var22 = var1.field10681[var6 + 1];
                           int var23 = (var22 >>> 8) + var8;
                           int var24 = (var22 & 255) + var23;
                           var20 = var17 > var23 && var17 < var24;
                        }

                        if (!var21 && var11 - 1 >= var9) {
                           short var25 = var1.field10681[var6 - 1];
                           int var26 = (var25 >>> 8) + var8;
                           int var27 = (var25 & 255) + var26;
                           var21 = var17 > var26 && var17 < var27;
                        }

                        if (var20 && !var21) {
                           var18 = 4;
                        } else if (var21 && !var20) {
                           var18 = 2;
                        }
                     } else {
                        boolean var28 = var17 - 1 >= var15;
                        boolean var29 = var17 + 1 <= var16;
                        if (!var28 && var11 - 1 >= var9) {
                           short var30 = var1.field10681[var6 - 1];
                           int var31 = (var30 >>> 8) + var8;
                           int var32 = (var30 & 255) + var31;
                           var28 = var17 > var31 && var17 < var32;
                        }

                        if (!var29 && var11 + 1 <= var10) {
                           short var33 = var1.field10681[var6 + 1];
                           int var34 = (var33 >>> 8) + var8;
                           int var35 = (var33 & 255) + var34;
                           var29 = var17 > var34 && var17 < var35;
                        }

                        if (var28 && !var29) {
                           var18 = 3;
                        } else if (var29 && !var28) {
                           var18 = 5;
                        }
                     }
                  }

                  var7[var14++] = var18;
               }

               ++var6;
            }

            class756.field10969[var0] = true;
            class93.field1241[var3].method1676(var2, var7);
         }
      }

   }

   @OriginalMember(
      owner = "client!ij",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method3316(int arg0, byte arg1) {
      try {
         class590 var3 = this.field6184;
         synchronized(this.field6184) {
            this.field6184.method4234(2, arg0);
         }

         if (arg1 < 30) {
            method3315();
         }

         ++field6186;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field6190[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ij",
      name = "a",
      descriptor = "(BI)Leh;"
   )
   public final class382 method3317(byte arg0, int arg1) {
      try {
         ++field6188;
         class590 var3 = this.field6184;
         class382 var4;
         synchronized(this.field6184) {
            var4 = (class382)this.field6184.method4239((long)arg1, 0);
         }

         if (var4 != null) {
            return var4;
         } else {
            class74 var5 = this.field6182;
            byte[] var6;
            synchronized(this.field6182) {
               var6 = this.field6182.method732(arg1, 30, (byte)76);
            }

            class382 var7 = new class382();
            int var8 = 48 / ((-53 - arg0) / 59);
            if (var6 != null) {
               var7.method2936(new class594(var6), false);
            }

            class590 var9 = this.field6184;
            synchronized(this.field6184) {
               this.field6184.method4238(94, var7, (long)arg1);
               return var7;
            }
         }
      } catch (RuntimeException var14) {
         throw class534.method3846(var14, field6190[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ij",
      name = "c",
      descriptor = "(B)V"
   )
   public final void method3318(byte arg0) {
      try {
         class590 var2 = this.field6184;
         synchronized(this.field6184) {
            if (arg0 > -50) {
               method3315();
            }

            this.field6184.method4245(true);
         }

         ++field6187;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field6190[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ij",
      name = "a",
      descriptor = "(Lha;B)V"
   )
   public static final void method3319(class65 arg0, byte arg1) {
      try {
         label27: {
            if (!class666.field9473) {
               class523.method3783(arg0, -77);
               if (!client.field4273) {
                  break label27;
               }
            }

            class425.method3201(117, arg0);
         }

         ++field6185;
         if (arg1 != -16) {
            field6181 = null;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6190[6] + (arg0 != null ? field6190[2] : field6190[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ij",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method3320(byte arg0) {
      try {
         field6181 = null;
         if (arg0 > -17) {
            field6183 = false;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6190[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ij",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method3321(byte arg0) {
      try {
         ++field6180;
         class590 var2 = this.field6184;
         synchronized(this.field6184) {
            this.field6184.method4244(true);
         }

         if (arg0 <= 1) {
            this.method3317((byte)-79, 52);
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field6190[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ij",
      name = "<init>",
      descriptor = "(Lnc;ILqh;)V"
   )
   public class447(class26 arg0, int arg1, class74 arg2) {
      try {
         this.field6182 = arg2;
         this.field6182.method727(30, -32767);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field6190[4] + (arg0 != null ? field6190[2] : field6190[3]) + ',' + arg1 + ',' + (arg2 != null ? field6190[2] : field6190[3]) + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!ij",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method3322(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!ij",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3323(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 89);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ij",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3324(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 40;
            break;
         case 1:
            var10005 = 65;
            break;
         case 2:
            var10005 = 120;
            break;
         case 3:
            var10005 = 41;
            break;
         default:
            var10005 = 89;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
