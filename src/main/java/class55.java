import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class55 extends class348 {
   @OriginalMember(
      owner = "client!hq",
      name = "t",
      descriptor = "Ljaclib/memory/heap/NativeHeap;"
   )
   public NativeHeap field800;
   @OriginalMember(
      owner = "client!hq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field803 = new String[]{method584(method583("U\u001a\bv")), method584(method583("S\u001eJYA")), method584(method583("@AJ4\u0014")), method584(method583("S\u001eJ&\u0000U\u0006\u0010$A")), method584(method583("S\u001eJ[A")), method584(method583("S\u001eJXA"))};
   @OriginalMember(
      owner = "client!hq",
      name = "q",
      descriptor = "[Z"
   )
   public static boolean[] field798 = new boolean[100];
   @OriginalMember(
      owner = "client!hq",
      name = "r",
      descriptor = "[I"
   )
   public static int[] field801 = new int[]{1, 2, 4, 8};
   @OriginalMember(
      owner = "client!hq",
      name = "s",
      descriptor = "I"
   )
   public static int field799;
   @OriginalMember(
      owner = "client!hq",
      name = "p",
      descriptor = "I"
   )
   public static int field802;

   @OriginalMember(
      owner = "client!hq",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method580(int arg0) {
      try {
         field798 = null;
         field801 = null;
         if (arg0 < 98) {
            field801 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field803[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hq",
      name = "a",
      descriptor = "(Ljava/lang/String;B)Ljava/lang/String;"
   )
   public static final String method581(String param0, byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!hq",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class55(int arg0) {
      try {
         this.field800 = new NativeHeap(arg0);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field803[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hq",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method582(int arg0) {
      try {
         this.field800.method3169();
         ++field799;
         if (arg0 != -48) {
            this.field800 = null;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field803[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method583(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 105);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method584(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 59;
            break;
         case 1:
            var10005 = 111;
            break;
         case 2:
            var10005 = 100;
            break;
         case 3:
            var10005 = 26;
            break;
         default:
            var10005 = 105;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
