import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class726 extends class347 {
   @OriginalMember(
      owner = "client!dq",
      name = "k",
      descriptor = "Lct;"
   )
   public class155 field10794;
   @OriginalMember(
      owner = "client!dq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10795 = new String[]{method5263(method5262("y@PR$")), method5263(method5262("l\u001b\u0012\u0010")), method5263(method5262("f\u001fP@0l\u0007\nBq")), method5263(method5262("f\u001fP=q")), method5263(method5262("f\u001fP>q"))};
   @OriginalMember(
      owner = "client!dq",
      name = "o",
      descriptor = "I"
   )
   public static int field10788 = 0;
   @OriginalMember(
      owner = "client!dq",
      name = "l",
      descriptor = "Lsda;"
   )
   public static class269 field10793 = new class269(2, 6);
   @OriginalMember(
      owner = "client!dq",
      name = "n",
      descriptor = "I"
   )
   public static int field10791;
   @OriginalMember(
      owner = "client!dq",
      name = "i",
      descriptor = "I"
   )
   public static int field10792;
   @OriginalMember(
      owner = "client!dq",
      name = "m",
      descriptor = "Law;"
   )
   public static class82 field10790;
   @OriginalMember(
      owner = "client!dq",
      name = "j",
      descriptor = "[[I"
   )
   public static int[][] field10789;

   @OriginalMember(
      owner = "client!dq",
      name = "a",
      descriptor = "(IBILjava/lang/String;Z)V"
   )
   public static final void method5260(int arg0, byte arg1, int arg2, String arg3, boolean arg4) {
      try {
         class397.method3040(arg0, (String)null, arg3, true, arg4, false, arg2);
         ++field10792;
         if (arg1 != 15) {
            method5260(-79, (byte)64, -30, (String)null, false);
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field10795[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field10795[0] : field10795[1]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dq",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5261(int arg0) {
      try {
         field10790 = null;
         field10793 = null;
         if (arg0 != 0) {
            field10793 = null;
         }

         field10789 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10795[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dq",
      name = "<init>",
      descriptor = "(Lct;)V"
   )
   public class726(class155 arg0) {
      try {
         this.field10794 = arg0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10795[2] + (arg0 != null ? field10795[0] : field10795[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5262(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 89);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5263(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 2;
            break;
         case 1:
            var10005 = 110;
            break;
         case 2:
            var10005 = 126;
            break;
         case 3:
            var10005 = 124;
            break;
         default:
            var10005 = 89;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
