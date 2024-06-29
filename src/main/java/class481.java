import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class481 extends class348 {
   @OriginalMember(
      owner = "client!kh",
      name = "t",
      descriptor = "Ljaclib/memory/heap/NativeHeap;"
   )
   public NativeHeap field6909;
   @OriginalMember(
      owner = "client!kh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6910 = new String[]{method3680(method3679(".\"G*O")), method3680(method3679(".\"GW\u000e+#\u001dUO")), method3680(method3679(".\"G)O"))};
   @OriginalMember(
      owner = "client!kh",
      name = "p",
      descriptor = "Z"
   )
   public static boolean field6906 = false;
   @OriginalMember(
      owner = "client!kh",
      name = "r",
      descriptor = "Lsb;"
   )
   public static class261 field6908 = new class261();
   @OriginalMember(
      owner = "client!kh",
      name = "s",
      descriptor = "F"
   )
   public static float field6905;
   @OriginalMember(
      owner = "client!kh",
      name = "q",
      descriptor = "I"
   )
   public static int field6907;

   @OriginalMember(
      owner = "client!kh",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method3677(byte arg0) {
      try {
         ++field6907;
         this.field6909.method3169();
         if (arg0 > -103) {
            field6905 = 2.0276554F;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6910[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kh",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method3678(byte arg0) {
      try {
         field6908 = null;
         if (arg0 != -37) {
            field6908 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6910[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kh",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class481(int arg0) {
      try {
         this.field6909 = new NativeHeap(arg0);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6910[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3679(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 103);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3680(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 69;
            break;
         case 1:
            var10005 = 74;
            break;
         case 2:
            var10005 = 105;
            break;
         case 3:
            var10005 = 107;
            break;
         default:
            var10005 = 103;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
