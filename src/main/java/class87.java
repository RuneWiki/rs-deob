import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class87 {
   @OriginalMember(
      owner = "client!jv",
      name = "d",
      descriptor = "J"
   )
   public long field1119;
   @OriginalMember(
      owner = "client!jv",
      name = "a",
      descriptor = "[I"
   )
   public int[] field1118;
   @OriginalMember(
      owner = "client!jv",
      name = "c",
      descriptor = "[S"
   )
   public short[] field1116;
   @OriginalMember(
      owner = "client!jv",
      name = "b",
      descriptor = "[S"
   )
   public short[] field1115;
   @OriginalMember(
      owner = "client!jv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1121 = new String[]{method843(method842("\u0016/_\u001e")), method843(method842("\u0003t\u001d\\G")), method843(method842("\u0012,\u001dNS\u00163GL\u0012")), method843(method842("\u0012,\u001d0\u0012")), method843(method842("\u0012,\u001d3\u0012"))};
   @OriginalMember(
      owner = "client!jv",
      name = "f",
      descriptor = "I"
   )
   public static int field1120;
   @OriginalMember(
      owner = "client!jv",
      name = "e",
      descriptor = "Ld;"
   )
   public static class160 field1117;

   @OriginalMember(
      owner = "client!jv",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method840(int arg0) {
      try {
         field1117 = null;
         int var1 = 72 / ((arg0 - -27) / 50);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1121[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jv",
      name = "<init>",
      descriptor = "(J[I[S[S)V"
   )
   public class87(long arg0, int[] arg1, short[] arg2, short[] arg3) {
      try {
         this.field1119 = arg0;
         this.field1118 = arg1;
         this.field1116 = arg2;
         this.field1115 = arg3;
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field1121[2] + arg0 + ',' + (arg1 != null ? field1121[1] : field1121[0]) + ',' + (arg2 != null ? field1121[1] : field1121[0]) + ',' + (arg3 != null ? field1121[1] : field1121[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jv",
      name = "<init>",
      descriptor = "()V"
   )
   protected class87() {
   }

   @OriginalMember(
      owner = "client!jv",
      name = "a",
      descriptor = "(CI)Z"
   )
   public static final boolean method841(char arg0, int arg1) {
      try {
         if (arg1 != -16668) {
            method840(-72);
         }

         ++field1120;
         return ~arg0 <= -49 && arg0 <= '9';
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1121[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method842(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 58);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method843(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 120;
            break;
         case 1:
            var10005 = 90;
            break;
         case 2:
            var10005 = 51;
            break;
         case 3:
            var10005 = 114;
            break;
         default:
            var10005 = 58;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
