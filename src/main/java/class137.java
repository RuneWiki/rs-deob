import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class137 extends class673 {
   @OriginalMember(
      owner = "client!nf",
      name = "l",
      descriptor = "I"
   )
   public int field1739;
   @OriginalMember(
      owner = "client!nf",
      name = "m",
      descriptor = "I"
   )
   public int field1738;
   @OriginalMember(
      owner = "client!nf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1746 = new String[]{method1148(method1147("zb'd<")), method1148(method1147("zb'\u001a}zm}\u0018<")), method1148(method1147("4W3\u0006")), method1148(method1147("zb'g<")), method1148(method1147("zb'e<")), method1148(method1147("zqeJ")), method1148(method1147("zb'b<")), method1148(method1147("o*'\bi"))};
   @OriginalMember(
      owner = "client!nf",
      name = "n",
      descriptor = "Lsia;"
   )
   public static class407 field1737 = new class407(32);
   @OriginalMember(
      owner = "client!nf",
      name = "s",
      descriptor = "Z"
   )
   public static boolean field1742 = false;
   @OriginalMember(
      owner = "client!nf",
      name = "u",
      descriptor = "I"
   )
   public static int field1736;
   @OriginalMember(
      owner = "client!nf",
      name = "q",
      descriptor = "I"
   )
   public static int field1740;
   @OriginalMember(
      owner = "client!nf",
      name = "o",
      descriptor = "I"
   )
   public static int field1741;
   @OriginalMember(
      owner = "client!nf",
      name = "p",
      descriptor = "I"
   )
   public static int field1743;
   @OriginalMember(
      owner = "client!nf",
      name = "r",
      descriptor = "I"
   )
   public static int field1744;
   @OriginalMember(
      owner = "client!nf",
      name = "t",
      descriptor = "[Loca;"
   )
   public static class642[] field1745;

   @OriginalMember(
      owner = "client!nf",
      name = "a",
      descriptor = "(BI)Llha;"
   )
   public static final class36 method1143(byte arg0, int arg1) {
      try {
         ++field1736;
         class36 var2 = (class36)class791.field11561.method2947((long)arg1, 28581);
         if (var2 != null) {
            return var2;
         } else {
            byte[] var3 = class160.field2044.method2697(0, arg1, false);
            if (arg0 > -16) {
               field1743 = 73;
            }

            if (var3 != null && ~var3.length < -2) {
               class36 var4;
               try {
                  var4 = class739.method5367(var3, (byte)-122);
               } catch (Exception var7) {
                  throw new RuntimeException(var7.getMessage() + field1746[2] + arg1);
               }

               class791.field11561.method2946(var4, true, (long)arg1);
               return var4;
            } else {
               return null;
            }
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field1746[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nf",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1144(int arg0) {
      try {
         if (arg0 != 1) {
            method1144(-118);
         }

         field1745 = null;
         field1737 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1746[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nf",
      name = "a",
      descriptor = "(Lsa;B)V"
   )
   public static final void method1145(class783 arg0, byte arg1) {
      try {
         if (arg1 < 11) {
            method1143((byte)24, -55);
         }

         ++field1741;
         class258 var2 = (class258)class328.field4539.method1818(-1, (long)arg0.field145);
         if (var2 != null) {
            if (var2.field3280 != null) {
               class674.field9978.method2844(var2.field3280);
               var2.field3280 = null;
            }

            var2.method4924(-2970);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field1746[6] + (arg0 != null ? field1746[7] : field1746[5]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nf",
      name = "a",
      descriptor = "(B)I"
   )
   public static final int method1146(byte arg0) {
      try {
         ++field1740;
         if (class233.field2900 != null) {
            return 3;
         } else {
            if (arg0 < 20) {
               method1146((byte)95);
            }

            return !class234.field2934 ? 1 : 2;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1746[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nf",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class137(int arg0, int arg1) {
      try {
         this.field1739 = arg0;
         this.field1738 = arg1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field1746[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1147(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 20);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1148(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 20;
            break;
         case 1:
            var10005 = 4;
            break;
         case 2:
            var10005 = 9;
            break;
         case 3:
            var10005 = 38;
            break;
         default:
            var10005 = 20;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
