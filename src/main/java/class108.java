import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class108 {
   @OriginalMember(
      owner = "client!al",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1379 = new String[]{method962(method961("^^\u0016@\r")), method962(method961("^^\u0016G\r")), method962(method961("^^\u0016F\r")), method962(method961("^^\u0016A\r"))};
   @OriginalMember(
      owner = "client!al",
      name = "b",
      descriptor = "Lbga;"
   )
   public static class378 field1375 = new class378(73, 5);
   @OriginalMember(
      owner = "client!al",
      name = "c",
      descriptor = "I"
   )
   public static int field1376;
   @OriginalMember(
      owner = "client!al",
      name = "a",
      descriptor = "I"
   )
   public static int field1377;
   @OriginalMember(
      owner = "client!al",
      name = "d",
      descriptor = "I"
   )
   public static int field1378;

   @OriginalMember(
      owner = "client!al",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method956(int arg0) {
      try {
         class223.method1696(22050, -48001, 2, class674.field9907.field8428.method5225((byte)-65) == 1);
         ++field1377;
         class614.field8576 = class205.method1549(22050, 0, class61.field671, (byte)125, class204.field2515);
         class175.method1358(48, true, class114.method991((class69)null, (byte)86));
         int var1 = 120 / ((arg0 - -45) / 36);
         class7.field62 = class205.method1549(2048, 1, class61.field671, (byte)119, class204.field2515);
         class717.field10509 = new class286();
         class7.field62.method61(121, class717.field10509);
         class223.field2776 = new class377(22050, class556.field7644);
         class191.method1437((byte)-120);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1379[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!al",
      name = "a",
      descriptor = "(IIIIBIZ)V"
   )
   public static final void method957(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, boolean arg6) {
      try {
         ++field1378;
         int var7 = 68 % ((62 - arg4) / 61);
         if ((!arg6 ? class674.field9907.field8453.method5190((byte)-71) : class674.field9907.field8439.method5190((byte)-64)) != 0 && arg1 != 0 && class56.field610 < 50 && arg5 != -1) {
            class701.field10206[class56.field610++] = new class693((byte)(arg6 ? 3 : 2), arg5, arg1, arg0, arg3, 0, arg2, (class80)null);
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field1379[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!al",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method958(int arg0) {
      try {
         if (arg0 != 1) {
            field1375 = null;
         }

         field1375 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field1379[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!al",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method959(int arg0, int arg1, int arg2) {
      try {
         ++field1376;
         if (arg2 != 55) {
            field1375 = null;
         }

         return (55 & arg0) != 0;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field1379[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!al",
      name = "a",
      descriptor = "(Lda;)V"
   )
   public static final void method960(class66 arg0) {
      class520.field7122 = arg0;
   }

   @OriginalMember(
      owner = "client!al",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method961(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 37);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!al",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method962(char[] arg0) {
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
            var10005 = 50;
            break;
         case 2:
            var10005 = 56;
            break;
         case 3:
            var10005 = 4;
            break;
         default:
            var10005 = 37;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
