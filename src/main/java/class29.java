import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public class class29 extends class3 {
   @OriginalMember(
      owner = "client!qaa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field434 = new String[]{method270(method269(" )(F?y")), method270(method269(" )(F>y"))};
   @OriginalMember(
      owner = "client!qaa",
      name = "n",
      descriptor = "Lek;"
   )
   public static class536 field429 = new class536(70, 8);
   @OriginalMember(
      owner = "client!qaa",
      name = "p",
      descriptor = "Z"
   )
   public static boolean field433 = false;
   @OriginalMember(
      owner = "client!qaa",
      name = "q",
      descriptor = "I"
   )
   public static int field423;
   @OriginalMember(
      owner = "client!qaa",
      name = "t",
      descriptor = "I"
   )
   public int field424;
   @OriginalMember(
      owner = "client!qaa",
      name = "o",
      descriptor = "I"
   )
   public int field425;
   @OriginalMember(
      owner = "client!qaa",
      name = "s",
      descriptor = "I"
   )
   public int field426;
   @OriginalMember(
      owner = "client!qaa",
      name = "m",
      descriptor = "I"
   )
   public int field427;
   @OriginalMember(
      owner = "client!qaa",
      name = "k",
      descriptor = "I"
   )
   public static int field428;
   @OriginalMember(
      owner = "client!qaa",
      name = "l",
      descriptor = "I"
   )
   public int field430;
   @OriginalMember(
      owner = "client!qaa",
      name = "r",
      descriptor = "I"
   )
   public int field432;
   @OriginalMember(
      owner = "client!qaa",
      name = "j",
      descriptor = "Ljava/lang/String;"
   )
   public String field431;

   @OriginalMember(
      owner = "client!qaa",
      name = "a",
      descriptor = "(B)V",
      line = 4
   )
   public static void method266(byte arg0) {
      try {
         if (arg0 < -49) {
            field429 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field434[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "a",
      descriptor = "(IIIZIII)V",
      line = 26
   )
   public static final void method267(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
      try {
         class754.field11175 = arg0;
         class662.field9648 = arg2;
         class463.field6650 = arg6;
         class612.field8981 = arg5;
         class483.field6916 = arg4;
         if (arg1 == -26421) {
            ++field423;
            if (arg3 && ~class483.field6916 <= -101) {
               class782.field11465 = class754.field11175 * 512 + 256;
               class224.field3188 = class463.field6650 * 512 + 256;
               class421.field6021 = class102.method851(class561.field8019, (byte)127, class224.field3188, class782.field11465) - class612.field8981;
            }

            class25.field376 = -1;
            class744.field10854 = -1;
            class380.field5481 = 2;
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field434[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "a",
      descriptor = "()V",
      line = 56
   )
   public static final void method268() {
      if (class121.field1554 != null) {
         for(int var0 = 0; var0 < class121.field1554.length; ++var0) {
            for(int var1 = 0; var1 < class457.field6539; ++var1) {
               for(int var2 = 0; var2 < class16.field190; ++var2) {
                  if (class121.field1554[var0][var1][var2] != null) {
                     class121.field1554[var0][var1][var2].method3764((byte)99);
                  }

                  class121.field1554[var0][var1][var2] = null;
               }
            }
         }
      }

      class121.field1554 = null;
      class265.field3658 = null;
      if (class75.field933 != null) {
         for(int var3 = 0; var3 < class75.field933.length; ++var3) {
            for(int var4 = 0; var4 < class457.field6539; ++var4) {
               for(int var5 = 0; var5 < class16.field190; ++var5) {
                  if (class75.field933[var3][var4][var5] != null) {
                     class75.field933[var3][var4][var5].method3764((byte)111);
                  }

                  class75.field933[var3][var4][var5] = null;
               }
            }
         }
      }

      class75.field933 = null;
      class757.field11220 = null;
      class663.field9659 = null;
      class731.field10698 = null;
      class506.field7334 = null;
      class433.field6210 = null;
      class25.field404 = null;
      class637.field9318 = null;
      class747.field11059 = null;
      class408.method3073(0);
      if (class541.field7770 != null) {
         for(int var6 = 0; var6 < class274.field3764; ++var6) {
            class541.field7770[var6] = null;
         }

         class274.field3764 = 0;
      }

      class591.field8705 = null;
      class392.field5677 = null;
      class756.field11204 = null;
      if (class198.field2822 != null) {
         for(int var7 = 0; var7 < class198.field2822.length; ++var7) {
            class198.field2822[var7] = null;
         }

         class614.field9023 = 0;
      }

      if (class752.field11128 != null) {
         for(int var8 = 0; var8 < class752.field11128.length; ++var8) {
            class752.field11128[var8] = null;
         }

         class616.field9062 = 0;
      }

      if (class220.field3145 != null) {
         for(int var9 = 0; var9 < class299.field4095; ++var9) {
            class220.field3145[var9] = null;
         }

         for(int var10 = 0; var10 < class154.field2185; ++var10) {
            for(int var11 = 0; var11 < class457.field6539; ++var11) {
               for(int var12 = 0; var12 < class16.field190; ++var12) {
                  class409.field5919[var10][var11][var12] = 0L;
               }
            }
         }

         class299.field4095 = 0;
      }

      class52.method410(-25933);
      class146.field1851 = class146.field1847;
      class146.field1851.method2008(true);
      class559.field8009 = null;
      class234.field3271 = null;
      class17.field202 = null;
      if (class314.field4294 != null) {
         class501.method3637();
         class80.field1038.method525(1);
         class80.field1038.method570(0);
      }

      if (class390.field5654 != null) {
         class390.field5654 = null;
      }

      class80.field1038 = null;
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method269(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 124);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qaa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method270(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 81;
            break;
         case 1:
            var10005 = 72;
            break;
         case 2:
            var10005 = 73;
            break;
         case 3:
            var10005 = 104;
            break;
         default:
            var10005 = 124;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
