import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vha")
public class class713 {
   @OriginalMember(
      owner = "client!vha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10641 = new String[]{method5170(method5169("\u0016!wL`H")), method5170(method5169("\u0016!wLcH")), method5170(method5169("\u0016!wLV\u000f\u001ab\u0010K\u000e.>"))};
   @OriginalMember(
      owner = "client!vha",
      name = "e",
      descriptor = "[Ljava/awt/Rectangle;"
   )
   public static Rectangle[] field10635 = new Rectangle[100];
   @OriginalMember(
      owner = "client!vha",
      name = "c",
      descriptor = "I"
   )
   public static int field10639 = 0;
   @OriginalMember(
      owner = "client!vha",
      name = "f",
      descriptor = "I"
   )
   public static int field10636;
   @OriginalMember(
      owner = "client!vha",
      name = "d",
      descriptor = "I"
   )
   public static int field10637;
   @OriginalMember(
      owner = "client!vha",
      name = "b",
      descriptor = "I"
   )
   public static int field10638;
   @OriginalMember(
      owner = "client!vha",
      name = "a",
      descriptor = "I"
   )
   public static int field10640;

   @OriginalMember(
      owner = "client!vha",
      name = "toString",
      descriptor = "()Ljava/lang/String;",
      line = 4
   )
   public final String toString() {
      try {
         ++field10640;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10641[2] + ')');
      }
   }

   @OriginalMember(
      owner = "client!vha",
      name = "a",
      descriptor = "(B)V",
      line = 12
   )
   public static void method5167(byte arg0) {
      try {
         field10635 = null;
         if (arg0 != -56) {
            field10639 = 59;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10641[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vha",
      name = "a",
      descriptor = "(I)V",
      line = 29
   )
   public static final void method5168(int arg0) {
      try {
         if (arg0 != 0) {
            field10635 = null;
         }

         class788.field11462.method5451(-117);
         ++field10636;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10641[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5169(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 34);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5170(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 96;
            break;
         case 1:
            var10005 = 73;
            break;
         case 2:
            var10005 = 22;
            break;
         case 3:
            var10005 = 98;
            break;
         default:
            var10005 = 34;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
