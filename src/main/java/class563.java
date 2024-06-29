import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class563 {
   @OriginalMember(
      owner = "client!vi",
      name = "b",
      descriptor = "I"
   )
   public int field8186;
   @OriginalMember(
      owner = "client!vi",
      name = "d",
      descriptor = "Lrk;"
   )
   private class35 field8187;
   @OriginalMember(
      owner = "client!vi",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8194 = new String[]{method4199(method4198("eeB}?")), method4199(method4198("p>\u0000?")), method4199(method4198("h\"Bo+p\"\u0018mj")), method4199(method4198("h\"B\u0012j")), method4199(method4198("h\"B5+p*\u0000:8{c"))};
   @OriginalMember(
      owner = "client!vi",
      name = "h",
      descriptor = "J"
   )
   public static long field8185 = -1L;
   @OriginalMember(
      owner = "client!vi",
      name = "c",
      descriptor = "Z"
   )
   public static boolean field8190 = true;
   @OriginalMember(
      owner = "client!vi",
      name = "e",
      descriptor = "Lhc;"
   )
   public static class150 field8189 = new class150();
   @OriginalMember(
      owner = "client!vi",
      name = "g",
      descriptor = "I"
   )
   public static int field8188;
   @OriginalMember(
      owner = "client!vi",
      name = "a",
      descriptor = "I"
   )
   public static int field8193;
   @OriginalMember(
      owner = "client!vi",
      name = "i",
      descriptor = "Lmh;"
   )
   public static class656 field8191;
   @OriginalMember(
      owner = "client!vi",
      name = "f",
      descriptor = "Lrf;"
   )
   public static class91 field8192;

   @OriginalMember(
      owner = "client!vi",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         ++field8188;
         this.field8187.method330(this.field8186, false);
         super.finalize();
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8194[4] + ')');
      }
   }

   @OriginalMember(
      owner = "client!vi",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4197(int arg0) {
      try {
         field8191 = null;
         field8192 = null;
         field8189 = null;
         if (arg0 != -1) {
            method4197(72);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8194[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vi",
      name = "<init>",
      descriptor = "(Lrk;II)V"
   )
   public class563(class35 arg0, int arg1, int arg2) {
      try {
         this.field8186 = arg2;
         this.field8187 = arg0;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field8194[2] + (arg0 != null ? field8194[0] : field8194[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vi",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4198(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 66);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vi",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4199(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 30;
            break;
         case 1:
            var10005 = 75;
            break;
         case 2:
            var10005 = 108;
            break;
         case 3:
            var10005 = 83;
            break;
         default:
            var10005 = 66;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
