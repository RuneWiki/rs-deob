import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public abstract class class299 extends class76 {
   @OriginalMember(
      owner = "client!sm",
      name = "z",
      descriptor = "I"
   )
   public int field4093;
   @OriginalMember(
      owner = "client!sm",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4096 = new String[]{method2237(method2236("n~F\u001e3sz\u001c\u001cr")), method2237(method2236("n~Fjr"))};
   @OriginalMember(
      owner = "client!sm",
      name = "B",
      descriptor = "[Z"
   )
   public static boolean[] field4092 = new boolean[100];
   @OriginalMember(
      owner = "client!sm",
      name = "A",
      descriptor = "Z"
   )
   public static boolean field4094 = false;
   @OriginalMember(
      owner = "client!sm",
      name = "C",
      descriptor = "I"
   )
   public static int field4095;

   @OriginalMember(
      owner = "client!sm",
      name = "a",
      descriptor = "(II)I",
      line = 4
   )
   public static final int method2232(int arg0, int arg1) {
      return class234.field3271 != null ? class234.field3271[arg0][arg1] & 16777215 : 0;
   }

   @OriginalMember(
      owner = "client!sm",
      name = "a",
      descriptor = "(I)V",
      line = 13
   )
   public static void method2233(int arg0) {
      try {
         if (arg0 == 29325) {
            field4092 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field4096[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sm",
      name = "<init>",
      descriptor = "(I)V",
      line = 25
   )
   public class299(int arg0) {
      try {
         this.field4093 = arg0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field4096[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sm",
      name = "c",
      descriptor = "(B)Z"
   )
   public abstract boolean method2234(byte arg0);

   @OriginalMember(
      owner = "client!sm",
      name = "c",
      descriptor = "(I)Ljava/lang/Object;"
   )
   public abstract Object method2235(int arg0);

   @OriginalMember(
      owner = "client!sm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2236(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 90);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2237(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 29;
            break;
         case 1:
            var10005 = 19;
            break;
         case 2:
            var10005 = 104;
            break;
         case 3:
            var10005 = 34;
            break;
         default:
            var10005 = 90;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
