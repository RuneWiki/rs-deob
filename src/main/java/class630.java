import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class630 {
   @OriginalMember(
      owner = "client!gl",
      name = "c",
      descriptor = "Z"
   )
   public boolean field8829;
   @OriginalMember(
      owner = "client!gl",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8830 = new String[]{method4582(method4581("f8!x?")), method4582(method4581("f8!\u0006~o={\u0004?")), method4582(method4581("f8!{?")), method4582(method4581("f8!y?")), method4582(method4581("f8!~?"))};
   @OriginalMember(
      owner = "client!gl",
      name = "g",
      descriptor = "Z"
   )
   public static boolean field8821 = false;
   @OriginalMember(
      owner = "client!gl",
      name = "f",
      descriptor = "Ltga;"
   )
   public static class63 field8824 = new class63(2);
   @OriginalMember(
      owner = "client!gl",
      name = "e",
      descriptor = "I"
   )
   public static int field8822;
   @OriginalMember(
      owner = "client!gl",
      name = "i",
      descriptor = "I"
   )
   public static int field8825;
   @OriginalMember(
      owner = "client!gl",
      name = "b",
      descriptor = "I"
   )
   public static int field8827;
   @OriginalMember(
      owner = "client!gl",
      name = "h",
      descriptor = "Loia;"
   )
   public class96 field8826;
   @OriginalMember(
      owner = "client!gl",
      name = "a",
      descriptor = "Loia;"
   )
   public class96 field8828;
   @OriginalMember(
      owner = "client!gl",
      name = "d",
      descriptor = "Z"
   )
   public boolean field8823;

   @OriginalMember(
      owner = "client!gl",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method4577(int arg0) {
      try {
         if (this.field8828 != null) {
            this.field8828.method788((byte)98);
         }

         ++field8825;
         this.field8823 = false;
         if (arg0 != 2757) {
            method4579((byte)79);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field8830[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gl",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4578(int arg0) {
      try {
         if (arg0 >= 14) {
            field8824 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field8830[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gl",
      name = "a",
      descriptor = "(B)I"
   )
   public static final int method4579(byte arg0) {
      try {
         ++field8822;
         class590 var1 = class305.field4046;
         synchronized(class305.field4046) {
            return arg0 >= -69 ? -32 : class305.field4046.method4237((byte)34);
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field8830[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gl",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method4580(int arg0) {
      try {
         if (arg0 != 2) {
            return true;
         } else {
            ++field8827;
            return this.field8823 && !this.field8829;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field8830[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gl",
      name = "<init>",
      descriptor = "(Z)V"
   )
   public class630(boolean arg0) {
      try {
         this.field8829 = arg0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field8830[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4581(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 23);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4582(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 1;
            break;
         case 1:
            var10005 = 84;
            break;
         case 2:
            var10005 = 15;
            break;
         case 3:
            var10005 = 58;
            break;
         default:
            var10005 = 23;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
