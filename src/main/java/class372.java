import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class372 extends class70 {
   @OriginalMember(
      owner = "client!km",
      name = "A",
      descriptor = "Lus;"
   )
   public class1 field5658;
   @OriginalMember(
      owner = "client!km",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5661 = new String[]{method2894(method2893("H\u0010e%h")), method2894(method2893("H\u0010e'h")), method2894(method2893("H\u0010e$h")), method2894(method2893("H\u0010eR)M\u0014?Ph")), method2894(method2893("XSe@=")), method2894(method2893("M\b'\u0002"))};
   @OriginalMember(
      owner = "client!km",
      name = "y",
      descriptor = "Lsd;"
   )
   public static class101 field5659 = new class101(67, 8);
   @OriginalMember(
      owner = "client!km",
      name = "B",
      descriptor = "Lsda;"
   )
   public static class269 field5660 = new class269(23, -1);
   @OriginalMember(
      owner = "client!km",
      name = "z",
      descriptor = "I"
   )
   public static int field5656;
   @OriginalMember(
      owner = "client!km",
      name = "x",
      descriptor = "I"
   )
   public static int field5657;

   @OriginalMember(
      owner = "client!km",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method2890(int arg0) {
      try {
         if (arg0 == 2048) {
            field5660 = null;
            field5659 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field5661[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!km",
      name = "a",
      descriptor = "(IZ)V"
   )
   public static final void method2891(int arg0, boolean arg1) {
      try {
         label37: {
            if (!arg1 || class329.field4667 == null) {
               class378.field5716 = -1;
               if (client.field4530 == 0) {
                  break label37;
               }
            }

            class378.field5716 = class329.field4667.field6717;
         }

         ++field5657;
         class329.field4667 = null;
         class100.field1216 = null;
         class180.field2223 = 0;
         class468.field7009 = null;
         class329.method2487();
         class329.field4676.method4062(arg0);
         class601.field8828 = null;
         class82.field999 = -1;
         class547.field8116 = null;
         class189.field2359 = null;
         class235.field2989 = null;
         class46.field529 = null;
         class329.field4683 = null;
         class302.field4295 = null;
         class231.field2942 = null;
         class137.field1782 = null;
         class573.field8531 = null;
         class303.field4325 = -1;
         if (class329.field4666 != null) {
            class329.field4666.method3291(false);
            class329.field4666.method3292(128, (byte)102, 64);
         }

         if (class329.field4672 != null) {
            class329.field4672.method4154(64, arg0 + 64, 64);
         }

         if (class329.field4670 != null) {
            class329.field4670.method5075(64, (byte)78);
         }

         class639.field9324.method3989(-94, 64);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5661[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!km",
      name = "c",
      descriptor = "(III)Z"
   )
   public static final boolean method2892(int arg0, int arg1, int arg2) {
      try {
         ++field5656;
         if (arg1 != 2048) {
            method2890(76);
         }

         return ~(arg2 & 2048) != -1;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field5661[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!km",
      name = "<init>",
      descriptor = "(Lus;)V"
   )
   public class372(class1 arg0) {
      try {
         this.field5658 = arg0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field5661[3] + (arg0 != null ? field5661[4] : field5661[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!km",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2893(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 64);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!km",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2894(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 35;
            break;
         case 1:
            var10005 = 125;
            break;
         case 2:
            var10005 = 75;
            break;
         case 3:
            var10005 = 110;
            break;
         default:
            var10005 = 64;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
