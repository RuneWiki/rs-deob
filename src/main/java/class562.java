import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class562 {
   @OriginalMember(
      owner = "client!gp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8349 = new String[]{method4243(method4242("d\u001b\u0013l\r")), method4243(method4242("m\u001eQB")), method4243(method4242("xE\u0013\u0000X")), method4243(method4242("d\u001b\u0013o\r")), method4243(method4242("d\u001b\u0013j\r")), method4243(method4242("d\u001b\u0013m\r"))};
   @OriginalMember(
      owner = "client!gp",
      name = "b",
      descriptor = "Llea;"
   )
   public static class625 field8345 = new class625();
   @OriginalMember(
      owner = "client!gp",
      name = "a",
      descriptor = "F"
   )
   public static float field8348;
   @OriginalMember(
      owner = "client!gp",
      name = "e",
      descriptor = "I"
   )
   public static int field8344;
   @OriginalMember(
      owner = "client!gp",
      name = "c",
      descriptor = "I"
   )
   public static int field8346;
   @OriginalMember(
      owner = "client!gp",
      name = "d",
      descriptor = "I"
   )
   public static int field8347;

   @OriginalMember(
      owner = "client!gp",
      name = "a",
      descriptor = "(Lti;I)Lti;"
   )
   public static final class80 method4238(class80 arg0, int arg1) {
      try {
         ++field8347;
         if (arg1 <= 23) {
            return null;
         } else {
            class80 var2 = arg0 != null ? new class80(arg0) : new class80();
            var2.method760(9, 128, 0);
            return var2;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8349[3] + (arg0 != null ? field8349[2] : field8349[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gp",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method4239(int param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!gp",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4240(byte arg0) {
      try {
         field8345 = null;
         if (arg0 < 110) {
            method4238((class80)null, -121);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8349[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gp",
      name = "a",
      descriptor = "(II[B)[B"
   )
   public static final byte[] method4241(int arg0, int arg1, byte[] arg2) {
      try {
         ++field8344;
         byte[] var3 = new byte[arg1];
         class107.method1027(arg2, 0, var3, 0, arg1);
         if (arg0 >= -92) {
            field8345 = null;
         }

         return var3;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field8349[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8349[2] : field8349[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4242(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 37);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4243(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 3;
            break;
         case 1:
            var10005 = 107;
            break;
         case 2:
            var10005 = 61;
            break;
         case 3:
            var10005 = 46;
            break;
         default:
            var10005 = 37;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
