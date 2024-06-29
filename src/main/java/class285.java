import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class285 {
   @OriginalMember(
      owner = "client!jl",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field3792 = method2167(method2166("P\u0003\u000fhx"));
   @OriginalMember(
      owner = "client!jl",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field3785 = new int[1024];
   @OriginalMember(
      owner = "client!jl",
      name = "c",
      descriptor = "Lod;"
   )
   public static class536 field3789 = new class536();
   @OriginalMember(
      owner = "client!jl",
      name = "d",
      descriptor = "I"
   )
   public int field3786;
   @OriginalMember(
      owner = "client!jl",
      name = "f",
      descriptor = "I"
   )
   public int field3787;
   @OriginalMember(
      owner = "client!jl",
      name = "g",
      descriptor = "I"
   )
   public int field3788;
   @OriginalMember(
      owner = "client!jl",
      name = "a",
      descriptor = "I"
   )
   public int field3790;
   @OriginalMember(
      owner = "client!jl",
      name = "e",
      descriptor = "Ljava/awt/datatransfer/Clipboard;"
   )
   public static Clipboard field3791;

   @OriginalMember(
      owner = "client!jl",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2164(int arg0) {
      try {
         if (arg0 >= -32) {
            method2164(-115);
         }

         field3789 = null;
         field3785 = null;
         field3791 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field3792 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jl",
      name = "a",
      descriptor = "(IIII)V"
   )
   public static final void method2165(int arg0, int arg1, int arg2, int arg3) {
      class225 var4 = class111.field1404[arg0][arg1][arg2];
      if (var4 != null) {
         class95 var5 = var4.field2824;
         class95 var6 = var4.field2822;
         if (var5 != null) {
            var5.field1268 = (short)(var5.field1268 * arg3 / (16 << class76.field965 - 7));
            var5.field1266 = (short)(var5.field1266 * arg3 / (16 << class76.field965 - 7));
         }

         if (var6 != null) {
            var6.field1268 = (short)(var6.field1268 * arg3 / (16 << class76.field965 - 7));
            var6.field1266 = (short)(var6.field1266 * arg3 / (16 << class76.field965 - 7));
         }

      }
   }

   @OriginalMember(
      owner = "client!jl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2166(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 80);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2167(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 58;
            break;
         case 1:
            var10005 = 111;
            break;
         case 2:
            var10005 = 33;
            break;
         case 3:
            var10005 = 41;
            break;
         default:
            var10005 = 80;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
