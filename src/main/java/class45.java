import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dja")
public class class45 {
   @OriginalMember(
      owner = "client!dja",
      name = "b",
      descriptor = "I"
   )
   public int field576;
   @OriginalMember(
      owner = "client!dja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field580 = new String[]{method339(method338("U%h-N^\u001c}qS_(!")), method339(method338("U%h-\u0006X!`w\u0004\u0019")), method339(method338("U%h-x\u0019")), method339(method338("U%h-{\u0019"))};
   @OriginalMember(
      owner = "client!dja",
      name = "e",
      descriptor = "Lse;"
   )
   public static class6 field578 = new class6(82, 7);
   @OriginalMember(
      owner = "client!dja",
      name = "a",
      descriptor = "I"
   )
   public static int field575;
   @OriginalMember(
      owner = "client!dja",
      name = "c",
      descriptor = "I"
   )
   public static int field577;
   @OriginalMember(
      owner = "client!dja",
      name = "d",
      descriptor = "Lbh;"
   )
   public static class453 field579;

   @OriginalMember(
      owner = "client!dja",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field577;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field580[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!dja",
      name = "a",
      descriptor = "(I)I"
   )
   public static final int method336(int arg0) {
      try {
         ++field575;
         class407 var1 = class563.field8278;
         synchronized(class563.field8278) {
            if (arg0 < 31) {
               method336(43);
            }

            return class563.field8278.method3195(-99);
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field580[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dja",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method337(int arg0) {
      try {
         field579 = null;
         field578 = null;
         if (arg0 != 7) {
            method336(16);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field580[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dja",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class45(int arg0) {
      try {
         this.field576 = arg0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field580[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method338(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 58);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method339(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 49;
            break;
         case 1:
            var10005 = 79;
            break;
         case 2:
            var10005 = 9;
            break;
         case 3:
            var10005 = 3;
            break;
         default:
            var10005 = 58;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
