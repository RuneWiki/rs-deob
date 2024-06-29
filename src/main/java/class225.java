import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class225 extends class70 {
   @OriginalMember(
      owner = "client!vu",
      name = "O",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2819 = new String[]{method1799(method1798("T\u0001#U\b")), method1799(method1798("T\u0001#_\b")), method1799(method1798("L\u0001a|")), method1799(method1798("T\u0001#T\b")), method1799(method1798("YZ#>]")), method1799(method1798("T\u0001#W\b"))};
   @OriginalMember(
      owner = "client!vu",
      name = "K",
      descriptor = "Laka;"
   )
   public static class418 field2815 = new class418(133, 5);
   @OriginalMember(
      owner = "client!vu",
      name = "J",
      descriptor = "Laka;"
   )
   public static class418 field2817 = new class418(112, 6);
   @OriginalMember(
      owner = "client!vu",
      name = "M",
      descriptor = "I"
   )
   public static int field2818 = 0;
   @OriginalMember(
      owner = "client!vu",
      name = "I",
      descriptor = "I"
   )
   public static int field2813;
   @OriginalMember(
      owner = "client!vu",
      name = "N",
      descriptor = "I"
   )
   public static int field2814;
   @OriginalMember(
      owner = "client!vu",
      name = "L",
      descriptor = "I"
   )
   public static int field2816;

   @OriginalMember(
      owner = "client!vu",
      name = "a",
      descriptor = "(Ljava/lang/String;BLjava/lang/String;)V"
   )
   public static final void method1795(String arg0, byte arg1, String arg2) {
      try {
         class413.field5674 = 1;
         class139.field1755 = -1;
         ++field2813;
         class223.field2792 = class387.field5363;
         class670.method4886(arg0, (byte)107, arg2, false, false);
         int var3 = -39 / ((-43 - arg1) / 57);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field2819[3] + (arg0 != null ? field2819[4] : field2819[2]) + ',' + arg1 + ',' + (arg2 != null ? field2819[4] : field2819[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vu",
      name = "<init>",
      descriptor = "()V"
   )
   public class225() {
      super(1, true);
   }

   @OriginalMember(
      owner = "client!vu",
      name = "i",
      descriptor = "(I)V"
   )
   public static void method1796(int arg0) {
      try {
         if (arg0 != -25361) {
            method1795((String)null, (byte)58, (String)null);
         }

         field2817 = null;
         field2815 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field2819[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vu",
      name = "b",
      descriptor = "(II)V"
   )
   public static final void method1797(int arg0, int arg1) {
      try {
         ++field2816;
         class487 var2 = class2.method12((long)arg1, 9, (byte)43);
         var2.method3696(-11118);
         if (arg0 != 5) {
            method1795((String)null, (byte)-45, (String)null);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field2819[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vu",
      name = "a",
      descriptor = "(BI)[I"
   )
   public final int[] method331(byte arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field2814;
         if (arg0 != -63) {
            field2818 = 2;
         }

         int[] var4 = super.field940.method119(false, arg1);
         if (super.field940.field270) {
            int[][] var5 = this.method696(arg1, 0, arg0 ^ -32706);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int var9 = 0;
            if (var3 || var9 < class262.field3328) {
               do {
                  var4[var9] = (var6[var9] + var7[var9] + var8[var9]) / 3;
                  ++var9;
               } while(var9 < class262.field3328);
            }
         }

         return var4;
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field2819[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1798(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 32);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1799(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 34;
            break;
         case 1:
            var10005 = 116;
            break;
         case 2:
            var10005 = 13;
            break;
         case 3:
            var10005 = 16;
            break;
         default:
            var10005 = 32;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
