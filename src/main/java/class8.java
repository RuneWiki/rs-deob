import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class8 {
   @OriginalMember(
      owner = "client!to",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field82 = new String[]{method43(method42("I#Nu")), method43(method42("\\x\f7X")), method43(method42("S9\fX\r")), method43(method42("S9\fZ\r")), method43(method42("S9\f[\r"))};
   @OriginalMember(
      owner = "client!to",
      name = "a",
      descriptor = "Lek;"
   )
   public static class536 field81 = new class536(82, -1);
   @OriginalMember(
      owner = "client!to",
      name = "b",
      descriptor = "I"
   )
   public static int field79;
   @OriginalMember(
      owner = "client!to",
      name = "c",
      descriptor = "I"
   )
   public static int field80;

   @OriginalMember(
      owner = "client!to",
      name = "a",
      descriptor = "(I)V",
      line = 5
   )
   public static void method39(int arg0) {
      try {
         field81 = null;
         if (arg0 != 0) {
            method41((class678)null, -85);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field82[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!to",
      name = "a",
      descriptor = "(BII)I",
      line = 19
   )
   public static final int method40(byte param0, int param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!to",
      name = "a",
      descriptor = "(Lbl;I)V",
      line = 104
   )
   public static final void method41(class678 arg0, int arg1) {
      try {
         if (arg0.field9992 == 5 && arg0.field9912 != -1) {
            class722.method5251(-28298, class383.field5543, arg0);
         }

         if (arg1 != -18958) {
            method40((byte)-4, 37, 113);
         }

         ++field79;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field82[2] + (arg0 != null ? field82[1] : field82[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!to",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method42(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 37);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!to",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method43(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 39;
            break;
         case 1:
            var10005 = 86;
            break;
         case 2:
            var10005 = 34;
            break;
         case 3:
            var10005 = 25;
            break;
         default:
            var10005 = 37;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
