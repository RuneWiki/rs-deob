import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public abstract class class191 extends class247 {
   @OriginalMember(
      owner = "client!nv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2795 = new String[]{method1694(method1693("OH>\u0001")), method1694(method1693("Z\u0013|Cj")), method1694(method1693("NM7\u0003}R")), method1694(method1693("OK|,?"))};
   @OriginalMember(
      owner = "client!nv",
      name = "k",
      descriptor = "I"
   )
   public static int field2793;
   @OriginalMember(
      owner = "client!nv",
      name = "j",
      descriptor = "J"
   )
   public static long field2794;

   @OriginalMember(
      owner = "client!nv",
      name = "a",
      descriptor = "(BLea;)V"
   )
   public abstract void method342(byte arg0, class456 arg1);

   @OriginalMember(
      owner = "client!nv",
      name = "a",
      descriptor = "(Lfea;BZZLjava/lang/String;)V"
   )
   public static final void method1692(class82 arg0, byte arg1, boolean arg2, boolean arg3, String arg4) {
      try {
         ++field2793;
         int var5 = -12 / ((arg1 - -20) / 53);
         class727.method5259(field2795[2], arg4, arg2, arg3, 3009, arg0);
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field2795[3] + (arg0 != null ? field2795[1] : field2795[0]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field2795[1] : field2795[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nv",
      name = "a",
      descriptor = "(Lcu;I)V"
   )
   public abstract void method346(class65 arg0, int arg1);

   @OriginalMember(
      owner = "client!nv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1693(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 23);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1694(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 33;
            break;
         case 1:
            var10005 = 61;
            break;
         case 2:
            var10005 = 82;
            break;
         case 3:
            var10005 = 109;
            break;
         default:
            var10005 = 23;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
