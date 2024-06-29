import jaclib.memory.heap.NativeHeap;
import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class152 extends class735 {
   @OriginalMember(
      owner = "client!hk",
      name = "t",
      descriptor = "Ljaclib/memory/heap/NativeHeap;"
   )
   public NativeHeap field1894;
   @OriginalMember(
      owner = "client!hk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1896 = new String[]{method1223(method1222("]l\u0006+K")), method1223(method1222("]l\u0006P\n[n\\RK")), method1223(method1222("]l\u0006*K"))};
   @OriginalMember(
      owner = "client!hk",
      name = "v",
      descriptor = "Lcba;"
   )
   public static class95 field1892 = new class95();
   @OriginalMember(
      owner = "client!hk",
      name = "s",
      descriptor = "I"
   )
   public static int field1895;
   @OriginalMember(
      owner = "client!hk",
      name = "u",
      descriptor = "Ljava/applet/Applet;"
   )
   public static Applet field1893;

   @OriginalMember(
      owner = "client!hk",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method1220(int arg0) {
      try {
         field1893 = null;
         field1892 = null;
         if (arg0 != 30091) {
            field1893 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1896[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hk",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method1221(int arg0) {
      try {
         if (arg0 == -11942) {
            ++field1895;
            this.field1894.method2986();
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1896[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hk",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class152(int arg0) {
      try {
         this.field1894 = new NativeHeap(arg0);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field1896[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1222(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 99);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1223(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 53;
            break;
         case 1:
            var10005 = 7;
            break;
         case 2:
            var10005 = 40;
            break;
         case 3:
            var10005 = 108;
            break;
         default:
            var10005 = 99;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
