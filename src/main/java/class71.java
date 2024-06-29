import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class71 {
   @OriginalMember(
      owner = "client!qr",
      name = "f",
      descriptor = "J"
   )
   public long field878;
   @OriginalMember(
      owner = "client!qr",
      name = "g",
      descriptor = "Lkfa;"
   )
   private class632 field884;
   @OriginalMember(
      owner = "client!qr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field885 = new String[]{method700(method699("!.Y\tA")), method700(method699("+rYf\u0014")), method700(method699(">)\u001b$")), method700(method699("!.Yt\u0000>5\u0003vA")), method700(method699("!.Y.\u0000>=\u001b!\u00135t"))};
   @OriginalMember(
      owner = "client!qr",
      name = "a",
      descriptor = "I"
   )
   public static int field882 = 0;
   @OriginalMember(
      owner = "client!qr",
      name = "d",
      descriptor = "I"
   )
   public static int field879 = -50;
   @OriginalMember(
      owner = "client!qr",
      name = "e",
      descriptor = "[[I"
   )
   public static int[][] field883 = new int[][]{{12, 12, 12, 12}, {12, 12, 12, 12, 12, 5}, {5, 5, 1, 1}, {5, 1, 1, 5}, {5, 5, 5}, {5, 5, 5}, {12, 12, 12, 12, 12, 12}, {1, 12, 12, 12, 12, 12}, {1, 1, 7, 1}, {8, 9, 9, 8, 8, 3, 1, 9}, {8, 8, 9, 8, 9, 9}, {10, 10, 11, 11, 11, 7, 3, 7}, {12, 12, 12, 12}};
   @OriginalMember(
      owner = "client!qr",
      name = "c",
      descriptor = "I"
   )
   public static int field881 = -1;
   @OriginalMember(
      owner = "client!qr",
      name = "b",
      descriptor = "I"
   )
   public static int field880;

   @OriginalMember(
      owner = "client!qr",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method698(int arg0) {
      try {
         if (arg0 >= 13) {
            field883 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field885[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qr",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         this.field884.method4586(this.field878, (byte)25);
         ++field880;
         super.finalize();
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field885[4] + ')');
      }
   }

   @OriginalMember(
      owner = "client!qr",
      name = "<init>",
      descriptor = "(Lkfa;J[Lqfa;)V"
   )
   public class71(class632 arg0, long arg1, class107[] arg2) {
      try {
         this.field878 = arg1;
         this.field884 = arg0;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field885[3] + (arg0 != null ? field885[1] : field885[2]) + ',' + arg1 + ',' + (arg2 != null ? field885[1] : field885[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method699(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 105);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method700(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 80;
            break;
         case 1:
            var10005 = 92;
            break;
         case 2:
            var10005 = 119;
            break;
         case 3:
            var10005 = 72;
            break;
         default:
            var10005 = 105;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
