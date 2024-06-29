import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class468 {
   @OriginalMember(
      owner = "client!vj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6736 = new String[]{method3401(method3400("w&J\u001d")), method3401(method3400("b}\b_p")), method3401(method3400("o9\b2%")), method3401(method3400("o9\b5%")), method3401(method3400("o9\b0%")), method3401(method3400("o9\b3%"))};
   @OriginalMember(
      owner = "client!vj",
      name = "i",
      descriptor = "I"
   )
   public static int field6730 = 0;
   @OriginalMember(
      owner = "client!vj",
      name = "d",
      descriptor = "C"
   )
   public char field6731;
   @OriginalMember(
      owner = "client!vj",
      name = "b",
      descriptor = "I"
   )
   public int field6726;
   @OriginalMember(
      owner = "client!vj",
      name = "c",
      descriptor = "I"
   )
   public int field6727;
   @OriginalMember(
      owner = "client!vj",
      name = "a",
      descriptor = "I"
   )
   public static int field6729;
   @OriginalMember(
      owner = "client!vj",
      name = "g",
      descriptor = "I"
   )
   public static int field6733;
   @OriginalMember(
      owner = "client!vj",
      name = "h",
      descriptor = "I"
   )
   public static int field6734;
   @OriginalMember(
      owner = "client!vj",
      name = "j",
      descriptor = "I"
   )
   public int field6735;
   @OriginalMember(
      owner = "client!vj",
      name = "e",
      descriptor = "Loaa;"
   )
   public static class304 field6728;
   @OriginalMember(
      owner = "client!vj",
      name = "f",
      descriptor = "Liga;"
   )
   public static class484 field6732;

   @OriginalMember(
      owner = "client!vj",
      name = "a",
      descriptor = "(IIJ)Ljava/lang/String;"
   )
   public static final String method3396(int arg0, int arg1, long arg2) {
      try {
         ++field6733;
         class111.method907((byte)-27, arg2);
         if (arg0 != -10778) {
            return null;
         } else {
            int var4 = class176.field2442.get(5);
            int var5 = 1 + class176.field2442.get(2);
            int var6 = class176.field2442.get(1);
            return Integer.toString(var4 / 10) + var4 % 10 + "/" + var5 / 10 + var5 % 10 + "/" + var6 % 100 / 10 + var6 % 10;
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field6736[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vj",
      name = "a",
      descriptor = "(IILwf;)V"
   )
   private final void method3397(int arg0, int arg1, class147 arg2) {
      try {
         label27: {
            if (~arg1 != arg0) {
               if (arg1 != 2) {
                  break label27;
               }

               this.field6727 = arg2.method1211(-26166);
               this.field6726 = arg2.method1143(arg0 ^ 15465);
               this.field6735 = arg2.method1143(-15465);
               if (!client.field4360) {
                  break label27;
               }
            }

            this.field6731 = class312.method2306(true, arg2.method1162(4));
         }

         ++field6734;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field6736[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6736[1] : field6736[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vj",
      name = "a",
      descriptor = "(Lwf;I)V"
   )
   public final void method3398(class147 arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         if (arg1 == 2) {
            ++field6729;

            do {
               int var4 = arg0.method1143(-15465);
               if (var4 == 0) {
                  break;
               }

               this.method3397(-2, var4, arg0);
            } while(!var3);

         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field6736[5] + (arg0 != null ? field6736[1] : field6736[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vj",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3399(int arg0) {
      try {
         field6728 = null;
         field6732 = null;
         int var1 = -83 / ((42 - arg0) / 59);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field6736[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3400(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 13);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3401(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 25;
            break;
         case 1:
            var10005 = 83;
            break;
         case 2:
            var10005 = 38;
            break;
         case 3:
            var10005 = 113;
            break;
         default:
            var10005 = 13;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
