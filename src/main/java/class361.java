import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afa")
public class class361 extends class629 {
   @OriginalMember(
      owner = "client!afa",
      name = "F",
      descriptor = "I"
   )
   private int field5401;
   @OriginalMember(
      owner = "client!afa",
      name = "J",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5405 = new String[]{method2835(method2834("T8:Z9\\02\u0000;\u001d")), method2835(method2834("[+7\u0018")), method2835(method2834("NpuZx")), method2835(method2834("T8:Z@\u001d")), method2835(method2834("T8:ZH\u001d")), method2835(method2834("T8:ZO\u001d"))};
   @OriginalMember(
      owner = "client!afa",
      name = "H",
      descriptor = "Luw;"
   )
   public static class435 field5400 = new class435(33, 8);
   @OriginalMember(
      owner = "client!afa",
      name = "D",
      descriptor = "F"
   )
   public static float field5399;
   @OriginalMember(
      owner = "client!afa",
      name = "I",
      descriptor = "I"
   )
   public static int field5402;
   @OriginalMember(
      owner = "client!afa",
      name = "G",
      descriptor = "I"
   )
   public static int field5403;
   @OriginalMember(
      owner = "client!afa",
      name = "E",
      descriptor = "Lac;"
   )
   public static class564 field5404;

   @OriginalMember(
      owner = "client!afa",
      name = "<init>",
      descriptor = "(I)V",
      line = 4
   )
   public class361(int arg0) {
      super(0, true);
      this.field5401 = 4096;

      try {
         this.field5401 = arg0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5405[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!afa",
      name = "<init>",
      descriptor = "()V",
      line = 12
   )
   public class361() {
      this(4096);
   }

   @OriginalMember(
      owner = "client!afa",
      name = "b",
      descriptor = "(B)V",
      line = 16
   )
   public static void method2833(byte arg0) {
      try {
         if (arg0 <= -125) {
            field5404 = null;
            field5400 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5405[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!afa",
      name = "a",
      descriptor = "(Luda;II)V",
      line = 28
   )
   public final void method241(class473 arg0, int arg1, int arg2) {
      try {
         if (~arg2 == -1) {
            this.field5401 = (arg0.method3564((byte)-78) << 12) / 255;
         }

         if (arg1 != 0) {
            this.method45(111, 76);
         }

         ++field5402;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field5405[3] + (arg0 != null ? field5405[2] : field5405[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!afa",
      name = "b",
      descriptor = "(II)[I",
      line = 56
   )
   public final int[] method45(int arg0, int arg1) {
      try {
         ++field5403;
         if (arg1 != 2048) {
            return null;
         } else {
            int[] var3 = super.field9161.method3870((byte)56, arg0);
            if (super.field9161.field7474) {
               class365.method2852(var3, 0, class66.field1214, this.field5401);
            }

            return var3;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field5405[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!afa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2834(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 5);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!afa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2835(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 53;
            break;
         case 1:
            var10005 = 94;
            break;
         case 2:
            var10005 = 91;
            break;
         case 3:
            var10005 = 116;
            break;
         default:
            var10005 = 5;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
