import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public abstract class class384 {
   @OriginalMember(
      owner = "client!vo",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field5328 = method3044(method3043("`\u000e-\u0010\u0004"));
   @OriginalMember(
      owner = "client!vo",
      name = "b",
      descriptor = "I"
   )
   public static int field5326 = 0;
   @OriginalMember(
      owner = "client!vo",
      name = "a",
      descriptor = "I"
   )
   public static int field5327 = 1;
   @OriginalMember(
      owner = "client!vo",
      name = "c",
      descriptor = "I"
   )
   public static int field5325;

   @OriginalMember(
      owner = "client!vo",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method3042(boolean arg0) {
      try {
         ++field5325;
         class757.field11093.method5438(true, class757.field11093.field10983, 1);
         class757.field11093.method5438(arg0, class757.field11093.field10978, 1);
         class757.field11093.method5438(true, class757.field11093.field11004, 2);
         class757.field11093.method5438(arg0, class757.field11093.field11018, 2);
         class757.field11093.method5438(true, class757.field11093.field11011, 1);
         class757.field11093.method5438(arg0, class757.field11093.field10967, 1);
         class757.field11093.method5438(true, class757.field11093.field10987, 1);
         class757.field11093.method5438(true, class757.field11093.field10998, 1);
         class757.field11093.method5438(arg0, class757.field11093.field11015, 1);
         class757.field11093.method5438(true, class757.field11093.field10973, 1);
         class757.field11093.method5438(true, class757.field11093.field11003, 1);
         class757.field11093.method5438(arg0, class757.field11093.field11016, 1);
         class757.field11093.method5438(true, class757.field11093.field11005, 0);
         class757.field11093.method5438(true, class757.field11093.field10999, 1);
         class757.field11093.method5438(arg0, class757.field11093.field11019, 0);
         class757.field11093.method5438(true, class757.field11093.field10969, 0);
         class757.field11093.method5438(true, class757.field11093.field10972, 1);
         class757.field11093.method5438(arg0, class757.field11093.field11009, 0);
         class757.field11093.method5438(true, class757.field11093.field11000, 0);
         class315.method2498((byte)118);
         class757.field11093.method5438(true, class757.field11093.field11010, 1);
         class757.field11093.method5438(arg0, class757.field11093.field10966, 3);
         class281.method2266(true);
         class274.method2167(-1662);
         class187.field2382 = true;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5328 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vo",
      name = "a",
      descriptor = "(BLgl;)Lgl;"
   )
   public abstract class647 method1036(byte arg0, class647 arg1);

   @OriginalMember(
      owner = "client!vo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3043(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 44);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3044(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 22;
            break;
         case 1:
            var10005 = 97;
            break;
         case 2:
            var10005 = 3;
            break;
         case 3:
            var10005 = 82;
            break;
         default:
            var10005 = 44;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
