import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class483 {
   @OriginalMember(
      owner = "client!jm",
      name = "a",
      descriptor = "I"
   )
   public int field6919;
   @OriginalMember(
      owner = "client!jm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6923 = new String[]{method3690(method3689("\u0000\u007f^A\u000e\u0004{\u0004CO")), method3690(method3689("\u0000\u007f^\t\b9f\u0002\u0014\t\r:")), method3690(method3689("\u0000\u007f^?O")), method3690(method3689("\u0000\u007f^<O")), method3690(method3689("\u0000\u007f^>O"))};
   @OriginalMember(
      owner = "client!jm",
      name = "f",
      descriptor = "Lbu;"
   )
   public static class234 field6921 = new class234(13, 0, 1, 0);
   @OriginalMember(
      owner = "client!jm",
      name = "d",
      descriptor = "D"
   )
   public static double field6922;
   @OriginalMember(
      owner = "client!jm",
      name = "e",
      descriptor = "I"
   )
   public static int field6917;
   @OriginalMember(
      owner = "client!jm",
      name = "c",
      descriptor = "I"
   )
   public static int field6918;
   @OriginalMember(
      owner = "client!jm",
      name = "b",
      descriptor = "I"
   )
   public static int field6920;

   @OriginalMember(
      owner = "client!jm",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field6917;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6923[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!jm",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method3686(boolean arg0) {
      try {
         class754.method5452();
         if (arg0) {
            field6921 = null;
         }

         ++field6920;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6923[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jm",
      name = "a",
      descriptor = "(IB)Z"
   )
   public static final boolean method3687(int arg0, byte arg1) {
      try {
         ++field6918;
         if (arg1 != 73) {
            method3687(41, (byte)77);
         }

         return arg0 == 0 || ~arg0 == -3;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6923[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jm",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3688(int arg0) {
      try {
         if (arg0 != 0) {
            method3687(-22, (byte)63);
         }

         field6921 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6923[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jm",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class483(int arg0) {
      try {
         this.field6919 = arg0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6923[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3689(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 103);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3690(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 106;
            break;
         case 1:
            var10005 = 18;
            break;
         case 2:
            var10005 = 112;
            break;
         case 3:
            var10005 = 125;
            break;
         default:
            var10005 = 103;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
