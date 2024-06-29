import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public abstract class class564 {
   @OriginalMember(
      owner = "client!ac",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8199 = new String[]{method4203(method4202(".axh4")), method4203(method4202(".axg4"))};
   @OriginalMember(
      owner = "client!ac",
      name = "b",
      descriptor = "Lld;"
   )
   public static class178 field8196 = new class178(16);
   @OriginalMember(
      owner = "client!ac",
      name = "a",
      descriptor = "Z"
   )
   public static boolean field8198 = true;
   @OriginalMember(
      owner = "client!ac",
      name = "d",
      descriptor = "I"
   )
   public static int field8195;
   @OriginalMember(
      owner = "client!ac",
      name = "c",
      descriptor = "I"
   )
   public static int field8197;

   @OriginalMember(
      owner = "client!ac",
      name = "a",
      descriptor = "(I)V",
      line = 7
   )
   public static void method4200(int arg0) {
      try {
         field8196 = null;
         int var1 = 116 / ((58 - arg0) / 57);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8199[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ac",
      name = "a",
      descriptor = "(IIIIIIII)V",
      line = 19
   )
   public static final void method4201(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ac",
      name = "a",
      descriptor = "([BIII)V"
   )
   public abstract void method2050(byte[] arg0, int arg1, int arg2, int arg3) throws IOException;

   @OriginalMember(
      owner = "client!ac",
      name = "a",
      descriptor = "(I[BIB)I"
   )
   public abstract int method2049(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException;

   @OriginalMember(
      owner = "client!ac",
      name = "a",
      descriptor = "(II)Z"
   )
   public abstract boolean method2046(int arg0, int arg1) throws IOException;

   @OriginalMember(
      owner = "client!ac",
      name = "b",
      descriptor = "(I)V"
   )
   public abstract void method2048(int arg0);

   @OriginalMember(
      owner = "client!ac",
      name = "c",
      descriptor = "(I)V"
   )
   public abstract void method2045(int arg0);

   @OriginalMember(
      owner = "client!ac",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4202(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 28);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ac",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4203(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 79;
            break;
         case 1:
            var10005 = 2;
            break;
         case 2:
            var10005 = 86;
            break;
         case 3:
            var10005 = 32;
            break;
         default:
            var10005 = 28;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
