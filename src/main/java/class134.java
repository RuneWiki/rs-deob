import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class134 extends class264 {
   @OriginalMember(
      owner = "client!ej",
      name = "Q",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1716 = new String[]{method1063(method1062("\u0016L6qK")), method1063(method1062("\b\b6\u001c\u001e")), method1063(method1062("\u0003\u0017t3")), method1063(method1062("\b\b6\u001e\u001e")), method1063(method1062("\b\b6\u0017\u001e")), method1063(method1062("\b\b6\u0019\u001e")), method1063(method1062("\b\b6\u001a\u001e")), method1063(method1062("\b\b6\u001b\u001e")), method1063(method1062("\b\b6\u0018\u001e")), method1063(method1062("\b\b6\u001d\u001e"))};
   @OriginalMember(
      owner = "client!ej",
      name = "N",
      descriptor = "I"
   )
   public static int field1707 = 0;
   @OriginalMember(
      owner = "client!ej",
      name = "I",
      descriptor = "Lbo;"
   )
   public static class762 field1712 = new class762();
   @OriginalMember(
      owner = "client!ej",
      name = "O",
      descriptor = "I"
   )
   public static int field1714 = 0;
   @OriginalMember(
      owner = "client!ej",
      name = "P",
      descriptor = "Lno;"
   )
   public static class732 field1715 = null;
   @OriginalMember(
      owner = "client!ej",
      name = "M",
      descriptor = "I"
   )
   public static int field1705;
   @OriginalMember(
      owner = "client!ej",
      name = "G",
      descriptor = "I"
   )
   public static int field1706;
   @OriginalMember(
      owner = "client!ej",
      name = "F",
      descriptor = "I"
   )
   public static int field1708;
   @OriginalMember(
      owner = "client!ej",
      name = "J",
      descriptor = "I"
   )
   public static int field1709;
   @OriginalMember(
      owner = "client!ej",
      name = "H",
      descriptor = "I"
   )
   public static int field1710;
   @OriginalMember(
      owner = "client!ej",
      name = "L",
      descriptor = "I"
   )
   public static int field1711;
   @OriginalMember(
      owner = "client!ej",
      name = "K",
      descriptor = "I"
   )
   public static int field1713;

   @OriginalMember(
      owner = "client!ej",
      name = "a",
      descriptor = "(Lea;Z)V"
   )
   public static final void method1057(class573 arg0, boolean arg1) {
      try {
         if (class428.field6131 == null) {
            class236 var2 = new class236();
            byte[] var3 = var2.method1820(16, -114, 128, 128);
            class428.field6131 = class133.method1053(var3, false, (byte)92);
         }

         ++field1709;
         if (class611.field8965 == null) {
            class722 var4 = new class722();
            byte[] var5 = var4.method5248(-4097, 128, 16, 128);
            class611.field8965 = class133.method1053(var5, false, (byte)92);
         }

         if (arg1) {
            field1707 = 36;
         }

         class470 var6 = arg0.field8351;
         if (var6.method3407((byte)126) && class515.field7444 == null) {
            byte[] var7 = class674.method4898(8, 118, new class367(419684), 16.0F, 16, 0.5F, 128, 4.0F, 0.6F, 128, 4.0F);
            class515.field7444 = class133.method1053(var7, false, (byte)92);
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field1716[5] + (arg0 != null ? field1716[0] : field1716[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ej",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method6(int arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         int var4 = 3 % ((24 - arg1) / 44);
         ++field1705;
         int[] var5 = super.field3641.method3079(-14361, arg0);
         if (super.field3641.field5922) {
            int[] var6 = this.method2019(0, -27804, arg0);
            int[] var7 = this.method2019(1, -27804, arg0);
            int[] var8 = this.method2019(2, -27804, arg0);
            int var9 = 0;
            if (var3 || ~class430.field6152 < ~var9) {
               do {
                  int var10 = var8[var9];
                  if (~var10 != -4097) {
                     if (~var10 == -1) {
                        var5[var9] = var7[var9];
                        if (!var3) {
                           ++var9;
                           continue;
                        }
                     }

                     var5[var9] = (-var10 + 4096) * var7[var9] + var6[var9] * var10 >> 12;
                     if (var3) {
                        var5[var9] = var6[var9];
                        ++var9;
                     } else {
                        ++var9;
                     }
                  } else {
                     var5[var9] = var6[var9];
                     ++var9;
                  }
               } while(~class430.field6152 < ~var9);
            }
         }

         return var5;
      } catch (RuntimeException var12) {
         throw class237.method1823(var12, field1716[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ej",
      name = "a",
      descriptor = "(IB)[[I"
   )
   public final int[][] method4(int arg0, byte arg1) {
      boolean var3 = client.field4360;

      try {
         ++field1713;
         int[][] var4 = super.field3634.method4362((byte)116, arg0);
         if (arg1 > -117) {
            field1712 = null;
         }

         if (super.field3634.field8828) {
            int[] var5 = this.method2019(2, -27804, arg0);
            int[][] var6 = this.method2015(0, (byte)76, arg0);
            int[][] var7 = this.method2015(1, (byte)76, arg0);
            int[] var8 = var4[0];
            int[] var9 = var4[1];
            int[] var10 = var4[2];
            int[] var11 = var6[0];
            int[] var12 = var6[1];
            int[] var13 = var6[2];
            int[] var14 = var7[0];
            int[] var15 = var7[1];
            int[] var16 = var7[2];
            int var17 = 0;
            if (var3 || var17 < class430.field6152) {
               do {
                  int var18 = var5[var17];
                  if (~var18 == -4097) {
                     var8[var17] = var11[var17];
                     var9[var17] = var12[var17];
                     var10[var17] = var13[var17];
                     if (!var3) {
                        ++var17;
                        continue;
                     }
                  }

                  if (var18 == 0) {
                     var8[var17] = var14[var17];
                     var9[var17] = var15[var17];
                     var10[var17] = var16[var17];
                     if (!var3) {
                        ++var17;
                        continue;
                     }
                  }

                  int var19 = -var18 + 4096;
                  var8[var17] = var11[var17] * var18 + var14[var17] * var19 >> 12;
                  var9[var17] = var12[var17] * var18 + var15[var17] * var19 >> 12;
                  var10[var17] = var13[var17] * var18 - -(var16[var17] * var19) >> 12;
                  ++var17;
               } while(var17 < class430.field6152);
            }
         }

         return var4;
      } catch (RuntimeException var21) {
         throw class237.method1823(var21, field1716[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ej",
      name = "a",
      descriptor = "(ILwf;)Lih;"
   )
   public static final class730 method1058(int arg0, class147 arg1) {
      try {
         ++field1711;
         int var2 = arg1.method1211(-26166);
         if (arg0 > -74) {
            return null;
         } else {
            class169 var3 = class515.method3747(-30483)[arg1.method1143(-15465)];
            class175 var4 = class784.method5643(-12551)[arg1.method1143(-15465)];
            int var5 = arg1.method1187((byte)-66);
            int var6 = arg1.method1187((byte)125);
            return new class730(var2, var3, var4, var5, var6);
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field1716[1] + arg0 + ',' + (arg1 != null ? field1716[0] : field1716[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ej",
      name = "a",
      descriptor = "(ILwf;I)V"
   )
   public final void method3(int arg0, class147 arg1, int arg2) {
      try {
         if (~arg0 == -1) {
            super.field3637 = ~arg1.method1143(-15465) == -2;
         }

         if (arg2 < 49) {
            field1712 = null;
         }

         ++field1710;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field1716[3] + arg0 + ',' + (arg1 != null ? field1716[0] : field1716[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ej",
      name = "<init>",
      descriptor = "()V"
   )
   public class134() {
      super(3, false);
   }

   @OriginalMember(
      owner = "client!ej",
      name = "b",
      descriptor = "(ILwf;)Lri;"
   )
   public static final class123 method1059(int arg0, class147 arg1) {
      try {
         ++field1706;
         int var2 = arg1.method1143(-15465);
         class169 var3 = class515.method3747(-30483)[arg1.method1143(-15465)];
         class175 var4 = class784.method5643(-12551)[arg1.method1143(-15465)];
         int var5 = arg1.method1187((byte)-70);
         int var6 = arg1.method1187((byte)121);
         int var7 = arg1.method1211(-26166);
         int var8 = arg1.method1211(-26166);
         int var9 = arg1.method1164(19693);
         int var10 = arg1.method1164(19693);
         int var11 = arg1.method1164(19693);
         boolean var12 = ~arg1.method1143(-15465) == -2;
         if (arg0 != -21265) {
            method1059(52, (class147)null);
         }

         return new class123(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
      } catch (RuntimeException var14) {
         throw class237.method1823(var14, field1716[7] + arg0 + ',' + (arg1 != null ? field1716[0] : field1716[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ej",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method1060(byte arg0) {
      boolean var1 = client.field4360;

      RuntimeException var10000;
      label59: {
         boolean var10001;
         int var3;
         try {
            ++field1708;
            class22.field252.method1740((byte)59);
            int var2 = 0;
            if (var1) {
               class401.field5811[var2] = 0L;
               ++var2;
            }

            while(true) {
               while(~var2 > -33) {
                  class401.field5811[var2] = 0L;
                  ++var2;
               }

               var3 = 0;
               if (!var1) {
                  if (arg0 <= 100) {
                     return;
                  }
                  break;
               }

               ++var2;
            }
         } catch (RuntimeException var7) {
            var10000 = var7;
            var10001 = false;
            break label59;
         }

         while(true) {
            label54: {
               try {
                  if (var3 < 32) {
                     class375.field5418[var3] = 0L;
                     break label54;
                  }

                  class276.field3775 = 0;
               } catch (RuntimeException var6) {
                  var10000 = var6;
                  var10001 = false;
                  break;
               }

               if (!var1) {
                  return;
               }
            }

            try {
               ++var3;
            } catch (RuntimeException var5) {
               var10000 = var5;
               var10001 = false;
               break;
            }
         }
      }

      RuntimeException var4 = var10000;
      throw class237.method1823(var4, field1716[6] + arg0 + ')');
   }

   @OriginalMember(
      owner = "client!ej",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method1061(int arg0) {
      try {
         if (arg0 != 16) {
            field1715 = null;
         }

         field1715 = null;
         field1712 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field1716[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ej",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1062(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 54);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ej",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1063(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 109;
            break;
         case 1:
            var10005 = 98;
            break;
         case 2:
            var10005 = 24;
            break;
         case 3:
            var10005 = 95;
            break;
         default:
            var10005 = 54;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
