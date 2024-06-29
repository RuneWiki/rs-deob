import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lfa")
public class class125 extends class463 {
   @OriginalMember(
      owner = "client!lfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1566 = new String[]{method1052(method1051("o_u\u001bh+")), method1052(method1051("o_u\u001bk+")), method1052(method1051("o_u\u001bi+")), method1052(method1051("o_u\u001bo+")), method1052(method1051("o_u\u001bj+")), method1052(method1051("x\u0017:\u001bQ")), method1052(method1051("mLxY"))};
   @OriginalMember(
      owner = "client!lfa",
      name = "v",
      descriptor = "[J"
   )
   public static long[] field1562 = new long[32];
   @OriginalMember(
      owner = "client!lfa",
      name = "r",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field1560 = new String[200];
   @OriginalMember(
      owner = "client!lfa",
      name = "u",
      descriptor = "Lnw;"
   )
   public static class616 field1563 = new class616(17, 6);
   @OriginalMember(
      owner = "client!lfa",
      name = "q",
      descriptor = "I"
   )
   public static int field1558;
   @OriginalMember(
      owner = "client!lfa",
      name = "s",
      descriptor = "I"
   )
   public static int field1559;
   @OriginalMember(
      owner = "client!lfa",
      name = "t",
      descriptor = "I"
   )
   public static int field1561;
   @OriginalMember(
      owner = "client!lfa",
      name = "w",
      descriptor = "I"
   )
   public static int field1564;
   @OriginalMember(
      owner = "client!lfa",
      name = "x",
      descriptor = "[[B"
   )
   public static byte[][] field1565;

   @OriginalMember(
      owner = "client!lfa",
      name = "a",
      descriptor = "(II[III)V"
   )
   public static final void method1046(int arg0, int arg1, int[] arg2, int arg3, int arg4) {
      boolean var5 = client.field4273;

      try {
         ++field1561;
         --arg4;
         if (arg0 != -23355) {
            field1562 = null;
         }

         int var9 = arg1 - 1;
         int var6 = var9 + -7;
         int var10;
         if (var5) {
            var10 = arg4 + 1;
            arg2[var10] = arg3;
            int var11 = var10 + 1;
            arg2[var11] = arg3;
            int var12 = var11 + 1;
            arg2[var12] = arg3;
            int var13 = var12 + 1;
            arg2[var13] = arg3;
            int var14 = var13 + 1;
            arg2[var14] = arg3;
            int var15 = var14 + 1;
            arg2[var15] = arg3;
            int var16 = var15 + 1;
            arg2[var16] = arg3;
            arg4 = var16 + 1;
            arg2[arg4] = arg3;
         }

         while(true) {
            while(arg4 < var6) {
               var10 = arg4 + 1;
               arg2[var10] = arg3;
               ++var10;
               arg2[var10] = arg3;
               ++var10;
               arg2[var10] = arg3;
               ++var10;
               arg2[var10] = arg3;
               ++var10;
               arg2[var10] = arg3;
               ++var10;
               arg2[var10] = arg3;
               ++var10;
               arg2[var10] = arg3;
               arg4 = var10 + 1;
               arg2[arg4] = arg3;
            }

            if (!var5) {
               if (!var5 && var9 <= arg4) {
                  return;
               } else {
                  do {
                     ++arg4;
                     arg2[arg4] = arg3;
                  } while(var9 > arg4);

                  return;
               }
            }

            ++arg4;
            arg2[arg4] = arg3;
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field1566[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1566[5] : field1566[6]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lfa",
      name = "a",
      descriptor = "(IZBI)V"
   )
   public final void method1047(int arg0, boolean arg1, byte arg2, int arg3) {
      try {
         if (arg2 != -84) {
            this.method1047(2, true, (byte)21, -112);
         }

         ++field1559;
         int var5 = this.method3399(-25631) * super.field6345.field1299 / 10000;
         class338.field4832.method508(arg3, arg0 + 2, var5, super.field6345.field1311 + -2, ((class602)super.field6345).field8401, 0);
         class338.field4832.method508(arg3 + var5, arg0 + 2, -var5 + super.field6345.field1299, super.field6345.field1311 + -2, 0, 0);
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field1566[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lfa",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method1048(int arg0) {
      try {
         if (arg0 > -77) {
            field1563 = null;
         }

         field1565 = null;
         field1560 = null;
         field1563 = null;
         field1562 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field1566[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lfa",
      name = "a",
      descriptor = "(ZII)V"
   )
   public static final void method1049(boolean arg0, int arg1, int arg2) {
      try {
         ++field1558;
         if (arg1 != 32) {
            method1046(89, 124, (int[])null, -113, -76);
         }

         class784 var3 = class655.method4729(arg0, arg2, (byte)96);
         if (var3 != null) {
            var3.method3609(122);
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field1566[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lfa",
      name = "a",
      descriptor = "(IIIZ)V"
   )
   public final void method1050(int arg0, int arg1, int arg2, boolean arg3) {
      try {
         class338.field4832.method523(arg2 + -2, arg0, super.field6345.field1299 - -4, super.field6345.field1311 - -2, ((class602)super.field6345).field8394, 0);
         ++field1564;
         if (arg1 == 29953) {
            class338.field4832.method523(arg2 + -1, arg0 + 1, super.field6345.field1299 + 2, super.field6345.field1311, 0, 0);
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field1566[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lfa",
      name = "<init>",
      descriptor = "(Lqh;Lqh;Lul;)V"
   )
   public class125(class74 arg0, class74 arg1, class602 arg2) {
      super(arg0, arg1, arg2);
   }

   @OriginalMember(
      owner = "client!lfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1051(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 44);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1052(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 3;
            break;
         case 1:
            var10005 = 57;
            break;
         case 2:
            var10005 = 20;
            break;
         case 3:
            var10005 = 53;
            break;
         default:
            var10005 = 44;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
