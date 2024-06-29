import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lia")
public class class633 {
   @OriginalMember(
      owner = "client!lia",
      name = "c",
      descriptor = "I"
   )
   public int field9330;
   @OriginalMember(
      owner = "client!lia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9331 = new String[]{method4670(method4669("C<;\u0010TF;3JV\u0007")), method4670(method4669("A 6R")), method4670(method4669("T{t\u0010\u0015")), method4670(method4669("C<;\u0010\u001c@\u0006.L\u0001A2r")), method4670(method4669("C<;\u0010)\u0007"))};
   @OriginalMember(
      owner = "client!lia",
      name = "a",
      descriptor = "I"
   )
   public static int field9327;
   @OriginalMember(
      owner = "client!lia",
      name = "d",
      descriptor = "I"
   )
   public static int field9328;
   @OriginalMember(
      owner = "client!lia",
      name = "b",
      descriptor = "I"
   )
   public static int field9329;

   @OriginalMember(
      owner = "client!lia",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field9329;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field9331[3] + ')');
      }
   }

   @OriginalMember(
      owner = "client!lia",
      name = "<init>",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V"
   )
   public class633(String arg0, String arg1, String arg2, int arg3) {
      try {
         this.field9330 = arg3;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field9331[0] + (arg0 != null ? field9331[2] : field9331[1]) + ',' + (arg1 != null ? field9331[2] : field9331[1]) + ',' + (arg2 != null ? field9331[2] : field9331[1]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lia",
      name = "a",
      descriptor = "(Lgea;B)Ldea;"
   )
   public static final class338 method4668(class66 arg0, byte arg1) {
      try {
         int var2 = -126 % ((arg1 - -23) / 55);
         ++field9327;
         return new class338(arg0.method652((byte)-102), arg0.method652((byte)50), arg0.method652((byte)28), arg0.method652((byte)50), arg0.method645((byte)-26), arg0.method645((byte)-26), arg0.method640(255));
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field9331[4] + (arg0 != null ? field9331[2] : field9331[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4669(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 104);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4670(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 47;
            break;
         case 1:
            var10005 = 85;
            break;
         case 2:
            var10005 = 90;
            break;
         case 3:
            var10005 = 62;
            break;
         default:
            var10005 = 104;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
