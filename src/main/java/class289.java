import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class289 {
   @OriginalMember(
      owner = "client!up",
      name = "i",
      descriptor = "B"
   )
   private byte field4051;
   @OriginalMember(
      owner = "client!up",
      name = "l",
      descriptor = "I"
   )
   public int field4041;
   @OriginalMember(
      owner = "client!up",
      name = "a",
      descriptor = "I"
   )
   public int field4042;
   @OriginalMember(
      owner = "client!up",
      name = "h",
      descriptor = "I"
   )
   public int field4046;
   @OriginalMember(
      owner = "client!up",
      name = "e",
      descriptor = "I"
   )
   public int field4043;
   @OriginalMember(
      owner = "client!up",
      name = "k",
      descriptor = "I"
   )
   public int field4040;
   @OriginalMember(
      owner = "client!up",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4053 = new String[]{method2248(method2247("g,2vY")), method2248(method2247("|)pX")), method2248(method2247("ir2\u001a\f")), method2248(method2247("g,2\b\u0018|5h\nY")), method2248(method2247("g,2pY")), method2248(method2247("g,2uY")), method2248(method2247("g,2wY"))};
   @OriginalMember(
      owner = "client!up",
      name = "b",
      descriptor = "Lqg;"
   )
   public static class485 field4044 = new class485(4, 1);
   @OriginalMember(
      owner = "client!up",
      name = "m",
      descriptor = "[I"
   )
   public static int[] field4052 = new int[200];
   @OriginalMember(
      owner = "client!up",
      name = "d",
      descriptor = "I"
   )
   public static int field4045;
   @OriginalMember(
      owner = "client!up",
      name = "g",
      descriptor = "I"
   )
   public static int field4047;
   @OriginalMember(
      owner = "client!up",
      name = "j",
      descriptor = "I"
   )
   public static int field4049;
   @OriginalMember(
      owner = "client!up",
      name = "c",
      descriptor = "I"
   )
   public static int field4050;
   @OriginalMember(
      owner = "client!up",
      name = "f",
      descriptor = "Lbaa;"
   )
   public static class546 field4048;

   @OriginalMember(
      owner = "client!up",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method2243(int arg0) {
      try {
         if (arg0 != -9696) {
            this.field4051 = 42;
         }

         ++field4047;
         return 7 & this.field4051;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4053[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!up",
      name = "a",
      descriptor = "(B)[Lhm;"
   )
   public static final class230[] method2244(byte arg0) {
      try {
         ++field4049;
         if (arg0 != -63) {
            method2244((byte)15);
         }

         return new class230[]{class542.field7860, class223.field3327, class389.field5742, class396.field5818, class497.field7267, class290.field4055, class344.field4909, class348.field4951, class431.field6250, class281.field3939, class307.field4433, class120.field1943, class594.field8569, class567.field8226};
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field4053[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!up",
      name = "a",
      descriptor = "(Z)I"
   )
   public final int method2245(boolean arg0) {
      try {
         if (!arg0) {
            this.method2243(119);
         }

         ++field4050;
         return ~(this.field4051 & 8) == -9 ? 1 : 0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4053[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!up",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2246(int arg0) {
      try {
         field4052 = null;
         field4048 = null;
         if (arg0 != 4) {
            field4044 = null;
         }

         field4044 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field4053[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!up",
      name = "<init>",
      descriptor = "()V"
   )
   public class289() {
   }

   @OriginalMember(
      owner = "client!up",
      name = "<init>",
      descriptor = "(Luda;)V"
   )
   public class289(class473 arg0) {
      try {
         this.field4051 = arg0.method3543(-1132613840);
         this.field4041 = arg0.method3565(true);
         this.field4042 = arg0.method3567(31871);
         this.field4046 = arg0.method3567(31871);
         this.field4043 = arg0.method3567(31871);
         this.field4040 = arg0.method3567(31871);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4053[3] + (arg0 != null ? field4053[2] : field4053[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!up",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2247(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 113);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!up",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2248(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 18;
            break;
         case 1:
            var10005 = 92;
            break;
         case 2:
            var10005 = 28;
            break;
         case 3:
            var10005 = 52;
            break;
         default:
            var10005 = 113;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
