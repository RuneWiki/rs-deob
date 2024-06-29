import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class123 extends class15 {
   @OriginalMember(
      owner = "client!bk",
      name = "y",
      descriptor = "[[S"
   )
   public short[][] field1615;
   @OriginalMember(
      owner = "client!bk",
      name = "t",
      descriptor = "D"
   )
   public double field1617;
   @OriginalMember(
      owner = "client!bk",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1618 = new String[]{method1078(method1077("\u0015C\u0017U'\u0019AMWf")), method1078(method1077("\u0019]U\u0005")), method1078(method1077("\f\u0006\u0017G3")), method1078(method1077("\u0015C\u0017-f")), method1078(method1077("\u0015C\u0017*f")), method1078(method1077("\u0015C\u0017(f")), method1078(method1077("9GWI-\u0007\u0019\u000b\\|WKQ\b<\u0016KM\f<W\u0018A")), method1078(method1077("\u0015C\u0017+f")), method1078(method1077("WXK\u00068\u001eL\\\r"))};
   @OriginalMember(
      owner = "client!bk",
      name = "u",
      descriptor = "Lse;"
   )
   public static class6 field1611 = new class6(86, 3);
   @OriginalMember(
      owner = "client!bk",
      name = "s",
      descriptor = "I"
   )
   public static int field1609;
   @OriginalMember(
      owner = "client!bk",
      name = "v",
      descriptor = "I"
   )
   public static int field1610;
   @OriginalMember(
      owner = "client!bk",
      name = "x",
      descriptor = "I"
   )
   public static int field1613;
   @OriginalMember(
      owner = "client!bk",
      name = "z",
      descriptor = "I"
   )
   public static int field1616;
   @OriginalMember(
      owner = "client!bk",
      name = "A",
      descriptor = "[I"
   )
   public static int[] field1612;
   @OriginalMember(
      owner = "client!bk",
      name = "w",
      descriptor = "[[B"
   )
   public static byte[][] field1614;

   @OriginalMember(
      owner = "client!bk",
      name = "a",
      descriptor = "(IBI)Z"
   )
   public static final boolean method1073(int arg0, byte arg1, int arg2) {
      try {
         ++field1616;
         int var3 = 61 % ((arg1 - -15) / 60);
         return (arg2 & 2048) != 0;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field1618[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bk",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1074(byte arg0) {
      try {
         field1611 = null;
         field1612 = null;
         field1614 = null;
         int var1 = -115 / ((-40 - arg0) / 59);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1618[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bk",
      name = "c",
      descriptor = "(B)J"
   )
   public final long method1075(byte arg0) {
      try {
         ++field1610;
         return arg0 >= -121 ? -13L : (long)(this.field1615.length << 0 | this.field1615[0].length);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1618[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bk",
      name = "a",
      descriptor = "(BI)C"
   )
   public static final char method1076(byte arg0, int arg1) {
      try {
         ++field1609;
         int var2 = 255 & arg0;
         if (arg1 != -25094) {
            field1611 = null;
         }

         if (var2 == 0) {
            throw new IllegalArgumentException(field1618[6] + Integer.toString(var2, 16) + field1618[8]);
         } else {
            if (~var2 <= -129 && ~var2 > -161) {
               char var3 = class497.field6956[var2 + -128];
               if (var3 == 0) {
                  var3 = '?';
               }

               var2 = var3;
            }

            return (char)var2;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field1618[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bk",
      name = "<init>",
      descriptor = "([[SD)V"
   )
   public class123(short[][] arg0, double arg1) {
      try {
         this.field1615 = arg0;
         this.field1617 = arg1;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field1618[0] + (arg0 != null ? field1618[2] : field1618[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1077(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 78);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1078(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 119;
            break;
         case 1:
            var10005 = 40;
            break;
         case 2:
            var10005 = 57;
            break;
         case 3:
            var10005 = 105;
            break;
         default:
            var10005 = 78;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
