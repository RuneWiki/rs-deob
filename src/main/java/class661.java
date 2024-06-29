import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class661 {
   @OriginalMember(
      owner = "client!am",
      name = "f",
      descriptor = "I"
   )
   public int field9620 = -1;
   @OriginalMember(
      owner = "client!am",
      name = "l",
      descriptor = "I"
   )
   public int field9622 = -1;
   @OriginalMember(
      owner = "client!am",
      name = "h",
      descriptor = "I"
   )
   public int field9634 = -1;
   @OriginalMember(
      owner = "client!am",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9635 = new String[]{method4829(method4828("9l\u001b\u0006L")), method4829(method4828(",7YD")), method4829(method4828("#/\u001bk\u0019")), method4829(method4828("#/\u001bj\u0019")), method4829(method4828("#/\u001bi\u0019"))};
   @OriginalMember(
      owner = "client!am",
      name = "i",
      descriptor = "Z"
   )
   public static boolean field9629 = false;
   @OriginalMember(
      owner = "client!am",
      name = "j",
      descriptor = "I"
   )
   public static int field9621;
   @OriginalMember(
      owner = "client!am",
      name = "b",
      descriptor = "I"
   )
   public int field9623;
   @OriginalMember(
      owner = "client!am",
      name = "k",
      descriptor = "I"
   )
   public int field9624;
   @OriginalMember(
      owner = "client!am",
      name = "n",
      descriptor = "I"
   )
   public int field9627;
   @OriginalMember(
      owner = "client!am",
      name = "m",
      descriptor = "I"
   )
   public int field9628;
   @OriginalMember(
      owner = "client!am",
      name = "e",
      descriptor = "I"
   )
   public static int field9630;
   @OriginalMember(
      owner = "client!am",
      name = "a",
      descriptor = "I"
   )
   public int field9631;
   @OriginalMember(
      owner = "client!am",
      name = "d",
      descriptor = "I"
   )
   public int field9633;
   @OriginalMember(
      owner = "client!am",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field9625;
   @OriginalMember(
      owner = "client!am",
      name = "g",
      descriptor = "[Ldha;"
   )
   public static class85[] field9626;
   @OriginalMember(
      owner = "client!am",
      name = "o",
      descriptor = "[[[B"
   )
   public static byte[][][] field9632;

   @OriginalMember(
      owner = "client!am",
      name = "a",
      descriptor = "(IJ)V"
   )
   public static final void method4825(int arg0, long arg1) {
      try {
         ++field9621;
         if (arg1 > 0L) {
            if (arg1 % 10L != (long)arg0) {
               class683.method4980(35044, arg1);
            } else {
               class683.method4980(arg0 + 35044, arg1 - 1L);
               class683.method4980(arg0 + 35044, 1L);
            }
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field9635[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!am",
      name = "a",
      descriptor = "(ILjava/lang/String;I)V"
   )
   public static final void method4826(int arg0, String arg1, int arg2) {
      try {
         int var3 = 90 % ((arg0 - 54) / 45);
         ++field9630;
         class755 var4 = class317.method2325((long)arg2, 103, 3);
         var4.method5479(1288);
         var4.field11186 = arg1;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field9635[2] + arg0 + ',' + (arg1 != null ? field9635[0] : field9635[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!am",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4827(byte arg0) {
      try {
         field9625 = null;
         if (arg0 >= -57) {
            field9626 = null;
         }

         field9626 = null;
         field9632 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field9635[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!am",
      name = "<init>",
      descriptor = "(Lcl;)V"
   )
   public class661(class279 arg0) {
   }

   @OriginalMember(
      owner = "client!am",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4828(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 49);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!am",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4829(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 66;
            break;
         case 1:
            var10005 = 66;
            break;
         case 2:
            var10005 = 53;
            break;
         case 3:
            var10005 = 40;
            break;
         default:
            var10005 = 49;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
