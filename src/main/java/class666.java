import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class666 {
   @OriginalMember(
      owner = "client!ua",
      name = "c",
      descriptor = "Liu;"
   )
   private class530 field9864;
   @OriginalMember(
      owner = "client!ua",
      name = "b",
      descriptor = "J"
   )
   public long field9866;
   @OriginalMember(
      owner = "client!ua",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9870 = new String[]{method4868(method4867("s\u0019~\u0001xh\u0019<\u000ekcP")), method4868(method4867("s\u0019~&9")), method4868(method4867("s\u0019~[xh\u0011$Y9")), method4868(method4867("h\r<\u000b")), method4868(method4867("}V~Il"))};
   @OriginalMember(
      owner = "client!ua",
      name = "a",
      descriptor = "Lse;"
   )
   public static class6 field9868 = new class6(38, 11);
   @OriginalMember(
      owner = "client!ua",
      name = "d",
      descriptor = "Lse;"
   )
   public static class6 field9869 = new class6(89, -1);
   @OriginalMember(
      owner = "client!ua",
      name = "f",
      descriptor = "I"
   )
   public static int field9865;
   @OriginalMember(
      owner = "client!ua",
      name = "e",
      descriptor = "I"
   )
   public static int field9867;

   @OriginalMember(
      owner = "client!ua",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4866(int arg0) {
      try {
         field9869 = null;
         int var1 = 57 / ((arg0 - 15) / 55);
         field9868 = null;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field9870[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ua",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         ++field9865;
         this.field9864.method4031(this.field9866, (byte)-84);
         super.finalize();
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field9870[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ua",
      name = "<init>",
      descriptor = "(Liu;J[Llj;)V"
   )
   public class666(class530 arg0, long arg1, class8[] arg2) {
      try {
         this.field9864 = arg0;
         this.field9866 = arg1;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field9870[2] + (arg0 != null ? field9870[4] : field9870[3]) + ',' + arg1 + ',' + (arg2 != null ? field9870[4] : field9870[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ua",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4867(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 17);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ua",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4868(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 6;
            break;
         case 1:
            var10005 = 120;
            break;
         case 2:
            var10005 = 80;
            break;
         case 3:
            var10005 = 103;
            break;
         default:
            var10005 = 17;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
