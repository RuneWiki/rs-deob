import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class353 extends class735 {
   @OriginalMember(
      owner = "client!vl",
      name = "t",
      descriptor = "Ljaclib/memory/heap/NativeHeap;"
   )
   public NativeHeap field4939;
   @OriginalMember(
      owner = "client!vl",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4944 = new String[]{method2809(method2808("\u001e\n\fa_")), method2809(method2808("\u001e\n\f\u001b\u001e\u0006\u000fV\u0019_")), method2809(method2808("\u001e\n\f`_"))};
   @OriginalMember(
      owner = "client!vl",
      name = "w",
      descriptor = "Laka;"
   )
   public static class418 field4938 = new class418(42, 6);
   @OriginalMember(
      owner = "client!vl",
      name = "u",
      descriptor = "I"
   )
   public static int field4942 = -1;
   @OriginalMember(
      owner = "client!vl",
      name = "v",
      descriptor = "I"
   )
   public static int field4943 = -2;
   @OriginalMember(
      owner = "client!vl",
      name = "y",
      descriptor = "I"
   )
   public static int field4937;
   @OriginalMember(
      owner = "client!vl",
      name = "s",
      descriptor = "I"
   )
   public static int field4940;
   @OriginalMember(
      owner = "client!vl",
      name = "x",
      descriptor = "I"
   )
   public static int field4941;

   @OriginalMember(
      owner = "client!vl",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method2806(int arg0) {
      try {
         ++field4937;
         if (arg0 != -19347) {
            field4943 = -35;
         }

         this.field4939.method2986();
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field4944[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vl",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method2807(int arg0) {
      try {
         if (arg0 < 24) {
            method2807(51);
         }

         field4938 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field4944[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vl",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class353(int arg0) {
      try {
         this.field4939 = new NativeHeap(arg0);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field4944[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2808(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 119);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2809(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 104;
            break;
         case 1:
            var10005 = 102;
            break;
         case 2:
            var10005 = 34;
            break;
         case 3:
            var10005 = 39;
            break;
         default:
            var10005 = 119;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
