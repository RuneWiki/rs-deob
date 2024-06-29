import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class776 {
   @OriginalMember(
      owner = "client!pn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11344 = new String[]{method5592(method5591("Tp\u007fZ^")), method5592(method5591("Tp\u007fo\u0019wj#r\u0018C6"))};
   @OriginalMember(
      owner = "client!pn",
      name = "a",
      descriptor = "I"
   )
   public static int field11342;
   @OriginalMember(
      owner = "client!pn",
      name = "c",
      descriptor = "I"
   )
   public static int field11343;
   @OriginalMember(
      owner = "client!pn",
      name = "b",
      descriptor = "[Lat;"
   )
   public static class396[] field11341;

   @OriginalMember(
      owner = "client!pn",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field11342;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field11344[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!pn",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5590(int arg0) {
      try {
         field11341 = null;
         if (arg0 != 24428) {
            field11341 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field11344[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5591(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 118);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5592(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 36;
            break;
         case 1:
            var10005 = 30;
            break;
         case 2:
            var10005 = 81;
            break;
         case 3:
            var10005 = 27;
            break;
         default:
            var10005 = 118;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
