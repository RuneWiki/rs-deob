import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class750 extends class604 {
   @OriginalMember(
      owner = "client!dr",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field11112 = method5470(method5469("`+K\t\u001f"));
   @OriginalMember(
      owner = "client!dr",
      name = "l",
      descriptor = "Z"
   )
   public static boolean field11111 = false;
   @OriginalMember(
      owner = "client!dr",
      name = "i",
      descriptor = "I"
   )
   public static int field11110;
   @OriginalMember(
      owner = "client!dr",
      name = "k",
      descriptor = "Ldr;"
   )
   public class750 field11108;
   @OriginalMember(
      owner = "client!dr",
      name = "j",
      descriptor = "Ldr;"
   )
   public class750 field11109;

   @OriginalMember(
      owner = "client!dr",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method5468(boolean arg0) {
      try {
         ++field11110;
         if (this.field11108 != null) {
            this.field11108.field11109 = this.field11109;
            this.field11109.field11108 = this.field11108;
            this.field11108 = null;
            this.field11109 = null;
            if (!arg0) {
               this.method5468(false);
            }
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field11112 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5469(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 55);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5470(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 4;
            break;
         case 1:
            var10005 = 89;
            break;
         case 2:
            var10005 = 101;
            break;
         case 3:
            var10005 = 72;
            break;
         default:
            var10005 = 55;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
