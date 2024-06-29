import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class72 extends class264 {
   @OriginalMember(
      owner = "client!qr",
      name = "F",
      descriptor = "I"
   )
   private int field883 = 0;
   @OriginalMember(
      owner = "client!qr",
      name = "M",
      descriptor = "I"
   )
   private int field888 = 16;
   @OriginalMember(
      owner = "client!qr",
      name = "N",
      descriptor = "I"
   )
   private int field889 = 2000;
   @OriginalMember(
      owner = "client!qr",
      name = "O",
      descriptor = "I"
   )
   private int field884 = 4096;
   @OriginalMember(
      owner = "client!qr",
      name = "S",
      descriptor = "I"
   )
   private int field890 = 0;
   @OriginalMember(
      owner = "client!qr",
      name = "K",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field891 = new String[]{method666(method665("_\u0010Uc%")), method666(method665("@\u0017\u0017D")), method666(method665("ULU\u0006p")), method666(method665("_\u0010Ui%")), method666(method665("_\u0010Uk%")), method666(method665("_\u0010Un%")), method666(method665("_\u0010Ul%")), method666(method665("_\u0010Uj%")), method666(method665("_\u0010Um%"))};
   @OriginalMember(
      owner = "client!qr",
      name = "G",
      descriptor = "Llea;"
   )
   public static class639 field885 = new class639(1, 5);
   @OriginalMember(
      owner = "client!qr",
      name = "J",
      descriptor = "I"
   )
   public static int field877;
   @OriginalMember(
      owner = "client!qr",
      name = "P",
      descriptor = "I"
   )
   public static int field878;
   @OriginalMember(
      owner = "client!qr",
      name = "I",
      descriptor = "I"
   )
   public static int field879;
   @OriginalMember(
      owner = "client!qr",
      name = "Q",
      descriptor = "I"
   )
   public static int field880;
   @OriginalMember(
      owner = "client!qr",
      name = "H",
      descriptor = "I"
   )
   public static int field881;
   @OriginalMember(
      owner = "client!qr",
      name = "L",
      descriptor = "I"
   )
   public static int field882;
   @OriginalMember(
      owner = "client!qr",
      name = "R",
      descriptor = "I"
   )
   public static int field887;
   @OriginalMember(
      owner = "client!qr",
      name = "T",
      descriptor = "[Lbg;"
   )
   public static class492[] field886;

   @OriginalMember(
      owner = "client!qr",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method6(int arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         int var4 = -102 / ((arg1 - 24) / 44);
         ++field887;
         int[] var5 = super.field3641.method3079(-14361, arg0);
         if (super.field3641.field5922) {
            int var6 = this.field884 >> 1;
            int[][] var7 = super.field3641.method3078(false);
            Random var8 = new Random((long)this.field883);
            int var9 = 0;
            if (var3 || var9 < this.field889) {
               do {
                  int var10 = this.field884 <= 0 ? this.field890 : -var6 + this.field890 + class258.method1968((byte)-38, var8, this.field884);
                  int var11 = (4087 & var10) >> 4;
                  int var12 = class258.method1968((byte)-21, var8, class430.field6152);
                  int var13 = class258.method1968((byte)-57, var8, class20.field234);
                  int var14 = var12 - -(class290.field4017[var11] * this.field888 >> 12);
                  int var15 = (class270.field3734[var11] * this.field888 >> 12) + var13;
                  int var16 = -var13 + var15;
                  int var17 = -var12 + var14;
                  if (~var17 == -1) {
                     if (~var16 == -1) {
                        ++var9;
                        continue;
                     }

                     if (~var17 > -1) {
                        var17 = -var17;
                     }
                  } else if (~var17 > -1) {
                     var17 = -var17;
                  }

                  if (~var16 > -1) {
                     var16 = -var16;
                  }

                  boolean var18 = ~var16 < ~var17;
                  if (var18) {
                     int var19 = var12;
                     int var20 = var14;
                     var12 = var13;
                     var14 = var15;
                     var13 = var19;
                     var15 = var20;
                  }

                  if (~var12 < ~var14) {
                     int var21 = var12;
                     int var22 = var13;
                     var12 = var14;
                     var13 = var15;
                     var14 = var21;
                     var15 = var22;
                  }

                  int var23 = var13;
                  int var24 = -var12 + var14;
                  int var25 = var15 - var13;
                  int var26 = -var24 / 2;
                  int var27 = 2048 / var24;
                  int var28 = -(class258.method1968((byte)-107, var8, 4096) >> 2) + 1024;
                  if (~var25 > -1) {
                     var25 = -var25;
                  }

                  int var29 = ~var13 <= ~var15 ? -1 : 1;
                  int var30 = var12;
                  if (!var3 && ~var14 >= ~var12) {
                     ++var9;
                  } else {
                     do {
                        int var31 = (-var12 + var30) * var27 + var28 + 1024;
                        int var32 = class78.field967 & var30;
                        int var33 = var23 & class220.field3144;
                        if (!var18) {
                           var7[var32][var33] = var31;
                           if (var3) {
                              var7[var33][var32] = var31;
                           }
                        } else {
                           var7[var33][var32] = var31;
                        }

                        var26 += var25;
                        if (var26 > 0) {
                           var23 += var29;
                           var26 += -var24;
                        }

                        ++var30;
                     } while(~var14 < ~var30);

                     ++var9;
                  }
               } while(var9 < this.field889);
            }
         }

         return var5;
      } catch (RuntimeException var35) {
         throw class237.method1823(var35, field891[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qr",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method413(int arg0) {
      try {
         if (arg0 >= 49) {
            ++field881;
            class69.method644(693);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field891[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qr",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method661(byte arg0) {
      try {
         field886 = null;
         field885 = null;
         int var1 = 28 / ((62 - arg0) / 32);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field891[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qr",
      name = "<init>",
      descriptor = "()V"
   )
   public class72() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!qr",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method662(byte arg0) {
      boolean var1 = client.field4360;

      try {
         ++field882;
         class60 var2 = (class60)class552.field7922.method2933(2);
         if (!var1 && var2 == null) {
            if (arg0 < 76) {
               field885 = null;
            }
         } else {
            do {
               class308 var3 = var2.field740;
               if (var3.field4240 < class96.field1234) {
                  var2.method3165(120);
                  var3.method2286(true);
                  if (!var1) {
                     var2 = (class60)class552.field7922.method2940(false);
                     continue;
                  }
               }

               if (var3.field4219 <= class96.field1234) {
                  var3.method2288(false);
                  if (~var3.field4227 < -1) {
                     class529 var4 = (class529)class328.field4479.method329((byte)103, (long)(var3.field4227 + -1));
                     if (var4 != null) {
                        class506 var5 = var4.field7559;
                        if (~var5.field10694 <= -1 && ~var5.field10694 > ~(class644.field9403 * 512) && ~var5.field10693 <= -1 && ~(class337.field4594 * 512) < ~var5.field10693) {
                           var3.method2290(var5.field10694, class96.field1234, -15473, class102.method851(var3.field10701, (byte)127, var5.field10694, var5.field10693) + -var3.field4213, var5.field10693);
                        }
                     }
                  }

                  if (var3.field4227 < 0) {
                     int var6 = -var3.field4227 + -1;
                     class121 var7;
                     if (~class358.field4891 != ~var6) {
                        var7 = class380.field5483[var6];
                        if (var1) {
                           var7 = class564.field8045;
                        }
                     } else {
                        var7 = class564.field8045;
                     }

                     if (var7 != null && var7.field10694 >= 0 && var7.field10694 < class644.field9403 * 512 && var7.field10693 >= 0 && ~(class337.field4594 * 512) < ~var7.field10693) {
                        var3.method2290(var7.field10694, class96.field1234, -15473, class102.method851(var3.field10701, (byte)127, var7.field10694, var7.field10693) + -var3.field4213, var7.field10693);
                     }
                  }

                  var3.method2287(class294.field4045, (byte)81);
                  class430.method3180(var3, true);
               }

               var2 = (class60)class552.field7922.method2940(false);
            } while(var2 != null);

            if (arg0 < 76) {
               field885 = null;
            }
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field891[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qr",
      name = "d",
      descriptor = "(I)Lgk;"
   )
   public static final class503 method663(int arg0) {
      try {
         ++field880;
         if (~class625.field9187 > ~class316.field4305.length) {
            return class316.field4305[class625.field9187++];
         } else {
            return arg0 != 1000 ? null : null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field891[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qr",
      name = "g",
      descriptor = "(I)V"
   )
   public static final void method664(int arg0) {
      try {
         class562.field8027 = 0;
         class545.field7817 = 0;
         class147.field1929 = new int[class154.field2185][class457.field6539 + 1][class16.field190 + 1];
         class740.field10795 = new class311[2000];
         class443.field6309 = new class311[500];
         class787.field11559 = 0;
         if (arg0 < 100) {
            method663(27);
         }

         class484.field6923 = new class311[1000];
         class539.field7689 = class729.field10681;
         ++field879;
         class168.field2345 = false;
         class67.field818 = new class311[500];
         class288.field4000 = 0;
         class642.field9388 = class729.field10681;
         if (!(class80.field1038 instanceof class724)) {
            class696.field10207 = true;
         } else {
            class696.field10207 = false;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field891[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qr",
      name = "a",
      descriptor = "(ILwf;I)V"
   )
   public final void method3(int arg0, class147 arg1, int arg2) {
      boolean var4 = client.field4360;

      try {
         label64: {
            label63: {
               label62: {
                  label61: {
                     label60: {
                        ++field878;
                        if (~arg0 != -1) {
                           if (arg0 == 1) {
                              break label60;
                           }

                           if (arg0 == 2) {
                              break label61;
                           }

                           if (arg0 == 3) {
                              break label62;
                           }

                           if (arg0 != 4) {
                              break label64;
                           }

                           if (!var4) {
                              break label63;
                           }
                        }

                        this.field883 = arg1.method1143(-15465);
                        if (!var4) {
                           break label64;
                        }
                     }

                     this.field889 = arg1.method1211(-26166);
                     if (!var4) {
                        break label64;
                     }
                  }

                  this.field888 = arg1.method1143(-15465);
                  if (!var4) {
                     break label64;
                  }
               }

               this.field890 = arg1.method1211(-26166);
               if (!var4) {
                  break label64;
               }
            }

            this.field884 = arg1.method1211(-26166);
         }

         if (arg2 < 49) {
            field877 = 99;
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field891[3] + arg0 + ',' + (arg1 != null ? field891[2] : field891[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method665(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 13);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method666(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 46;
            break;
         case 1:
            var10005 = 98;
            break;
         case 2:
            var10005 = 123;
            break;
         case 3:
            var10005 = 40;
            break;
         default:
            var10005 = 13;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
