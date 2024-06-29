import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class231 {
   @OriginalMember(
      owner = "client!oq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2880 = new String[]{method1835(method1834("|?V\u0003n")), method1835(method1834("h`Vl;")), method1835(method1834("};\u0014.")), method1835(method1834("|?V\u0000n"))};
   @OriginalMember(
      owner = "client!oq",
      name = "g",
      descriptor = "Lvv;"
   )
   public static class467 field2873 = new class467();
   @OriginalMember(
      owner = "client!oq",
      name = "h",
      descriptor = "Laka;"
   )
   public static class418 field2879 = new class418(20, -2);
   @OriginalMember(
      owner = "client!oq",
      name = "f",
      descriptor = "I"
   )
   public static int field2876;
   @OriginalMember(
      owner = "client!oq",
      name = "e",
      descriptor = "I"
   )
   public static int field2877;
   @OriginalMember(
      owner = "client!oq",
      name = "d",
      descriptor = "[B"
   )
   public byte[] field2875;
   @OriginalMember(
      owner = "client!oq",
      name = "b",
      descriptor = "[S"
   )
   public short[] field2872;
   @OriginalMember(
      owner = "client!oq",
      name = "a",
      descriptor = "[S"
   )
   public short[] field2874;
   @OriginalMember(
      owner = "client!oq",
      name = "c",
      descriptor = "[S"
   )
   public short[] field2878;

   @OriginalMember(
      owner = "client!oq",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1832(int arg0) {
      try {
         field2873 = null;
         field2879 = null;
         if (arg0 != -9954) {
            field2873 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field2880[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oq",
      name = "a",
      descriptor = "(ILwf;)V"
   )
   public static final void method1833(int param0, class541 param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!oq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1834(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 70);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1835(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 19;
            break;
         case 1:
            var10005 = 78;
            break;
         case 2:
            var10005 = 120;
            break;
         case 3:
            var10005 = 66;
            break;
         default:
            var10005 = 70;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
