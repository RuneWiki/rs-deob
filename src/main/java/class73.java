import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class73 extends class432 {
   @OriginalMember(
      owner = "client!wc",
      name = "q",
      descriptor = "Ljaclib/memory/heap/NativeHeap;"
   )
   public NativeHeap field1306;
   @OriginalMember(
      owner = "client!wc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1308 = new String[]{method776(method775("BJO\u000e\u000e")), method776(method775("BJO\r\u000e")), method776(method775("BJOsO[@\u0015q\u000e")), method776(method775("BJO\f\u000e"))};
   @OriginalMember(
      owner = "client!wc",
      name = "p",
      descriptor = "Lgh;"
   )
   public static class572 field1305 = new class572(71, 8);
   @OriginalMember(
      owner = "client!wc",
      name = "r",
      descriptor = "I"
   )
   public static int field1307 = 64;
   @OriginalMember(
      owner = "client!wc",
      name = "o",
      descriptor = "I"
   )
   public static int field1303;
   @OriginalMember(
      owner = "client!wc",
      name = "n",
      descriptor = "I"
   )
   public static int field1304;

   @OriginalMember(
      owner = "client!wc",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method772(int arg0) {
      try {
         this.field1306.method5078();
         if (arg0 > -18) {
            field1307 = -64;
         }

         ++field1304;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1308[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wc",
      name = "e",
      descriptor = "(I)V"
   )
   public static void method773(int arg0) {
      try {
         if (arg0 != -14538) {
            field1305 = null;
         }

         field1305 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field1308[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wc",
      name = "a",
      descriptor = "(IIC)I"
   )
   public static final int method774(int arg0, int arg1, char arg2) {
      try {
         ++field1303;
         int var3 = arg2 << 4;
         if (Character.isUpperCase(arg2) || Character.isTitleCase(arg2)) {
            char var6 = Character.toLowerCase(arg2);
            var3 = (var6 << 4) - -1;
         }

         if (arg1 != 357786212) {
            field1307 = 56;
         }

         return var3;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field1308[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wc",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class73(int arg0) {
      try {
         this.field1306 = new NativeHeap(arg0);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1308[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method775(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 38);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method776(char[] arg0) {
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
            var10005 = 41;
            break;
         case 2:
            var10005 = 97;
            break;
         case 3:
            var10005 = 79;
            break;
         default:
            var10005 = 38;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
