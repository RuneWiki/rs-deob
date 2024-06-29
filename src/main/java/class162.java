import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class162 {
   @OriginalMember(
      owner = "client!ib",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2584 = new String[]{method1484(method1483("(/D\tT")), method1484(method1483(":cDe\u0001")), method1484(method1483("/8\u0006'")), method1484(method1483("(/D\nT"))};
   @OriginalMember(
      owner = "client!ib",
      name = "c",
      descriptor = "F"
   )
   public static float field2583 = 1.0F;
   @OriginalMember(
      owner = "client!ib",
      name = "a",
      descriptor = "I"
   )
   public static int field2578;
   @OriginalMember(
      owner = "client!ib",
      name = "b",
      descriptor = "I"
   )
   public int field2580;
   @OriginalMember(
      owner = "client!ib",
      name = "f",
      descriptor = "I"
   )
   public static int field2582;
   @OriginalMember(
      owner = "client!ib",
      name = "e",
      descriptor = "Lqaa;"
   )
   public class29 field2581;
   @OriginalMember(
      owner = "client!ib",
      name = "d",
      descriptor = "[I"
   )
   public int[] field2579;

   @OriginalMember(
      owner = "client!ib",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method1481(int arg0) {
      try {
         class657.field9595.method4287(38);
         ++field2582;
         if (arg0 > -87) {
            method1482((class443)null, false);
         }

         class548.field7918 = null;
         class710.field10318 = null;
         class203.field3034 = 1;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2584[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ib",
      name = "a",
      descriptor = "(Lhea;Z)I"
   )
   public static final int method1482(class443 arg0, boolean arg1) {
      try {
         ++field2578;
         if (class641.field9348 != arg0) {
            if (class621.field9036 != arg0) {
               if (class226.field3348 != arg0) {
                  if (class345.field4912 == arg0) {
                     return 260;
                  } else if (class566.field8200 == arg0) {
                     return 34023;
                  } else if (!arg1) {
                     return -95;
                  } else {
                     throw new IllegalArgumentException();
                  }
               } else {
                  return 34165;
               }
            } else {
               return 8448;
            }
         } else {
            return 7681;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2584[3] + (arg0 != null ? field2584[1] : field2584[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ib",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1483(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 124);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ib",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1484(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 65;
            break;
         case 1:
            var10005 = 77;
            break;
         case 2:
            var10005 = 106;
            break;
         case 3:
            var10005 = 75;
            break;
         default:
            var10005 = 124;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
