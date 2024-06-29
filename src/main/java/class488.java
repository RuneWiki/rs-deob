import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class488 {
   @OriginalMember(
      owner = "client!ee",
      name = "i",
      descriptor = "Liw;"
   )
   private class107 field6966 = new class107(64);
   @OriginalMember(
      owner = "client!ee",
      name = "g",
      descriptor = "Liw;"
   )
   public class107 field6969 = new class107(2);
   @OriginalMember(
      owner = "client!ee",
      name = "d",
      descriptor = "Lsa;"
   )
   public class39 field6967;
   @OriginalMember(
      owner = "client!ee",
      name = "l",
      descriptor = "Lsa;"
   )
   private class39 field6961;
   @OriginalMember(
      owner = "client!ee",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6970 = new String[]{method3718(method3717("\r|N-\u0011")), method3718(method3717("\u0006l\f\u0004")), method3718(method3717("\u00137NFD")), method3718(method3717("\r|NTP\u0006p\u0014V\u0011")), method3718(method3717("\r|N+\u0011")), method3718(method3717("\r|N,\u0011")), method3718(method3717("\r|N.\u0011")), method3718(method3717("\r|N*\u0011")), method3718(method3717("\r|N/\u0011")), method3718(method3717("\r|N)\u0011"))};
   @OriginalMember(
      owner = "client!ee",
      name = "a",
      descriptor = "Lhha;"
   )
   public static class724 field6959 = new class724(90, 11);
   @OriginalMember(
      owner = "client!ee",
      name = "e",
      descriptor = "I"
   )
   public static int field6958;
   @OriginalMember(
      owner = "client!ee",
      name = "f",
      descriptor = "I"
   )
   public static int field6960;
   @OriginalMember(
      owner = "client!ee",
      name = "h",
      descriptor = "I"
   )
   public static int field6963;
   @OriginalMember(
      owner = "client!ee",
      name = "c",
      descriptor = "I"
   )
   public static int field6964;
   @OriginalMember(
      owner = "client!ee",
      name = "b",
      descriptor = "I"
   )
   public static int field6965;
   @OriginalMember(
      owner = "client!ee",
      name = "j",
      descriptor = "I"
   )
   public static int field6968;
   @OriginalMember(
      owner = "client!ee",
      name = "k",
      descriptor = "Lsa;"
   )
   public static class39 field6962;

   @OriginalMember(
      owner = "client!ee",
      name = "a",
      descriptor = "(II)Lab;"
   )
   public final class244 method3710(int arg0, int arg1) {
      try {
         ++field6968;
         class107 var3 = this.field6966;
         class244 var4;
         synchronized(this.field6966) {
            var4 = (class244)this.field6966.method1041((long)arg0, 8);
         }

         if (var4 != null) {
            return var4;
         } else {
            class39 var5 = this.field6961;
            byte[] var6;
            synchronized(this.field6961) {
               var6 = this.field6961.method460((byte)-11, arg0, arg1);
            }

            class244 var7 = new class244();
            var7.field3746 = this;
            if (var6 != null) {
               var7.method2126(-128, new class65(var6));
            }

            class107 var8 = this.field6966;
            synchronized(this.field6966) {
               this.field6966.method1050(-102, var7, (long)arg0);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field6970[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ee",
      name = "a",
      descriptor = "(BIIIII)I"
   )
   public static final int method3711(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         int var6 = -46 % ((-3 - arg0) / 47);
         ++field6964;
         if (class225.field3197 == null) {
            return 0;
         } else {
            if (arg1 < 3) {
               int var7 = arg4 >> 9;
               int var8 = arg2 >> 9;
               if (~arg5 > -1 || arg3 < 0 || arg5 > class234.field3626 + -1 || arg3 > class209.field2989 + -1) {
                  return 0;
               }

               if (~var7 > -2 || var8 < 1 || var7 > class234.field3626 + -1 || class209.field2989 + -1 < var8) {
                  return 0;
               }

               boolean var9 = ~(2 & class644.field9070[1][arg4 >> 9][arg2 >> 9]) != -1;
               if (~(arg4 & 511) == -1) {
                  boolean var10 = (class644.field9070[1][var7 - 1][arg2 >> 9] & 2) != 0;
                  boolean var11 = (class644.field9070[1][var7][arg2 >> 9] & 2) != 0;
                  if (var11 == !var10) {
                     var9 = (class644.field9070[1][arg5][arg3] & 2) != 0;
                  }
               }

               if (~(511 & arg2) == -1) {
                  boolean var12 = (2 & class644.field9070[1][arg4 >> 9][var8 + -1]) != 0;
                  boolean var13 = (class644.field9070[1][arg4 >> 9][var8] & 2) != 0;
                  if (var12 != var13) {
                     var9 = ~(2 & class644.field9070[1][arg5][arg3]) != -1;
                  }
               }

               if (var9) {
                  ++arg1;
               }
            }

            return class225.field3197[arg1].method5401(arg4, true, arg2);
         }
      } catch (RuntimeException var15) {
         throw class612.method4503(var15, field6970[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ee",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method3712(int arg0) {
      try {
         ++field6958;
         class107 var2 = this.field6966;
         synchronized(this.field6966) {
            this.field6966.method1045(3);
            if (arg0 != 25520) {
               field6959 = null;
            }
         }

         class107 var3 = this.field6969;
         synchronized(this.field6969) {
            this.field6969.method1045(3);
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field6970[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ee",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method3713(int arg0, byte arg1) {
      try {
         class107 var3 = this.field6966;
         synchronized(this.field6966) {
            this.field6966.method1048(arg0, -8543);
            if (arg1 > -23) {
               method3711((byte)-48, 41, -50, -73, 73, 24);
            }
         }

         ++field6960;
         class107 var4 = this.field6969;
         synchronized(this.field6969) {
            this.field6969.method1048(arg0, -8543);
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field6970[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ee",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method3714(int arg0, int arg1, int arg2) {
      try {
         if (arg0 != 1) {
            return false;
         } else {
            ++field6963;
            return (2048 & arg1) != 0;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6970[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ee",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method3715(int arg0) {
      try {
         ++field6965;
         class107 var2 = this.field6966;
         synchronized(this.field6966) {
            this.field6966.method1052(true);
         }

         class107 var3 = this.field6969;
         synchronized(this.field6969) {
            this.field6969.method1052(true);
         }

         if (arg0 < 105) {
            this.method3712(57);
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field6970[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ee",
      name = "<init>",
      descriptor = "(Ltb;ILsa;Lsa;)V"
   )
   public class488(class392 arg0, int arg1, class39 arg2, class39 arg3) {
      try {
         this.field6967 = arg3;
         this.field6961 = arg2;
         this.field6961.method434((byte)-106, 33);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field6970[3] + (arg0 != null ? field6970[2] : field6970[1]) + ',' + arg1 + ',' + (arg2 != null ? field6970[2] : field6970[1]) + ',' + (arg3 != null ? field6970[2] : field6970[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ee",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method3716(int arg0) {
      try {
         field6959 = null;
         if (arg0 >= -67) {
            method3711((byte)-59, -101, 53, 16, 121, -14);
         }

         field6962 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6970[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ee",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3717(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 57);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ee",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3718(char[] arg0) {
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
            var10005 = 25;
            break;
         case 2:
            var10005 = 96;
            break;
         case 3:
            var10005 = 104;
            break;
         default:
            var10005 = 57;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
