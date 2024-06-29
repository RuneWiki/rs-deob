import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public class class707 extends class667 {
   @OriginalMember(
      owner = "client!saa",
      name = "eb",
      descriptor = "I"
   )
   public int field10635 = -1;
   @OriginalMember(
      owner = "client!saa",
      name = "P",
      descriptor = "Z"
   )
   private boolean field10638 = false;
   @OriginalMember(
      owner = "client!saa",
      name = "cb",
      descriptor = "I"
   )
   private int field10648 = 0;
   @OriginalMember(
      owner = "client!saa",
      name = "R",
      descriptor = "I"
   )
   public int field10654 = -1;
   @OriginalMember(
      owner = "client!saa",
      name = "O",
      descriptor = "I"
   )
   public int field10641 = 0;
   @OriginalMember(
      owner = "client!saa",
      name = "L",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10659 = new String[]{method5219(method5218("QCk-")), method5219(method5218("D\u0018)o~")), method5219(method5218("LWfoI\u0017")), method5219(method5218("LWfoD\u0017")), method5219(method5218("LWfoE\u0017")), method5219(method5218("LWfoK\u0017")), method5219(method5218("WPf")), method5219(method5218("LWfoJ\u0017")), method5219(method5218("LWfoG\u0017")), method5219(method5218("LWfoH\u0017")), method5219(method5218("LWfoA\u0017")), method5219(method5218("LWfoL\u0017")), method5219(method5218("LWfoS\u0017")), method5219(method5218("LWfoO\u0017")), method5219(method5218("LWfoV~\u001e")), method5219(method5218("LWfoV\u0017"))};
   @OriginalMember(
      owner = "client!saa",
      name = "S",
      descriptor = "I"
   )
   public static int field10649 = 1337;
   @OriginalMember(
      owner = "client!saa",
      name = "fb",
      descriptor = "I"
   )
   public static int field10636;
   @OriginalMember(
      owner = "client!saa",
      name = "ib",
      descriptor = "I"
   )
   public static int field10637;
   @OriginalMember(
      owner = "client!saa",
      name = "gb",
      descriptor = "I"
   )
   public static int field10639;
   @OriginalMember(
      owner = "client!saa",
      name = "hb",
      descriptor = "I"
   )
   public static int field10640;
   @OriginalMember(
      owner = "client!saa",
      name = "ab",
      descriptor = "I"
   )
   public static int field10642;
   @OriginalMember(
      owner = "client!saa",
      name = "V",
      descriptor = "I"
   )
   public static int field10643;
   @OriginalMember(
      owner = "client!saa",
      name = "M",
      descriptor = "I"
   )
   public static int field10644;
   @OriginalMember(
      owner = "client!saa",
      name = "X",
      descriptor = "I"
   )
   public static int field10645;
   @OriginalMember(
      owner = "client!saa",
      name = "Z",
      descriptor = "I"
   )
   public static int field10646;
   @OriginalMember(
      owner = "client!saa",
      name = "jb",
      descriptor = "I"
   )
   public static int field10647;
   @OriginalMember(
      owner = "client!saa",
      name = "Q",
      descriptor = "I"
   )
   public static int field10650;
   @OriginalMember(
      owner = "client!saa",
      name = "T",
      descriptor = "I"
   )
   public int field10651;
   @OriginalMember(
      owner = "client!saa",
      name = "db",
      descriptor = "I"
   )
   public static int field10652;
   @OriginalMember(
      owner = "client!saa",
      name = "bb",
      descriptor = "I"
   )
   public int field10653;
   @OriginalMember(
      owner = "client!saa",
      name = "Y",
      descriptor = "I"
   )
   public static int field10655;
   @OriginalMember(
      owner = "client!saa",
      name = "N",
      descriptor = "I"
   )
   public static int field10656;
   @OriginalMember(
      owner = "client!saa",
      name = "U",
      descriptor = "I"
   )
   public int field10657;
   @OriginalMember(
      owner = "client!saa",
      name = "W",
      descriptor = "I"
   )
   public int field10658;

   @OriginalMember(
      owner = "client!saa",
      name = "h",
      descriptor = "(I)I"
   )
   public final int method230(int arg0) {
      try {
         if (arg0 != 2) {
            return 22;
         } else {
            ++field10637;
            return -10;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10659[15] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!saa",
      name = "b",
      descriptor = "(Lha;I)V"
   )
   public final void method49(class610 arg0, int arg1) {
      try {
         ++field10643;
         if (arg1 != -16) {
            this.method49((class610)null, -95);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10659[13] + (arg0 != null ? field10659[1] : field10659[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!saa",
      name = "c",
      descriptor = "(B)I"
   )
   public final int method1041(byte arg0) {
      try {
         ++field10640;
         class136 var2 = class247.field3763.method2058(-11, this.field10651);
         int var3 = var2.field1989;
         if (~this.field10654 != 0) {
            class136 var4 = class247.field3763.method2058(-11, this.field10654);
            if (var4.field1989 > var3) {
               var3 = var4.field1989;
            }
         }

         if (~this.field10635 != 0) {
            class136 var5 = class247.field3763.method2058(-11, this.field10635);
            if (var5.field1989 > var3) {
               var3 = var5.field1989;
            }
         }

         return arg0 >= -1 ? 94 : var3;
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field10659[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!saa",
      name = "k",
      descriptor = "(I)I"
   )
   public final int method239(int arg0) {
      try {
         ++field10645;
         int var2 = -60 % ((-44 - arg0) / 39);
         return this.field10648;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10659[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!saa",
      name = "a",
      descriptor = "(ZLpfa;)V"
   )
   public static final void method5214(boolean param0, class102 param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!saa",
      name = "a",
      descriptor = "(ILha;)Lil;"
   )
   public final class680 method41(int arg0, class610 arg1) {
      try {
         ++field10639;
         return arg0 != 4058 ? null : null;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10659[5] + arg0 + ',' + (arg1 != null ? field10659[1] : field10659[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!saa",
      name = "a",
      descriptor = "(BLha;)Lpga;"
   )
   public final class788 method56(byte arg0, class610 arg1) {
      boolean var3 = client.field1786;

      try {
         ++field10655;
         class605 var4 = class396.method3196(super.field1506, super.field1505 >> class394.field6180, super.field1494 >> class394.field6180);
         class462 var5 = class269.method2302(super.field1506, super.field1505 >> class394.field6180, super.field1494 >> class394.field6180);
         int var6 = 0;
         if (var4 != null && var4.field8839.field1038) {
            var6 = var4.field8839.method230(2);
         }

         if (var5 != null && ~(-var6) > ~var5.field7024) {
            var6 = -var5.field7024;
         }

         if (this.field10641 != var6) {
            super.field1495 -= this.field10641;
            this.field10641 = var6;
            super.field1495 += var6;
         }

         class401 var7 = arg1.method640();
         var7.method1551();
         if (this.field10641 == 0) {
            boolean var8 = false;
            boolean var9 = false;
            boolean var10 = false;
            class271 var11 = class385.field6076[super.field1500];
            int var12 = this.field10648 << 1;
            int var14 = -var12 / 2;
            int var15 = -var12 / 2;
            int var16 = var11.method2312(super.field1505 - -var14, super.field1494 + var15, -128);
            int var17 = var12 / 2;
            int var18 = -var12 / 2;
            int var19 = var11.method2312(super.field1505 + var17, super.field1494 + var18, 106);
            int var20 = -var12 / 2;
            int var21 = var12 / 2;
            int var22 = var11.method2312(super.field1505 - -var20, super.field1494 + var21, 123);
            int var23 = var12 / 2;
            int var24 = var12 / 2;
            int var25 = var11.method2312(super.field1505 - -var23, super.field1494 + var24, 92);
            int var26 = var16 >= var19 ? var19 : var16;
            int var27 = ~var22 > ~var25 ? var22 : var25;
            int var28 = var25 <= var19 ? var25 : var19;
            if (~var12 != -1) {
               int var29 = 16383 & (int)(Math.atan2((double)(-var27 + var26), (double)var12) * 2607.5945876176133D);
               if (~var29 != -1) {
                  var7.method1560(var29);
               }
            }

            int var30 = var16 >= var22 ? var22 : var16;
            int var31 = var16 + var25;
            if (var12 != 0) {
               int var32 = 16383 & (int)(2607.5945876176133D * Math.atan2((double)(-var28 + var30), (double)var12));
               if (var32 != 0) {
                  var7.method1555(-var32);
               }
            }

            if (~var31 < ~(var19 + var22)) {
               var31 = var19 + var22;
            }

            int var33 = (var31 >> 1) + -super.field1495;
            if (var33 != 0) {
               var7.method1546(0, var33, 0);
            }
         }

         var7.method1546(super.field1505, super.field1495 + -10, super.field1494);
         class788 var34 = class333.method2708((byte)126, 3, true);
         this.field10638 = false;
         if (arg0 != -20) {
            this.method228(122);
         }

         this.field10648 = 0;
         if (this.field10635 != -1) {
            class91 var35 = class247.field3763.method2058(-11, this.field10635).method1258((class456)null, 2048, true, arg1, this.field10658, (class366)null);
            if (var35 != null) {
               label118: {
                  if (!class334.field5143) {
                     var35.method897(var7, var34.field11545[2], 0);
                     if (!var3) {
                        break label118;
                     }
                  }

                  var35.method905(var7, var34.field11545[2], class591.field8709, 0);
               }

               this.field10638 |= var35.method892();
               this.field10648 = var35.method919();
            }
         }

         if (~this.field10654 != 0) {
            class91 var36 = class247.field3763.method2058(-11, this.field10654).method1258((class456)null, 2048, true, arg1, this.field10657, (class366)null);
            if (var36 != null) {
               label110: {
                  if (class334.field5143) {
                     var36.method905(var7, var34.field11545[1], class591.field8709, 0);
                     if (!var3) {
                        break label110;
                     }
                  }

                  var36.method897(var7, var34.field11545[1], 0);
               }

               this.field10638 |= var36.method892();
               if (~var36.method919() < ~this.field10648) {
                  this.field10648 = var36.method919();
               }
            }
         }

         class91 var37 = class247.field3763.method2058(-11, this.field10651).method1258((class456)null, 2048, true, arg1, this.field10653, (class366)null);
         if (var37 != null) {
            label103: {
               if (class334.field5143) {
                  var37.method905(var7, var34.field11545[0], class591.field8709, 0);
                  if (!var3) {
                     break label103;
                  }
               }

               var37.method897(var7, var34.field11545[0], 0);
            }

            this.field10638 |= var37.method892();
            if (~var37.method919() < ~this.field10648) {
               this.field10648 = var37.method919();
            }
         }

         return var34;
      } catch (RuntimeException var39) {
         throw class482.method3757(var39, field10659[8] + arg0 + ',' + (arg1 != null ? field10659[1] : field10659[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!saa",
      name = "a",
      descriptor = "(Lha;IIZ)Z"
   )
   public final boolean method43(class610 arg0, int arg1, int arg2, boolean arg3) {
      try {
         ++field10642;
         class401 var5 = arg0.method640();
         if (arg3) {
            this.method1041((byte)-32);
         }

         var5.method1542(super.field1505, super.field1495 + -10, super.field1494);
         class136 var6 = class247.field3763.method2058(-11, this.field10651);
         class91 var7 = var6.method1258((class456)null, 131072, true, arg0, this.field10653, (class366)null);
         if (var7 != null && (class334.field5143 ? var7.method912(arg2, arg1, var5, true, var6.field1989, class591.field8709) : var7.method886(arg2, arg1, var5, true, var6.field1989))) {
            return true;
         } else {
            if (~this.field10654 != 0) {
               class136 var8 = class247.field3763.method2058(-11, this.field10654);
               class91 var9 = var8.method1258((class456)null, 131072, true, arg0, this.field10657, (class366)null);
               if (var9 != null && (class334.field5143 ? var9.method912(arg2, arg1, var5, true, var8.field1989, class591.field8709) : var9.method886(arg2, arg1, var5, true, var8.field1989))) {
                  return true;
               }
            }

            if (~this.field10635 != 0) {
               class136 var10 = class247.field3763.method2058(-11, this.field10635);
               class91 var11 = var10.method1258((class456)null, 131072, !arg3, arg0, this.field10658, (class366)null);
               if (var11 != null && (class334.field5143 ? var11.method912(arg2, arg1, var5, true, var10.field1989, class591.field8709) : var11.method886(arg2, arg1, var5, true, var10.field1989))) {
                  return true;
               }
            }

            return false;
         }
      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field10659[12] + (arg0 != null ? field10659[1] : field10659[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!saa",
      name = "a",
      descriptor = "(IIILwo;B)V"
   )
   public static final void method5215(int param0, int param1, int param2, class9 param3, byte param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!saa",
      name = "a",
      descriptor = "(I)Lvba;"
   )
   public static final class735 method5216(int arg0) {
      try {
         ++field10646;

         try {
            return arg0 != -23348 ? null : (class735)Class.forName(field10659[6]).newInstance();
         } catch (Throwable var2) {
            return new class638();
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10659[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!saa",
      name = "g",
      descriptor = "(I)Z"
   )
   public final boolean method228(int arg0) {
      try {
         ++field10647;
         return arg0 != 0 ? false : this.field10638;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10659[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!saa",
      name = "<init>",
      descriptor = "(IIIII)V"
   )
   public class707(int arg0, int arg1, int arg2, int arg3, int arg4) {
      super(arg0, arg1, arg2, arg3, arg4);
   }

   @OriginalMember(
      owner = "client!saa",
      name = "a",
      descriptor = "(Z[B)Ljq;"
   )
   public static final class672 method5217(boolean arg0, byte[] arg1) {
      try {
         ++field10656;
         if (arg1 == null) {
            throw new RuntimeException("");
         } else {
            if (arg0) {
               method5216(3);
            }

            while(true) {
               try {
                  Image var2 = Toolkit.getDefaultToolkit().createImage(arg1);
                  MediaTracker var3 = new MediaTracker(class798.field11616);
                  var3.addImage(var2, 0);
                  var3.waitForAll();
                  int var4 = var2.getWidth(class798.field11616);
                  int var5 = var2.getHeight(class798.field11616);
                  if (!var3.isErrorAny() && var4 >= 0 && var5 >= 0) {
                     int[] var6 = new int[var4 * var5];
                     PixelGrabber var7 = new PixelGrabber(var2, 0, 0, var4, var5, var6, 0, var4);
                     var7.grabPixels();
                     return class351.field5356.method4494((byte)-78, var5, var4, var4, 0, var6);
                  }

                  throw new RuntimeException("");
               } catch (InterruptedException var9) {
               }
            }
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field10659[10] + arg0 + ',' + (arg1 != null ? field10659[1] : field10659[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!saa",
      name = "b",
      descriptor = "(Z)Z"
   )
   public final boolean method233(boolean arg0) {
      try {
         ++field10652;
         return arg0 ? false : false;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10659[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!saa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5218(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 3);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!saa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5219(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 63;
            break;
         case 1:
            var10005 = 54;
            break;
         case 2:
            var10005 = 7;
            break;
         case 3:
            var10005 = 65;
            break;
         default:
            var10005 = 3;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
