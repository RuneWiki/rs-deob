import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class229 {
   @OriginalMember(
      owner = "client!cu",
      name = "f",
      descriptor = "J"
   )
   private long field3372 = -1L;
   @OriginalMember(
      owner = "client!cu",
      name = "c",
      descriptor = "Liw;"
   )
   private class332 field3368 = new class332();
   @OriginalMember(
      owner = "client!cu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3374 = new String[]{method1906(method1905("\u000b\u0006\u0003\r\u0012_\u0016=\u001c\u001e\u0011")), method1906(method1905("P]]G\u000e")), method1906(method1905("h\u001f\u0012\u00070C\u0012\u001d\u0007\u0016G7\u0016\u0005\u0007J]\u0012\u0019\u0003G\n'\u00060G\u0012\u001d*\u001bJ\u001d\u001d\f\u001f\u0003ZII0Y\u0016\u0017\f\u001d_\u001a\u0012\u0005\u0000\u000b\u0017\u001cI\u001dD\u0007S\u0004\u0012_\u0010\u001bHSH\u0010]\n\u001fJ\u001d;\b\u0000CI")), method1906(method1905("\u000b\u0017\u0016\u0005\u0007J]\u0010\u0005\u0012E;\u0012\u001a\u001b\u0011")), method1906(method1905("E\u0006\u001f\u0005")), method1906(method1905("H\u0006]([")), method1906(method1905("H\u0006]U\u001aE\u001a\u0007W[")), method1906(method1905("H\u0006]+[")), method1906(method1905("~\u001d\u0001\f\u0010D\u0014\u001d\u0000\u0000N\u0017S*\u001fJ\u001d0\u0001\u0012E\u001d\u0016\u00057N\u001f\u0007\bS_\n\u0003\fSB\u001dS\r\u0016H\u001c\u0017\f[\u0002")), method1906(method1905("H\u0006]*["))};
   @OriginalMember(
      owner = "client!cu",
      name = "b",
      descriptor = "Luw;"
   )
   public static class435 field3373 = new class435(65, -1);
   @OriginalMember(
      owner = "client!cu",
      name = "a",
      descriptor = "I"
   )
   public static int field3369;
   @OriginalMember(
      owner = "client!cu",
      name = "e",
      descriptor = "I"
   )
   public static int field3370;
   @OriginalMember(
      owner = "client!cu",
      name = "d",
      descriptor = "J"
   )
   private long field3371;

   @OriginalMember(
      owner = "client!cu",
      name = "a",
      descriptor = "(Luda;B)V"
   )
   private final void method1902(class473 param1, byte param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!cu",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1903(byte arg0) {
      try {
         field3373 = null;
         if (arg0 < 3) {
            method1903((byte)-111);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3374[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cu",
      name = "a",
      descriptor = "(ZLan;)V"
   )
   public final void method1904(boolean param1, class25 param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!cu",
      name = "<init>",
      descriptor = "(Luda;)V"
   )
   public class229(class473 arg0) {
      try {
         this.method1902(arg0, (byte)-17);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3374[6] + (arg0 != null ? field3374[1] : field3374[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1905(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 115);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1906(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 43;
            break;
         case 1:
            var10005 = 115;
            break;
         case 2:
            var10005 = 115;
            break;
         case 3:
            var10005 = 105;
            break;
         default:
            var10005 = 115;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
