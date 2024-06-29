import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public class class666 extends class195 implements class126 {
   @OriginalMember(
      owner = "client!tda",
      name = "r",
      descriptor = "I"
   )
   private int field9673;
   @OriginalMember(
      owner = "client!tda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9676 = new String[]{method4856(method4855("1\\\u0006]lm")), method4856(method4855("1\\\u0006]nm")), method4856(method4855("1\\\u0006]dm")), method4856(method4855(">\u0016I]Z")), method4856(method4855("+M\u000b\u001f")), method4856(method4855("1\\\u0006]fm")), method4856(method4855("1\\\u0006]bm")), method4856(method4855("1\\\u0006]cm")), method4856(method4855("1\\\u0006]mm")), method4856(method4855("1\\\u0006]\u001b,V\u000e\u0007\u0019m")), method4856(method4855("1\\\u0006]em"))};
   @OriginalMember(
      owner = "client!tda",
      name = "n",
      descriptor = "I"
   )
   public static int field9666 = 0;
   @OriginalMember(
      owner = "client!tda",
      name = "t",
      descriptor = "I"
   )
   public static int field9664;
   @OriginalMember(
      owner = "client!tda",
      name = "p",
      descriptor = "I"
   )
   public static int field9665;
   @OriginalMember(
      owner = "client!tda",
      name = "q",
      descriptor = "I"
   )
   public static int field9667;
   @OriginalMember(
      owner = "client!tda",
      name = "m",
      descriptor = "I"
   )
   public static int field9669;
   @OriginalMember(
      owner = "client!tda",
      name = "u",
      descriptor = "I"
   )
   public static int field9670;
   @OriginalMember(
      owner = "client!tda",
      name = "s",
      descriptor = "I"
   )
   public static int field9671;
   @OriginalMember(
      owner = "client!tda",
      name = "w",
      descriptor = "I"
   )
   public static int field9674;
   @OriginalMember(
      owner = "client!tda",
      name = "x",
      descriptor = "I"
   )
   public static int field9675;
   @OriginalMember(
      owner = "client!tda",
      name = "v",
      descriptor = "Lkf;"
   )
   public static class266 field9672;
   @OriginalMember(
      owner = "client!tda",
      name = "o",
      descriptor = "[I"
   )
   public static int[] field9668;

   @OriginalMember(
      owner = "client!tda",
      name = "a",
      descriptor = "(Z)V",
      line = 3
   )
   public static void method4852(boolean arg0) {
      try {
         if (!arg0) {
            method4853(false, -76, -117);
         }

         field9672 = null;
         field9668 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field9676[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tda",
      name = "<init>",
      descriptor = "(Lea;I[BIZ)V",
      line = 14
   )
   public class666(class573 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
      super(arg0, 34963, arg2, arg3, arg4);

      try {
         this.field9673 = arg1;
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field9676[9] + (arg0 != null ? field9676[3] : field9676[4]) + ',' + arg1 + ',' + (arg2 != null ? field9676[3] : field9676[4]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tda",
      name = "a",
      descriptor = "(B)I",
      line = 22
   )
   public final int method1008(byte arg0) {
      try {
         if (arg0 <= 95) {
            return -123;
         } else {
            ++field9665;
            return super.field2763;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9676[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tda",
      name = "b",
      descriptor = "(B)J",
      line = 35
   )
   public final long method1011(byte arg0) {
      try {
         if (arg0 >= -119) {
            field9669 = 38;
         }

         ++field9675;
         return 0L;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9676[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tda",
      name = "c",
      descriptor = "(B)V",
      line = 47
   )
   public final void method1529(byte arg0) {
      try {
         super.field2762.method4165((byte)-83, this);
         ++field9670;
         int var2 = -58 % ((-43 - arg0) / 57);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field9676[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tda",
      name = "a",
      descriptor = "(BI[BI)V",
      line = 59
   )
   public final void method1010(byte arg0, int arg1, byte[] arg2, int arg3) {
      try {
         ++field9671;
         this.method1531(arg3, arg2, false);
         this.field9673 = arg1;
         int var5 = 124 / ((arg0 - 49) / 40);
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field9676[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9676[3] : field9676[4]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tda",
      name = "a",
      descriptor = "(I)I",
      line = 70
   )
   public final int method1009(int arg0) {
      try {
         ++field9674;
         if (arg0 >= -35) {
            this.method1008((byte)-18);
         }

         return this.field9673;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field9676[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tda",
      name = "a",
      descriptor = "(ZII)I",
      line = 84
   )
   public static final int method4853(boolean arg0, int arg1, int arg2) {
      try {
         ++field9667;
         if (arg0) {
            return 85;
         } else {
            return arg1 != 1 && arg1 != 3 ? class129.field1650[arg2 & 3] : class776.field11386[arg2 & 3];
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field9676[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tda",
      name = "a",
      descriptor = "(IIIIIII)V",
      line = 106
   )
   public static final void method4854(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var7 = client.field4360;

      try {
         if (arg4 > -43) {
            method4852(false);
         }

         label55: {
            if (arg5 < class457.field6528 || ~arg0 < ~class348.field4702 || arg6 < class245.field3374 || ~arg2 < ~class699.field10237) {
               if (arg1 != 1) {
                  class133.method1052(arg5, (byte)14, arg2, arg1, arg0, arg6, arg3);
                  if (!var7) {
                     break label55;
                  }
               }

               class113.method920(arg2, arg3, arg5, arg6, arg0, 30399);
               if (!var7) {
                  break label55;
               }
            }

            if (arg1 == 1) {
               class9.method46(arg0, arg2, 0, arg6, arg3, arg5);
               if (!var7) {
                  break label55;
               }
            }

            class23.method139(arg6, 17781, arg3, arg0, arg5, arg2, arg1);
         }

         ++field9664;
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field9676[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4855(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 39);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4856(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 69;
            break;
         case 1:
            var10005 = 56;
            break;
         case 2:
            var10005 = 103;
            break;
         case 3:
            var10005 = 115;
            break;
         default:
            var10005 = 39;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
