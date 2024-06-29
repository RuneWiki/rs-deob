import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public abstract class class718 extends class80 {
   @OriginalMember(
      owner = "client!bs",
      name = "w",
      descriptor = "S"
   )
   public short field10521;
   @OriginalMember(
      owner = "client!bs",
      name = "H",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10526 = new String[]{method5223(method5222("p$\u0016\u0001g|>L\u0003&")), method5223(method5222("p$\u0016\u007fO:")), method5223(method5222("|\"TQ")), method5223(method5222("iy\u0016\u0013s")), method5223(method5222("p$\u0016vO:")), method5223(method5222("p$\u0016wO:")), method5223(method5222("}']Sda")), method5223(method5222("p$\u0016rO:")), method5223(method5222("p$\u0016mO:")), method5223(method5222("p$\u0016qO:")), method5223(method5222("p$\u0016xO:")), method5223(method5222("p$\u0016~O:"))};
   @OriginalMember(
      owner = "client!bs",
      name = "E",
      descriptor = "Lsca;"
   )
   public static class49 field10519 = new class49(method5223(method5222("^\u001enx")), 0);
   @OriginalMember(
      owner = "client!bs",
      name = "G",
      descriptor = "I"
   )
   public static int field10522 = 0;
   @OriginalMember(
      owner = "client!bs",
      name = "C",
      descriptor = "I"
   )
   public static int field10514;
   @OriginalMember(
      owner = "client!bs",
      name = "A",
      descriptor = "I"
   )
   public static int field10515;
   @OriginalMember(
      owner = "client!bs",
      name = "z",
      descriptor = "I"
   )
   public static int field10516;
   @OriginalMember(
      owner = "client!bs",
      name = "v",
      descriptor = "I"
   )
   public static int field10517;
   @OriginalMember(
      owner = "client!bs",
      name = "y",
      descriptor = "I"
   )
   public static int field10518;
   @OriginalMember(
      owner = "client!bs",
      name = "F",
      descriptor = "I"
   )
   public static int field10520;
   @OriginalMember(
      owner = "client!bs",
      name = "B",
      descriptor = "I"
   )
   public static int field10523;
   @OriginalMember(
      owner = "client!bs",
      name = "D",
      descriptor = "I"
   )
   public static int field10525;
   @OriginalMember(
      owner = "client!bs",
      name = "x",
      descriptor = "Lui;"
   )
   public static class241 field10524;

   @OriginalMember(
      owner = "client!bs",
      name = "a",
      descriptor = "([Loda;I)I"
   )
   public final int method401(class127[] arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         ++field10517;
         if (arg1 != 1) {
            method5220(false, -123, (String)null);
         }

         int var4;
         int var5;
         int var6;
         label114: {
            var4 = super.field999 >> class76.field965;
            var5 = super.field1003 >> class76.field965;
            var6 = 0;
            if (~class367.field5174 == ~var4) {
               ++var6;
               if (!var3) {
                  break label114;
               }
            }

            if (~var4 < ~class367.field5174) {
               var6 += 2;
            }
         }

         label109: {
            if (~class406.field5720 != ~var5) {
               if (var5 >= class406.field5720) {
                  break label109;
               }

               var6 += 6;
               if (!var3) {
                  break label109;
               }
            }

            var6 += 3;
         }

         int var7 = class468.field6456[var6];
         if ((var7 & this.field10521) != 0) {
            return this.method781(arg0, var4, (byte)-109, var5);
         } else if (~this.field10521 == -2 && var4 > 0) {
            return this.method781(arg0, var4 + -1, (byte)-107, var5);
         } else if (this.field10521 == 4 && class635.field8973 >= var4) {
            return this.method781(arg0, var4 + 1, (byte)-33, var5);
         } else if (~this.field10521 == -9 && ~var5 < -1) {
            return this.method781(arg0, var4, (byte)-101, var5 - 1);
         } else if (this.field10521 == 2 && var5 <= class304.field4042) {
            return this.method781(arg0, var4, (byte)-121, var5 - -1);
         } else if (this.field10521 == 16 && var4 > 0 && class304.field4042 >= var5) {
            return this.method781(arg0, var4 - 1, (byte)-94, var5 + 1);
         } else if (this.field10521 == 32 && class635.field8973 >= var4 && class304.field4042 >= var5) {
            return this.method781(arg0, var4 + 1, (byte)-49, var5 + 1);
         } else if (this.field10521 == 128 && var4 > 0 && var5 > 0) {
            return this.method781(arg0, var4 + -1, (byte)-50, var5 + -1);
         } else if (~this.field10521 == -65 && ~class635.field8973 <= ~var4 && ~var5 < -1) {
            return this.method781(arg0, var4 + 1, (byte)-51, var5 + -1);
         } else {
            throw new RuntimeException("");
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field10526[11] + (arg0 != null ? field10526[3] : field10526[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bs",
      name = "e",
      descriptor = "(I)Z"
   )
   public final boolean method397(int arg0) {
      try {
         if (arg0 != 0) {
            field10524 = null;
         }

         ++field10518;
         return class426.field5961[(super.field999 >> class76.field965) + class224.field2812 + -class367.field5174][(super.field1003 >> class76.field965) + -class406.field5720 + class224.field2812];
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10526[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bs",
      name = "a",
      descriptor = "(BI)V"
   )
   public static final void method5217(byte arg0, int arg1) {
      try {
         if (arg0 > 102) {
            ++field10516;
            class446 var2 = class635.method4607(109, (long)arg1, 4);
            var2.method3312(-120);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field10526[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bs",
      name = "g",
      descriptor = "(B)V"
   )
   public static void method5218(byte arg0) {
      try {
         field10519 = null;
         if (arg0 > -54) {
            method5220(true, 64, (String)null);
         }

         field10524 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field10526[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bs",
      name = "a",
      descriptor = "(IBLjava/lang/String;Lbj;)Lvea;"
   )
   public static final class289 method5219(int arg0, byte arg1, String arg2, class255 arg3) {
      try {
         ++field10515;
         if (arg1 != 54) {
            field10519 = null;
         }

         return class590.method4247(arg2, arg3, arg0, 49, field10526[6]);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field10526[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10526[3] : field10526[2]) + ',' + (arg3 != null ? field10526[3] : field10526[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bs",
      name = "a",
      descriptor = "(ZILjava/lang/String;)V"
   )
   public static final void method5220(boolean arg0, int arg1, String arg2) {
      boolean var3 = client.field4273;

      try {
         ++field10514;
         if (arg2 != null) {
            if (~class568.field7743 <= -101) {
               class545.method3938(-7764, 4, class551.field7560.method3980(class494.field6787, true));
            } else {
               String var4 = class14.method110(true, arg2);
               if (var4 != null) {
                  byte var10000;
                  label95: {
                     int var5 = 0;
                     if (var3) {
                        var10000 = 1;
                     } else if (~class568.field7743 >= ~var5) {
                        var10000 = 0;
                        if (!var3) {
                           break label95;
                        }
                     } else {
                        var10000 = 1;
                     }

                     while(true) {
                        String var6 = class14.method110((boolean)var10000, class589.field8125[var5]);
                        if (var6 != null && var6.equals(var4)) {
                           class545.method3938(-7764, 4, arg2 + class551.field7561.method3980(class494.field6787, true));
                           return;
                        }

                        if (class740.field10787[var5] != null) {
                           String var7 = class14.method110(true, class740.field10787[var5]);
                           if (var7 != null && var7.equals(var4)) {
                              class545.method3938(-7764, 4, arg2 + class551.field7561.method3980(class494.field6787, true));
                              return;
                           }
                        }

                        ++var5;
                        if (~class568.field7743 >= ~var5) {
                           var10000 = 0;
                           if (!var3) {
                              break;
                           }
                        } else {
                           var10000 = 1;
                        }
                     }
                  }

                  int var8 = var10000;
                  String var9;
                  String var10;
                  if (var3) {
                     var9 = class14.method110(true, class125.field1560[var8]);
                     if (var9 != null && var9.equals(var4)) {
                        class545.method3938(-7764, 4, class551.field7566.method3980(class494.field6787, true) + arg2 + class551.field7567.method3980(class494.field6787, true));
                        return;
                     }

                     if (class257.field3286[var8] != null) {
                        var10 = class14.method110(true, class257.field3286[var8]);
                        if (var10 != null && var10.equals(var4)) {
                           class545.method3938(-7764, 4, class551.field7566.method3980(class494.field6787, true) + arg2 + class551.field7567.method3980(class494.field6787, true));
                           return;
                        }
                     }

                     ++var8;
                  }

                  while(true) {
                     boolean var16;
                     if (~var8 <= ~class209.field2582) {
                        var16 = class14.method110(true, class278.field3709.field5662).equals(var4);
                        if (!var3) {
                           if (var16) {
                              class545.method3938(-7764, 4, class551.field7563.method3980(class494.field6787, true));
                              return;
                           }

                           ++class128.field1612;
                           class223 var11 = class355.method2790(13111);
                           class471 var12 = class133.method1118(var11.field2787, 2, class767.field11068);
                           var12.field6527.method4318(class190.method1432(10524, arg2) + 1, 0);
                           var12.field6527.method4332((byte)-91, arg2);
                           var12.field6527.method4318(!arg0 ? 0 : 1, 0);
                           var11.method1702((byte)-66, var12);
                           int var13 = 126 / ((62 - arg1) / 48);
                           return;
                        }
                     } else {
                        var16 = true;
                     }

                     var9 = class14.method110(var16, class125.field1560[var8]);
                     if (var9 != null && var9.equals(var4)) {
                        class545.method3938(-7764, 4, class551.field7566.method3980(class494.field6787, true) + arg2 + class551.field7567.method3980(class494.field6787, true));
                        return;
                     }

                     if (class257.field3286[var8] != null) {
                        var10 = class14.method110(true, class257.field3286[var8]);
                        if (var10 != null && var10.equals(var4)) {
                           class545.method3938(-7764, 4, class551.field7566.method3980(class494.field6787, true) + arg2 + class551.field7567.method3980(class494.field6787, true));
                           return;
                        }
                     }

                     ++var8;
                  }
               }
            }
         }
      } catch (RuntimeException var15) {
         throw class534.method3846(var15, field10526[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10526[3] : field10526[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bs",
      name = "a",
      descriptor = "(Ljava/lang/Object;BII)[B"
   )
   public static final byte[] method5221(Object arg0, byte arg1, int arg2, int arg3) {
      try {
         ++field10520;
         if (arg0 == null) {
            return null;
         } else if (arg0 instanceof byte[]) {
            byte[] var4 = (byte[])arg0;
            return class249.method1872(arg2, false, var4, arg3);
         } else if (arg0 instanceof class205) {
            class205 var5 = (class205)arg0;
            return var5.method1545(arg2, arg3, (byte)-30);
         } else {
            if (arg1 != -69) {
               field10524 = null;
            }

            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field10526[8] + (arg0 != null ? field10526[3] : field10526[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bs",
      name = "b",
      descriptor = "(ZLha;)Z"
   )
   public final boolean method402(boolean arg0, class65 arg1) {
      try {
         ++field10525;
         return !arg0 ? false : class371.method2871(this, super.field1005, -7748, super.field999 >> class76.field965, super.field1003 >> class76.field965);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field10526[10] + arg0 + ',' + (arg1 != null ? field10526[3] : field10526[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bs",
      name = "<init>",
      descriptor = "(IIIIII)V"
   )
   public class718(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         super.field1005 = (byte)arg4;
         super.field998 = arg1;
         this.field10521 = (short)arg5;
         super.field999 = arg0;
         super.field1001 = (byte)arg3;
         super.field1003 = arg2;
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field10526[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bs",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5222(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 14);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bs",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5223(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 18;
            break;
         case 1:
            var10005 = 87;
            break;
         case 2:
            var10005 = 56;
            break;
         case 3:
            var10005 = 61;
            break;
         default:
            var10005 = 14;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
