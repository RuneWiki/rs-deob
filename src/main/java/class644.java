import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public class class644 extends class55 {
   @OriginalMember(
      owner = "client!aaa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9412 = new String[]{method4666(method4665("\u0002!V\u0001\u000bK")), method4666(method4665("\u0002!V\u0001\u0002K")), method4666(method4665("\u0002!V\u0001\nK")), method4666(method4665("\u0002!V\u0001\u000eK")), method4666(method4665("\r5[C")), method4666(method4665("\u0002!V\u0001\u0001K")), method4666(method4665("\u0018n\u0019\u00015")), method4666(method4665("\u0002!V\u0001\u000fK")), method4666(method4665("\u0002!V\u0001\tK")), method4666(method4665("\u0002!V\u0001\fK")), method4666(method4665("\u0002!V\u0001\rK")), method4666(method4665("\u0002!V\u0001\u0003K")), method4666(method4665("\u0002!V\u0001\u0000K"))};
   @OriginalMember(
      owner = "client!aaa",
      name = "e",
      descriptor = "I"
   )
   public static int field9402 = 0;
   @OriginalMember(
      owner = "client!aaa",
      name = "n",
      descriptor = "I"
   )
   public static int field9403 = 104;
   @OriginalMember(
      owner = "client!aaa",
      name = "q",
      descriptor = "Lkda;"
   )
   public static class412 field9405 = new class412(method4666(method4665("4\u0014`f\u0018")), method4666(method4665("\f&QF+\u0006")), method4666(method4665("<7^_")), 3);
   @OriginalMember(
      owner = "client!aaa",
      name = "p",
      descriptor = "I"
   )
   public static int field9399;
   @OriginalMember(
      owner = "client!aaa",
      name = "k",
      descriptor = "I"
   )
   public static int field9400;
   @OriginalMember(
      owner = "client!aaa",
      name = "l",
      descriptor = "I"
   )
   public static int field9401;
   @OriginalMember(
      owner = "client!aaa",
      name = "o",
      descriptor = "I"
   )
   public static int field9404;
   @OriginalMember(
      owner = "client!aaa",
      name = "j",
      descriptor = "I"
   )
   public static int field9406;
   @OriginalMember(
      owner = "client!aaa",
      name = "m",
      descriptor = "I"
   )
   public static int field9407;
   @OriginalMember(
      owner = "client!aaa",
      name = "f",
      descriptor = "I"
   )
   public static int field9408;
   @OriginalMember(
      owner = "client!aaa",
      name = "i",
      descriptor = "I"
   )
   public static int field9409;
   @OriginalMember(
      owner = "client!aaa",
      name = "h",
      descriptor = "I"
   )
   public static int field9410;
   @OriginalMember(
      owner = "client!aaa",
      name = "g",
      descriptor = "I"
   )
   public static int field9411;

   @OriginalMember(
      owner = "client!aaa",
      name = "a",
      descriptor = "(IIIIIZIIII)V",
      line = 3
   )
   public static final void method4658(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9) {
      try {
         ++field9409;
         if (!arg5) {
            if (~arg8 <= ~class457.field6528 && ~class348.field4702 <= ~arg8 && ~class457.field6528 >= ~arg1 && ~class348.field4702 <= ~arg1 && class457.field6528 <= arg6 && ~class348.field4702 <= ~arg6 && arg9 >= class457.field6528 && ~class348.field4702 <= ~arg9 && ~arg3 <= ~class245.field3374 && class699.field10237 >= arg3 && arg0 >= class245.field3374 && class699.field10237 >= arg0 && ~class245.field3374 >= ~arg4 && ~class699.field10237 <= ~arg4 && class245.field3374 <= arg2 && ~class699.field10237 <= ~arg2) {
               class653.method4784(!arg5, arg0, arg1, arg9, arg8, arg7, arg2, arg3, arg4, arg6);
            } else {
               class178.method1426(arg0, arg3, (byte)-67, arg6, arg8, arg4, arg1, arg2, arg7, arg9);
            }
         }
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field9412[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "b",
      descriptor = "(Z)V",
      line = 21
   )
   public static void method4659(boolean arg0) {
      try {
         if (!arg0) {
            field9405 = null;
         }

         field9405 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field9412[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "b",
      descriptor = "(IB)V",
      line = 31
   )
   public final void method96(int arg0, byte arg1) {
      try {
         int var3 = 104 % ((47 - arg1) / 46);
         super.field680 = arg0;
         ++field9401;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field9412[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "a",
      descriptor = "(I[B)V",
      line = 43
   )
   public static final void method4660(int param0, byte[] param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "b",
      descriptor = "(I)I",
      line = 133
   )
   public final int method101(int arg0) {
      try {
         if (arg0 >= -116) {
            method4660(97, (byte[])null);
         }

         ++field9411;
         return 1;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9412[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "<init>",
      descriptor = "(Lifa;)V",
      line = 144
   )
   public class644(class453 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "a",
      descriptor = "(I)V",
      line = 147
   )
   public final void method98(int arg0) {
      try {
         label31: {
            if (super.field683.method3308(1) == class185.field2620) {
               if (!super.field683.method3300((byte)-56)) {
                  break label31;
               }

               super.field680 = 0;
               if (!client.field4360) {
                  break label31;
               }
            }

            super.field680 = 1;
         }

         ++field9400;
         if (arg0 != 0) {
            field9402 = -123;
         }

         if (~super.field680 != -1 && ~super.field680 != -2) {
            super.field680 = this.method101(-125);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9412[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "d",
      descriptor = "(I)V",
      line = 168
   )
   public static final void method4661(int arg0) {
      try {
         ++field9407;
         if (class426.method3155(true, class622.field9156)) {
            class388.method2945(false, (byte)-20);
         } else {
            class592.field8716 = class430.field6150.field102;
            class430.field6150.field102 = null;
            if (arg0 < -38) {
               class731.method5321(14, (byte)-93);
            }
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field9412[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "a",
      descriptor = "(B)Z",
      line = 187
   )
   public final boolean method4662(byte arg0) {
      try {
         if (arg0 != 120) {
            return true;
         } else {
            ++field9404;
            if (super.field683.method3300((byte)-56)) {
               return false;
            } else {
               return super.field683.method3308(1) == class185.field2620;
            }
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9412[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "a",
      descriptor = "(ZB[B)V",
      line = 205
   )
   public static final void method4663(boolean arg0, byte arg1, byte[] arg2) {
      boolean var3 = client.field4360;

      try {
         if (arg1 < 17) {
            field9405 = null;
         }

         ++field9406;
         if (class605.field8885 == null) {
            class605.field8885 = new class147(20000);
         }

         class605.field8885.method1193((byte)42, arg2, 0, arg2.length);
         if (arg0) {
            class566.method4034(class605.field8885.field1889, 11580);
            class316.field4305 = new class503[class152.field2145];
            int var4 = 0;
            int var5 = class140.field1788;
            class503 var6;
            if (var3) {
               var6 = class137.method1086(var5, 0);
               if (var6 != null) {
                  class316.field4305[var4++] = var6;
               }

               ++var5;
            }

            while(true) {
               int var10000;
               if (~var5 < ~class33.field478) {
                  class688.field10137 = false;
                  var10000 = -29025;
                  if (!var3) {
                     class756.field11194 = class133.method1054(-29025);
                     class605.field8885 = null;
                     return;
                  }
               } else {
                  var10000 = var5;
               }

               var6 = class137.method1086(var10000, 0);
               if (var6 != null) {
                  class316.field4305[var4++] = var6;
               }

               ++var5;
            }
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field9412[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9412[6] : field9412[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "<init>",
      descriptor = "(ILifa;)V",
      line = 250
   )
   public class644(int arg0, class453 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "a",
      descriptor = "(IB)I",
      line = 266
   )
   public final int method97(int arg0, byte arg1) {
      try {
         ++field9408;
         if (super.field683.method3300((byte)-56)) {
            return 3;
         } else {
            if (arg1 != 105) {
               method4663(true, (byte)38, (byte[])null);
            }

            return super.field683.method3308(1) == class185.field2620 ? 1 : 3;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field9412[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "c",
      descriptor = "(I)I",
      line = 291
   )
   public final int method4664(int arg0) {
      try {
         ++field9399;
         int var2 = 20 % ((arg0 - 36) / 41);
         return super.field680;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field9412[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4665(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 72);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aaa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4666(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 99;
            break;
         case 1:
            var10005 = 64;
            break;
         case 2:
            var10005 = 55;
            break;
         case 3:
            var10005 = 47;
            break;
         default:
            var10005 = 72;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
