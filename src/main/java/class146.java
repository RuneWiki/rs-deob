import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ofa")
public class class146 {
   @OriginalMember(
      owner = "client!ofa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1832 = new String[]{method1187(method1186("%&\u001aa\u0005b")), method1187(method1186("%&\u001aa\u0004b")), method1187(method1186("%&\u001aa\u0006b")), method1187(method1186("$#\u001a")), method1187(method1186("%&\u001aa\u0003b"))};
   @OriginalMember(
      owner = "client!ofa",
      name = "f",
      descriptor = "[I"
   )
   public static int[] field1828 = new int[]{1, -1, -1, 1};
   @OriginalMember(
      owner = "client!ofa",
      name = "b",
      descriptor = "I"
   )
   public static int field1825;
   @OriginalMember(
      owner = "client!ofa",
      name = "d",
      descriptor = "I"
   )
   public static int field1827;
   @OriginalMember(
      owner = "client!ofa",
      name = "e",
      descriptor = "I"
   )
   public static int field1829;
   @OriginalMember(
      owner = "client!ofa",
      name = "g",
      descriptor = "I"
   )
   public static int field1830;
   @OriginalMember(
      owner = "client!ofa",
      name = "c",
      descriptor = "Lww;"
   )
   public static class339 field1826;
   @OriginalMember(
      owner = "client!ofa",
      name = "a",
      descriptor = "Ljava/awt/Image;"
   )
   public static Image field1831;

   @OriginalMember(
      owner = "client!ofa",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method1182(byte arg0) {
      try {
         ++field1829;
         if (!class237.field3000) {
            class784.field11461 += (24.0F - class784.field11461) / 2.0F;
            if (arg0 > 22) {
               class237.field3000 = true;
               class193.field2447 = true;
            }
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1832[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ofa",
      name = "a",
      descriptor = "(IZ)I"
   )
   public static final int method1183(int arg0, boolean arg1) {
      try {
         ++field1825;
         if (arg1) {
            field1831 = null;
         }

         return 127 & arg0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1832[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ofa",
      name = "a",
      descriptor = "(B)Lro;"
   )
   public static final class288 method1184(byte arg0) {
      try {
         ++field1827;
         if (arg0 != -17) {
            method1184((byte)-122);
         }

         try {
            return (class288)Class.forName(field1832[3]).newInstance();
         } catch (Throwable var2) {
            return null;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1832[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ofa",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1185(int arg0) {
      try {
         field1828 = null;
         field1831 = null;
         field1826 = null;
         if (arg0 != -30935) {
            field1830 = -18;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1832[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ofa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1186(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 71);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ofa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1187(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 74;
            break;
         case 1:
            var10005 = 64;
            break;
         case 2:
            var10005 = 123;
            break;
         case 3:
            var10005 = 79;
            break;
         default:
            var10005 = 71;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
