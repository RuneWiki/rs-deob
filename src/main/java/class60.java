import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class60 extends class302 {
   @OriginalMember(
      owner = "client!vg",
      name = "H",
      descriptor = "I"
   )
   private int field747;
   @OriginalMember(
      owner = "client!vg",
      name = "N",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field751 = new String[]{method497(method496("M\u0006\u0013\u001cnU\bI\u001e/")), method497(method496("M\u0006\u0013f/")), method497(method496("@O\u0013\u000ez")), method497(method496("U\u0014QL")), method497(method496("M\u0006\u0013a/")), method497(method496("M\u0006\u0013c/"))};
   @OriginalMember(
      owner = "client!vg",
      name = "K",
      descriptor = "I"
   )
   public static int field748 = 0;
   @OriginalMember(
      owner = "client!vg",
      name = "L",
      descriptor = "Z"
   )
   public static boolean field746 = false;
   @OriginalMember(
      owner = "client!vg",
      name = "M",
      descriptor = "I"
   )
   public static int field745;
   @OriginalMember(
      owner = "client!vg",
      name = "I",
      descriptor = "I"
   )
   public static int field749;
   @OriginalMember(
      owner = "client!vg",
      name = "J",
      descriptor = "I"
   )
   public static int field750;

   @OriginalMember(
      owner = "client!vg",
      name = "<init>",
      descriptor = "()V",
      line = 3
   )
   public class60() {
      this(4096);
   }

   @OriginalMember(
      owner = "client!vg",
      name = "a",
      descriptor = "(II)[I",
      line = 8
   )
   public final int[] method401(int arg0, int arg1) {
      try {
         ++field749;
         int[] var3 = super.field4298.method3175(arg0, (byte)-127);
         if (arg1 >= -37) {
            field748 = 24;
         }

         if (super.field4298.field6356) {
            class195.method1494(var3, 0, class344.field5238, this.field747);
         }

         return var3;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field751[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vg",
      name = "<init>",
      descriptor = "(I)V",
      line = 37
   )
   public class60(int arg0) {
      super(0, true);
      this.field747 = 4096;

      try {
         this.field747 = arg0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field751[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vg",
      name = "a",
      descriptor = "(ILha;)V",
      line = 45
   )
   public static final void method495(int arg0, class66 arg1) {
      int var2 = client.field4530;

      try {
         ++field750;
         int var3 = 0;
         int var4 = 0;
         if (arg0 != 16) {
            method495(68, (class66)null);
         }

         if (class446.field6785) {
            var3 = class325.method2458(arg0 + 29445);
            var4 = class319.method2421(true);
         }

         int var5;
         int var6;
         int var7;
         int var8;
         byte var9;
         int var10;
         int var11;
         int var10000;
         int var10001;
         int var10003;
         label232: {
            var5 = class319.field4561 + var3;
            var6 = class10.field147 + var4;
            var7 = class712.field10630;
            var8 = class386.field5907 - 3;
            var9 = 20;
            class746.method5434(class386.field5907, class204.field2588.method1562((byte)-75, class728.field10827), arg1, class10.field147 + var4, (byte)69, var9, class712.field10630, class319.field4561 + var3);
            var10 = var3 + class723.field10766.method368((byte)106);
            var11 = var4 + class723.field10766.method366(true);
            if (!class16.field194) {
               int var12 = 0;
               class303 var13 = (class303)class459.field6947.method4071((byte)127);
               if (var2 != 0 || var13 != null) {
                  do {
                     int var14 = var6 + 13 - (-((-var12 + class354.field5375 + -1) * 16) + -var9);
                     if (var10 > class319.field4561 - -var3 && class712.field10630 + var3 + class319.field4561 > var10 && ~var11 < ~(var14 + -13) && var14 + 4 > var11 && var13.field4329) {
                        arg1.method645(class319.field4561 + var3, var14 - 12, class712.field10630, 16, -class345.field5260 + 255 << 24 | class790.field11474, 1);
                     }

                     ++var12;
                     var13 = (class303)class459.field6947.method4059((byte)-109);
                  } while(var13 != null);
               }

               if (var2 == 0) {
                  break label232;
               }
            }

            int var15 = 0;
            class488 var16 = (class488)class744.field11034.method5158(0);
            if (var2 != 0 || var16 != null) {
               do {
                  int var17 = var9 + 13 + var6 - -(var15 * 16);
                  if (~(class319.field4561 + var3) > ~var10 && var10 < class319.field4561 - -var3 + class712.field10630 && ~var11 < ~(var17 - 13) && ~var11 > ~(var17 + 4) && (var16.field7211 > 1 || ((class303)var16.field7218.field10622.field881).field4329)) {
                     arg1.method645(class319.field4561 + var3, var17 + -12, class712.field10630, 16, class790.field11474 | 255 - class345.field5260 << 24, 1);
                  }

                  ++var15;
                  var16 = (class488)class744.field11034.method5163((byte)117);
               } while(var16 != null);
            }

            if (class352.field5348 != null) {
               int var10002;
               label169: {
                  int var18 = 0;
                  class746.method5434(class164.field2062, class352.field5348.field7213, arg1, class276.field3848, (byte)-40, var9, class707.field10582, class501.field7452);
                  class303 var19 = (class303)class352.field5348.field7218.method5158(0);
                  if (var2 != 0) {
                     var10000 = var9;
                     var10001 = class276.field3848 - -13;
                     var10002 = var18;
                     var10003 = 16;
                  } else if (var19 == null) {
                     var10000 = class164.field2062;
                     var10001 = class501.field7452;
                     var10002 = var9;
                     var10003 = class276.field3848;
                     if (var2 == 0) {
                        break label169;
                     }
                  } else {
                     var10000 = var9;
                     var10001 = class276.field3848 - -13;
                     var10002 = var18;
                     var10003 = 16;
                  }

                  while(true) {
                     int var20 = var10000 + (var10001 - -(var10002 * var10003));
                     if (class501.field7452 < var10 && ~var10 > ~(class707.field10582 + class501.field7452) && var20 + -13 < var11 && var20 - -4 > var11 && var19.field4329) {
                        arg1.method645(class501.field7452, var20 + -12, class707.field10582, 16, class790.field11474 | -class345.field5260 + 255 << 24, 1);
                     }

                     ++var18;
                     var19 = (class303)class352.field5348.field7218.method5163((byte)118);
                     if (var19 == null) {
                        var10000 = class164.field2062;
                        var10001 = class501.field7452;
                        var10002 = var9;
                        var10003 = class276.field3848;
                        if (var2 == 0) {
                           break;
                        }
                     } else {
                        var10000 = var9;
                        var10001 = class276.field3848 - -13;
                        var10002 = var18;
                        var10003 = 16;
                     }
                  }
               }

               class674.method4919(var10000, var10001, var10002, var10003, (byte)62, class707.field10582, arg1);
            }
         }

         label221: {
            class674.method4919(class386.field5907, class319.field4561 - -var3, var9, class10.field147 + var4, (byte)62, class712.field10630, arg1);
            if (class16.field194) {
               int var21 = 0;
               class488 var22 = (class488)class744.field11034.method5158(0);
               if (var2 != 0 || var22 != null) {
                  do {
                     label145: {
                        int var23 = var21 * 16 + var4 + class10.field147 + var9 - -13;
                        if (~var22.field7211 == -2) {
                           class27.method191(-16777216 | class354.field5370, class386.field5907, var11, arg0 ^ -1473285840, class10.field147 + var4, class319.field4561 + var3, var23, var10, (class303)var22.field7218.field10622.field881, -16777216 | class447.field6801, arg1, class712.field10630);
                           if (var2 == 0) {
                              break label145;
                           }
                        }

                        class574.method4252(var10, class319.field4561 + var3, var23, var11, (byte)106, class10.field147 + var4, class354.field5370 | -16777216, class386.field5907, class712.field10630, -16777216 | class447.field6801, arg1, var22);
                     }

                     ++var21;
                     var22 = (class488)class744.field11034.method5163((byte)114);
                  } while(var22 != null);
               }

               if (class352.field5348 == null) {
                  break label221;
               }

               byte var32;
               label132: {
                  int var24 = 0;
                  class303 var25 = (class303)class352.field5348.field7218.method5158(0);
                  if (var2 != 0) {
                     var10000 = var24 * 16;
                     var10001 = 13;
                     var32 = var9;
                     var10003 = class276.field3848;
                  } else if (var25 == null) {
                     var10000 = class707.field10582;
                     var10001 = class501.field7452;
                     var32 = 80;
                     var10003 = class164.field2062;
                     if (var2 == 0) {
                        break label132;
                     }
                  } else {
                     var10000 = var24 * 16;
                     var10001 = 13;
                     var32 = var9;
                     var10003 = class276.field3848;
                  }

                  while(true) {
                     int var26 = var10000 + var10001 + var32 + var10003;
                     ++var24;
                     class27.method191(class354.field5370 | -16777216, class164.field2062, var11, -1473285856, class276.field3848, class501.field7452, var26, var10, var25, -16777216 | class447.field6801, arg1, class707.field10582);
                     var25 = (class303)class352.field5348.field7218.method5163((byte)127);
                     if (var25 == null) {
                        var10000 = class707.field10582;
                        var10001 = class501.field7452;
                        var32 = 80;
                        var10003 = class164.field2062;
                        if (var2 == 0) {
                           break;
                        }
                     } else {
                        var10000 = var24 * 16;
                        var10001 = 13;
                        var32 = var9;
                        var10003 = class276.field3848;
                     }
                  }
               }

               class40.method279(var10000, var10001, var32, var10003, class276.field3848);
               if (var2 == 0) {
                  break label221;
               }
            }

            int var27 = 0;
            class303 var28 = (class303)class459.field6947.method4071((byte)127);
            if (var2 != 0 || var28 != null) {
               do {
                  int var29 = var6 - (-((-var27 + -1 + class354.field5375) * 16) + -13) + var9;
                  ++var27;
                  class27.method191(class354.field5370 | -16777216, var8, var11, -1473285856, var6, var5, var29, var10, var28, -16777216 | class447.field6801, arg1, var7);
                  var28 = (class303)class459.field6947.method4059((byte)-62);
               } while(var28 != null);
            }
         }

         class40.method279(class712.field10630, class319.field4561 + var3, (byte)-53, class386.field5907, class10.field147 + var4);
      } catch (RuntimeException var31) {
         throw class670.method4877(var31, field751[5] + arg0 + ',' + (arg1 != null ? field751[2] : field751[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vg",
      name = "a",
      descriptor = "(IILjj;)V",
      line = 220
   )
   public final void method244(int arg0, int arg1, class128 arg2) {
      try {
         if (arg0 == 0) {
            this.field747 = (arg2.method1104(255) << 12) / 255;
         }

         if (arg1 != 0) {
            method495(127, (class66)null);
         }

         ++field745;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field751[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field751[2] : field751[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method496(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 7);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method497(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 59;
            break;
         case 1:
            var10005 = 97;
            break;
         case 2:
            var10005 = 61;
            break;
         case 3:
            var10005 = 32;
            break;
         default:
            var10005 = 7;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
