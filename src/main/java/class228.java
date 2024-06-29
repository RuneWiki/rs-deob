import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public abstract class class228 {
   @OriginalMember(
      owner = "client!jf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3223 = new String[]{method1782(method1781("r\u001c^\t:")), method1782(method1781("r\u001c^\u000b:")), method1782(method1781("r\u001c^\u000e:")), method1782(method1781("r\u001c^\b:"))};
   @OriginalMember(
      owner = "client!jf",
      name = "d",
      descriptor = "S"
   )
   public static short field3218 = 1;
   @OriginalMember(
      owner = "client!jf",
      name = "e",
      descriptor = "I"
   )
   public static int field3220;
   @OriginalMember(
      owner = "client!jf",
      name = "c",
      descriptor = "I"
   )
   public static int field3221;
   @OriginalMember(
      owner = "client!jf",
      name = "a",
      descriptor = "I"
   )
   public static int field3222;
   @OriginalMember(
      owner = "client!jf",
      name = "b",
      descriptor = "[[Z"
   )
   public static boolean[][] field3219;

   @OriginalMember(
      owner = "client!jf",
      name = "b",
      descriptor = "(B)V"
   )
   public abstract void method1773(byte arg0);

   @OriginalMember(
      owner = "client!jf",
      name = "a",
      descriptor = "(ZI)J"
   )
   public static final long method1774(boolean arg0, int arg1) {
      try {
         if (arg0) {
            return -91L;
         } else {
            ++field3220;
            return (long)(arg1 + 11745) * 86400000L;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3223[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jf",
      name = "a",
      descriptor = "(IIIII)Z"
   )
   public static final boolean method1775(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field3222;
         if (class696.field10207 && class273.field3754) {
            if (~class330.field4497 > -101) {
               return false;
            } else if (!class50.method405(arg2, 124, arg3, arg1)) {
               return false;
            } else {
               if (arg0 != -1) {
                  field3218 = -116;
               }

               int var5 = arg2 << class773.field11359;
               int var6 = arg3 << class773.field11359;
               if (class787.method5685(var5, var6, class729.field10681, class729.field10681, (byte)76, class731.field10698[arg1].method2219(true, arg2, arg3), arg4)) {
                  ++class20.field225;
                  return true;
               } else {
                  return false;
               }
            }
         } else {
            return false;
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field3223[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jf",
      name = "a",
      descriptor = "(I)Luv;"
   )
   public abstract class386 method1776(int arg0);

   @OriginalMember(
      owner = "client!jf",
      name = "a",
      descriptor = "(Z)V"
   )
   public abstract void method1777(boolean arg0);

   @OriginalMember(
      owner = "client!jf",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method1778(int arg0) {
      try {
         if (arg0 != 1) {
            method1775(125, -82, -40, -75, -2);
         }

         field3219 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field3223[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jf",
      name = "a",
      descriptor = "(II)Z"
   )
   public abstract boolean method1779(int arg0, int arg1);

   @OriginalMember(
      owner = "client!jf",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method1780(byte arg0) {
      boolean var1 = client.field4360;

      try {
         label34: {
            if (class314.field4289 != null) {
               class263.method2010((byte)89);
               if (!var1) {
                  break label34;
               }
            }

            if (class203.field2883 != -1) {
               class608.method4430(arg0 + 148);
               if (!var1) {
                  break label34;
               }
            }

            class473.method3444(class750.field11103, arg0 ^ -75, class284.field3931);
         }

         ++field3221;
         if (arg0 != -24) {
            method1774(false, 97);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3223[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1781(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 18);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1782(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 24;
            break;
         case 1:
            var10005 = 122;
            break;
         case 2:
            var10005 = 112;
            break;
         case 3:
            var10005 = 76;
            break;
         default:
            var10005 = 18;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
