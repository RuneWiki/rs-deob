import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public abstract class class572 {
   @OriginalMember(
      owner = "client!ea",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field8523 = method4240(method4239("\u007f4\u0004EU"));
   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "I"
   )
   public static int field8520;
   @OriginalMember(
      owner = "client!ea",
      name = "c",
      descriptor = "I"
   )
   public static int field8521;
   @OriginalMember(
      owner = "client!ea",
      name = "b",
      descriptor = "I"
   )
   public static int field8522;
   @OriginalMember(
      owner = "client!ea",
      name = "d",
      descriptor = "J"
   )
   public static long field8519;

   @OriginalMember(
      owner = "client!ea",
      name = "b",
      descriptor = "(IJ)I",
      line = 4
   )
   public final int method4238(int arg0, long arg1) {
      try {
         if (arg0 != 15297) {
            field8519 = -97L;
         }

         ++field8522;
         long var4 = this.method1108(false);
         if (~var4 < -1L) {
            class89.method817(var4, 2535);
         }

         return this.method1111(arg0 + -39059, arg1);
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field8523 + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(IJ)I"
   )
   public abstract int method1111(int arg0, long arg1);

   @OriginalMember(
      owner = "client!ea",
      name = "b",
      descriptor = "(B)J"
   )
   public abstract long method1110(byte arg0);

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(Z)J"
   )
   public abstract long method1108(boolean arg0);

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(B)V"
   )
   public abstract void method1109(byte arg0);

   @OriginalMember(
      owner = "client!ea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4239(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 125);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4240(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 26;
            break;
         case 1:
            var10005 = 85;
            break;
         case 2:
            var10005 = 42;
            break;
         case 3:
            var10005 = 3;
            break;
         default:
            var10005 = 125;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
