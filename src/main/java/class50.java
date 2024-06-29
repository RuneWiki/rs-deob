import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sca")
public class class50 extends class302 {
   @OriginalMember(
      owner = "client!sca",
      name = "I",
      descriptor = "Z"
   )
   private boolean field606 = true;
   @OriginalMember(
      owner = "client!sca",
      name = "L",
      descriptor = "Z"
   )
   private boolean field607 = true;
   @OriginalMember(
      owner = "client!sca",
      name = "P",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field609 = new String[]{method405(method404("\u001bDr;[@")), method405(method404("\u0013\t=;d")), method405(method404("\u001bDr;_@")), method405(method404("\u0006R\u007fy")), method405(method404("\u001bDr;X@")), method405(method404("\u001bDr;Z@"))};
   @OriginalMember(
      owner = "client!sca",
      name = "J",
      descriptor = "Lsd;"
   )
   public static class101 field604 = new class101(129, -2);
   @OriginalMember(
      owner = "client!sca",
      name = "N",
      descriptor = "Lvha;"
   )
   public static class713 field605 = new class713();
   @OriginalMember(
      owner = "client!sca",
      name = "H",
      descriptor = "I"
   )
   public static int field608 = 0;
   @OriginalMember(
      owner = "client!sca",
      name = "K",
      descriptor = "I"
   )
   public static int field601;
   @OriginalMember(
      owner = "client!sca",
      name = "M",
      descriptor = "I"
   )
   public static int field602;
   @OriginalMember(
      owner = "client!sca",
      name = "O",
      descriptor = "I"
   )
   public static int field603;

   @OriginalMember(
      owner = "client!sca",
      name = "a",
      descriptor = "(IILjj;)V"
   )
   public final void method244(int arg0, int arg1, class128 arg2) {
      try {
         ++field603;
         if (arg1 != 0) {
            field608 = 20;
         }

         if (~arg0 != -1) {
            if (~arg0 == -2) {
               this.field606 = ~arg2.method1104(255) == -2;
               return;
            }

            if (~arg0 != -3) {
               return;
            }

            if (client.field4530 == 0) {
               super.field4313 = ~arg2.method1104(255) == -2;
               return;
            }
         }

         this.field607 = arg2.method1104(255) == 1;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field609[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field609[1] : field609[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sca",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method401(int arg0, int arg1) {
      int var3 = client.field4530;

      try {
         ++field601;
         if (arg1 >= -37) {
            this.method244(-92, 56, (class128)null);
         }

         int[] var4 = super.field4298.method3175(arg0, (byte)-127);
         if (super.field4298.field6356) {
            int[] var5 = this.method2299(this.field606 ? class275.field3837 - arg0 : arg0, false, 0);
            if (this.field607) {
               int var6 = 0;
               if (var3 != 0) {
                  var4[var6] = var5[class264.field3612 - var6];
                  ++var6;
               }

               while(true) {
                  while(~class344.field5238 < ~var6) {
                     var4[var6] = var5[class264.field3612 - var6];
                     ++var6;
                  }

                  if (var3 == 0) {
                     if (var3 == 0) {
                        return var4;
                     }
                     break;
                  }

                  ++var6;
               }
            }

            class195.method1495(var5, 0, var4, 0, class344.field5238);
         }

         return var4;
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field609[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sca",
      name = "a",
      descriptor = "(BI)[[I"
   )
   public final int[][] method245(byte arg0, int arg1) {
      int var3 = client.field4530;

      try {
         if (arg0 != -90) {
            field608 = 8;
         }

         ++field602;
         int[][] var4 = super.field4292.method3409(arg1, arg0 + 90);
         if (super.field4292.field6892) {
            int[][] var5 = this.method2297(0, this.field606 ? -arg1 + class275.field3837 : arg1, arg0 + 90);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            if (!this.field607) {
               int var12 = 0;
               if (var3 != 0) {
                  var9[var12] = var6[var12];
                  var10[var12] = var7[var12];
                  var11[var12] = var8[var12];
                  ++var12;
               }

               while(true) {
                  while(class344.field5238 > var12) {
                     var9[var12] = var6[var12];
                     var10[var12] = var7[var12];
                     var11[var12] = var8[var12];
                     ++var12;
                  }

                  if (var3 == 0) {
                     if (var3 == 0) {
                        return var4;
                     }
                     break;
                  }

                  ++var12;
               }
            }

            int var13 = 0;
            if (var3 != 0 || ~var13 > ~class344.field5238) {
               do {
                  var9[var13] = var6[class264.field3612 - var13];
                  var10[var13] = var7[-var13 + class264.field3612];
                  var11[var13] = var8[-var13 + class264.field3612];
                  ++var13;
               } while(~var13 > ~class344.field5238);
            }
         }

         return var4;
      } catch (RuntimeException var15) {
         throw class670.method4877(var15, field609[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sca",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method402(int arg0) {
      try {
         field604 = null;
         if (arg0 >= -79) {
            method403(-93, -96);
         }

         field605 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field609[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sca",
      name = "<init>",
      descriptor = "()V"
   )
   public class50() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!sca",
      name = "b",
      descriptor = "(II)V"
   )
   public static final void method403(int arg0, int arg1) {
      class72 var2 = class353.field5360[0][arg0][arg1];

      for(int var3 = 0; var3 < 3; ++var3) {
         class72 var4 = class353.field5360[var3][arg0][arg1] = class353.field5360[var3 + 1][arg0][arg1];
         if (var4 != null) {
            for(class389 var5 = var4.field910; var5 != null; var5 = var5.field5942) {
               class741 var6 = var5.field5943;
               if (var6.field10995 == arg0 && var6.field11000 == arg1) {
                  --var6.field9010;
               }
            }

            if (var4.field919 != null) {
               --var4.field919.field9010;
            }

            if (var4.field907 != null) {
               --var4.field907.field9010;
            }

            if (var4.field915 != null) {
               --var4.field915.field9010;
            }

            if (var4.field922 != null) {
               --var4.field922.field9010;
            }

            if (var4.field913 != null) {
               --var4.field913.field9010;
            }
         }
      }

      if (class353.field5360[0][arg0][arg1] == null) {
         class353.field5360[0][arg0][arg1] = new class72(0);
         class353.field5360[0][arg0][arg1].field921 = 1;
      }

      class353.field5360[0][arg0][arg1].field918 = var2;
      class353.field5360[3][arg0][arg1] = null;
   }

   @OriginalMember(
      owner = "client!sca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method404(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 25);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method405(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 104;
            break;
         case 1:
            var10005 = 39;
            break;
         case 2:
            var10005 = 19;
            break;
         case 3:
            var10005 = 21;
            break;
         default:
            var10005 = 25;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
